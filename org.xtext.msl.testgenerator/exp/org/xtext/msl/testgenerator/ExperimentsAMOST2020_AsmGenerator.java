package org.xtext.msl.testgenerator;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.xtext.msl.generator.asmgenerator.AsmGenerator;

public class ExperimentsAMOST2020_AsmGenerator {

	@Test
	public void generateAsmForFDconcern() throws IOException, Exception {
		AsmGenerator asmGen = new AsmGenerator("examples/SmartHomeGateway_mod/FD_MAPE.msl");
		asmGen.generate();
	}
}
	