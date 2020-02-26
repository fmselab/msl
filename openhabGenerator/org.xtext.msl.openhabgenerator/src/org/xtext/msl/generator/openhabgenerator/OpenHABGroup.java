package org.xtext.msl.generator.openhabgenerator;

import java.util.List;
import java.util.ArrayList;

public class OpenHABGroup {
	
	private String name;
	private String label;
	private OpenHABGroupType type;
	private List<OpenHABSwitch> switches;
	
	public OpenHABGroup (String grName, OpenHABGroupType grType) {
		name = grName + "_" + OpenHABGenerator.concern;
		label = grName + "_" + OpenHABGenerator.concern;
		type = grType;
		switches = new ArrayList<OpenHABSwitch>();
	}
	
	public void addSwitch(OpenHABSwitch s) {
		s.setGroupName(name);
		switches.add(s);
	}
	
	public String getName() {
		return name;
	}
	
	public OpenHABGroupType getType() {
		return type;
	}
	
	@Override
	public String toString() {
		String temp = "Group";
		switch(type) {
		case NONE:
			temp += " ";
			break;
		case AND:
			temp += ":Switch:AND(ON, OFF) ";
			break;
		case OR:
			temp += ":Switch:OR(ON, OFF) ";
			break;
		}
		temp += name + " \"" + label + "\"" + "\n" + "\n";
		for (OpenHABSwitch s : switches) {
			temp += s.toString() + "\n";
		}
		return temp;
	}
}
