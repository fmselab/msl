package org.xtext.msl.testgenerator;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import org.asmeta.flattener.RemoveArgumentsFlattener;
import org.asmeta.flattener.nesting.RemoveNestingFlattener;
import org.asmeta.flattener.rule.AsmetaFlattener;
import org.asmeta.flattener.rule.CaseRuleFlattener;
import org.asmeta.flattener.rule.ForallRuleFlattener;
import org.asmeta.flattener.rule.LetRuleFlattener;
import org.asmeta.modeladvisor.AsmetaMA;
import org.asmeta.modeladvisor.metaproperties.RuleIsReached;
import org.asmeta.modeladvisor.texpr.Expression;
import org.asmeta.modeladvisor.texpr.SimpleExpression;
import org.asmeta.modeladvisor.texpr.SometimeExpression;
import org.asmeta.modeladvisor.texpr.TemporalExpression;
import org.asmeta.nusmv.AsmetaSMV;
import org.asmeta.nusmv.MapVisitor;
import org.asmeta.nusmv.util.Util;
import org.asmeta.parser.ASMParser;
import org.asmeta.scenariorefinement.ScenarioRefiner;
import org.xtext.msl.Loader;
import org.xtext.msl.generator.asmgenerator.AsmGenerator;
import org.xtext.msl.mSL.AbstractComponentName;
import org.xtext.msl.mSL.AbstractGroup;
import org.xtext.msl.mSL.AbstractInteraction;
import org.xtext.msl.mSL.ComponentInstance;
import org.xtext.msl.mSL.ComponentName;
import org.xtext.msl.mSL.ConcreteGroup;
import org.xtext.msl.mSL.Interaction;
import org.xtext.msl.mSL.Specification;

import asmeta.structure.Asm;
import asmeta.testandmon.Counterexample;
import asmeta.testandmon.NuSMVTestSequencesExtractor;
import asmeta.transitionrules.basictransitionrules.MacroCallRule;
import asmeta.transitionrules.basictransitionrules.Rule;

public class SelfAdaptiveASMtestGenerator {
	public static boolean USE_LTL = true;
	public static boolean SPLIT_ASYNCH = true;
	public static boolean COMPLETE_CEX = true;
	private String mslPath;
	private String asmPath;
	private TypeOfProperty top;
	private Path mslP;
	private Specification spec;
	private TerminalRule terminalRule;

	private SelfAdaptiveASMtestGenerator(String mslPath, TypeOfProperty top) {
		this.mslPath = mslPath;
		this.top = top;
		spec = Loader.loadSpec(mslPath);
		mslP = Paths.get(mslPath).getParent();
		asmPath = mslP.resolve("asm").resolve(spec.getConfiguration().getName() + "_refined_forMC.asm").toString();
	}

	private void testGenerator() throws Exception, IOException {
		// detect the terminal rules TR of the MAPE loops (those without exiting
		// interactions)
		Set<TerminalRule> terminalRules = extractTerminationOfMAPE();
		assert terminalRules.size() == 1;
		terminalRule = terminalRules.iterator().next();

		Path mslP = Paths.get(mslPath);
		String mslName = mslP.getFileName().toString().replaceAll(".msl", "");

		Path mslFolder = mslP.getParent();
		File scenariosFolder = mslFolder.resolve("scenarios").toFile();
		if (!scenariosFolder.exists()) {
			scenariosFolder.mkdir();
		}

		// build the conditions (RFC: Rule Firing Conditions) that trigger TR
		// model check the negated RFC
		AsmetaSMV asmetaSMV = buildRFCandModelCheck(asmPath, terminalRules, top);
		// use the counterexamples to build scenarios for the self-adaptive ASM
		buildScenariosFromCexs(asmetaSMV, mslName, scenariosFolder.getAbsolutePath());
	}

