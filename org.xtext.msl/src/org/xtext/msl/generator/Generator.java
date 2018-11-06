package org.xtext.msl.generator;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xtext.msl.mSL.AbstractGroup;
import org.xtext.msl.mSL.AbstractInteraction;
import org.xtext.msl.mSL.AbstractPattern;
import org.xtext.msl.mSL.AbstractSystem;
import org.xtext.msl.mSL.ConcreteGroup;
import org.xtext.msl.mSL.ConcreteSystem;
import org.xtext.msl.mSL.Configuration;
import org.xtext.msl.mSL.GroupBinding;
import org.xtext.msl.mSL.Pattern;
import org.xtext.msl.mSL.Specification;
import org.xtext.msl.mSL.SystemBinding;

abstract public class Generator {
	protected AbstractPattern absPattern;
	protected Pattern pattern;
	protected Configuration configuration;
	protected Specification spec;
	protected List<ConcreteSystem> concrSys;
	protected List<AbstractGroup> absGroups;
	protected List<AbstractSystem> absSys;
	protected List<ConcreteGroup> concreteGroups;
	protected List<AbstractInteraction> absInteractions;
	protected Map<String, String> nameBinding;
	protected PrintWriter pw;
	

	public Generator(Specification spec, PrintWriter pw) {
		this.spec = spec;
		this.pw = pw;
	}

	private String resolveName(String a) {
		assert nameBinding.containsKey(a) : a;
		return nameBinding.get(a);
	}

	public void generate() {
		absPattern = spec.getAbsPattern();
		List<Pattern> patterns = spec.getPattern();
		if (patterns.size() > 1) {
			System.out.println("Multiple concrete pattern are not supported yet by the generator");
			return;
		} else if (patterns.size() == 0) {
			System.out.println("You have to specify a concrete pattern");
			return;
		}
		pattern = patterns.get(0);
		configuration = spec.getConfiguration();

		absGroups = absPattern.getAbstractGroups();
		absSys = absPattern.getManagedSystems();

		/*
		 * for(AbstractGroup ag: absGroups) { AbstractSystem manSys = ag.getManSys();
		 * assert manSys != null; absSys.add(manSys); }
		 */
		absInteractions = absPattern.getInteractions();
		concrSys = configuration.getConcreteSystems();
		concreteGroups = configuration.getConcreteGroups();

		nameBinding = new HashMap<>();
		for (SystemBinding ms : pattern.getManagedSystems()) {
			assert !nameBinding.containsKey(ms.getAbsSys().getName());
			nameBinding.put(ms.getAbsSys().getName(), ms.getName());
			// System.err.println(ms.getAbsSys().getName() + "-> " + ms.getName());
		}
		for (GroupBinding g : pattern.getGroups()) {
			// System.err.println(g.getAbsGroup().getName() + "-> " + g.getName());
			assert !nameBinding.containsKey(g.getAbsGroup().getName());
			nameBinding.put(g.getAbsGroup().getName(), g.getName());
		}
		/*
		 * for(Binding b: pattern.getConcrete()) { Abstract abs = b.getAbs(); assert
		 * !nameBinding.containsKey(abs); String name = b.getName();
		 * nameBinding.put(abs, name); System.err.println(abs + "-> " + name); }
		 */
		// System.out.println(nameBinding);
		generateCode();
	}

	abstract public void generateCode();
}
