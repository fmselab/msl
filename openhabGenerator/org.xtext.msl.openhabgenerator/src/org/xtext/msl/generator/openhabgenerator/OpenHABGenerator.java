package org.xtext.msl.generator.openhabgenerator;

import java.io.PrintWriter;
import java.io.File;

import org.xtext.msl.Loader;
import org.xtext.msl.generator.Generator;
import org.xtext.msl.mSL.Specification;

import org.xtext.msl.mSL.AbstractInteraction;
import org.xtext.msl.mSL.ComponentInstance;
import org.xtext.msl.mSL.ConcreteGroup;

public class OpenHABGenerator extends Generator {
	boolean writeLog;
	
	public OpenHABGenerator(Specification spec, PrintWriter pw, boolean logMode) {
		super(spec, pw);
		writeLog = logMode;
		// TODO Auto-generated constructor stub
	}
	
	public OpenHABGenerator(String path, PrintWriter pw) {
		this(Loader.loadSpec(path), pw, false);
	}

	public OpenHABGenerator(String path, PrintWriter pw, boolean logMode) { //logMode invece di debugMode
		this(Loader.loadSpec(path), pw, logMode);
	}
	
	public OpenHABGenerator(String path, boolean logMode) {
		this(path, new PrintWriter(System.out, true), logMode);
	}
	
	public OpenHABGenerator(String path) {
		this(path, new PrintWriter(System.out, true), true);
	}
	
	@Override
	public void generateCode() {
		// TODO Auto-generated method stub
		//pw.println("\t//" + pattern.getName());
		//TO COMPLETE
		generateItems();
		generateRules();
		pw.close();
	}
	public void generateItems() {
		try {
			pw = new PrintWriter(new File("conf/items/"+configuration.getName()+".items"));
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
		pw.flush();
	}
	public void generateRules() {
		try {
			pw = new PrintWriter(new File("conf/rules/"+configuration.getName()+".rules"));
		}
		catch(Exception e) {
			System.out.println("error");
		}
		//if logging is required, generates a counter for each group
		if(writeLog) {
			for(ConcreteGroup cG : concreteGroups) {
				pw.println("var Number counter_"+cG.getName());
			}
			pw.println();
		}
		
		pw.println("rule \"" + "StartLoop" + "_" + configuration.getName() + "\"");
		pw.println("when");
		pw.println("\tSystem started" );
		pw.println("then");
		if(writeLog) {
			for(ConcreteGroup cG : concreteGroups) {
				pw.println("\tcounter_"+cG.getName()+" = 0");
				pw.println("\tlogInfo(\"" + configuration.getName() + ".rules\", \"Starting MAPE loop for group (" + cG.getName() + "), counter_" + cG.getName() +  " = \" + counter_" + cG.getName() + ")");
			}
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
			for(AbstractInteraction i : absInteractions) {
				String ruleName = new String();
				ruleName = GetRuleName(i);
				String start = new String();
				String end = new String();
				for(ComponentInstance cI : cG.getComponents()) {
					if(i.getStart().getType().getName().equals(cI.getType()))
						start = cI.getName();
					else if(i.getEnd().getType().getName().equals(cI.getType()))
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
				}
				pw.println("\tsendCommand(start_" + "e_" + cG.getName() + ", OFF)");
				pw.println("\tsendCommand(start_" + "m_" + cG.getName() + ", ON)");
				pw.println("\tcounter_" + cG.getName() + " = 0");
				pw.println("end\n");
			}
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
	
	public static void main(String[] args) {
		
		//Required argument: path of the msl specification
		//TODO: optional argument to switch logMode ON or OFF
		//TODO: aggregate MAPEloop support
		/* you'll find some specifications in examples/:
		 * SimpleMAPE.msl : A single MAPEloop without other dependencies
		 * SimpleMAPE_MissingComp.msl : A MAPEloop without Analyze and Plan 
		 * SimpleMAPE_MultipleLoops.msl : Two independent MAPEloops running in parallel
		 * AggregateMAPE.msl : **unsupported** Two MAPEloops, one managing the system, depending on the other with AP functions
		 */
		//output files go in conf/items and conf/rules; naming conventions are the same as those found in the OpenHAB folder
		//output logs from OpenHAB are found in the OpenHAB folder under userdata/logs/openhab.log
		
		OpenHABGenerator g = new OpenHABGenerator(args[0]); //implicitly, logMode is true
		g.generate();
	}
}
