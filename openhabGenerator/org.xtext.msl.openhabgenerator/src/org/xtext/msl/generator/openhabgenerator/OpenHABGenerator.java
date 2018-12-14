package org.xtext.msl.generator.openhabgenerator;

import java.io.PrintWriter;
import java.io.File;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.xtext.msl.Loader;
import org.xtext.msl.generator.Generator;

import org.xtext.msl.mSL.*;

public class OpenHABGenerator extends Generator {
	private boolean writeLog;
	
	private int exec_number;
	private static final int exec_default = 10;
	private static final boolean writeLog_default = true;
	
	private Map<ComponentInstance, AbstractComponent> concrToAbsComponents; //Map that links a ComponentInstance with the corresponding AbstractComponent
	private Map<Interaction, AbstractInteraction> concrToAbsInteractions; //Map that links an Interaction with the corresponding AbstractInteraction
	private Map<ComponentInstance, ConcreteGroup> compToGroupConcrete; //Map that links a ComponentInstance with the ConcreteGroup containing it
	private Map<AbstractComponent, AbstractGroup> compToGroupAbs; //Map that links an AbstractComponent with the AbstractGroup containing it
	
	private Map<ComponentInstance, List<Interaction>> interactWithSameStart; //Map that links a ComponentInstance with a list of Interactions with at least 2 elements that start from it
	private Map<ComponentInstance, List<Interaction>> interactWithSameEnd; //Map that links a ComponentInstance with a list of Interactions with at least 2 elements that end in it
	
	public OpenHABGenerator(Specification spec, PrintWriter pw, boolean logMode, int exec) {
		super(spec, pw);
		writeLog = logMode;
		exec_number = exec;
		// TODO Auto-generated constructor stub
	}
	
	public OpenHABGenerator(String path, PrintWriter pw) {
		this(Loader.loadSpec(path), pw, false, 0);
	}

	public OpenHABGenerator(String path, PrintWriter pw, boolean logMode, int exec) { //logMode invece di debugMode
		this(Loader.loadSpec(path), pw, logMode, exec);
	}
	
	public OpenHABGenerator(String path, boolean logMode, int exec) {
		this(path, new PrintWriter(System.out, true), logMode, exec);
	}
	
	public OpenHABGenerator(String path, int exec) {
		this(path, new PrintWriter(System.out, true), true, exec);
	}
	
	@Override
	public void generateCode() {
		PopulateMaps();
		generateItems();
		generateRules();
		pw.close();
	}
	
	private void PopulateMaps() {
		//populate compToGroupConcrete
		compToGroupConcrete = new HashMap<ComponentInstance, ConcreteGroup>();
		for(ConcreteGroup cG : concreteGroups) {
			for(ComponentInstance cI : cG.getComponents()) {
				compToGroupConcrete.put(cI, cG);
			}
		}
		//populate compToGroupAbs
		compToGroupAbs = new HashMap<AbstractComponent, AbstractGroup>();
		for(AbstractGroup aG : absGroups) {
			for(AbstractComponent aC : aG.getComponents()) {
				compToGroupAbs.put(aC, aG);
			}
		}
		//populate interactWithSameStart and interactWithSameEnd
		if(configuration.getConcreteInteractions().size() > 1) {
			interactWithSameStart = new HashMap<ComponentInstance, List<Interaction>>();
			for(ConcreteGroup cG : concreteGroups) {
				for(ComponentInstance cI : cG.getComponents()) {
					List<Interaction> MapValue = new ArrayList<Interaction>();
					for(Interaction i : configuration.getConcreteInteractions()) {
						if(i.getStart().getComponent().equals(cI))
							MapValue.add(i);
					}
					if(MapValue.size() > 1)
						interactWithSameStart.put(cI, MapValue);
				}
			}
			interactWithSameEnd = new HashMap<ComponentInstance, List<Interaction>>();
			for(ConcreteGroup cG : concreteGroups) {
				for(ComponentInstance cI : cG.getComponents()) {
					List<Interaction> MapValue = new ArrayList<Interaction>();
					for(Interaction i : configuration.getConcreteInteractions()) {
						if(i.getEnd().getComponent().equals(cI))
							MapValue.add(i);
					}
					if(MapValue.size() > 1)
						interactWithSameEnd.put(cI, MapValue);
				}
			}
		}
		//Populate concrToAbsComponents
		if(concreteGroups.size()>1){
			concrToAbsComponents = new HashMap<ComponentInstance, AbstractComponent>();
			for(ConcreteGroup cG : concreteGroups) {
				for(GroupBinding gB : cG.getAbstractGroups()) {
					AbstractGroup aG = gB.getAbsGroup();
					for(ComponentInstance cI : cG.getComponents()) {
						for(AbstractComponent aC : aG.getComponents()) {
							if(cI.getType().equals(aC.getName()))
								//pw.println("Writing correspondence FROM " + cG.getName() + "." + cI.getName() + " TO "+ aG.getName() + "." + aC.getName());
								concrToAbsComponents.put(cI, aC);
						}
					}
				}
			}
		}
		//Populate concrToAbsInteractions
		if(concrToAbsComponents != null) {
			concrToAbsInteractions = new HashMap<Interaction, AbstractInteraction>();
			for(Interaction cI : configuration.getConcreteInteractions()) {
				for(AbstractInteraction aI : absInteractions) {
					//pw.println(aI.getStart().getType().getName());
					//pw.println(concrToAbsComponents.get(cI.getStart().getComponent()).getName());
					//pw.println(aI.getEnd().getType().getName());
					//pw.println(concrToAbsComponents.get(cI.getEnd().getComponent()).getName());
					//pw.println(aI.getStart().getType().getName().equals(concrToAbsComponents.get(cI.getStart().getComponent()).getName()) && aI.getEnd().getType().getName().equals(concrToAbsComponents.get(cI.getEnd().getComponent()).getName()));
					if(aI.getStart().getType().getName().equals(concrToAbsComponents.get(cI.getStart().getComponent()).getName()) && aI.getEnd().getType().getName().equals(concrToAbsComponents.get(cI.getEnd().getComponent()).getName())){
						//pw.println("Writing correspondence FROM " + cI.getStart().getComponent().getName() + " -> " + cI.getEnd().getComponent().getName() + " TO " + aI.getStart().getType().getName() + " -> " + aI.getEnd().getType().getName());
						concrToAbsInteractions.put(cI, aI);
					}
				}
			}
		}
		
	}
	
