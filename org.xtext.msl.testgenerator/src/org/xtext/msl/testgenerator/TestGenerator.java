package org.xtext.msl.testgenerator;

import java.io.BufferedReader;
import java.io.File;
import java.io.StringReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.asmeta.flattener.RemoveArgumentsFlattener;
import org.asmeta.flattener.nesting.RemoveNestingFlattener;
import org.asmeta.flattener.rule.AsmetaFlattener;
import org.asmeta.flattener.rule.CaseRuleFlattener;
import org.asmeta.flattener.rule.ForallRuleFlattener;
import org.asmeta.flattener.rule.LetRuleFlattener;
import org.asmeta.flattener.rule.MacroCallRuleFlattener;
import org.asmeta.modeladvisor.AsmetaMA;
import org.asmeta.modeladvisor.metaproperties.MacroCallRuleIsReached;
import org.asmeta.modeladvisor.metaproperties.MacroRuleCalled;
import org.asmeta.modeladvisor.texpr.Expression;
import org.asmeta.nusmv.AsmetaSMV;
import org.asmeta.nusmv.MapVisitor;
import org.asmeta.parser.ASMParser;
import org.asmeta.scenariorefinement.ScenarioRefiner;
import org.eclipse.emf.common.archive.Handler;
import org.xtext.msl.Loader;
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

public class TestGenerator {

	public static void main(String[] args) throws Exception {
		String path = "../examples/SmartHomeGateway/SmartHomeGateway/HC_MAPE.msl";
		String asmPath = "../examples/SmartHomeGateway/SmartHomeGateway/asm/MySmartHomeHC_refined_forMC.asm";
		
		Asm asm = ASMParser.setUpReadAsm(new File(asmPath)).getMain();
		
		Specification spec = Loader.loadSpec(path);
		List<Interaction> interactions = spec.getConfiguration().getConcreteInteractions();
		Map<String, Set<String>> flow = new HashMap<String, Set<String>>();
		Set<String> elements = new HashSet<String>();
		for (Interaction i : interactions) {
			String startComp = getName(i.getStart());
			String endComp = getName(i.getEnd());
			System.out.println(startComp + " -> " + endComp);
			if(!flow.containsKey(startComp)) {
				flow.put(startComp, new HashSet<String>());
			}
			flow.get(startComp).add(endComp);
			elements.add(startComp);
			elements.add(endComp);
		}
		elements.removeAll(flow.keySet());
		//System.out.println(elements);
		AsmetaMA asmetaMA = new AsmetaMA(asmPath);
		//asmetaMA.loadAsmetaSMV();
		asmetaMA.execRuleIsReached = true;
		
		/*asmetaMA.mcrIsReached = new MacroCallRuleIsReached(asmetaMA.mv.ruleCond);
		asmetaMA.mcrIsReached.createNuSmvProperties();
		Map<Rule, List<String>> b = asmetaMA.mcrIsReached.ruleCond;
		for(Rule r: asmetaMA.mcrIsReached.printResults();) {
			System.out.println(r);
		}*/
		MapVisitor.FLATTEN = true;
		Class<? extends AsmetaFlattener>[] backup = MapVisitor.ALL_SMV_FLATTENERS;
		MapVisitor.ALL_SMV_FLATTENERS = new Class[] {ForallRuleFlattener.class, RemoveArgumentsFlattener.class, LetRuleFlattener.class, CaseRuleFlattener.class, RemoveNestingFlattener.class};
		//asmetaMA.runCheck();
		AsmetaSMV asmetaSMV = asmetaMA.loadAsmetaSMV();
		AsmetaMA.LOG_COUNTEREXAMPLES = true;
		asmetaMA.setCheckers();
		asmetaMA.execCheck(asmetaSMV);
		
		Set<Expression> properties = asmetaMA.nuSmvProperties.get(asmetaMA.ruleIsReached);
		Set<String> translatedProperties = asmetaMA.translate(properties);
		
		Map<String, Boolean> results = asmetaMA.results(asmetaSMV, translatedProperties);
		HashMap<Integer, String> counterExamples = asmetaSMV.getPropertiesCounterExample();
		//System.out.println(counterExamples);
		/*for(Rule rule: asmetaMA.ruleIsReached.conditions.keySet()) {
			if(rule instanceof MacroCallRule) {
				String key = asmetaMA.ruleIsReached.smvPropAlwaysReached.get(rule);
				assert key != null;
				//Boolean alwaysReached = results.get(key);
				boolean sometimesReached = !results.get(asmetaMA.ruleIsReached.smvPropReached.get(rule));
				System.out.println(((MacroCallRule)rule).getCalledMacro().getName());
			}
		}*/
		for(Integer key: counterExamples.keySet()) {
			String cex = counterExamples.get(key);
			System.out.println(cex);
			BufferedReader br = new BufferedReader(new StringReader(cex));
			Counterexample counterexample = NuSMVTestSequencesExtractor.parseCounterexample(br, false);
			System.out.println(counterexample);
			
			Path scenarioPath = ScenarioRefiner.buildScenario(counterexample, "scen", Paths.get("."), Paths.get(asmPath), asm, null, true);
			
			break;
		}
		
		MapVisitor.ALL_SMV_FLATTENERS = backup;
	}

	private static String getName(ComponentName comp) {
		ComponentInstance c = comp.getComponent();
		ConcreteGroup group = (ConcreteGroup) c.eContainer();
		String groupName = group.getName();
		return groupName + "." +c.getName();
	}
}
