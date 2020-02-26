package org.xtext.msl.generator.openhabgenerator;

import org.xtext.msl.mSL.*;

public class RuleMonitor extends OpenHABRule {
	private boolean start;
	private ComponentInstance component;
	
	//loop data for master/slave and aggregate
	//in non-start monitors these fields are left empty
	//if mutual exclusion is not needed only loopSwitch is filled.
	private OpenHABSwitch loopSwitch;
	private String loopMod;
	private String loopCall;
	private String loopPriority;
	private String loopAdaptationRequired;

	public RuleMonitor(String ruleName, ComponentInstance ruleComponent, boolean isStart) {
		super("Monitor_" + ruleName + "_" + OpenHABGenerator.concern);
		start = isStart;
		component = ruleComponent;
	}

	public ComponentInstance getComponent() {
		return component;
	}
	
	public boolean isStart() {
		return start;
	}
	
	@Override
	public String toString() {
		String temp = "rule \"" + getName() + "\"\n";
		
		temp += "when\n";
		temp += OpenHABGenerator.tab + "Item " + getTriggers().get(0).getName() + " received command ON\n";

		//Body starts here
		temp += "then\n";
		
		//Turning switch OFF
		temp += OpenHABGenerator.tab + "sendCommand(" + getTriggers().get(0).getName() + ", OFF)\n";
		
		//Logging infrastructure
		if(OpenHABGenerator.writeLog) {
			temp += "\n" + OpenHABGenerator.tab + getCounterVarName() + " = " + getCounterVarName() + " + 1\n";
			temp += String.format(OpenHABGenerator.logTemplate, "Monitor for group (" + getGroupName() + ") active.");
			temp += String.format(OpenHABGenerator.logTemplate, getCounterVarName() + " = \" + " + getCounterVarName() + " + \".");
		}
		temp += "\n";
		
		if(OpenHABGenerator.needMutex) {
			//MasterSlave only
			
			//Try/Finally for mutual exclusion
			
			//Try
			temp += OpenHABGenerator.tab + "try {\n";
			if(OpenHABGenerator.writeLog) {
				temp += OpenHABGenerator.tab + String.format(OpenHABGenerator.logTemplate, getName() + " is requesting a lock on lock_m.");
			}
			temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "lock_m.lock()\n";
			
			//Finally
			temp += OpenHABGenerator.tab + "} finally {\n";
			if(OpenHABGenerator.writeLog) {
				temp += OpenHABGenerator.tab + String.format(OpenHABGenerator.logTemplate, getName() + " obtained a lock on lock_m.");
			}
			
			//Setting Priority true if no other priority is true
			temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "if(!(";
			String work = "";
			OpenHABRule ohrVisitor = getOut().get(0);
			if(ohrVisitor instanceof RuleAggregate) {
				
				//OR condition for if clause
				for(OpenHABRule ohr : ohrVisitor.getIn()) {
					if(ohr instanceof RuleMonitor && ohr != this) {
						work += ((RuleMonitor)ohr).getLoopPriority() + "||";
					}
				}
				work = work.substring(0, work.length() - 2) + ")) {\n";
			}
			temp += work;
			temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab + getLoopPriority() + " = true\n";
			temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "}\n";
			
			//Setting call true & unlocking
			temp += OpenHABGenerator.tab + OpenHABGenerator.tab + getLoopCall() + " = true\n";
			temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "lock_m.unlock()\n";
			if(OpenHABGenerator.writeLog) {
				temp += OpenHABGenerator.tab + String.format(OpenHABGenerator.logTemplate, getName() + " released a lock on lock_m.");
			}
			temp += OpenHABGenerator.tab + "}\n";
			temp += "\n";
		}
		for(OpenHABRule ohr : getOut()) {
			
			//Turning exit switch ON
			if(ohr instanceof RuleAggregate) {
				temp += OpenHABGenerator.tab + "sendCommand(" + getLoopSwitch().getName() + ", ON)\n";
			} else {
				temp += OpenHABGenerator.tab + "sendCommand(" + ohr.getTriggers().get(0).getName() + ", ON)\n";
			}
		}
		temp += "end\n";
		return temp;
	}
	
	//Getters and Setters for loop data needed for mutual exclusion
	
	public OpenHABSwitch getLoopSwitch() {
		return loopSwitch;
	}

	public void setLoopSwitch(OpenHABSwitch sw) {
		loopSwitch = sw;
	}

	public String getLoopMod() {
		return loopMod;
	}

	public void setLoopMod() {
		loopMod= getGroupName() + "_mod";
	}

	public String getLoopCall() {
		return loopCall;
	}

	public void setLoopCall() {
		loopCall = getGroupName() + "_call";
	}

	public String getLoopPriority() {
		return loopPriority;
	}

	public void setLoopPriority() {
		loopPriority = getGroupName() + "_priority";
	}

	public String getLoopAdaptationRequired() {
		return loopAdaptationRequired;
	}

	public void setLoopAdaptationRequired() {
		loopAdaptationRequired = "adaptation_required_" + getGroupName();
	}
}