	private void generateItems() {
		
		
		try {//TODO: sistemare con il plugin UI
			File destination = new File("conf " + configuration.getName() +"/items/"+configuration.getName()+".items");
			if(destination.exists())
				pw = new PrintWriter(destination);
			else {
				File destination_parent = new File(destination.getParent());
				destination_parent.mkdirs();
				pw = new PrintWriter(destination);
			}
			System.out.println("Writing in: " + destination.getAbsolutePath());
		}
		catch(Exception e) {
			System.out.println("error");
		}
		//for each group in the concrete pattern, generates an OpenHAB group and a switch for each of the components in this group
		for (ConcreteGroup cG : concreteGroups ) {
			pw.println("Group " + cG.getName() + " \"" + cG.getName() + "\"" + "\n" );
			for (ComponentInstance cI : cG.getComponents())
				pw.println("Switch start_" + cI.getName() + " \"" + cI.getName() + "\" " + "(" + cG.getName()+ ")");
			pw.println();
		}
		//prints the group switch for a group of interactions with the same end
		if(configuration.getConcreteInteractions().size()>1) {
			for(ConcreteGroup cG : concreteGroups) {
				for(ComponentInstance cI : cG.getComponents()) {
					if(interactWithSameEnd.get(cI) != null) {
						pw.print("Group:Switch:");
						String low = new String();
						String groupSwitchName = "";
						for(Interaction i : interactWithSameEnd.get(cI)) {
							low = concrToAbsInteractions.get(i).getLow();
							groupSwitchName = groupSwitchName.concat(compToGroupConcrete.get(i.getStart().getComponent()).getName());
						}
						groupSwitchName = groupSwitchName.concat("_to_" + cG.getName());
						//TODO extend later with "*-SOME" and "*-1"
						if(low.equals("*-ALL")) {
							pw.print("AND");
						}
						pw.print("(ON, OFF) " + groupSwitchName + " \"" + groupSwitchName + "\"\n\n");
						for(Interaction i : interactWithSameEnd.get(cI)) {
							String switchName = compToGroupConcrete.get(i.getStart().getComponent()).getName() + "_to_" + cG.getName();
							pw.println("Switch " + switchName + " \"" + switchName + "\" (" + groupSwitchName + ")" );
						}
					}
				}
			}
		}
		
		pw.flush();
	}
	private void generateRules() {
		try {
			File destination = new File("conf " + configuration.getName() +"/rules/"+configuration.getName()+".rules");
			if(destination.exists())
				pw = new PrintWriter(destination);
			else {
				File destination_parent = new File(destination.getParent());
				destination_parent.mkdirs();
				pw = new PrintWriter(destination);
			}
			System.out.println("Writing in: " + destination.getAbsolutePath());
		}
		catch(Exception e) {
			System.out.println("error");
		}
		//if logging is required, generates a counter for each group
		if(writeLog) {
			for(ConcreteGroup cG : concreteGroups) {
				pw.println("var Number counter_"+cG.getName());
			}
			if(exec_number > 0)
				pw.println("var Number exec_counter\n");
			else
				pw.println();
		}
		
		if(writeLog && exec_number > 0) {
			pw.println("rule \"Execution stop countdown\"");
			pw.println("when");
			pw.println("\tItem start_" + concreteGroups.get(0).getComponents().get(0).getName() + " received command ON");
			pw.println("then");
			pw.println("\tif(exec_counter > 0) {");
			pw.println("\t\texec_counter = exec_counter-1");
			pw.println("\t\tlogInfo(\"" + configuration.getName() + ".rules\", \"Execution counter reduced by one. exec_counter = \" + exec_counter)");
			pw.println("\t}");
			pw.println("\tif(exec_counter <= 0) {");
			pw.println("\t\tlogInfo(\"" + configuration.getName() + ".rules\", \"" + exec_number + " executions have elapsed. Loops will end then stop.\")");
			pw.println("\t}");
			pw.println("end\n");
		}
		
		pw.println("rule \"" + "StartLoop" + "_" + configuration.getName() + "\"");
		pw.println("when");
		pw.println("\tSystem started" );
		pw.println("then");
		if(writeLog) {
			if(exec_number > 0)
				pw.println("\tlogInfo(\"" + configuration.getName() + ".rules\", \"Loops will run for \" + " + exec_number + " + \" iterations.\")");
			for(ConcreteGroup cG : concreteGroups) {
				pw.println("\tcounter_"+cG.getName()+" = 0");
				pw.println("\tlogInfo(\"" + configuration.getName() + ".rules\", \"Starting MAPE loop for group (" + cG.getName() + "), counter_" + cG.getName() +  " = \" + counter_" + cG.getName() + ")");
			}
			if(exec_number > 0)
				pw.println("\texec_counter = " + exec_number);
		}
		//initializes each MAPEloop. At runtime, a MAPEloop starts only if it has a managed system to monitor, otherwise it has to wait until it is activated by another loop
		for(ConcreteGroup cG : concreteGroups) {
			for(ComponentInstance cI : cG.getComponents()) {
				if(cI.getType().equals("M") && cG.getManSys()!=null)
					pw.println("\tstart_" + cI.getName() + ".sendCommand(ON)");
				else
					pw.println("\tstart_" + cI.getName() + ".sendCommand(OFF)");
			}
		}
		pw.println("end\n");
		//generates one rule for each of the implicit intra-group concrete interactions by resolving them from the abstract interactions specified in the abstract pattern
		for(ConcreteGroup cG : concreteGroups) {
			for(AbstractInteraction aI : absInteractions) {
				if(configuration.getConcreteInteractions().size() > 1) {
					if(!InteractionIsIntragroup(aI, cG))
						continue;
				}
				String ruleName = new String();
				ruleName = GetRuleName(aI);
				String start = new String();
				String end = new String();
				for(ComponentInstance cI : cG.getComponents()) {
					if(aI.getStart().getType().getName().equals(cI.getType()))
						start = cI.getName();	
					else if(aI.getEnd().getType().getName().equals(cI.getType()))
						end = cI.getName();
				}
				pw.println("rule \"" + ruleName + "_" + start + "\"");
				pw.println("when");
				pw.println("\tItem start_" + start + " received command ON" );
				pw.println("then");
				if(writeLog) {
					pw.println("\tcounter_" + cG.getName() + " = counter_"+ cG.getName() + " + 1");
					pw.println("\tlogInfo(\"" + configuration.getName() + ".rules\", \""+ ruleName +" for group (" + cG.getName() + ") active, counter_" + cG.getName() +  " = \" + counter_"+ cG.getName() +")");
				}
				pw.println("\tsendCommand(start_" + start + ", OFF)");
				pw.println("\tsendCommand(start_" + end + ", ON)");
				pw.println("end\n");
			}
			//generates the implicit loopback rule if the group has a managed system, otherwise there should be an explicit interaction pointing to another MAPEloop
			if(cG.getManSys() != null) {
				pw.println("rule \"" + "Exec" + "_" + "e_" + cG.getName() + "\"");
				pw.println("when");
				pw.println("\tItem start_" + "e_" + cG.getName() + " received command ON" );
				pw.println("then");
				if(writeLog) {
					pw.println("\tcounter_" + cG.getName() + " = counter_"+ cG.getName() + " + 1");
					pw.println("\tlogInfo(\"" + configuration.getName() + ".rules\", \"Exec active for group (" + cG.getName() + "), counter_" + cG.getName() +  " = \" + counter_" + cG.getName() + ")");
					pw.println("\tcounter_" + cG.getName() + " = 0");
				}
				pw.println("\tsendCommand(start_" + "e_" + cG.getName() + ", OFF)");
				if(writeLog && exec_number>0) {
					pw.println("\tif(exec_counter > 0) {");
					pw.print("\t");
				}
				pw.println("\tsendCommand(start_" + "m_" + cG.getName() + ", ON)");
				if(writeLog && exec_number > 0)
					pw.println("\t}");
				pw.println("end\n");
			}
		}
		if(configuration.getConcreteInteractions().size() != 0) {
			PrintIntergroup();
		}
		pw.flush();
	}
	
