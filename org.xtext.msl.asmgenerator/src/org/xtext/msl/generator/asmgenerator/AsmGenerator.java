package org.xtext.msl.generator.asmgenerator;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.xtext.msl.Loader;
import org.xtext.msl.generator.Generator;
import org.xtext.msl.generator.VariationPointSemantics;
import org.xtext.msl.mSL.AbstractComponent;
import org.xtext.msl.mSL.AbstractComponentName;
import org.xtext.msl.mSL.AbstractGroup;
import org.xtext.msl.mSL.AbstractInteraction;
import org.xtext.msl.mSL.AbstractSystem;
import org.xtext.msl.mSL.ComponentInstance;
import org.xtext.msl.mSL.ComponentName;
import org.xtext.msl.mSL.ConcreteGroup;
import org.xtext.msl.mSL.ConcreteSystem;
import org.xtext.msl.mSL.GroupBinding;
import org.xtext.msl.mSL.Interaction;
import org.xtext.msl.mSL.Specification;
import org.xtext.msl.mSL.SystemBinding;

public class AsmGenerator extends Generator {
	private int counter = 0;
	private static final String CLEAN_UP_PREFIX = "r_CleanUp_";
	private Map<String, String> agentNames = new HashMap<String, String>();
	private Specification spec;
	// the program
	private Map<String, String> agentPrograms;
	// private List<AbstractSystem> managedSys;
	private Map<String, List<String[]>> managingToManagedToFunc;
	private Map<String, Map<String, ArrayList<String>>> managingFuncManagingInstToManagedInst;
	private Set<String[]> signalFunctions;
	private Map<String, String> functionDomain = new HashMap<>();
	private Map<String, String> functionCoDomain = new HashMap<>();
	private Set<String[]> absIntFuncs;
	private Map<String, String> componentTypes;
	private Map<String, Map<String, ArrayList<String>>> componentInteractions;
	private Map<String, Set<String>> compIntFuncToDomValues;
	private Map<String, Set<String>> calledRules;
	private Map<String, String> calledBy;
	private ArrayList<String> allRules;
	private Map<String, String> getCleanUpRule;
	private Map<String, LinkedHashSet<String>> programRules;
	private LinkedHashMap<String, String> derivedFunctions;
	private Map<String, String> ruleGuard;
	private Map<String, String> ruleAction;
	private Map<String, String> ruleBody;
	private String modelName;

	public AsmGenerator(Specification spec, PrintWriter pw) {
		super(spec, pw);
	}

	public AsmGenerator(String path, PrintWriter pw) {
		this(Loader.loadSpec(path), pw);
	}

	public AsmGenerator(String path) {
		this(path, new PrintWriter(System.out, true));
	}

	private String resolveName(String a) {
		assert nameBinding.containsKey(a) : "a: " + a + "\nnameBinding: " + nameBinding;
		return nameBinding.get(a);
	}

	@Override
	public void generateCode() {
		generateSignature();
		generateBody();
		generateInitState();
	}

	public String getModelName() {
		return modelName;
	}

