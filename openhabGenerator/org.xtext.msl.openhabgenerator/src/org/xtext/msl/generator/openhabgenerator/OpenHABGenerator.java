package org.xtext.msl.generator.openhabgenerator;

import java.io.PrintWriter;
import java.nio.file.Paths;
import java.io.File;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.xtext.msl.Loader;
import org.xtext.msl.generator.Generator;

import org.xtext.msl.mSL.*;

public class OpenHABGenerator extends Generator {
	
	// The concern is the domain of the OpenHAB loop and it is taken from the configuration name. 
	// If two Collections of OpenHAB entities are generated with different concerns, they should be able to be
	// Merged without interference
	public static String concern;

	// An indentation standard for all methods.
	public static final String tab = "    ";
	
	// Methods will refer to this field to see if they need to print mutual exclusion infrastructure
	// (only if there is any interaction with multiplicity [*-SOME/ONE])
	public static boolean needMutex;
	
	// Methods will refer to these fields to see if, how and to where they need to print logging infrastructure
	public static boolean writeLog;
	public static int execNumber;
	public static String execCounterVarName;
	public static String logTemplate;
	public static final boolean writeLog_default = false;
	public static final int execNumber_default = 10;
	
	
	private Map<ComponentInstance, AbstractComponent> concrToAbsComponents; // Map that links a ComponentInstance with
																			// the corresponding AbstractComponent
	private Map<Interaction, AbstractInteraction> concrToAbsInteractions; // Map that links an Interaction with the
																			// corresponding AbstractInteraction
	private Map<ComponentInstance, ConcreteGroup> compToGroupConcrete; // Map that links a ComponentInstance with the
																		// ConcreteGroup containing it
	private Map<AbstractComponent, AbstractGroup> compToGroupAbs; // Map that links an AbstractComponent with the
																	// AbstractGroup containing it

	private Map<ComponentInstance, List<Interaction>> interactWithSameStart; // Map that links a ComponentInstance with
																				// a list of Interactions with at least
																				// 2 elements that start from it
	private Map<ComponentInstance, List<Interaction>> interactWithSameEnd; // Map that links a ComponentInstance with a
																			// list of Interactions with at least 2
																			// elements that end in it
	
	private Map<ComponentInstance, OpenHABRule> compToRule; // Map that links a ComponentInstance to the
															 // OpenHAB rule that represents it.
															 // Each rule also has a reference to its Component

	private List<OpenHABGroup> openHABGroups; // List of groups to be printed in OpenHAB Item file
	
	private List<OpenHABRule> openHABRules; // List of rules to be printed in OpenHAB Rule file
	
	private RuleStart startRule; // The StartLoop rule. Conceptually it is different from other rules
								  // As it is not part of the loop, so it is stored and printed separately
	
	private String path;

	public OpenHABGenerator(Specification spec, PrintWriter pw, boolean logMode, int exec) {
		super(spec, pw);
		writeLog = logMode;
		execNumber = exec;
		// TODO Auto-generated constructor stub
	}

	public OpenHABGenerator(String path, PrintWriter pw) {
		this(Loader.loadSpec(path), pw, false, 0);
		this.path = path;
	}

	public OpenHABGenerator(String path, PrintWriter pw, boolean logMode, int exec) {
		this(Loader.loadSpec(path), pw, logMode, exec);
		this.path = path;
	}

	public OpenHABGenerator(String path, boolean logMode, int exec) {
		this(path, new PrintWriter(System.out, true), logMode, exec);
	}

	public OpenHABGenerator(String path, int exec) {
		this(path, new PrintWriter(System.out, true), true, exec);
	}

	@Override
	public void generateCode() {
		populateDataStructures();
		generateItems();
		generateRules();
		pw.close();
	}
	
