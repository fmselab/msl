package org.xtext.msl.generator.openhabgenerator;

import java.io.PrintWriter;

import org.xtext.msl.Loader;
import org.xtext.msl.generator.Generator;
import org.xtext.msl.mSL.Specification;

public class OpenHABGenerator extends Generator {

	public OpenHABGenerator(Specification spec, PrintWriter pw) {
		super(spec, pw);
		// TODO Auto-generated constructor stub
	}

	public OpenHABGenerator(String path, PrintWriter pw) {
		this(Loader.loadSpec(path), pw);
	}

	public OpenHABGenerator(String path) {
		this(path, new PrintWriter(System.out, true));
	}
	
	@Override
	public void generateCode() {
		// TODO Auto-generated method stub
		pw.println("\t//" + pattern.getName());
		//TO COMPLETE
	}
	
	public static void main(String[] args) {
		OpenHABGenerator g = new OpenHABGenerator("examples/SimpleMAPE.msl");
		g.generate();
	}
}