	private void buildScenariosFromCexs(AsmetaSMV asmetaSMV, String mslName, String scenarioFolder)
			throws Exception, IOException {
		Asm asm = ASMParser.setUpReadAsm(new File(asmPath)).getMain();
		HashMap<Integer, String> counterExamples = asmetaSMV.getPropertiesCounterExample();

		List<Boolean> nuSmvPropsResults = asmetaSMV.mv.getNuSmvPropsResults();
		for (int i = 0; i < nuSmvPropsResults.size(); i++) {
			Boolean res = nuSmvPropsResults.get(i);
			if (res) {
				System.out.println("Test predicate " + i + " is infeasible");
			}
		}

		int counter = 0;
		boolean multipleScenarios = counterExamples.size() > 1;
		HashMap<Integer, String> properties = asmetaSMV.getPropertiesForPrinting();
		for (Integer key : counterExamples.keySet()) {
			String cex = asmetaSMV.replaceVarsWithLocations(counterExamples.get(key));
			String prop = properties.get(key);
			// System.out.println(prop);
			BufferedReader br = new BufferedReader(new StringReader(cex));
			Counterexample counterexample = NuSMVTestSequencesExtractor.parseCounterexample(br, COMPLETE_CEX);
			// System.out.println(counterexample);
			String name = asm.getName() + "_" + mslName + "_" + top + "_scen" + (multipleScenarios ? (counter++) : "");
			// String name = asm.getName() + "_" + mslName + "_" + top + "_scen" + key;
			Path scenarioPath = ScenarioRefiner.buildScenario(counterexample, name,
					Paths.get(scenarioFolder + "/" + name + ".avalla"),
					Paths.get("../asm/" + Paths.get(asmPath).getFileName().toString()), asm, null, true, false, prop);
			// System.out.println(scenarioPath);
		}
	}

	private AsmetaSMV buildRFCandModelCheck(String asmPath, Set<TerminalRule> terminalRules, TypeOfProperty top)
			throws Exception {
		AsmetaMA asmetaMA = AsmetaMA.buildAsmetaMA(asmPath);
		asmetaMA.execRuleIsReached = true;
		MapVisitor.FLATTEN = true;
		Class<? extends AsmetaFlattener>[] backup = MapVisitor.ALL_SMV_FLATTENERS;
		MapVisitor.ALL_SMV_FLATTENERS = new Class[] { ForallRuleFlattener.class, RemoveArgumentsFlattener.class,
				LetRuleFlattener.class, CaseRuleFlattener.class, RemoveNestingFlattener.class };
		AsmetaSMV asmetaSMV = asmetaMA.loadAsmetaSMV();
		Iterator<Entry<Rule, List<String>>> conditions = asmetaMA.mv.ruleCond.entrySet().iterator();
		boolean found = false;
		// boolean some = false;
		while (conditions.hasNext()) {
			Entry<Rule, List<String>> entry = conditions.next();
			Rule k = entry.getKey();
			if (k instanceof MacroCallRule) {
				String calledMacro = ((MacroCallRule) k).getCalledMacro().getName();
				// if (terminalRules.contains(calledMacro)) {
				List<TerminalRule> matched = terminalRules.stream()
						.filter(tr -> tr.getTerminalRule().equals(calledMacro)).collect(Collectors.toList());
				if (matched.size() > 1) {
					throw new Exception("At most one rule should match!");
				}
				if (matched.size() > 0) {
					// System.out.println("Keep " + matched.get(0));
					if (found) {
						throw new Exception("Only one supported!");
					}
					found = true;
					// some = matched.get(0).getMult().equals("*-SOME");//this is not what we want
					continue;
				}
			}
			conditions.remove();
		}
		// System.out.println(asmetaMA.mv.ruleCond);
		asmetaMA.ruleIsReached = new RuleIsReached(asmetaMA.mv.ruleCond, false);
		// asmetaMA.nuSmvProperties.put(asmetaMA.ruleIsReached,
		// asmetaMA.ruleIsReached.createNuSmvProperties());
		assert asmetaMA.mv.ruleCond.size() == 1;
		Set<Expression> properties = buildProperties(asmetaMA.mv.ruleCond.values().iterator().next());
		
		
		//asmetaMA.nuSmvProperties.put(asmetaMA.ruleIsReached, properties);
		// System.out.println(asmetaMA.nuSmvProperties);
		//asmetaMA.execCheck(asmetaSMV);
		
		// we don't want to check other CTL/LTL properties
		asmetaSMV.mv.ctlList.clear();
		asmetaSMV.mv.ltlList.clear();
		asmetaSMV.mv.ctlListNames.clear();
		asmetaSMV.mv.ltlListNames.clear();
		Set<String> smvProps = new HashSet<String>();
		for (Expression t : properties) {
			smvProps.add(t.getSMV());
		}
		if(USE_LTL) {
			asmetaSMV.addLtlProperties(smvProps);
		}
		else {
			asmetaSMV.addCtlProperties(smvProps);
		}
		asmetaSMV.createTempNuSMVfile();
		asmetaSMV.executeNuSMV();
		
		
		
		System.out.println(asmetaSMV.getSmvFileName());
		MapVisitor.ALL_SMV_FLATTENERS = backup;
		return asmetaSMV;
	}

