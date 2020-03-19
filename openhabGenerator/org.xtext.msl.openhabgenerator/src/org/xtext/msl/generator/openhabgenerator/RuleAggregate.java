package org.xtext.msl.generator.openhabgenerator;

//import java.util.Map;
//import java.util.HashMap;

public class RuleAggregate extends OpenHABRule {
	private OpenHABGroup groupSwitch;
	
	public RuleAggregate(String ruleName, OpenHABGroup ruleGroup) {
		super("Aggregate_" + ruleName);
		groupSwitch = ruleGroup;
	}
	
	public OpenHABGroup getGroupSwitch() {
		return groupSwitch;
	}
	
	@Override
	public String toString() {
		String temp = "rule \"" + getName() + "\"\n";
		
		temp += "when\n";
		temp += OpenHABGenerator.TAB + "Item " + groupSwitch.getName() + " received update ON\n";

		//Body starts here
		temp += "then\n";
		
		//Logging infrastructure, builds an enumeration of groups 
		if(OpenHABGenerator.writeLog) {
			String work = "Aggregating output from ";
			for(OpenHABRule ohr : getIn()) {
				if(!(ohr == getIn().get(getIn().size() - 1))) {
					work += ohr.getTriggers().get(0).getName() + ", ";
				} else {
					work = work.substring(0, work.length() - 2);
					if(getGroupSwitch().getType() == OpenHABGroupType.AND) {
						work += " and ";
					} else if(getGroupSwitch().getType() == OpenHABGroupType.OR) {
						work += " or ";
					}
					work += ohr.getTriggers().get(0).getName();
				}
			}
			work += " to " + getOut().get(0).getTriggers().get(0).getName() + ".";
			temp += String.format(OpenHABGenerator.logTemplate, work);
			temp += "\n";
			
			if(!OpenHABGenerator.needMutex) {
				//Aggregate, Simple only
				for(OpenHABRule ohr : getIn()) {
					temp += OpenHABGenerator.TAB + ohr.getCounterVarName() + " = " + ohr.getCounterVarName() + " + 1\n";
					temp += String.format(OpenHABGenerator.logTemplate, ohr.getCounterVarName() + " = \" + " + ohr.getCounterVarName() + " + \"." );
					temp += "\n";
				}
			}
		}
		if(OpenHABGenerator.needMutex) {
			//MasterSlave
			
			temp += OpenHABGenerator.TAB + "if(";
			String work = "";
			for(OpenHABRule ohr : getIn()) {
				
				//Turning of Switches
				//work is an OR clause of mod loop variables
				if(ohr instanceof RuleMonitor) {
					temp += ((RuleMonitor)ohr).getLoopSwitch().getName() + ".state == ON){\n";
					if(OpenHABGenerator.writeLog) {
						temp += OpenHABGenerator.TAB + OpenHABGenerator.TAB + ohr.getCounterVarName() + " = " + ohr.getCounterVarName() + " + 1\n";
						temp += OpenHABGenerator.TAB + String.format(OpenHABGenerator.logTemplate, ohr.getCounterVarName() + " = \" + " + ohr.getCounterVarName() + " + \"." );
						temp += "\n";
					}
					temp += OpenHABGenerator.TAB + OpenHABGenerator.TAB + "sendCommand(" + ((RuleMonitor)ohr).getLoopSwitch().getName() + ", OFF)\n";
					temp += OpenHABGenerator.TAB + "} else if (";
					work += ((RuleMonitor)ohr).getLoopMod() + " || ";
				}
			}
			temp = temp.substring(0, temp.length() - 10) + "\n";
			
			//do-whiles to guarantee mutual exclusion
			work = work.substring(0, work.length() - 4);
			temp += "\n";
			temp += OpenHABGenerator.TAB + "do{\n";
			temp += OpenHABGenerator.TAB + OpenHABGenerator.TAB + "do{\n";
			if(OpenHABGenerator.writeLog) {
				temp += OpenHABGenerator.TAB + OpenHABGenerator.TAB + String.format(OpenHABGenerator.logTemplate, getName() + " is sleeping for 1 second...");
			}
			temp += OpenHABGenerator.TAB + OpenHABGenerator.TAB + OpenHABGenerator.TAB + "Thread::sleep(1000)\n";
			temp += OpenHABGenerator.TAB + OpenHABGenerator.TAB + "} while(";
				//work is used here
			temp += work;
			temp += ")\n";
			if(OpenHABGenerator.writeLog) {
				temp += OpenHABGenerator.TAB + String.format(OpenHABGenerator.logTemplate, getName() + " is sleeping for 1 second...");
			}
			temp += OpenHABGenerator.TAB + OpenHABGenerator.TAB + "Thread::sleep(1000)\n";
			temp += OpenHABGenerator.TAB + "} while(" + getOut().get(0).getTriggers().get(0).getName() + ")\n";
			temp += "\n";
			if(OpenHABGenerator.writeLog) {
				temp += String.format(OpenHABGenerator.logTemplate, getName() + " stopped sleeping.");
				temp += "\n";
			}
			
		} else {
			//Aggregate, Simple
			
			//Turning OFF switches
			for(OpenHABSwitch ohs : this.getTriggers()) {
				temp += OpenHABGenerator.TAB + "sendCommand(" + ohs.getName() + ", OFF)\n";
			}
			temp += "\n";
		}
		
		//Turning ON exit switch
		for(OpenHABRule ohr : getOut()) {
			temp += OpenHABGenerator.TAB + "sendCommand(" + ohr.getTriggers().get(0).getName() + ", ON)\n";
		}
		temp += "end\n";
		return temp;
	}
}
