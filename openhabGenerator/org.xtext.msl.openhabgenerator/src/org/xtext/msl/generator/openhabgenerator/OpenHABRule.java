package org.xtext.msl.generator.openhabgenerator;

import java.util.List;
import java.util.ArrayList;

public class OpenHABRule {
	private String name;
	
	//if logging is not requested, these are empty
	 //the name of the variable used in logging to count progress in the same group
	private String counterVarName;
	 //the name of the group to which the rule belongs
	private String groupName;

	private List<OpenHABRule> in;
	private List<OpenHABRule> out;
	private List<OpenHABSwitch> triggers;
	
	public OpenHABRule (String ruleName) {
		name = ruleName;
		in = new ArrayList<OpenHABRule>();
		out = new ArrayList<OpenHABRule>();
		triggers = new ArrayList<OpenHABSwitch>();
	}
	
	public void addIn(OpenHABRule r) {
		in.add(r);
	}
	
	public void addOut(OpenHABRule r) {
		out.add(r);
	}
	
	public void addTrigger(OpenHABSwitch s) {
		triggers.add(s);
	}
	
	public String getName() {
		return name;
	}
	
	public String getCounterVarName() {
		return counterVarName;
	}
	
	public void setCounterVarName(String cvn) {
		counterVarName = "counter_" + cvn + "_" + OpenHABGenerator.concern;	
	}
	
	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String grn) {
		this.groupName = grn + "_" + OpenHABGenerator.concern;
	}
	
	public List<OpenHABRule> getIn(){
		return in;
	}
	
	public List<OpenHABRule> getOut(){
		return out;
	}
	
	public List<OpenHABSwitch> getTriggers(){
		return triggers;
	}
}
