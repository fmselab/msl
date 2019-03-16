package org.xtext.msl;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.xtext.msl.mSL.AbstractComponent;
import org.xtext.msl.mSL.AbstractComponentName;
import org.xtext.msl.mSL.AbstractGroup;
import org.xtext.msl.mSL.AbstractInteraction;
import org.xtext.msl.mSL.AbstractPattern;
import org.xtext.msl.mSL.AbstractSystem;
import org.xtext.msl.mSL.ComponentInstance;
import org.xtext.msl.mSL.ConcreteGroup;
import org.xtext.msl.mSL.ConcreteSystem;
import org.xtext.msl.mSL.Configuration;
import org.xtext.msl.mSL.GroupBinding;
import org.xtext.msl.mSL.Interaction;
import org.xtext.msl.mSL.ParamValue;
import org.xtext.msl.mSL.Pattern;
import org.xtext.msl.mSL.Specification;
import org.xtext.msl.mSL.SystemBinding;

public class Main {

	public static void main(String[] args) {
		Specification spec = Loader.loadSpec("examples/Hierarchical_AQ_HC_MAPE.msl");
		// System.out.println(SERIALIZER.serialize(spec));
		AbstractPattern absPattern = spec.getAbsPattern();
		assert absPattern != null;
		System.out.println("abstract pattern " + absPattern.getName());
		EList<AbstractGroup> ag = absPattern.getAbstractGroups();
		EList<AbstractInteraction> inter = absPattern.getInteractions();
		for (AbstractGroup a : ag) {
			System.out.println("group " + a.getName());
			
			List<AbstractSystem> sysS = a.getManSys();
			if (sysS != null) {
				for(AbstractSystem sys: sysS) {
					System.out.println("\tmanagedSyS " + sys.getName());
				}
			}
			EList<AbstractComponent> ac = a.getComponents();
			System.out.print("\tcomponents ");
			for (AbstractComponent c : ac) {
				System.out.print(c.getName() + " ");
			}
			System.out.println();
		}
		for (AbstractInteraction i : inter) {
			AbstractComponentName start = i.getStart();
			assert start != null;
			AbstractComponent startGr = start.getType();
			AbstractComponent endGr = i.getEnd().getType();
			assert startGr != null;
			System.out.println("I: " + ((AbstractGroup) startGr.eContainer()).getName() + startGr.getName() + " -> "
					+ ((AbstractGroup)endGr.eContainer()).getName() + endGr.getName());
		}
		Pattern pattern = spec.getPattern().get(0);
		assert pattern != null;
		AbstractPattern absPatternFromPattern = pattern.getAbsPattern();
		assert absPatternFromPattern != null;
		System.out.println("pattern " + pattern.getName() + " instanceOf " + absPatternFromPattern.getName());
		EList<GroupBinding> bindings = pattern.getGroups();
		assert bindings != null;
		for (GroupBinding b : bindings) {
			String name = b.getName();
			System.out.print("\t" + name + ": ");
			AbstractGroup abs = b.getAbsGroup();
			assert abs != null;
			System.out.println(abs.getName());
		}
		Configuration model = spec.getConfiguration();
		Pattern modelPattern = model.getPattern().get(0);
		assert modelPattern != null;
		System.out.println("model " + model.getName() + " instanceOf " + modelPattern.getName());
		EList<ConcreteSystem> sys = model.getConcreteSystems();
		assert sys != null;
		for (ConcreteSystem s : sys) {
			String name = s.getName();
			assert name != null;
			System.out.print("\t" + name + ": ");
			SystemBinding bind = s.getBindings().get(0);
			assert bind != null;
			String bindName = bind.getName();
			assert bindName != null : bind;
			System.out.println(bindName);
		}
		for (ConcreteGroup cg : model.getConcreteGroups()) {
			String name = cg.getName();
			System.out.print("\t" + name + " ");
			
			System.out.print("\t\tcomponents ");
	
			for (ComponentInstance mg : cg.getComponents()) {
				System.out.print(" " + mg.getName() + ":" + mg.getType());
				EList<ParamValue> plist = mg.getParamValues();
				if (plist != null) {
					System.out.print("\t NFPs :");
					for (ParamValue param: plist) 
					   System.out.print("\t "+param.getNameParam()+"="+ param.getValParam() + param.getUnit());
				 }	
				}
			
			GroupBinding absGroup = cg.getAbstractGroups().get(0);
			assert absGroup != null;
			String absName = absGroup.getName();
			assert absName != null;
			System.out.println(absName);
			EList<ConcreteSystem> ms = cg.getManSys();
			if (ms != null) {
				for(ConcreteSystem msys : ms) {
				System.out.println("\t\tmanagedSys " + msys.getName());
				}
			}
			for (ConcreteGroup mg : cg.getManGrp()) {
				System.out.println("\t\tmanagedGroup " + mg.getName());
			}
			System.out.print("\t\tcomponents ");
			for (ComponentInstance mg : cg.getComponents()) {
				System.out.print(" " + mg.getName() + ":" + mg.getType());
			}
			System.out.println();
		}
		for (Interaction ci : model.getConcreteInteractions()) {
			ComponentInstance start = ci.getStart().getComponent();
			ComponentInstance end = ci.getEnd().getComponent();
			String startString = ((ConcreteGroup) start.eContainer()).getName() + "." + start.getName();
			String endString = ((ConcreteGroup) end.eContainer()).getName() + "." + end.getName();
			System.out.println(startString + " ->" + endString);
		}
	}
}