	private Set<Expression> buildProperties(List<String> conds) {
		switch (top) {
		case ONE:
			return createSingleProperties(conds);
		case ALL_SYNCH:
			return createPropertySynch(conds);
		case ALL_ASYNCH:
			return createPropertyAsynch(conds);
		default:
			throw new RuntimeException("Type of property " + top + " not supported!");
		}
	}

	private Set<TerminalRule> extractTerminationOfMAPE() throws Exception {
		// Specification spec = Loader.loadSpec(mslPath);
		AsmGenerator ag = new AsmGenerator(spec, new PrintWriter(new StringWriter()));
		ag.generate();
		List<Interaction> interactions = spec.getConfiguration().getConcreteInteractions();
		Map<String, Set<String>> flow = new HashMap<String, Set<String>>();
		Set<String> components = new HashSet<String>();
		Map<String, Interaction> compToInteraction = new HashMap<String, Interaction>();
		for (Interaction i : interactions) {
			String startComp = getName(i.getStart());
			String endComp = getName(i.getEnd());
			// System.out.println(startComp + " -> " + endComp);
			if (!flow.containsKey(startComp)) {
				flow.put(startComp, new HashSet<String>());
			}
			flow.get(startComp).add(endComp);
			components.add(startComp);
			components.add(endComp);
			compToInteraction.put(endComp, i);
		}
		components.removeAll(flow.keySet());
		Iterator<Entry<String, Interaction>> it = compToInteraction.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Interaction> e = it.next();
			if (!components.contains(e.getKey())) {
				it.remove();
			}
		}
		// when these rules are executed, it means that the MAPE loop is completed
		Set<TerminalRule> terminalRules = new HashSet<TerminalRule>();
		for (Interaction i : compToInteraction.values()) {
			ComponentName startComp = i.getStart();
			ComponentName endComp = i.getEnd();
			String absGroupStart = ((ConcreteGroup) startComp.getComponent().eContainer()).getAbstractGroups().get(0)
					.getName();
			String absGroupEnd = ((ConcreteGroup) endComp.getComponent().eContainer()).getAbstractGroups().get(0)
					.getName();
			String componentTypeEnd = endComp.getComponent().getType();
			String componentTypeStart = startComp.getComponent().getType();
			String start = absGroupStart + componentTypeStart;
			String end = absGroupEnd + componentTypeEnd;
			String fromTo = "from" + end + "to" + start;
			String signal = "sgn" + start + end + "(" + fromTo + "(self), self)";
			Set<String> receivers = ag.getCompIntFuncToDomValues().get(fromTo);
			System.out.println("signal " + signal);
			System.out.println("fromTo " + fromTo);
			System.out.println("receivers " + receivers);
			Map<String, ArrayList<String>> connected;
			Map<String, String> codomain = new HashMap<>();
			if (receivers != null) {
				connected = ag.getComponentInteractions().get(fromTo);
				for (String r : receivers) {
					ArrayList<String> d = connected.get(r);
					if (d.size() > 1) {
						throw new Exception("Only one supported!");
					}
					System.out.println("-- " + d);
					codomain.put(r, connected.get(r).get(0));
				}
			} else {
				signal = null;
				fromTo = null;
			}
			String terminalRule = AsmGenerator.CLEAN_UP_PREFIX + end;
			AbstractInteraction ai = getAbstractInteraction(i);
			terminalRules.add(new TerminalRule(terminalRule, ai.getHigh(), signal, fromTo, receivers, codomain));
		}
		System.out.println("Terminal rules " + terminalRules);
		// System.out.println(ag.getManagingFuncManagingInstToManagedInst());
		return terminalRules;
	}

	private AbstractInteraction getAbstractInteraction(Interaction i) {
		List<AbstractInteraction> abstractInteractions = spec.getAbsPattern().getInteractions();
		// ComponentInstance startComponent = i.getStart().getComponent();
		// System.out.print(startComponent.getName() + " " + startComponent.getType());
		// ComponentInstance endComponent = i.getEnd().getComponent();
		// System.out.println("\t" + endComponent.getName() + " " +
		// endComponent.getType());

		ComponentName startInt = i.getStart();
		ConcreteGroup startConcreteGroup = (ConcreteGroup) startInt.getComponent().eContainer();
		assert startConcreteGroup != null : startInt.getComponent();
		ComponentName endInt = i.getEnd();
		ConcreteGroup endConcreteGroup = (ConcreteGroup) endInt.getComponent().eContainer();
		String absGroupStart = startConcreteGroup.getAbstractGroups().get(0).getAbsGroup().getName();
		String absGroupEnd = endConcreteGroup.getAbstractGroups().get(0).getAbsGroup().getName();
		String startType = startInt.getComponent().getType();
		String endType = endInt.getComponent().getType();
		for (AbstractInteraction ai : abstractInteractions) {
			AbstractComponentName start = ai.getStart();
			AbstractComponentName end = ai.getEnd();
			String startGroup = ((AbstractGroup) (start.getType().eContainer())).getName();
			String endGroup = ((AbstractGroup) (end.getType().eContainer())).getName();
			if (startGroup.equals(absGroupStart) && start.getType().getName().equals(startType)
					&& endGroup.equals(absGroupEnd) && end.getType().getName().equals(endType)) {
				// System.out.println(absGroupStart + "." + startType + " -> " + absGroupEnd +
				// "." + endType);
				// System.out.println(ai.getLow() + " " + ai.getHigh());
				return ai;
			}
		}
		return null;
	}

	private static String getName(ComponentName comp) {
		ComponentInstance c = comp.getComponent();
		ConcreteGroup group = (ConcreteGroup) c.eContainer();
		String groupName = group.getName();
		return groupName + "." + c.getName();
	}

	public Set<Expression> createSingleProperties(List<String> allConds) {
		Set<Expression> smvProp = new HashSet<Expression>();
		TemporalExpression property;
		// sometimes
		// EF( + cond + );
		// AG(!( + cond + ))
		for (String cond : allConds) {
			System.out.println(cond);
			String signalRep = getSignal(cond);
			if(USE_LTL) {
				property = new SimpleExpression("!F(" + cond + (signalRep != null ? (" & X(!(" + signalRep + "))") : "") + ")");
			}
			else {
				property = new SometimeExpression(cond + (signalRep != null ? (" & AX(!(" + signalRep + "))") : ""));
			}
			smvProp.add(property);
		}
		return smvProp;
	}

	private String getSignal(String cond) {
		Set<String> recs = terminalRule.getReceivers();
		String signal = terminalRule.getSignal();
		Map<String, String> codomains = terminalRule.getCodomain();
		System.out.println("codomains " + codomains);
		String signalRep = signal;
		if (recs != null) {
			for (String rec : recs) {
				if (cond.contains(rec.toUpperCase())) {
					System.out.println("found " + rec);
					String codomain = codomains.get(rec);
					if (codomain != null) {
						signalRep = signalRep.replaceAll(terminalRule.getFromTo() + "\\(self\\)",
								codomain.toUpperCase());
					}
					signalRep = signalRep.replaceAll("self", rec.toUpperCase());
					signalRep = signalRep.replace("(", "_");
					signalRep = signalRep.replace(", ", "_");
					signalRep = signalRep.replace(")", "");
					System.out.println("replaced " + signalRep);
				}
			}
		}
		return signalRep;
	}

	public Set<Expression> createPropertySynch(List<String> allConds) {
		Set<Expression> smvProp = new HashSet<Expression>();
		TemporalExpression property;
		// sometimes
		// EF( + cond + );
		// AG(!( + cond + ))
		List<String> signals = getSignals(allConds);
		if(USE_LTL) {
			property = new SimpleExpression("!F(" + Util.and(allConds) + (signals.size() == allConds.size() ? (" & X(" + Util.and(signals) + ")") : "") + ")");
		}
		else {
			property = new SometimeExpression(Util.and(allConds) + (signals.size() == allConds.size() ? (" & AX(" + Util.and(signals) + ")") : ""));
		}
		smvProp.add(property);
		return smvProp;
	}

	private List<String> getSignals(List<String> allConds) {
		List<String> signals = new ArrayList<>();
		for (String cond : allConds) {
			String signalRep = getSignal(cond);
			if (signalRep != null) {
				signals.add("!(" + signalRep + ")");
			}
		}
		return signals;
	}

	public Set<Expression> createPropertyAsynch(List<String> allConds) {
		Set<Expression> smvProp = new HashSet<Expression>();
		TemporalExpression property;
		List<List<String>> condsPerms = buildPermutations(allConds, 0);
		Set<String> tempExps = new HashSet<String>();
		for (List<String> conds : condsPerms) {
			List<String> signals = getSignals(conds);
			StringBuilder start = new StringBuilder();
			StringBuilder end = new StringBuilder();
			for (int i = 0; i < conds.size() - 1; i++) {
				String cond = conds.get(i);
				if(USE_LTL) {
					start.append("F(" + cond + (signals.size() == allConds.size() ? (" & X(" + signals.get(i) + ")") : "") + " & ");
				}
				else {
					start.append("EF(" + cond + (signals.size() == allConds.size() ? (" & AX(" + signals.get(i) + ")") : "") + " & ");
				}
				end.append(")");
			}
			if(USE_LTL) {
				start.append("F(" + conds.get(conds.size() - 1) + (signals.size() == allConds.size() ? (" & X(" + signals.get(conds.size() - 1) + ")") : ""));
			}
			else {
				start.append("EF(" + conds.get(conds.size() - 1) + (signals.size() == allConds.size() ? (" & AX(" + signals.get(conds.size() - 1) + ")") : ""));
			}
			end.append(")");
			property = new SimpleExpression(start.toString() + end.toString());
			//System.out.println(property.getSMV());
			tempExps.add(property.getSMV());
		}
		if(SPLIT_ASYNCH) {
			for(String tempExp: tempExps) {
				SimpleExpression simpleExpr = new SimpleExpression("!(" + tempExp + ")");
				smvProp.add(simpleExpr);
			}
		}
		else {
			SimpleExpression simpleExpr = new SimpleExpression("!(" + Util.or(tempExps) + ")");
			smvProp.add(simpleExpr);
		}
		return smvProp;
	}

	static List<List<String>> buildPermutations(List<String> elements, int index) {
		List<List<String>> permutations = new ArrayList<List<String>>();
		for (int i = index; i < elements.size(); i++) {
			Collections.swap(elements, i, index);
			permutations.addAll(buildPermutations(elements, index + 1));
			Collections.swap(elements, index, i);
		}
		if (index == elements.size() - 1) {
			permutations.add(new ArrayList<String>(elements));
		}
		return permutations;
	}

	public static void testGenerator(String mslPath, TypeOfProperty top) throws Exception, IOException {
		SelfAdaptiveASMtestGenerator satg = new SelfAdaptiveASMtestGenerator(mslPath, top);
		satg.testGenerator();
	}

}

class TerminalRule {
	private String terminalRule;
	private String mult;
	private String signal;
	private String fromTo;
	private Set<String> receivers;
	private Map<String, String> codomain;

	public TerminalRule(String terminalRule, String mult, String signal, String fromTo, Set<String> receivers,
			Map<String, String> codomain) {
		this.terminalRule = terminalRule;
		this.mult = mult;
		this.signal = signal;
		this.fromTo = fromTo;
		this.receivers = receivers;
		this.codomain = codomain;
	}

	public String getTerminalRule() {
		return terminalRule;
	}

	public String getMult() {
		return mult;
	}

	public String getSignal() {
		return signal;
	}

	public String getFromTo() {
		return fromTo;
	}

	public Set<String> getReceivers() {
		return receivers;
	}

	public Map<String, String> getCodomain() {
		return codomain;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TerminalRule) {
			TerminalRule otr = (TerminalRule) obj;
			return otr.terminalRule.equals(terminalRule) && otr.mult.equals(mult);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return (terminalRule + mult + signal).hashCode();
	}

	@Override
	public String toString() {
		return terminalRule + "(" + mult + ")";
	}
}