	private void populateDataStructures() {
		
		concern = configuration.getName();
		
		execCounterVarName = "exec_counter_" + concern;
		
		// Mutual exclusion is needed if there are interactions between groups with [*-SOME] or [*-ONE] multiplicity
		needMutex = false;
		if(!configuration.getConcreteInteractions().isEmpty()) {
			for(AbstractInteraction aI : absInteractions) {
				if(aI.getLow().equals("*-SOME")||aI.getLow().equals("*-ONE"))			
					needMutex = true;
			}
		}
		
		if(writeLog)
			logTemplate = OpenHABGenerator.tab + "logInfo(\"" + concern + ".rules\", \"%s\")\n";
		
		
		// Populates a series of data structures that support the generation of OpenHAB items and rules. 
		
		// populate compToGroupConcrete
		// it allows to find the ConcreteGroup a ComponentInstance belongs to
		compToGroupConcrete = new HashMap<ComponentInstance, ConcreteGroup>();
		for (ConcreteGroup cG : concreteGroups) {
			for (ComponentInstance cI : cG.getComponents()) {
				compToGroupConcrete.put(cI, cG);
			}
		}
		
		// populate compToGroupAbs
		// it allows to find the AbstractGroup an AbstractComponent belongs to 
		compToGroupAbs = new HashMap<AbstractComponent, AbstractGroup>();
		for (AbstractGroup aG : absGroups) {
			for (AbstractComponent aC : aG.getComponents()) {
				compToGroupAbs.put(aC, aG);
			}
		}
		
		// populate interactWithSameStart and interactWithSameEnd
		// they allow to find all the interactions that start with the same componentInstance
		// and all interactions that end with the same ComponentInstance respectively
		// given that ComponentInstance
		if (!configuration.getConcreteInteractions().isEmpty()) {
			interactWithSameStart = new HashMap<ComponentInstance, List<Interaction>>();
			for (ConcreteGroup cG : concreteGroups) {
				for (ComponentInstance cI : cG.getComponents()) {
					List<Interaction> MapValue = new ArrayList<Interaction>();
					for (Interaction i : configuration.getConcreteInteractions()) {
						if (i.getStart().getComponent().equals(cI))
							MapValue.add(i);
					}
					if (MapValue.size() > 1)
						interactWithSameStart.put(cI, MapValue);
				}
			}
			interactWithSameEnd = new HashMap<ComponentInstance, List<Interaction>>();
			for (ConcreteGroup cG : concreteGroups) {
				for (ComponentInstance cI : cG.getComponents()) {
					List<Interaction> MapValue = new ArrayList<Interaction>();
					for (Interaction i : configuration.getConcreteInteractions()) {
						if (i.getEnd().getComponent().equals(cI))
							MapValue.add(i);
					}
					if (MapValue.size() > 1)
						interactWithSameEnd.put(cI, MapValue);
				}
			}
		}
		
		// Populate concrToAbsComponents
		// It links a ComponentInstance with its abstract blueprint
		concrToAbsComponents = new HashMap<ComponentInstance, AbstractComponent>();
		for (ConcreteGroup cG : concreteGroups) {
			for (GroupBinding gB : cG.getAbstractGroups()) {
				AbstractGroup aG = gB.getAbsGroup();
				for (ComponentInstance cI : cG.getComponents()) {
					for (AbstractComponent aC : aG.getComponents()) {
						if (cI.getType().equals(aC.getName()))
							concrToAbsComponents.put(cI, aC);
					}
				}
			}
		}
		
		// Populate concrToAbsInteractions
		// It links a ComponentInteraction with its Abstract blueprint
		if (concrToAbsComponents != null) {
			concrToAbsInteractions = new HashMap<Interaction, AbstractInteraction>();
			for (Interaction cI : configuration.getConcreteInteractions()) {
				for (AbstractInteraction aI : absInteractions) {
					if (aI.getStart().getType().getName()
							.equals(concrToAbsComponents.get(cI.getStart().getComponent()).getName())
							&& aI.getEnd().getType().getName()
									.equals(concrToAbsComponents.get(cI.getEnd().getComponent()).getName())) {
						concrToAbsInteractions.put(cI, aI);
					}
				}
			}
		}
		
		// Populate openHABGroups and openHABRules
		// for each group in the concrete pattern, generates an OpenHAB group
		// and also a switch and a rule for each of the components in this group
		// Generates a view of the model as a set of OpenHAB entities linked together (items + rules)
		// also links each component to the rule that represents it through compToRule.
		openHABGroups = new ArrayList<OpenHABGroup>();
		openHABRules = new ArrayList<OpenHABRule>();
		compToRule = new HashMap<ComponentInstance, OpenHABRule>();
		
		for (ConcreteGroup cG : concreteGroups) {
			OpenHABGroup newGroup = new OpenHABGroup(cG.getName(), OpenHABGroupType.NONE);
			List<OpenHABRule> intraGroupRules = new ArrayList<OpenHABRule>(); // generates a list of rules that will be connected to each other
																			   // representing each of the components and the interactions linking them 
																			   // that belong to the same group

			// For each component, creates a rule that represents it
			for (ComponentInstance cI : cG.getComponents()) {
				OpenHABSwitch newSwitch = new OpenHABSwitch(cI.getName());
				OpenHABRule newRule;
				if(cI.getType().equals("M")) { // only monitors may start the MAPE loop, thus having their switch set to ON at start
					if(configuration.getConcreteInteractions().isEmpty()) { //the model represents a simple MAPE loop, so all monitors start ON
						newRule = new RuleMonitor(cI.getName(), cI, true);
					} else { // the model represents an aggregate or master/slave loop
						boolean shouldStart = false;
						for (Interaction i : configuration.getConcreteInteractions()) {
							if(i.getStart().getComponent() == cI) { // only monitors of slave or interface loops should start ON
								shouldStart = true;
								break;
							}
						}
						newRule = new RuleMonitor(cI.getName(), cI, shouldStart);
					}
				} else if (cI.getType().equals("A")) {
					newRule = new RuleAnalyze(cI.getName(), cI);
				}else if (cI.getType().equals("P")) {
					newRule = new RulePlan(cI.getName(), cI);
				}else {
					newRule = new RuleExecute(cI.getName(), cI);
				}
				
				// If logging is required, generates the name of the variable that counts progress in the execution of a loop
				if(writeLog) {
					newRule.setCounterVarName(cG.getName());
				}
				newRule.setGroupName(cG.getName());
				if(needMutex && (newRule instanceof RuleMonitor && ((RuleMonitor)newRule).isStart())) {
					((RuleMonitor)newRule).setLoopAdaptationRequired();
					((RuleMonitor)newRule).setLoopCall();
					((RuleMonitor)newRule).setLoopMod();
					((RuleMonitor)newRule).setLoopPriority();
				}
				
				compToRule.put(cI, newRule);
				newGroup.addSwitch(newSwitch);
				newRule.addTrigger(newSwitch);
				intraGroupRules.add(newRule);		
			}
			
			//Links the rules representing each component to each other as specified by the abstract interactions
			for(AbstractInteraction aI : absInteractions) {
				if(compToGroupAbs.get(aI.getStart().getType()) == compToGroupAbs.get(aI.getEnd().getType())) {
					OpenHABRule start = new OpenHABRule("start");
					OpenHABRule end = new OpenHABRule("end");
					for(ComponentInstance cI : cG.getComponents()) {
						if(concrToAbsComponents.get(cI) == aI.getStart().getType()) {
							start = compToRule.get(cI);
						}else if(concrToAbsComponents.get(cI) == aI.getEnd().getType()) {
							end = compToRule.get(cI);
						}
					}
					start.addOut(end);
					end.addIn(start);
				}
			}
			
			//Creates the loopback rule between a monitor and execute of the same group, only if the monitor is a component that starts the model loop
			//and thus the execute of that group is the end of the model loop
			for(OpenHABRule ohr : intraGroupRules) {
				if(ohr instanceof RuleMonitor && ((RuleMonitor)ohr).isStart()) {
					for(OpenHABRule ohrVisitor : intraGroupRules) {
						if(ohrVisitor instanceof RuleExecute) {
							ohr.addIn(ohrVisitor);
							ohrVisitor.addOut(ohr);
						}
					}
				}
			}
			
			openHABGroups.add(newGroup);
			for(OpenHABRule ohr : intraGroupRules)
				openHABRules.add(ohr);
		}
		
		
		// links the rules representing components that interact between groups
		//TODO: add mutex strings to monitors
		if (!configuration.getConcreteInteractions().isEmpty()) {
			for (ConcreteGroup cG : concreteGroups) {
				for (ComponentInstance cI : cG.getComponents()) {
					//Generates the aggregate rule for an interaction with multiple starts
					if (interactWithSameEnd.get(cI) != null) {
						OpenHABGroup newGroup;
						OpenHABGroupType newGroupType ;
						String low = "";
						String groupSwitchName = "";
						for (Interaction i : interactWithSameEnd.get(cI)) {
							low = concrToAbsInteractions.get(i).getLow();
							groupSwitchName += compToGroupConcrete.get(i.getStart().getComponent()).getName();
						}
						groupSwitchName = groupSwitchName.concat("_to_" + cG.getName());
						// TODO extend later with "*-ONE" 
						if (low.equals("*-ALL")) 
							newGroupType = OpenHABGroupType.AND;
						else //if (low.equals("*-SOME")||low.equals("*-ONE"))
							newGroupType = OpenHABGroupType.OR;
						newGroup = new OpenHABGroup(groupSwitchName, newGroupType);
						OpenHABRule newRule = new RuleAggregate(newGroup.getName(), newGroup);
						newRule.addOut(compToRule.get(cI));
						compToRule.get(cI).getIn().add(newRule);
						for (Interaction i : interactWithSameEnd.get(cI)) {
							String switchName = compToGroupConcrete.get(i.getStart().getComponent()).getName() + "_to_"
									+ cG.getName();
							OpenHABSwitch newSwitch = new OpenHABSwitch (switchName); 
							newGroup.addSwitch(newSwitch);
							newRule.addTrigger(newSwitch);
							newRule.addIn(compToRule.get(i.getStart().getComponent()));
							if(compToRule.get(i.getStart().getComponent()) instanceof RuleMonitor) {
								((RuleMonitor)compToRule.get(i.getStart().getComponent())).setLoopSwitch(newSwitch);
							}
							compToRule.get(i.getStart().getComponent()).addOut(newRule);
						}
						openHABRules.add(newRule);
						openHABGroups.add(newGroup);
					} else if (interactWithSameStart.get(cI) != null) { //links rules following an interaction with multiple ends.
						for (Interaction i : interactWithSameStart.get(cI)) {
							compToRule.get(cI).addOut(compToRule.get(i.getEnd().getComponent()));
							compToRule.get(i.getEnd().getComponent()).addIn(compToRule.get(cI));
						}
					}
				}
			}
		}
		
		startRule = new RuleStart(openHABRules);
		for(ConcreteGroup cG : concreteGroups)
			startRule.addGroupName(cG.getName());
		
	}

