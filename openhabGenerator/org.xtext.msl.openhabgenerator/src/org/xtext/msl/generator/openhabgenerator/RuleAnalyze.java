package org.xtext.msl.generator.openhabgenerator;

import org.xtext.msl.mSL.ComponentInstance;

public class RuleAnalyze extends OpenHABRule {
	private ComponentInstance component;
	private String adaptReqs;
	
	public RuleAnalyze(String ruleName, ComponentInstance ruleComponent) {
		super("Analyze_" + ruleName + "_" + OpenHABGenerator.concern);
		component = ruleComponent;
		adaptReqs = "adaptation_required_" + ruleComponent.getName();
	}

	public ComponentInstance getComponent() {
		return component;
	}
	
	
	public String getAdaptReqs() {
		return adaptReqs;
	}
	
	@Override
	public String toString() {
		
		//An analyze needs to end the loops if logging is required and a maximum number of executions is specified
		boolean needEndLoop = false;
		if(OpenHABGenerator.writeLog && OpenHABGenerator.execNumber > 0) {
			needEndLoop = true;
		}
		
		String temp = "rule \"" + getName() + "\"\n";
		
		temp += "when\n";
		temp += OpenHABGenerator.tab + "Item " + getTriggers().get(0).getName() + " received command ON\n";

		//Body starts here
		temp += "then\n";
		
		//Turning switch OFF
		temp += OpenHABGenerator.tab + "sendCommand(" + getTriggers().get(0).getName() + ", OFF)\n";
		
		if(OpenHABGenerator.writeLog) {
			temp += "\n" + OpenHABGenerator.tab + getCounterVarName() + " = " + getCounterVarName() + " + 1\n";
			temp += String.format(OpenHABGenerator.logTemplate, "Analyze for group (" + getGroupName() + ") active.");
			temp += String.format(OpenHABGenerator.logTemplate, getCounterVarName() + " = \" + " + getCounterVarName() + " + \".");
		}
		temp += "\n";
		
		if(OpenHABGenerator.needMutex) {
			//MasterSlave
			
			//reaching Monitors from Analyze
			OpenHABRule ohrVisitor = getIn().get(0);
			while(!(ohrVisitor instanceof RuleAggregate)) {
				ohrVisitor = ohrVisitor.getIn().get(0);
			}
			
			//random adaptation decision
			//work is an OR clause of adaptation variables within an if construct
			String work = OpenHABGenerator.tab + "if(";
			for(OpenHABRule ohr : ohrVisitor.getIn()) {
				if(ohr instanceof RuleMonitor && ((RuleMonitor)ohr).isStart()) {
					temp += OpenHABGenerator.tab + "if(((Math::random * 100.0).intValue + 1) <= 50 ){\n";
					temp += OpenHABGenerator.tab + OpenHABGenerator.tab + ((RuleMonitor)ohr).getLoopAdaptationRequired() + " = true\n";
					temp += OpenHABGenerator.tab + "}\n";
					work += ((RuleMonitor)ohr).getLoopAdaptationRequired() + " || ";
				}
			}
			work = work.substring(0, work.length() - 4) + ") {\n";
				//work is used here
			temp += "\n" + work;
			//Some adaptation required starts here
			
			//For each monitor, creates an if/else if(call && priority)
			temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "if(";
			for(OpenHABRule ohr : ohrVisitor.getIn()) {
				if(ohr instanceof RuleMonitor && ((RuleMonitor)ohr).isStart()) {
					temp += ((RuleMonitor)ohr).getLoopCall() + " && " + ((RuleMonitor)ohr).getLoopPriority() + ") {\n";
					
					if(OpenHABGenerator.writeLog) {
						temp += OpenHABGenerator.tab + OpenHABGenerator.tab 
							+ String.format(OpenHABGenerator.logTemplate, "Adaptation required for " + ohr.getGroupName() + ".");
					}
					
					temp += "\n";
					temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab + ((RuleMonitor)ohr).getLoopCall() + " = false\n";
					temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab + ((RuleMonitor)ohr).getLoopPriority() + " = false\n";
					temp += "\n";
					temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab + "if(";
					
					//For each OTHER monitor, creates an if/else if(call && !priority)
					for(OpenHABRule ohrOther : ohrVisitor.getIn()) { //TODO risolvere il fatto che dipende dall'ordine delle componenti
						if(ohrOther != ohr && ohrOther instanceof RuleMonitor && ((RuleMonitor)ohrOther).isStart()) {
							temp += ((RuleMonitor)ohrOther).getLoopCall() + " && !" + ((RuleMonitor)ohrOther).getLoopPriority() + ") {\n";
							
							if(OpenHABGenerator.writeLog) {
								temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab +
									String.format(OpenHABGenerator.logTemplate, "Setting " + ((RuleMonitor)ohrOther).getLoopPriority() + " to true.");
							}
								
							temp += "\n";
							
							temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab 
									+ ((RuleMonitor)ohrOther).getLoopPriority() + " = true\n";
							
							temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab + "} else if(";
						}
					}
					//OTHER monitor if clause ends here
					
					temp = temp.substring(0, temp.length() - 9) + "\n";
					temp += "\n";
					temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab + ((RuleMonitor)ohr).getLoopMod() + " = true\n";
					temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "} else if(";
				}
			}
			//monitor if clause ends here
			
			temp = temp.substring(0, temp.length() - 9) + "\n";
			temp += "\n";
			
			//Turns ON exit switch
			temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "sendCommand(" + getOut().get(0).getTriggers().get(0).getName() +  ", ON)\n";
			
			temp += OpenHABGenerator.tab + "} else {\n";
			//No adaptation required starts here
			
			//TODO there is some repeated code here
			//For each monitor, creates an if/else if(call && priority)
			temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "if(";
			for(OpenHABRule ohr : ohrVisitor.getIn()) {
				if(ohr instanceof RuleMonitor && ((RuleMonitor)ohr).isStart()) {
					temp += ((RuleMonitor)ohr).getLoopCall() + " && " + ((RuleMonitor)ohr).getLoopPriority() + ") {\n";
					
					if(OpenHABGenerator.writeLog) {
						temp += OpenHABGenerator.tab + OpenHABGenerator.tab 
							+ String.format(OpenHABGenerator.logTemplate, "No adaptation required for " + ohr.getGroupName() + ".");
					}
					temp += "\n";
					temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab + ((RuleMonitor)ohr).getLoopCall() + " = false\n";
					temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab + ((RuleMonitor)ohr).getLoopPriority() + " = false\n";
					temp += "\n";
					temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab + "if(";
					
					//For each OTHER monitor, creates an if/else if(call && !priority)
					for(OpenHABRule ohrOther : ohrVisitor.getIn()) { //TODO risolvere il fatto che dipende dall'ordine delle componenti
						if(ohrOther != ohr && ohrOther instanceof RuleMonitor && ((RuleMonitor)ohrOther).isStart()) {
							temp += ((RuleMonitor)ohrOther).getLoopCall() + " && !" + ((RuleMonitor)ohrOther).getLoopPriority() + ") {\n";
							
							if(OpenHABGenerator.writeLog) {
								temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab +
									String.format(OpenHABGenerator.logTemplate, "Setting " + ((RuleMonitor)ohrOther).getLoopPriority() + " to true.");
							}
							
							temp += "\n";
							
							temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab 
									+ ((RuleMonitor)ohrOther).getLoopPriority() + " = true\n";
							
							temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab + "} else if(";
						}
					}
					//OTHER monitor if clause ends here
					
					temp = temp.substring(0, temp.length() - 9) + "\n";
					temp += "\n";
					
					if(needEndLoop) {
						temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab + "if(" + OpenHABGenerator.execCounterVarName + " > 0){\n";
						temp += OpenHABGenerator.tab;
					}
					if(OpenHABGenerator.writeLog) {
						temp += OpenHABGenerator.tab + OpenHABGenerator.tab + String.format(OpenHABGenerator.logTemplate, "Resetting loop.");
						temp += "\n";
					}
					if(needEndLoop) {
						temp += OpenHABGenerator.tab;
					}
					//Turns monitor switches ON (with infrastructure to stop loops if needed)
					temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab + "sendCommand(" + ohr.getTriggers().get(0).getName() + ", ON)\n";
					
					if(needEndLoop) {
						temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab + "}\n";
						temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab + "else {\n";
						
						temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab 
								+ String.format(OpenHABGenerator.logTemplate, OpenHABGenerator.execCounterVarName + " = 0.");
						
						temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab 
								+ String.format(OpenHABGenerator.logTemplate, "Loops for " + OpenHABGenerator.concern + " are stopping.");
						
						temp += OpenHABGenerator.tab + OpenHABGenerator.tab + OpenHABGenerator.tab + "}\n";
					}
					
					temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "} else if(";
				}
			}
			//monitor if clause ends here
			
			temp = temp.substring(0, temp.length() - 9) + "\n";
			temp += OpenHABGenerator.tab + "}\n";	
			
		} else {
			//Aggregate, Simple
			
			//Random adaptation required generation
			temp += OpenHABGenerator.tab + "if(((Math::random * 100.0).intValue + 1) <= 50 ){\n";
			temp += OpenHABGenerator.tab + OpenHABGenerator.tab + adaptReqs + " = true\n";
			temp += OpenHABGenerator.tab + "}\n";
			temp += OpenHABGenerator.tab + "else {\n";
			temp += OpenHABGenerator.tab + OpenHABGenerator.tab + adaptReqs + " = false\n";
			temp += OpenHABGenerator.tab + "}\n\n";
			
			//If adaptation required
			temp += OpenHABGenerator.tab + "if(" + adaptReqs + "){\n";
			if(OpenHABGenerator.writeLog) {
				temp += OpenHABGenerator.tab + String.format(OpenHABGenerator.logTemplate, "Adaptation required for " + OpenHABGenerator.concern + ".");
				temp += OpenHABGenerator.tab + String.format(OpenHABGenerator.logTemplate, "Proceeding with loop.");
				temp += "\n";
			}
			
			//Turning exit switch ON
			for(OpenHABRule ohr : getOut())
				temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "sendCommand(" + ohr.getTriggers().get(0).getName() + ", ON)\n";
			temp += OpenHABGenerator.tab + "}\n";
			//IF adaptation required ends here
			
			temp += OpenHABGenerator.tab + "else {\n";
			//No adaptation required
			
			if(OpenHABGenerator.writeLog) {
				temp += OpenHABGenerator.tab + String.format(OpenHABGenerator.logTemplate, "Adaptation not required for " + OpenHABGenerator.concern + ".");
				temp += OpenHABGenerator.tab + OpenHABGenerator.tab + getCounterVarName() + " = 0\n";
				
				//If there is a max number of executions if clause to stop loops
				if(needEndLoop) {
					temp += "\n";
					temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "if(" + OpenHABGenerator.execCounterVarName + " > 0){\n";
					temp += OpenHABGenerator.tab;
				}
				temp += OpenHABGenerator.tab + String.format(OpenHABGenerator.logTemplate, "Resetting loop.");
				temp += "\n";
			}
			
			//If there is no adaptation required, the loop needs to reset
			//If there is a maximum number of executions loops stop
			for(OpenHABRule ohrVisitor : getIn()) {
				if(needEndLoop) {
					temp += OpenHABGenerator.tab;
				}
				if (ohrVisitor instanceof RuleMonitor && ((RuleMonitor)ohrVisitor).isStart()) {
					
					//Turning on monitor switch
					temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "sendCommand(" + ohrVisitor.getTriggers().get(0).getName() + ", ON)\n";
				} else {
					ohrVisitor = ohrVisitor.getIn().get(0);
					if(ohrVisitor instanceof RuleAggregate) {
						for(OpenHABRule ohr : ohrVisitor.getIn()) {
							if(ohr instanceof RuleMonitor && ((RuleMonitor)ohr).isStart()) {
								temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "sendCommand(" + ohr.getTriggers().get(0).getName() + ", ON)\n";
							}
						}
					}
				}
			}
			
			//If there are no more executions left, doesn't reset loop
			if(needEndLoop) {
				temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "}\n";
				temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "else {\n";
				temp += OpenHABGenerator.tab + OpenHABGenerator.tab + String.format(OpenHABGenerator.logTemplate, OpenHABGenerator.execCounterVarName + " = 0.");
				temp += OpenHABGenerator.tab + OpenHABGenerator.tab + String.format(OpenHABGenerator.logTemplate, "Loops for " + OpenHABGenerator.concern + " are stopping.");
				temp += OpenHABGenerator.tab + OpenHABGenerator.tab + "}\n";
			}
			temp += OpenHABGenerator.tab + "}\n";
		}
		temp += "end\n";
		return temp;
	}
}