	//Extends the type of a component from a single letter to the full word
	private String GetRuleName(AbstractInteraction aI) {
		String ruleName = new String();
		if(aI.getStart().getType().getName().equals("M")) 
			ruleName = "Monitor";
		else if (aI.getStart().getType().getName().equals("A"))
			ruleName = "Analyze";
		else if (aI.getStart().getType().getName().equals("P"))
			ruleName = "Plan";
		else if (aI.getStart().getType().getName().equals("E"))
			ruleName = "Exec";
		return ruleName;
	}
	
	private String GetRuleName(Interaction cI) {
		String ruleName = new String();
		if(cI.getStart().getComponent().getType().equals("M")) 
			ruleName = "Monitor";
		else if (cI.getStart().getComponent().getType().equals("A"))
			ruleName = "Analyze";
		else if (cI.getStart().getComponent().getType().equals("P"))
			ruleName = "Plan";
		else if (cI.getStart().getComponent().getType().equals("E"))
			ruleName = "Exec";
		return ruleName;
	}
	//determines whether the abstract interaction aI runs within the concretegroup cG
	private boolean InteractionIsIntragroup(AbstractInteraction aI, ConcreteGroup cG) {
		boolean isIntragroup = false;
		boolean startInGroup = false;
		boolean endInGroup = false;
		boolean isSameGroup = false;
		for(AbstractGroup aG : absGroups) {
			startInGroup = false;
			endInGroup = false;
			for(GroupBinding gB : cG.getAbstractGroups()) {
				if(gB.getAbsGroup() == aG) {
					isSameGroup = true;
					break;
				}
			}
			if(!isSameGroup) {
				continue;
			}
			for(AbstractComponent aC : aG.getComponents()) {
				if(aI.getStart().getType() ==  aC)
					startInGroup = true;
				else if(aI.getEnd().getType() == aC)
					endInGroup = true;
			}
			if(startInGroup && endInGroup) {
				break;
			}
		}
		if(startInGroup && endInGroup)
			isIntragroup = true;
		
		return isIntragroup;
	}
	//prints all interactions where the group of the start component is different that that of the end component
	private void PrintIntergroup() {
		for(ConcreteGroup cG : concreteGroups) {
			for(ComponentInstance cI : cG.getComponents()) {
				if(interactWithSameEnd.get(cI)!=null) {
					String groupSwitchName = "";
					String ruleName = "Aggregator_";
					String endName = "";
					List<String> sendCommandSwitches = new ArrayList<String>();
					for(Interaction i : interactWithSameEnd.get(cI)) {
						groupSwitchName = groupSwitchName.concat(compToGroupConcrete.get(i.getStart().getComponent()).getName());
						ruleName = ruleName.concat(i.getStart().getComponent().getName() + "_");
						endName = i.getEnd().getComponent().getName();
						sendCommandSwitches.add(compToGroupConcrete.get(i.getStart().getComponent()).getName() + "_to_" + compToGroupConcrete.get(i.getEnd().getComponent()).getName());
					}
					ruleName = ruleName.concat(endName);
					groupSwitchName = groupSwitchName.concat("_to_" + cG.getName());
					for(Interaction i : interactWithSameEnd.get(cI)) {
						pw.println("rule \"" + GetRuleName(i) + "_" + i.getStart().getComponent().getName() + "\"");
						pw.println("when");
						pw.println("\tItem start_" + i.getStart().getComponent().getName() + " received command ON");
						pw.println("then");
						if(writeLog) {
							pw.println("\tcounter_" + compToGroupConcrete.get(i.getStart().getComponent()).getName() + " = counter_"+ compToGroupConcrete.get(i.getStart().getComponent()).getName() + " + 1");
							pw.println("\tlogInfo(\"" + configuration.getName() + ".rules\", \""+ GetRuleName(i) +" for group (" + compToGroupConcrete.get(i.getStart().getComponent()).getName() + ") active, counter_" + compToGroupConcrete.get(i.getStart().getComponent()).getName() +  " = \" + counter_"+ compToGroupConcrete.get(i.getStart().getComponent()).getName() +")");
						}
						pw.println("\tsendCommand(start_" + i.getStart().getComponent().getName() + ", OFF)");
						pw.println("\tsendCommand(" + compToGroupConcrete.get(i.getStart().getComponent()).getName() + "_to_" + compToGroupConcrete.get(i.getEnd().getComponent()).getName() + ", ON)");
						pw.println("end\n");
					}
					pw.println("rule \"" + ruleName + "\"");
					pw.println("when");
					pw.println("\tItem " + groupSwitchName + " received update ON");
					pw.println("then");
					if(writeLog) {
						String logStarts = "";
						List<String> counterList = new ArrayList<String>();
						for(Interaction i : interactWithSameEnd.get(cI)) {
							logStarts = logStarts.concat(i.getStart().getComponent().getName() + ", ");
							counterList.add(" + \", counter_" + compToGroupConcrete.get(i.getStart().getComponent()).getName() + " = \" + counter_" + compToGroupConcrete.get(i.getStart().getComponent()).getName());
							pw.println("\tcounter_" + compToGroupConcrete.get(i.getStart().getComponent()).getName() + " = counter_"+ compToGroupConcrete.get(i.getStart().getComponent()).getName() + " + 1");
						}
						pw.print("\tlogInfo(\"" + configuration.getName() + ".rules\", \"Aggregating output from " + logStarts + "to " + endName + "\"");
						for(String s : counterList) {
							pw.print(s);
						}
						pw.println(")");
					}
					for(String s : sendCommandSwitches) {
						pw.println("\tsendCommand(" + s + ", OFF)");
					}
					pw.println("\tsendCommand(start_" + endName + ", ON)");
					pw.println("end\n");
				}
				if(interactWithSameStart.get(cI) != null) {
					String ruleName = "";
					for(Interaction i : interactWithSameStart.get(cI)) {
						ruleName = GetRuleName(i) + "_" + cI.getName();
					}
					pw.println("rule \"" + ruleName + "\"");
					pw.println("when");
					pw.println("\tItem start_" + cI.getName() + " received command ON");
					pw.println("then");
					if(writeLog) {
						pw.println("\tcounter_" + cG.getName() + " = counter_"+ cG.getName() + " + 1");
						pw.println("\tlogInfo(\"" + configuration.getName() + ".rules\", \""+ ruleName +" for group (" + cG.getName() + ") active, counter_" + cG.getName() +  " = \" + counter_"+ cG.getName() +")");
						pw.println("\tcounter_" + cG.getName() + " = 0");
					}
					pw.println("\tsendCommand(start_" + cI.getName() + ", OFF)");
					for(Interaction i : interactWithSameStart.get(cI)) {
						pw.println("\tsendCommand(start_" + i.getEnd().getComponent().getName() + ", ON)");
					}
					pw.println("end\n");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		//Required argument: String path of the msl specification
		//Optional argument: int number of executions; 0 or a negative number runs indefinitely; default number is the static final field exec_default
		//Optional argument: boolean logMode; true if log is required, false otherwise. Default: true.
		/* you'll find some specifications in examples/:
		 * SimpleMAPE.msl : A single MAPEloop without other dependencies
		 * SimpleMAPE_MissingComp.msl : A MAPEloop without Analyze and Plan 
		 * SimpleMAPE_MultipleLoops.msl : Two independent MAPEloops running in parallel
		 * AggregateMAPE.msl : Two MAPEloops, one managing the system, depending on the other with AP functions
		 */
		//output files go in conf/items and conf/rules; naming conventions are the same as those found in the OpenHAB folder
		//output logs from OpenHAB are found in the OpenHAB folder under userdata/logs/openhab.log
		int exec = exec_default;
		boolean logMode = writeLog_default;
		
		if(args.length > 1) {
			try {
				exec = Integer.parseInt(args[1]);
			}
			catch (Exception e) {
				exec = exec_default;
			}
		}
		
		if(args.length > 2) {
			try {
				logMode = Boolean.parseBoolean(args[2]);
			}
			catch (Exception e) {
				logMode = writeLog_default;
			}
		}
		
		
		OpenHABGenerator g = new OpenHABGenerator(args[0], logMode ,exec); //implicitly, logMode is true
		g.generate();
	}
}