	private void generateSignature() {
		modelName = configuration.getName();
		pw.println("asm " + modelName);
		pw.println("\nimport StandardLibrary\n");
		pw.println("signature:");
		pw.println("\t//" + pattern.getName());

		/*
		 * managedSys = new ArrayList<>(); for(Object k: nameBinding.keySet()) { if(k
		 * instanceof AbstractSystem) { managedSys.add((AbstractSystem)k); } }
		 */

		agentPrograms = new HashMap<>();
		allRules = new ArrayList<>();
		ruleGuard = new HashMap<>();
		getCleanUpRule = new HashMap<>();
		programRules = new HashMap<>();
		derivedFunctions = new LinkedHashMap<>();
		for (AbstractSystem s : absSys) {
			String systemName = resolveName(s.getName());
			String agentName = systemName + "MdA";
			agentNames.put(systemName, agentName);
			pw.println("\tdomain " + agentName + " subsetof Agent");
			String program = "r_" + systemName;
			agentPrograms.put(agentName, program);
			programRules.put(program, new LinkedHashSet<>());
			allRules.add(program);
		}

		for (AbstractGroup a : absGroups) {
			String groupName = resolveName(a.getName());
			String agentName = groupName + "MgA";
			agentNames.put(groupName, agentName);
			pw.println("\tdomain " + agentName + " subsetof Agent");
		}
		managingToManagedToFunc = new HashMap<>();
		for (AbstractGroup absGroup : absGroups) {
			String groupName = resolveName(absGroup.getName());
			assert groupName != null : absGroup;
			String groupAgent = agentNames.get(groupName);
			assert groupAgent != null;
			List<AbstractSystem> manSys = absGroup.getManSys();
			if (manSys != null) {
				for (AbstractSystem s : manSys) {
					String systemName = resolveName(s.getName());
					String systemAgent = agentNames.get(systemName);
					assert systemAgent != null : systemName + "\n" + agentNames;
					String funcName = systemName.toLowerCase() + "ManagedBy" + groupName;
					
					boolean useSet = false;
					//System.out.println("sn: " + systemName);
					int counter = 0;
					for(ConcreteSystem concrSysInConf: configuration.getConcreteSystems()) {
						//System.out.println(concrSysInConf.getName());
						SystemBinding b = concrSysInConf.getBindings().get(0);
						//System.out.println(b.getName());
						if(systemName.equals(b.getName())) {
							counter++;
						}
					}
					if(counter > 1) {
						g:for(GroupBinding g: pattern.getGroups()) {
							String gName = g.getName();
							//System.out.println("gName: " + gName);
							for(ConcreteGroup concrGroupInConf: configuration.getConcreteGroups()) {
								//System.out.println("concrGroupInConf: " + concrGroupInConf.getAbstractGroups().get(0).getName());
								if(concrGroupInConf.getAbstractGroups().get(0).getName().equals(gName)) {
									counter = 0;
									for(ConcreteSystem ms: concrGroupInConf.getManSys()) {
										if(ms.getBindings().get(0).getName().equals(systemName)) {
											//System.out.println(gName + "\t" + ms.getName()+ "\t" + ms.getBindings().get(0).getName());
											counter++;
										}
									}
									if(counter > 1) {
										useSet = true;
										break g;
									}
								}
							}
						}
					}
					
					
					String codomain = useSet?"Powerset(" + systemAgent + ")":systemAgent;
					pw.println("\tcontrolled " + funcName  + ": " + groupAgent + " -> " + codomain);

					if(!managingToManagedToFunc.containsKey(groupAgent)) {
						managingToManagedToFunc.put(groupAgent, new ArrayList<String[]>());
					}
					managingToManagedToFunc.get(groupAgent).add(new String[] { systemAgent, funcName});
					
					// System.out.println(groupAgent + "\t" + systemAgent + "\t" + funcName);
					functionDomain.put(funcName, groupAgent);
					functionCoDomain.put(funcName, codomain);
				}
			}
			LinkedHashSet<String> rules = new LinkedHashSet<>();
			for (AbstractComponent absComp : absGroup.getComponents()) {
				String groupComp = groupName + absComp.getName();
				String rule = "r_" + groupComp;
				String cleanUpRule = CLEAN_UP_PREFIX + groupComp;
				allRules.add(cleanUpRule);
				assert !allRules.contains(rule);
				allRules.add(rule);
				getCleanUpRule.put(rule, cleanUpRule);
				rules.add(rule);
				String derFuncName = "start" + groupComp;
				pw.println("\tderived " + derFuncName + ": " + groupAgent + " -> Boolean");
				String funcBody = "true";
				String derFuncNameInDef = derFuncName + "($b in " + groupAgent + ")";
				derivedFunctions.put(derFuncNameInDef, funcBody);
				ruleGuard.put(rule, derFuncName + "(self)");
			}
			String ruleProgram = "r_" + groupName;
			assert !allRules.contains(ruleProgram);
			allRules.add(ruleProgram);
			programRules.put(ruleProgram, rules);
			agentPrograms.put(groupAgent, ruleProgram);
		}
		// System.out.println("ks " + managingToManagedToFunc.keySet());
		signalFunctions = new LinkedHashSet<String[]>();
		absIntFuncs = new LinkedHashSet<String[]>();
		compIntFuncToDomValues = new HashMap<>();
		calledRules = new HashMap<>();
		calledBy = new HashMap<>();

		ruleAction = new HashMap<>();
		ruleBody = new HashMap<>();
		for (AbstractInteraction i : absInteractions) {
			AbstractComponentName startInteraction = i.getStart();
			AbstractComponentName endInteraction = i.getEnd();
			String startGroup = ((AbstractGroup) (startInteraction.getType().eContainer())).getName();
			String endGroup = ((AbstractGroup) (endInteraction.getType().eContainer())).getName();
			String startGroupName = resolveName(startGroup);
			String endGroupName = resolveName(endGroup);
			String startComp = startInteraction.getType().getName();
			String endComp = endInteraction.getType().getName();

			String startRule = "r_" + startGroupName + startComp;
			String endRule = "r_" + endGroupName + endComp;
			String cleanUpstartRule = CLEAN_UP_PREFIX + startGroupName + startComp;
			String cleanUpendRule = CLEAN_UP_PREFIX + endGroupName + endComp;
			assert allRules.contains(startRule) : startRule + " is missing";
			assert allRules.contains(cleanUpstartRule) : cleanUpstartRule + " is missing";
			assert allRules.contains(endRule) : endRule + " is missing";
			assert allRules.contains(cleanUpendRule) : cleanUpendRule + " is missing";
			assert allRules.indexOf(startRule) == allRules.indexOf(cleanUpstartRule) + 1 : allRules;
			assert allRules.indexOf(endRule) == allRules.indexOf(cleanUpendRule) + 1;

			if (!startGroupName.equals(endGroupName)) {
				String high = i.getHigh();
				assert high != null;
				String low = i.getLow();
				assert low != null;

				pw.println("\t//I: " + startGroupName + "." + startComp + " -> " + endGroupName + "." + endComp + " ["
						+ low + "," + high + "]");
				String startGroupAgent = agentNames.get(startGroupName);
				String endGroupAgent = agentNames.get(endGroupName);

				String funcNameSgn = "sgn" + startGroupName + startComp + endGroupName + endComp;
				String domain = "Prod(" + startGroupAgent + ", " + endGroupAgent + ")";
				String codomain = "Boolean";
				pw.println("\tcontrolled " + funcNameSgn + ": " + domain + " -> " + codomain);
				String[] signal = new String[] { funcNameSgn, startGroupAgent, endGroupAgent };
				signalFunctions.add(signal);

				domain = startGroupAgent;
				String funcName1 = "from" + startGroupName + startComp + "to" + endGroupName + endComp;
				boolean isPowersetHigh = !high.equals(VariationPointSemantics.ONE_SEMANTICS.getValue());
				String funcName2 = "from" + endGroupName + endComp + "to" + startGroupName + startComp;
				assert i.getLow() != null;
				boolean isPowersetLow = !low.equals(VariationPointSemantics.ONE_SEMANTICS.getValue());

				codomain = isPowersetHigh ? ("Powerset(" + endGroupAgent + ")") : endGroupAgent;
				pw.println("\tcontrolled " + funcName1 + ": " + domain + " -> " + codomain);
				absIntFuncs.add(new String[] { funcName1, startGroupName, startComp, endGroupName, endComp,
						startGroupAgent, endGroupAgent, isPowersetHigh ? "SET" : "SINGLE" });
				compIntFuncToDomValues.put(funcName1, new LinkedHashSet<>());
				if (isPowersetHigh) {
					String action = null;
					if (high.equals(VariationPointSemantics.AND_SEMANTICS.getValue())) {
						action = "forall $a in " + funcName1 + "(self) do " + signal[0] + "(self, $a) := true";
					} else if (high.equals(VariationPointSemantics.OR_SEMANTICS.getValue())) {
						String selectorName = "orSelector" + funcName1;
						action = "forall $a in " + selectorName + "(self) do " + signal[0] + "(self, $a) := true";
						pw.println("\tderived " + selectorName + ": " + startGroupAgent + " -> Powerset("
								+ endGroupAgent + ")");
						String funcBody = "chooseone({$a in Powerset(" + endGroupAgent + ") | not(isEmpty($a)): $a})";
						String derFuncNameInDef = selectorName + "($b in " + startGroupAgent + ")";
						derivedFunctions.put(derFuncNameInDef, funcBody);
					} else if (high.equals(VariationPointSemantics.XOR_SEMANTICS.getValue())) {
						String selectorName = "xorSelector" + funcName1;
						action = signal[0] + "(self, " + selectorName + "(self)) := true";
						pw.println("\tderived " + selectorName + ": " + startGroupAgent + " -> " + endGroupAgent);
						String funcBody = "chooseone({$a in " + endGroupAgent + " : $a})";
						String derFuncNameInDef = selectorName + "($b in " + startGroupAgent + ")";
						derivedFunctions.put(derFuncNameInDef, funcBody);
					} else {
						assert false;
					}
					// System.out.println(action);
					ruleAction.put(startRule, action);

					String location = signal[0] + "(" + funcName2 + "($b), $b)";

					String derFuncName = "start" + endGroupName + endComp;
					String derFuncNameInDef = derFuncName + "($b in " + endGroupAgent + ")";
					String funcBody = location;
					if (!derivedFunctions.containsKey(derFuncNameInDef)) {
						derivedFunctions.put(derFuncNameInDef, funcBody);
						pw.println("\tderived " + derFuncName + ": " + endGroupAgent + " -> Boolean");
					} else {
						String oldBody = derivedFunctions.get(derFuncNameInDef);
						if (!oldBody.equals("true")) {
							funcBody = oldBody + " and " + funcBody;
						}
						derivedFunctions.put(derFuncNameInDef, funcBody);
					}

					location = signal[0] + "(" + funcName2 + "(self), self)";
					String cleanUpBody = location + " := false";
					ruleBody.put(cleanUpendRule, cleanUpBody);

				}

				domain = endGroupAgent;
				codomain = isPowersetLow ? ("Powerset(" + startGroupAgent + ")") : startGroupAgent;
				pw.println("\tcontrolled " + funcName2 + ": " + domain + " -> " + codomain);
				absIntFuncs.add(new String[] { funcName2, endGroupName, endComp, startGroupName, startComp,
						endGroupAgent, startGroupAgent, isPowersetLow ? "SET" : "SINGLE" });
				compIntFuncToDomValues.put(funcName2, new LinkedHashSet<>());

				if (isPowersetLow) {
					String derFuncName = "start" + endGroupName + endComp;
					String derFuncNameInDef = derFuncName + "($b in " + endGroupAgent + ")";

					String quantifier = null;
					if (low.equals(VariationPointSemantics.AND_SEMANTICS.getValue())) {
						quantifier = "forall";
					} else if (low.equals(VariationPointSemantics.OR_SEMANTICS.getValue())) {
						quantifier = "exist";
					} else {
						quantifier = "exist unique";
					}

					String funcBody = "(" + quantifier + " $a in " + funcName2 + "($b) with " + signal[0] + "($a, $b))";

					if (!derivedFunctions.containsKey(derFuncNameInDef)) {
						derivedFunctions.put(derFuncNameInDef, funcBody);
						pw.println("\tderived " + derFuncName + ": " + endGroupAgent + " -> Boolean");
					} else {
						String oldBody = derivedFunctions.get(derFuncNameInDef);
						if (!oldBody.equals("true")) {
							// TODO when is this code needed?
							assert false;
							funcBody = funcBody.replaceAll("\\$a", "\\$a" + (counter++));

							String operator = "and";

							funcBody = oldBody + operator + funcBody;
						}
						derivedFunctions.put(derFuncNameInDef, funcBody);
					}

					String cleanUpBody = "forall $a in " + funcName2 + "(self) do " + signal[0] + "($a, self) := false";
					ruleBody.put(cleanUpendRule, cleanUpBody);
					// if sgnMM(self,$a) = false then sgnMM(self,$a) := true endif
					String rBody = "if not " + funcNameSgn + "(self," + funcName1 + "(self)) then " + funcNameSgn
							+ "(self," + funcName1 + "(self)) := true endif";
					ruleBody.put(startRule, rBody);
				}

				if (isPowersetHigh) {
					// String location = signal[0] + "(" + funcName2 + "(self), self)";
					// String cleanUpBody = location + " := false";
					// ruleBody.put(cleanUpendRule, cleanUpBody);
					// ruleGuard.put(endRule, location);
				}
			} else {
				if (!calledRules.containsKey(startRule)) {
					calledRules.put(startRule, new LinkedHashSet<>());
				}
				calledRules.get(startRule).add(endRule);
				calledBy.put(endRule, startRule);
				int indexStart = allRules.indexOf(startRule);
				int endStart = allRules.indexOf(endRule);
				if (endStart > indexStart) {
					allRules.remove(cleanUpendRule);
					allRules.remove(endRule);
					allRules.add(indexStart - 1, endRule);
					allRules.add(indexStart - 1, cleanUpendRule);
				}
			}
		}

		for (String p : programRules.keySet()) {
			LinkedHashSet<String> pRules = programRules.get(p);
			Iterator<String> it = pRules.iterator();
			while (it.hasNext()) {
				String r = it.next();
				if (calledBy.containsKey(r)) {
					it.remove();
				}
			}
		}

		pw.println("\t//" + modelName);
		for (ConcreteSystem s : concrSys) {
			String systemName = s.getName();
			SystemBinding binding = s.getBindings().get(0);
			assert binding != null;
			AbstractSystem linkedSys = binding.getAbsSys();
			assert linkedSys != null;
			pw.println("\tstatic " + systemName + ": " + agentNames.get(resolveName(linkedSys.getName())));
		}
		managingFuncManagingInstToManagedInst = new HashMap<>();
		componentTypes = new HashMap<>();

		for (ConcreteGroup cg : concreteGroups) {
			String groupName = cg.getName();
			AbstractGroup abstractGroup = cg.getAbstractGroups().get(0).getAbsGroup();
			assert abstractGroup != null : groupName;
			String concreteGroupName = resolveName(abstractGroup.getName());
			String abstGroupAgent = agentNames.get(concreteGroupName);
			assert abstGroupAgent != null : abstractGroup.getName() + "\n" + agentNames;
			pw.println("\tstatic " + groupName + ": " + abstGroupAgent);
			/*
			 * ConcreteSystem ms = cg.getManSys(); if (ms != null) { AbstractSystem absSyst
			 * = ms.getBindings().get(0).getAbsSys(); assert absSyst != null; String[] a =
			 * managingToManagedToFunc.get(abstGroupAgent); assert a != null; //
			 * pw.println(Arrays.toString(a)); if
			 * (!managingFuncManagingInstToManagedInst.containsKey(a[1])) {
			 * managingFuncManagingInstToManagedInst.put(a[1], new LinkedHashMap<>()); }
			 * managingFuncManagingInstToManagedInst.get(a[1]).put(groupName, ms.getName());
			 * }
			 */
			List<ConcreteSystem> mss = cg.getManSys();
			if (mss != null) {
				List<String[]> listA = managingToManagedToFunc.get(abstGroupAgent);
				if (listA != null) {
					for(String[] a: listA) {
						//System.out.println("a " + Arrays.toString(a));
						if (!managingFuncManagingInstToManagedInst.containsKey(a[1])) {
							managingFuncManagingInstToManagedInst.put(a[1], new LinkedHashMap<>());
						}
						Map<String, ArrayList<String>> map = managingFuncManagingInstToManagedInst.get(a[1]);
						ArrayList<String> list = new ArrayList<String>();
						if (!map.containsKey(groupName)) {
							map.put(groupName, list);
						}
						for (ConcreteSystem ms : mss) {
							// System.out.println("bindings: " + ms.getBindings());
							AbstractSystem absSyst = ms.getBindings().get(0).getAbsSys();
							
							assert absSyst != null;
							if((ms.getBindings().get(0).getName() + "MdA").equals(a[0])) {
								//System.out.println("absSyst: " + ms.getBindings().get(0).getName());
								list.add(ms.getName());
							}
						}
					}
				}
			}

			for (ComponentInstance c : cg.getComponents()) {
				componentTypes.put(c.getName(), c.getType());
				// System.out.println(c.getName()+ " "+c.getType());
			}
		}

		componentInteractions = new LinkedHashMap<>();
		for (Interaction i : configuration.getConcreteInteractions()) {
			ComponentName startInt = i.getStart();
			String initComp = startInt.getComponent().getName();
			ConcreteGroup startConcreteGroup = (ConcreteGroup) startInt.getComponent().eContainer();
			assert startConcreteGroup != null : startInt.getComponent();
			String startGroupName = startConcreteGroup.getName();
			ComponentName endInt = i.getEnd();
			ConcreteGroup endConcreteGroup = (ConcreteGroup) endInt.getComponent().eContainer();
			String endComp = endInt.getComponent().getName();
			String endGroupName = endConcreteGroup.getName();
			String initCompType = componentTypes.get(initComp);
			String endCompType = componentTypes.get(endComp);

			// String start = startGroupName + "." + initComp;
			// String end = endGroupName + "." + endComp;
			// System.out.println(start + "->" + end);

			String absGroupStart = startConcreteGroup.getAbstractGroups().get(0).getName();
			String absGroupEnd = endConcreteGroup.getAbstractGroups().get(0).getName();
			if (!absGroupStart.equals(absGroupEnd)) {
				// System.out.println(absGroupStart + "->" + absGroupEnd);
				// System.out.println(initComp + initCompType + "->" + endComp + endCompType);

				String firstFunc = null;
				String secondFunc = null;
				for (String[] f : absIntFuncs) {
					// System.out.println(Arrays.toString(f));
					// absIntFuncs.add(new String[] {funcName, startGroupName, startComp,
					// endGroupName, endComp, startGroupAgent, endGroupAgent,
					// i.getHighMult().equals("*")?"SET":"SINGLE"});
					if (f[1].equals(absGroupStart) && f[2].equals(initCompType) && f[3].equals(absGroupEnd)
							&& f[4].equals(endCompType)) {
						firstFunc = f[0];
						compIntFuncToDomValues.get(f[0]).add(startGroupName);
						if (!componentInteractions.containsKey(f[0])) {
							componentInteractions.put(f[0], new HashMap<>());
						}
					}
					if (f[1].equals(absGroupEnd) && f[2].equals(endCompType) && f[3].equals(absGroupStart)
							&& f[4].equals(initCompType)) {
						secondFunc = f[0];
						compIntFuncToDomValues.get(f[0]).add(endGroupName);
						if (!componentInteractions.containsKey(f[0])) {
							componentInteractions.put(f[0], new HashMap<>());
						}
					}
				}
				assert firstFunc != null;
				assert secondFunc != null;

				if (!componentInteractions.get(firstFunc).containsKey(startGroupName)) {
					componentInteractions.get(firstFunc).put(startGroupName, new ArrayList<>());
				}
				componentInteractions.get(firstFunc).get(startGroupName).add(endGroupName);

				if (!componentInteractions.get(secondFunc).containsKey(endGroupName)) {
					componentInteractions.get(secondFunc).put(endGroupName, new ArrayList<>());
				}
				componentInteractions.get(secondFunc).get(endGroupName).add(startGroupName);
			}
		}
		// System.out.println(componentInteractions);
	}

