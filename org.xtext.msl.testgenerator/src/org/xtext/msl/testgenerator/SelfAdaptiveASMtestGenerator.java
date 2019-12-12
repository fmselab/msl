package org.xtext.msl.testgenerator;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Path;
import java.nio.file.Paths;
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

	public static void main(String[] args) throws Exception {
		String mslPath = "../examples/SmartHomeGateway/SmartHomeGateway/HC_MAPE.msl";
		String asmPath = "../examples/SmartHomeGateway/SmartHomeGateway/asm/MySmartHomeHC_refined_forMC.asm";

		testGenerator(mslPath, asmPath, TypeOfProperty.ONE);
	}

	private static void testGenerator(String mslPath, String asmPath, TypeOfProperty top) throws Exception, IOException {
		// detect the terminal rules TR of the MAPE loops (those without exiting
		// interactions)
		Set<TerminalRule> terminalRules = extractTerminationOfMAPE(mslPath);
		//System.out.println(terminalRules);
		//terminalRules.clear();
		//terminalRules.add("r_CleanUp_IntHCE");
		// build the conditions (RFC: Rule Firing Conditions) that trigger TR
		// model check the negated RFC
		AsmetaSMV asmetaSMV = buildRFCandModelCheck(asmPath, terminalRules, top);
		// use the counterexamples to build scenarios for the self-adaptive ASM
		buildScenariosFromCexs(asmPath, asmetaSMV);
	}

	private static void buildScenariosFromCexs(String asmPath, AsmetaSMV asmetaSMV) throws Exception, IOException {
		Asm asm = ASMParser.setUpReadAsm(new File(asmPath)).getMain();
		HashMap<Integer, String> counterExamples = asmetaSMV.getPropertiesCounterExample();
		int counter = 0;
		boolean multipleScenarios = counterExamples.size() > 1;
		for (Integer key : counterExamples.keySet()) {
			String cex = asmetaSMV.replaceVarsWithLocations(counterExamples.get(key));
			// System.out.println(cex);
			BufferedReader br = new BufferedReader(new StringReader(cex));
			Counterexample counterexample = NuSMVTestSequencesExtractor.parseCounterexample(br, false);
			// System.out.println(counterexample);
			String name = asm.getName() + "_scen" + (multipleScenarios?(counter++):"");
			Path scenarioPath = ScenarioRefiner.buildScenario(counterexample, name, Paths.get("./" + name + ".test"),
					Paths.get(asmPath), asm, null, true, false);
			System.out.println(scenarioPath);
		}
	}

	private static AsmetaSMV buildRFCandModelCheck(String asmPath, Set<TerminalRule> terminalRules, TypeOfProperty top) throws Exception {
		AsmetaMA asmetaMA = AsmetaMA.buildAsmetaMA(asmPath);
		asmetaMA.execRuleIsReached = true;
		MapVisitor.FLATTEN = true;
		Class<? extends AsmetaFlattener>[] backup = MapVisitor.ALL_SMV_FLATTENERS;
		MapVisitor.ALL_SMV_FLATTENERS = new Class[] { ForallRuleFlattener.class, RemoveArgumentsFlattener.class,
				LetRuleFlattener.class, CaseRuleFlattener.class, RemoveNestingFlattener.class };
		AsmetaSMV asmetaSMV = asmetaMA.loadAsmetaSMV();
		Iterator<Entry<Rule, List<String>>> conditions = asmetaMA.mv.ruleCond.entrySet().iterator();
		boolean found = false;
		//boolean some = false;
		while (conditions.hasNext()) {
			Entry<Rule, List<String>> entry = conditions.next();
			Rule k = entry.getKey();
			if (k instanceof MacroCallRule) {
				String calledMacro = ((MacroCallRule) k).getCalledMacro().getName();
				//if (terminalRules.contains(calledMacro)) {
				List<TerminalRule> matched = terminalRules.stream().filter(tr -> tr.getTerminalRule().equals(calledMacro)).collect(Collectors.toList());
				if(matched.size() > 1) {
					throw new Exception("At most one rule should match!");
				}
				if (matched.size() > 0) {
					//System.out.println("Keep " + matched.get(0));
					if(found) {
						throw new Exception("Only one supported!");
					}
					found = true;
					//some = matched.get(0).getMult().equals("*-SOME");//this is not what we want
					continue;
				}
			}
			conditions.remove();
		}
		// System.out.println(asmetaMA.mv.ruleCond);
		asmetaMA.ruleIsReached = new RuleIsReached(asmetaMA.mv.ruleCond, false);
		// asmetaMA.nuSmvProperties.put(asmetaMA.ruleIsReached,
		// asmetaMA.ruleIsReached.createNuSmvProperties());
		Set<Expression> properties = buildProperties(asmetaMA.mv.ruleCond, top);
		asmetaMA.nuSmvProperties.put(asmetaMA.ruleIsReached, properties);
		//System.out.println(asmetaMA.nuSmvProperties);
		asmetaMA.execCheck(asmetaSMV);
		MapVisitor.ALL_SMV_FLATTENERS = backup;
		return asmetaSMV;
	}
	
	private static Set<Expression> buildProperties(Map<Rule, List<String>> conds, TypeOfProperty top) {
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

	private static Set<TerminalRule> extractTerminationOfMAPE(String mslPath) {
		Specification spec = Loader.loadSpec(mslPath);
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
			ComponentName end = i.getEnd();
			String absGroup = ((ConcreteGroup) end.getComponent().eContainer()).getAbstractGroups().get(0).getName();
			String componentType = end.getComponent().getType();
			// System.out.println(absGroup + "_" + componentType);
			String terminalRule = AsmGenerator.CLEAN_UP_PREFIX + absGroup + componentType;
			AbstractInteraction ai = getAbstractInteraction(spec, i);
			terminalRules.add(new TerminalRule(terminalRule, ai.getHigh()));
		}
		// System.out.println("Terminal rules " + terminalRules);
		return terminalRules;
	}
	
	private static AbstractInteraction getAbstractInteraction(Specification spec, Interaction i) {
		List<AbstractInteraction> abstractInteractions = spec.getAbsPattern().getInteractions();
		//ComponentInstance startComponent = i.getStart().getComponent();
		//System.out.print(startComponent.getName() + " " + startComponent.getType());
		//ComponentInstance endComponent = i.getEnd().getComponent();
		//System.out.println("\t" + endComponent.getName() + " " + endComponent.getType());

		ComponentName startInt = i.getStart();
		ConcreteGroup startConcreteGroup = (ConcreteGroup) startInt.getComponent().eContainer();
		assert startConcreteGroup != null : startInt.getComponent();
		ComponentName endInt = i.getEnd();
		ConcreteGroup endConcreteGroup = (ConcreteGroup) endInt.getComponent().eContainer();
		String absGroupStart = startConcreteGroup.getAbstractGroups().get(0).getAbsGroup().getName();
		String absGroupEnd = endConcreteGroup.getAbstractGroups().get(0).getAbsGroup().getName();		
		String startType = startInt.getComponent().getType();
		String endType = endInt.getComponent().getType();
		for(AbstractInteraction ai: abstractInteractions) {
			AbstractComponentName start = ai.getStart();
			AbstractComponentName end = ai.getEnd();
			String startGroup = ((AbstractGroup) (start.getType().eContainer())).getName();
			String endGroup = ((AbstractGroup) (end.getType().eContainer())).getName();
			if(startGroup.equals(absGroupStart) && start.getType().getName().equals(startType) && endGroup.equals(absGroupEnd) && end.getType().getName().equals(endType)) {
				//System.out.println(absGroupStart + "." + startType + " -> " + absGroupEnd + "." + endType);
				//System.out.println(ai.getLow() + " " + ai.getHigh());
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

	public static Set<Expression> createSingleProperties(Map<Rule, List<String>> allConds) {
		Set<Expression> smvProp = new HashSet<Expression>();
		TemporalExpression property;
		for (Rule rule : allConds.keySet()) {
			// sometimes
			// EF( + cond + );
			// AG(!( + cond + ))
			for (String cond : allConds.get(rule)) {
				//System.out.println(cond);
				property = new SometimeExpression(cond);
				smvProp.add(property);
			}
		}
		return smvProp;
	}
	
	public static Set<Expression> createPropertySynch(Map<Rule, List<String>> allConds) {
		Set<Expression> smvProp = new HashSet<Expression>();
		TemporalExpression property;
		for (Rule rule : allConds.keySet()) {
			// sometimes
			// EF( + cond + );
			// AG(!( + cond + ))
			property = new SometimeExpression(Util.and(allConds.get(rule)));
			smvProp.add(property);
		}
		return smvProp;
	}

	public static Set<Expression> createPropertyAsynch(Map<Rule, List<String>> allConds) {
		Set<Expression> smvProp = new HashSet<Expression>();
		TemporalExpression property;
		Set<String> tempExps = new HashSet<String>();
		for (Rule rule : allConds.keySet()) {
			// sometimes
			// EF( + cond + );
			// AG(!( + cond + ))
			property = new SometimeExpression(Util.and(allConds.get(rule)));
			tempExps.add(property.getSMV());
		}
		smvProp.add(new SimpleExpression(Util.or(tempExps)));
		return smvProp;
	}
}

class TerminalRule {
	private String terminalRule;
	private String mult;
	
	public TerminalRule(String terminalRule, String mult) {
		this.terminalRule = terminalRule;
		this.mult = mult;
	}

	public String getTerminalRule() {
		return terminalRule;
	}
	
	public String getMult() {
		return mult;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof TerminalRule) {
			TerminalRule otr = (TerminalRule)obj;
			return otr.terminalRule.equals(terminalRule) && otr.mult.equals(mult);
 		}
		return false;
	}

	@Override
	public int hashCode() {
		return (terminalRule + mult).hashCode();
	}

	@Override
	public String toString() {
		return terminalRule + "(" + mult + ")";
	}
}

enum TypeOfProperty {
	ONE, ALL_SYNCH, ALL_ASYNCH;
}

