package org.xtext.msl.generator.openhabgenerator;

import java.util.List;
import java.util.ArrayList;

public class RuleStart {
	private String name;
	private List<OpenHABRule> configurationRules;
	private List<String> groupNames;
	private List<String> groupCounters;
	
	
	//Does not extend OpenHABRule, as it is a little different from the others
	public RuleStart(List<OpenHABRule> cRules) {
		name = "StartLoop_" + OpenHABGenerator.concern;
		configurationRules = cRules;
		groupNames = new ArrayList<String>();
		groupCounters = new ArrayList<String>();
		if(OpenHABGenerator.writeLog) {
			String varName = "";
			for (OpenHABRule ohr : configurationRules) {
				if(!(ohr instanceof RuleAggregate) && !varName.equals(ohr.getCounterVarName())) {
					groupCounters.add(ohr.getCounterVarName());
					varName = ohr.getCounterVarName();
				}
			}
		}
	}
	
	@Override
	public String toString() {
		String temp = "rule \"" + name + "\"\n";
		
		temp += "when\n";
		temp += OpenHABGenerator.tab + "System started\n";
		
		//Body starts here
		temp += "then\n";
		if(OpenHABGenerator.writeLog) {
			temp += String.format(OpenHABGenerator.logTemplate, "Initializing loops for " + OpenHABGenerator.concern + ".") + "\n";
			
			//Execution counter initialization
			if(OpenHABGenerator.execNumber > 0) {
				temp += OpenHABGenerator.tab + OpenHABGenerator.execCounterVarName + " = " + OpenHABGenerator.execNumber + "\n";
				temp += String.format(OpenHABGenerator.logTemplate, "Loops will run for " + OpenHABGenerator.execNumber + " iterations.");
				temp += "\n";
			}
			
			String work = "Starting MAPE Loop for group";
			
			//Loop counters initialization
			if(groupNames.size() > 1) {
				work += "s ";
				for(String s : groupNames) {
					if(!(s == groupNames.get(groupNames.size()-1))) {
						work += "(" + s + "), ";
					}
					else {
						work = work.substring(0, work.length() - 2);
						work += " and (" + s + ").";
					}
				}
			}
			else
				work += " (" + groupNames.get(0) + ").";
			temp += String.format(OpenHABGenerator.logTemplate, work);
			for(String s : groupCounters) {
				temp += OpenHABGenerator.tab + s + " = 0\n";
				temp += String.format(OpenHABGenerator.logTemplate, s + " = \" + " + s + " + \".");
			}
			temp += "\n";
		}
		if(OpenHABGenerator.needMutex) {
			//MasterSlave
			
			//Loop variables initialization
			for(OpenHABRule ohr : configurationRules) {
				if(!(ohr instanceof RuleAggregate)) {
					if(ohr instanceof RuleMonitor && ((RuleMonitor)ohr).isStart()) {
						temp += OpenHABGenerator.tab + ((RuleMonitor)ohr).getLoopMod() + " = false\n";
						temp += OpenHABGenerator.tab + ((RuleMonitor)ohr).getLoopCall() + " = false\n";
						temp += OpenHABGenerator.tab + ((RuleMonitor)ohr).getLoopPriority() + " = false\n";
						temp += OpenHABGenerator.tab + ((RuleMonitor)ohr).getLoopAdaptationRequired() + " = false\n";
						temp += "\n";
					}
				}
			}
		} else { 
			//Simple, Aggregate
			
			//Adaptation Required variable initialization
			for(OpenHABRule ohr : configurationRules) {
				if(ohr instanceof RuleAnalyze) {
					temp += OpenHABGenerator.tab + ((RuleAnalyze)ohr).getAdaptReqs() + " = false\n";
				}
			}
		}
		temp += "\n";
		
		//Not sure this timer is needed
		temp += OpenHABGenerator.tab + "//createTimer(now.plusSeconds(1)) [|\n";
		
		//Switch state initialization
		for(OpenHABRule ohr : configurationRules) {
			if(!(ohr instanceof RuleAggregate)) {
				if(ohr instanceof RuleMonitor && ((RuleMonitor)ohr).isStart()) {
					temp += OpenHABGenerator.tab + OpenHABGenerator.tab + ohr.getTriggers().get(0).getName() + ".sendCommand(ON)\n";
				} else {
					temp += OpenHABGenerator.tab + OpenHABGenerator.tab + ohr.getTriggers().get(0).getName() + ".sendCommand(OFF)\n";
				}
			}
		}
		temp += OpenHABGenerator.tab + "//|]\n";
		temp += "end\n";
		return temp;
	}
	
	public void addGroupName(String name) {
		groupNames.add(name + "_" + OpenHABGenerator.concern);
	}

}
