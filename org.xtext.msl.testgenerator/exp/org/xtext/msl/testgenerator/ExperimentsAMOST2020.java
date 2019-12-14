package org.xtext.msl.testgenerator;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class ExperimentsAMOST2020 {

	@Test
	public void smarthomeHC_ASYNCH() throws IOException, Exception {
		SelfAdaptiveASMtestGenerator.testGenerator("../examples/SmartHomeGateway/SmartHomeGateway/HC_MAPE.msl",
				TypeOfProperty.ALL_ASYNCH);
	}

	@Test
	public void smarthomeHC_SYNCH() throws IOException, Exception {
		SelfAdaptiveASMtestGenerator.testGenerator("../examples/SmartHomeGateway/SmartHomeGateway/HC_MAPE.msl",
				TypeOfProperty.ALL_SYNCH);
	}

	@Test
	public void smarthomeHC_ONE() throws IOException, Exception {
		SelfAdaptiveASMtestGenerator.testGenerator("../examples/SmartHomeGateway/SmartHomeGateway/HC_MAPE.msl",
				TypeOfProperty.ONE);
	}

	@Test
	public void smarthomeAQ_ASYNCH() throws IOException, Exception {
		SelfAdaptiveASMtestGenerator.testGenerator("../examples/SmartHomeGateway/SmartHomeGateway/AQ_MAPE.msl",
				TypeOfProperty.ALL_ASYNCH);
	}

	@Test
	public void smarthomeAQ_SYNCH() throws IOException, Exception {
		SelfAdaptiveASMtestGenerator.testGenerator("../examples/SmartHomeGateway/SmartHomeGateway/AQ_MAPE.msl",
				TypeOfProperty.ALL_SYNCH);
	}

	@Test
	public void smarthomeAQ_ONE() throws IOException, Exception {
		SelfAdaptiveASMtestGenerator.testGenerator("../examples/SmartHomeGateway/SmartHomeGateway/AQ_MAPE.msl",
				TypeOfProperty.ONE);
	}
	
	@Test
	public void smarthomeFD_ASYNCH() throws IOException, Exception {
		SelfAdaptiveASMtestGenerator.testGenerator("../examples/SmartHomeGateway/SmartHomeGateway/FD_MAPE.msl",
				TypeOfProperty.ALL_ASYNCH);
	}

	@Test
	public void smarthomeFD_SYNCH() throws IOException, Exception {
		SelfAdaptiveASMtestGenerator.testGenerator("../examples/SmartHomeGateway/SmartHomeGateway/FD_MAPE.msl",
				TypeOfProperty.ALL_SYNCH);
	}

	@Test
	public void smarthomeFD_ONE() throws IOException, Exception {
		SelfAdaptiveASMtestGenerator.testGenerator("../examples/SmartHomeGateway/SmartHomeGateway/FD_MAPE.msl",
				TypeOfProperty.ONE);
	}
}
	