	private void generateBody() {
		pw.println("\ndefinitions:");

		for (String d : derivedFunctions.keySet()) {
			pw.println("\tfunction " + d + " =");
			pw.println("\t\t" + derivedFunctions.get(d));
			pw.println();
		}

		for (String rule : allRules) {
			pw.println("\trule " + rule + " =");
			if (getCleanUpRule.values().contains(rule)) {
				if (ruleBody.containsKey(rule)) {
					pw.println("\t\t" + ruleBody.get(rule) + "\n");
				} else {
					pw.println("\t\tskip //<<TODO>>\n");
				}
			} else if (!programRules.containsKey(rule)) {
				String tab = "\t\t";
				if (ruleGuard.containsKey(rule)) {
					pw.println(tab + "if " + ruleGuard.get(rule) + " then");
					tab = tab + "\t";
				}
				pw.println(tab + "par");
				pw.println(tab + "\tskip //<<TODO>>");
				if (calledRules.containsKey(rule)) {
					assert calledRules.get(rule).size() > 0;
					assert !ruleAction.containsKey(rule) : rule;
					assert !ruleBody.containsKey(rule) : rule;
					for (String calledRule : calledRules.get(rule)) {
						pw.println(tab + "\t" + calledRule + "[]");
					}
				} else if (ruleAction.containsKey(rule)) {
					assert !ruleBody.containsKey(rule) : rule + "\n" + ruleAction.get(rule) + "\n" + ruleBody.get(rule);
					pw.println(tab + "\t" + ruleAction.get(rule));
				} else if (ruleBody.containsKey(rule)) {
					pw.println(tab + "\t" + ruleBody.get(rule));
				}
				pw.println(tab + "\t" + getCleanUpRule.get(rule) + "[]");
				pw.println(tab + "endpar");
				if (ruleGuard.containsKey(rule)) {
					pw.println("\t\tendif");
				}
				pw.println();
			} else {
				LinkedHashSet<String> rules = programRules.get(rule);
				if (rules.size() == 0) {
					pw.println("\t\tskip //<<TODO>>\n");
				} else {
					String init = "";
					String end = "";
					String tab = "\t\t";
					if (rules.size() > 1) {
						init = tab + "par\n";
						end = tab + "endpar\n";
						tab = tab + "\t";
					}
					pw.print(init);
					for (String r : rules) {
						pw.println(tab + r + "[]");
					}
					pw.println(end);
				}
			}
		}
		pw.println("\tmain rule r_mainRule =\n\t\tforall $a in Agent with true do\n\t\t\tprogram($a)\n");
	}

