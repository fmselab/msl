package org.xtext.msl.generator.openhabgenerator;

public class OpenHABSwitch {
	private String name;
	private String label;
	private String groupName;
	
	public OpenHABSwitch (String swName) {
		name = "start_" + swName + "_" + OpenHABGenerator.concern;
		label = "start_" + swName + "_" + OpenHABGenerator.concern;
	}
	
	public void setGroupName (String grName) {
		groupName = grName;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		String temp = "Switch " + name + " \"" + label + "\" (" + groupName + ")";
		return temp;
	}
}