	private void generateItems() {
		
		String destName = null;
		try {// TODO: sistemare con il plugin UI
			// TODO: controllo esecuzioni incrementale
				// File destination = new File("conf" + configuration.getName()
				// +"/items/"+configuration.getName()+".items");

			destName = Paths.get(path).getParent().toAbsolutePath() + "/OpenHAB/conf" + configuration.getName()
					+ "/items/" + configuration.getName() + ".items";
			//System.out.println(destName);
			File destination = new File(destName);
			if (destination.exists())
				pw = new PrintWriter(destination);
			else {
				File destination_parent = new File(destination.getParent());
				destination_parent.mkdirs();
				pw = new PrintWriter(destination);
			}
		} catch (Exception e) {
			System.out.println("error in creating item " + destName);
		}
		
		for (OpenHABGroup ohg : openHABGroups) {
			pw.println(ohg.toString());
		}
		
		pw.flush();
	}

	private void generateRules() {
		
		String destName = null;
		try {
			// File destination = new File("conf" + configuration.getName() + "/rules/" +
			// configuration.getName() + ".rules");
			destName = Paths.get(path).getParent().toAbsolutePath() + "/OpenHAB/conf" + configuration.getName()
					+ "/rules/" + configuration.getName() + ".rules";
			File destination = new File(destName);
			if (destination.exists())
				pw = new PrintWriter(destination);
			else {
				File destination_parent = new File(destination.getParent());
				destination_parent.mkdirs();
				pw = new PrintWriter(destination);
			}
		} catch (Exception e) {
			System.out.println("error in creating rules file " + destName);
		}
		
		//Prints variables and imports for the rules file
		generateVarsImports();		

		//generates the startloop rule
		//if logging is requested, the startloop rule also generates the rule that stops execution
		//once the correct amount of execution have elapsed
		pw.println(startRule.toString());
		
		//Prints each rule; refer to the toString() method of each rule type for details		
		for(OpenHABRule ohr : openHABRules)
			pw.println(ohr.toString());
		
		//Prints the execution stop countdown rule
		if(writeLog && execNumber > 0)
			pw.println(printExecutionStopCountdown());
		
		pw.flush();
	}
	