	private void generateInitFunctions() {
		for (String[] f : signalFunctions) {
			assert f.length == 3;
			pw.println("\tfunction " + f[0] + "($a in " + f[1] + ", $b in " + f[2] + ") = false");
		}

		for (String[] ais : absIntFuncs) {
			pw.println("\tfunction " + ais[0] + "($a in " + ais[5] + ") =");
			// System.out.println(compIntFuncToDomValues.get(ais[0]));
			pw.println("\t\tswitch($a)");
			for (String a : compIntFuncToDomValues.get(ais[0])) {
				pw.print("\t\t\tcase " + a + ": ");
				if (ais[7].equals("SET")) {
					pw.print("{");
				}
				ArrayList<String> connected = componentInteractions.get(ais[0]).get(a);
				// System.out.println(componentInteractions.get(ais[0]));
				pw.print(connected.get(0));
				for (int i = 1; i < connected.size(); i++) {
					pw.print(", " + connected.get(i));
				}
				if (ais[7].equals("SET")) {
					pw.print("}");
				}
				pw.println();
			}
			pw.println("\t\tendswitch\n");
		}

		for (String m : managingFuncManagingInstToManagedInst.keySet()) {
			pw.println("\tfunction " + m + "($x in " + functionDomain.get(m) + ") =\n\t\tswitch($x)");
			Map<String, ArrayList<String>> concrGrpToConcrSys = managingFuncManagingInstToManagedInst.get(m);
			boolean isSet = functionCoDomain.get(m).contains("Powerset");
			for (String cg : concrGrpToConcrSys.keySet()) {
				ArrayList<String> list = concrGrpToConcrSys.get(cg);
				String listStr = list.toString();
				if(isSet) {
					listStr = listStr.replaceAll("\\[", "{").replaceAll("\\]", "}");
				}
				else {
					listStr = listStr.replaceAll("\\[", "").replaceAll("\\]", "");
				}
				pw.println("\t\t\tcase " + cg + ": " + listStr);
			}
			pw.println("\t\tendswitch\n");
		}
	}

	private void generateInitState() {
		pw.println("default init s0:");
		generateInitFunctions();
		pw.println();
		for (String a : agentNames.values()) {
			pw.println("\tagent " + a + ": " + agentPrograms.get(a) + "[]");
		}
	}

	public ArrayList<String> getAllRules() {
		return allRules;
	}
	public Map<String, Set<String>> getCalledRules() {
		return calledRules;
	}

	public static void main(String[] args) {
		AsmGenerator g = new AsmGenerator("examples/Example.msl");
		// AsmGenerator g = new AsmGenerator(args[0]);
		g.generate();
	}
}
