package org.xtext.msl.generator.openhabgenerator;

import org.xtext.msl.mSL.ComponentInstance;

public class RulePlan extends OpenHABRule{
	private ComponentInstance component;
	
	public RulePlan(String ruleName, ComponentInstance ruleComponent) {
		super("Plan_" + ruleName + "_" + OpenHABGenerator.concern);
		component = ruleComponent;
	}

	public ComponentInstance getComponent() {
		return component;
	}
	
	@Override
	public String toString() {
		String temp = "rule \"" + getName() + "\"\n";
		
		temp += "when\n";
		temp += OpenHABGenerator.tab + "Item " + getTriggers().get(0).getName() + " received command ON\n";
		
		//Body starts here
		temp += "then\n";
		
		//Turns switch off
		temp += OpenHABGenerator.tab + "sendCommand(" + getTriggers().get(0).getName() + ", OFF)\n";
		
		//Logging infrastructure
		if(OpenHABGenerator.writeLog) {
			temp += "\n" + OpenHABGenerator.tab + getCounterVarName() + " = " + getCounterVarName() + " + 1\n";
			temp += String.format(OpenHABGenerator.logTemplate, "Plan for group (" + getGroupName() + ") active.");
			temp += String.format(OpenHABGenerator.logTemplate, getCounterVarName() + " = \" + " + getCounterVarName() + " + \".");
			if(!getOut().get(0).getGroupName().equals(getGroupName())) {
				temp += OpenHABGenerator.tab + getCounterVarName() + " = 0\n";
			}
		}
		temp += "\n";
		
		if(OpenHABGenerator.needMutex) {
			//MasterSlave
			
			//Reaches the Aggregate
			OpenHABRule ohrVisitor = getIn().get(0);
			while(!((ohrVisitor.getIn().get(0) instanceof RuleMonitor) && ((RuleMonitor)ohrVisitor.getIn().get(0)).isStart())) {
				ohrVisitor = ohrVisitor.getIn().get(0);
			}
			
			//For each monitor, sets up an If clause with the adaptation required flag
			//To turn the respective execute ON
			for(OpenHABRule ohr : ohrVisitor.getIn()) {
				temp += OpenHABGenerator.tab + "if(" + ((RuleMonitor)ohr).getLoopAdaptationRequired() + "){\n";
				if(OpenHABGenerator.writeLog) {
					temp += OpenHABGenerator.tab + String.format(OpenHABGenerator.logTemplate, "Proceeding to " + ohr.getIn().get(0).getName() + ".");
					temp += "\n";
				}
				temp += OpenHABGenerator.tab + OpenHABGenerator.tab + ((RuleMonitor)ohr).getLoopAdaptationRequired() + " = false\n";
				temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "sendCommand(" + ohr.getIn().get(0).getTriggers().get(0).getName() + ", ON)\n";
				temp += OpenHABGenerator.tab + "}\n";
				temp += "\n";
			}
			temp = temp.substring(0, temp.length() - 1);
		} else {
			//Aggregate, Simple
			
			//Turn exit switch ON
			for(OpenHABRule ohr : getOut())
				temp += OpenHABGenerator.tab + "sendCommand(" + ohr.getTriggers().get(0).getName() + ", ON)\n";
		}
		temp += "end\n";
		return temp;
	}
}