	private void generateVarsImports() {
		if(needMutex) {
			pw.println("import java.util.concurrent.locks.ReentrantLock\n");
			
			pw.println("val ReentrantLock lock_m = new ReentrantLock()");
			pw.println("val ReentrantLock lock_e = new ReentrantLock()");
			
			pw.println();
			
			for(OpenHABRule ohr : openHABRules) {
				if(ohr instanceof RuleMonitor && ((RuleMonitor)ohr).isStart()) {
					pw.println("var boolean " + ((RuleMonitor)ohr).getLoopMod());
					pw.println("var boolean " + ((RuleMonitor)ohr).getLoopPriority());
					pw.println("var boolean " + ((RuleMonitor)ohr).getLoopCall());
					pw.println("var boolean " + ((RuleMonitor)ohr).getLoopAdaptationRequired());
					pw.println();
				}
			}
		} else {
			for(OpenHABRule ohr : openHABRules) {
				if(ohr instanceof RuleAnalyze) {
					pw.println("var boolean " + ((RuleAnalyze)ohr).getAdaptReqs());
					pw.println();
				}
			}
		}
		
		
		// if logging is required, generates a counter for each group
		// based on that group
		if (writeLog) {
			String varName = "";
			for (OpenHABRule ohr : openHABRules) {
				if(!(ohr instanceof RuleAggregate) && !varName.equals(ohr.getCounterVarName())) {
					pw.println("var Number " + ohr.getCounterVarName());
					varName = ohr.getCounterVarName();
				}
			}
			if (execNumber > 0)
				pw.println("var Number " + execCounterVarName);
		}
		
		pw.println();
	}
	
