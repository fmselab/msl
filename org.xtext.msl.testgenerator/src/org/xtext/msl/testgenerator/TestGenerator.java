package org.xtext.msl.testgenerator;

import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
import org.asmeta.modeladvisor.metaproperties.RuleIsReached;
import org.asmeta.modeladvisor.texpr.Expression;
import org.asmeta.nusmv.AsmetaSMV;
import org.asmeta.nusmv.MapVisitor;
import org.asmeta.parser.ASMParser;
import org.asmeta.scenariorefinement.ScenarioRefiner;
import org.eclipse.emf.common.archive.Handler;
import org.xtext.msl.Loader;
import org.xtext.msl.generator.asmgenerator.AsmGenerator;
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
		//extractTerminalRulesOfMAPE(path);
		Set<String> terminalRules = getTerminalRules(path);
		
		AsmetaMA asmetaMA = new AsmetaMA(asmPath);
		asmetaMA.execRuleIsReached = true;
		MapVisitor.FLATTEN = true;
		Class<? extends AsmetaFlattener>[] backup = MapVisitor.ALL_SMV_FLATTENERS;
		MapVisitor.ALL_SMV_FLATTENERS = new Class[] {ForallRuleFlattener.class, RemoveArgumentsFlattener.class, LetRuleFlattener.class, CaseRuleFlattener.class, RemoveNestingFlattener.class};
		//asmetaMA.runCheck();
		AsmetaSMV asmetaSMV = asmetaMA.loadAsmetaSMV();
		AsmetaMA.LOG_COUNTEREXAMPLES = true;
		Iterator<Entry<Rule, List<String>>> conditions = asmetaMA.mv.ruleCond.entrySet().iterator();
		while(conditions.hasNext()) {
			Entry<Rule, List<String>> entry = conditions.next();
			Rule k = entry.getKey();
			if(k instanceof MacroCallRule) {
				if(terminalRules.contains(((MacroCallRule)k).getCalledMacro().getName())) {
					//System.out.println("Keep " + k);
					continue;
				}
			}
			conditions.remove();
		}
		//System.out.println(asmetaMA.mv.ruleCond.size());
		asmetaMA.ruleIsReached = new RuleIsReached(asmetaMA.mv.ruleCond, false);
		asmetaMA.nuSmvProperties.put(asmetaMA.ruleIsReached, asmetaMA.ruleIsReached.createNuSmvProperties());
		asmetaMA.execCheck(asmetaSMV);
		MapVisitor.ALL_SMV_FLATTENERS = backup;

		Set<Expression> properties = asmetaMA.nuSmvProperties.get(asmetaMA.ruleIsReached);
		Set<String> translatedProperties = asmetaMA.translate(properties);
		
		Map<String, Boolean> results = asmetaMA.results(asmetaSMV, translatedProperties);
		
		HashMap<Integer, String> counterExamples = asmetaSMV.getPropertiesCounterExample();
		for(Integer key: counterExamples.keySet()) {
			String cex = asmetaSMV.replaceVarsWithLocations(counterExamples.get(key));
			System.out.println(cex);
			BufferedReader br = new BufferedReader(new StringReader(cex));
			Counterexample counterexample = NuSMVTestSequencesExtractor.parseCounterexample(br, false);
			//System.out.println(counterexample);
			
			Path scenarioPath = ScenarioRefiner.buildScenario(counterexample, "scen", Paths.get("./scen.test"), Paths.get(asmPath), asm, null, true);
			
		}
		
		//System.out.println(asmetaSMV.outputRunNuSMVreplace);
		
	}

	private static Set<String> getTerminalRules(String path) {
		AsmGenerator asmGenerator = new AsmGenerator(path, new PrintWriter(new StringWriter()));
		asmGenerator.generate();
		ArrayList<String> allRules = asmGenerator.getAllRules();
		Map<String, Set<String>> calledRules = asmGenerator.getCalledRules();
		Set<String> rulesCalledInMape = new HashSet<String>();
		for(String r: allRules) {
			//System.out.println(r);
			Set<String> rulesCalledByR = calledRules.get(r);
			if(rulesCalledByR != null) {
				rulesCalledInMape.addAll(rulesCalledByR);
			}
		}
		Set<String> terminalRules = new HashSet<String>();
		System.out.println("Terminal rules");
		for(String r: rulesCalledInMape) {
			if(calledRules.get(r) == null) {
				System.out.println(r);
				terminalRules.add(r);
			}
		}
		return terminalRules;
	}

	private static void extractTerminalRulesOfMAPE(String path) {
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
		
		System.out.println("Terminal rules " + elements);
		
	}

	private static String getName(ComponentName comp) {
		ComponentInstance c = comp.getComponent();
		ConcreteGroup group = (ConcreteGroup) c.eContainer();
		String groupName = group.getName();
		return groupName + "." +c.getName();
	}
}
