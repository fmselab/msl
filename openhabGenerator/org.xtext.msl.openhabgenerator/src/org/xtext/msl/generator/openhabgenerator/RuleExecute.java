package org.xtext.msl.generator.openhabgenerator;

import org.xtext.msl.mSL.ComponentInstance;

public class RuleExecute extends OpenHABRule {
	private ComponentInstance component;
	
	public RuleExecute(String ruleName, ComponentInstance ruleComponent) {
		super("Execute_" + ruleName + "_" + OpenHABGenerator.concern);
		component = ruleComponent;
	}

	public ComponentInstance getComponent() {
		return component;
	}
	
	@Override
	public String toString() {
		//TODO improve readability and comment
		//An execute needs to end the loops only if it triggers a Monitor that starts the loop
		//and only if logging is requested with a maximun number of loops
		boolean needEndLoop = false;
		if(OpenHABGenerator.writeLog && OpenHABGenerator.execNumber > 0) {
			for(OpenHABRule ohr : getOut()) {
				if(ohr instanceof RuleMonitor && ((RuleMonitor)ohr).isStart()) {
					needEndLoop = true;
				}
			}
		}
		
		String temp = "rule \"" + getName() + "\"\n";
		
		temp += "when\n";
		temp += OpenHABGenerator.tab + "Item " + getTriggers().get(0).getName() + " received command ON\n";
		
		//Body starts here
		temp += "then\n";
		
		//Turns switch OFF
		temp += OpenHABGenerator.tab + "sendCommand(" + getTriggers().get(0).getName() + ", OFF)\n";
		
		//Logging infrastructure
		if(OpenHABGenerator.writeLog) {
			temp += "\n" + OpenHABGenerator.tab + getCounterVarName() + " = " + getCounterVarName() + " + 1\n";
			temp += String.format(OpenHABGenerator.logTemplate, "Execute for group (" + getGroupName() + ") active.");
			temp += String.format(OpenHABGenerator.logTemplate, getCounterVarName() + " = \" + " + getCounterVarName() + " + \".");
			temp += OpenHABGenerator.tab + getCounterVarName() + " = 0\n";
		}
		temp += "\n";
		
		if(OpenHABGenerator.needMutex) {
			//MasterSlave
			
			//Reaches the Aggregate
			OpenHABRule ohrVisitor = getOut().get(0);
			while(!(ohrVisitor instanceof RuleAggregate)) {
				ohrVisitor = ohrVisitor.getOut().get(0);
			}
			
			//Try/Finally for mutual exclusion
			
			//Try
			temp += OpenHABGenerator.tab + "try {\n";
			if(OpenHABGenerator.writeLog) {
				temp += OpenHABGenerator.tab + String.format(OpenHABGenerator.logTemplate, getName() + " is requesting a lock on lock_e.");
			}
			temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "lock_e.lock()\n";
			
			//Finally
			temp += OpenHABGenerator.tab + "} finally {\n";
			if(OpenHABGenerator.writeLog) {
				temp += OpenHABGenerator.tab + String.format(OpenHABGenerator.logTemplate, getName() + " obtained a lock on lock_e.");
			}
			if(needEndLoop) {
				temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "if(" + OpenHABGenerator.execCounterVarName + " > 0){\n";
				temp += OpenHABGenerator.tab;
			}
			
			//Turns on each monitor switch if their mod variable is true
			//TODO: it doesn't respect the model, each execute should only be able to call their respective monitor
			temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "if(";
			for(OpenHABRule ohr : ohrVisitor.getIn()) {
				if(ohr instanceof RuleMonitor && ((RuleMonitor)ohr).isStart()) {
					temp += ((RuleMonitor)ohr).getLoopMod() + "){\n";
					if(needEndLoop) {
						temp += OpenHABGenerator.tab;
					}
					temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab + ((RuleMonitor)ohr).getLoopMod() + " = false\n";
					if(needEndLoop) {
						temp += OpenHABGenerator.tab;
					}
					temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab + "sendCommand(" + ohr.getTriggers().get(0).getName() +  ", ON)\n";
					if(needEndLoop) {
						temp += OpenHABGenerator.tab;
					}
					temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "} else if(";
				}
			}
			temp = temp.substring(0, temp.length() - 8) + "\n";
			
			//If there are no more executions left, don't reset the loop
			if(needEndLoop) {
				temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "}\n";
				temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "else {\n";
				for(OpenHABRule ohr : ohrVisitor.getIn()) {
					if(ohr instanceof RuleMonitor && ((RuleMonitor)ohr).isStart()) {
						temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab + ((RuleMonitor)ohr).getLoopMod() + " = false\n";
					}
				}				
				temp += OpenHABGenerator.tab + OpenHABGenerator.tab + String.format(OpenHABGenerator.logTemplate, OpenHABGenerator.execCounterVarName + " = 0.");
				temp += OpenHABGenerator.tab + OpenHABGenerator.tab + String.format(OpenHABGenerator.logTemplate, "Loops for " + OpenHABGenerator.concern + " are stopping.");
				temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "}\n";
			}
			temp += "\n";
			temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "lock_e.unlock()\n";
			if(OpenHABGenerator.writeLog) {
				temp += OpenHABGenerator.tab + String.format(OpenHABGenerator.logTemplate, getName() + " released a lock on lock_e.");
			}
			temp += OpenHABGenerator.tab + "}\n";
		} else {
			//Aggregate, Simple
			
			if(needEndLoop) {
				temp += OpenHABGenerator.tab + "if(" + OpenHABGenerator.execCounterVarName + " > 0){\n";
			}
			
			//Turns each exit switch ON
			for(OpenHABRule ohr : getOut()) {
				if(needEndLoop) {
					temp += OpenHABGenerator.tab;
				}
				temp += OpenHABGenerator.tab + "sendCommand(" + ohr.getTriggers().get(0).getName() + ", ON)\n";
			}
			
			//If there are no more executions left, don't reset the loop
			if(needEndLoop) {
				temp += OpenHABGenerator.tab + "}\n";
				temp += OpenHABGenerator.tab + "else {\n";
				temp += OpenHABGenerator.tab + String.format(OpenHABGenerator.logTemplate, OpenHABGenerator.execCounterVarName + " = 0.");
				temp += OpenHABGenerator.tab + String.format(OpenHABGenerator.logTemplate, "Loops for " + OpenHABGenerator.concern + " are stopping.");
				temp += OpenHABGenerator.tab + "}\n";
			}
		}
		temp += "end\n";
		return temp;
	}
}