	private String printExecutionStopCountdown() {
		String temp = "rule \"Execution stop countdown\"\n";
		
		temp += "when\n";
		temp += tab + "Item ";
		String work = "";
		
		//Chooses the aggregate rule trigger to mark the start of a new loop. 
		//If there is none, chooses the start monitor trigger
		for(OpenHABRule ohr : openHABRules) { 
			if(ohr instanceof RuleAggregate) {
				work = ((RuleAggregate)ohr).getGroupSwitch().getName() + " received update ON\n";
				break;
			} else if(ohr instanceof RuleMonitor && ((RuleMonitor)ohr).isStart()) {
				work = ohr.getTriggers().get(0).getName() + " received command ON\n";
			}
		}
		temp += work;
		
		//Body starts here
		temp += "then\n";
		
		//reduces the execution counter by one
		temp += tab + "if(" + execCounterVarName + " > 0) {\n";
		temp += tab + tab + execCounterVarName  + " = "; 
		temp += execCounterVarName + " - 1\n";
		temp += tab + String.format(logTemplate, "Execution counter reduced by one. " + execCounterVarName + " = \" + " + execCounterVarName + " + \".");
		temp += tab + "}\n";
		
		//announces that loops are stopping
		temp += tab + "if(" + execCounterVarName + " <= 0) {\n";
		temp += tab + String.format(logTemplate, execNumber + " executions have elapsed. Loops will end, then stop.");
		temp += tab + "}\n";
		temp += "end\n";
		
		return temp;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	public void setWriteLog(boolean arg) {
		writeLog = arg;
	}
	
	public void setExecNumber(int arg) {
		execNumber = arg;
	}

	public static void main(String[] args) {

		// Required argument: String path of the msl specification
		// Optional argument: int number of executions; 0 or a negative number runs
		// indefinitely; default number is the static final field exec_default
		// Optional argument: boolean logMode; true if log is required, false otherwise.
		// Default: true.
		// output files go in /examples/OpenHAB/<configurationName>/; 
		// naming conventions are the same as those found in the OpenHAB folder
		// output logs from OpenHAB are found in the OpenHAB folder under
		// userdata/logs/openhab.log
		int exec = execNumber_default;
		boolean logMode = writeLog_default;

		if (args.length > 1) {
			try {
				exec = Integer.parseInt(args[1]);
			} catch (Exception e) {
				exec = execNumber_default;
			}
		}

		if (args.length > 2) {
			try {
				logMode = Boolean.parseBoolean(args[2]);
			} catch (Exception e) {
				logMode = writeLog_default;
			}
		}

		OpenHABGenerator g = new OpenHABGenerator(args[0], logMode, exec);
		g.generate();
		System.out.println("Done");
	}
}
