asm simpleMAPE2PatternInstance
import StandardLibrary
  
signature:
	domain HeaterMdA subsetof Agent
	domain WaterHeaterMdA subsetof Agent
	domain MainESMgA subsetof Agent
	domain InterfaceTemperatureMgA subsetof Agent
	domain InterfaceWaterHeaterMgA subsetof Agent
	
	enum domain HeatingStatus = {FAIRLY_HOT | VERY_HOT | OFF}
	enum domain WaterHeatingStatus = {WH_ON | WH_OFF}
	domain Temperature subsetof Integer
	enum domain Time = {EARLY_MORN | MORN_AFT | EVENING}
  
	monitored roomTemp: Temperature //environment sensor
	monitored whONOFF: Boolean //true (ON), false (OFF)
	monitored timePassed: Boolean
	
	controlled waterHeaterON: Boolean
	controlled time: Time
	
	derived adaptationRequiredMainESA: Boolean
    
	//desired state values:
	controlled waterHeatingStatus: WaterHeatingStatus
	controlled heatingStatus: HeatingStatus
	
	//shared between managed and managing agents
	controlled setWaterHeatingStatus: WaterHeaterMdA -> WaterHeatingStatus
	controlled setHeatingStatus: HeaterMdA -> HeatingStatus
	
	controlled heaterManagedByInterfaceTemperature: InterfaceTemperatureMgA -> HeaterMdA
	controlled waterheaterManagedByInterfaceWaterHeater: InterfaceWaterHeaterMgA -> WaterHeaterMdA
	//I: InterfaceTemperature.M -> MainES.M
	controlled sgnInterfaceTemperatureMMainESM: Prod(InterfaceTemperatureMgA, MainESMgA) -> Boolean
	controlled fromInterfaceTemperatureMtoMainESM: InterfaceTemperatureMgA -> MainESMgA
	controlled fromMainESMtoInterfaceTemperatureM: MainESMgA -> Powerset(InterfaceTemperatureMgA)
	derived startMainESM: Boolean
	//I: InterfaceWaterHeater.M -> MainES.M
	controlled sgnInterfaceWaterHeaterMMainESM: Prod(InterfaceWaterHeaterMgA, MainESMgA) -> Boolean
	controlled fromInterfaceWaterHeaterMtoMainESM: InterfaceWaterHeaterMgA -> MainESMgA
	controlled fromMainESMtoInterfaceWaterHeaterM: MainESMgA -> Powerset(InterfaceWaterHeaterMgA)
	//I: MainES.E -> InterfaceTemperature.E
	controlled sgnMainESEInterfaceTemperatureE: Prod(MainESMgA, InterfaceTemperatureMgA) -> Boolean
	controlled fromMainESEtoInterfaceTemperatureE: MainESMgA -> Powerset(InterfaceTemperatureMgA)
	controlled fromInterfaceTemperatureEtoMainESE: InterfaceTemperatureMgA -> MainESMgA
	//I: MainES.E -> InterfaceWaterHeater.E
	controlled sgnMainESEInterfaceWaterHeaterE: Prod(MainESMgA, InterfaceWaterHeaterMgA) -> Boolean
	controlled fromMainESEtoInterfaceWaterHeaterE: MainESMgA -> Powerset(InterfaceWaterHeaterMgA)
	controlled fromInterfaceWaterHeaterEtoMainESE: InterfaceWaterHeaterMgA -> MainESMgA
	//ElectricitySavingMAPE
	static hs1: HeaterMdA
	static whs: WaterHeaterMdA
	static es: MainESMgA
	static h: InterfaceTemperatureMgA
	static wh: InterfaceWaterHeaterMgA

    //**** Function for the coordination of the overall system  ****
	//derived startMainM: Boolean
	//derived adaptationRequiredMainA: Boolean
	monitored sensorsActivatedHeater: HeaterMdA -> Boolean //Used to trigger the model execution; it means some sensors are ready for reading
	monitored sensorsActivatedWaterHeater: WaterHeaterMdA -> Boolean //Used to trigger the model execution; it means some sensors are ready for reading
	 
	//Used to strictly sequence different MAPE loop executions
	//(just an example of a MAPE execution schema)
	controlled loopCompletedIT: InterfaceTemperatureMgA -> Boolean
	controlled loopCompletedIWH: InterfaceWaterHeaterMgA -> Boolean
		
	monitored esAdaptHeater: Boolean // used to nondeterministically choose between two adaptations actions
    	
definitions:
	function startMainESM =
		(forall $a in fromMainESMtoInterfaceWaterHeaterM(self) 
		   with sgnInterfaceWaterHeaterMMainESM($a, self))
		   and
		(forall $b in fromMainESMtoInterfaceTemperatureM(self) 
		   with sgnInterfaceTemperatureMMainESM($b, self))   
		   
	function adaptationRequiredMainESA = time = MORN_AFT and 
       heatingStatus = VERY_HOT and waterHeaterON  
    	   
    rule r_start($signal in Boolean) =
        if $signal = false then 
           $signal := true 
        endif   
	
	rule r_Heater =
		 if isDef(setHeatingStatus(self)) then
			setHeatingStatus(self) := undef //signal reset
	   endif

	rule r_WaterHeater =
		if isDef(setWaterHeatingStatus(self)) then
			setWaterHeatingStatus(self) := undef //signal reset
		endif

	rule r_CleanUp_MainESE =
		skip 

	rule r_MainESE =
	 par
	   //XOR-semantics (non-deterministic choice)
	   if esAdaptHeater then // send signal to decrease the heater
			par
			  heatingStatus := FAIRLY_HOT
			  forall $a in fromMainESEtoInterfaceWaterHeaterE(self) do 
			   sgnMainESEInterfaceWaterHeaterE(self, $a) := true
			endpar		 
	   else // send signal to turn the water heater off
		    par
		      waterHeatingStatus := WH_OFF
		      forall $b in fromMainESEtoInterfaceTemperatureE(self) do 
			   sgnMainESEInterfaceTemperatureE(self, $b) := true
		    endpar   
	   endif
       r_CleanUp_MainESE[]
	endpar
		
   rule r_CleanUp_MainESA =	skip    

	rule r_CleanUp_LoopCompletedESA =
	 //if no adaptation was necessary, cleaaning of loop completion flag is done here  
     par 
       forall $a in fromMainESMtoInterfaceWaterHeaterM(self) do 
	    loopCompletedIWH($a) := false
	   forall $b in fromMainESMtoInterfaceTemperatureM(self) do 
	    loopCompletedIT($b) := false
	 endpar

	rule r_MainESA =
	//time = MORN_AFT and heatingStatus = VERY_HOT and waterHeaterON  
    if adaptationRequiredMainESA then
      par
          r_MainESE[] //@E_MAPE_ES direct invocation (waterfall), without planning
          r_CleanUp_MainESA[]
      endpar
    else r_CleanUp_LoopCompletedESA[]  //for loop coordination
    endif   

	rule r_CleanUp_MainESM =
	par 
       forall $a in fromMainESMtoInterfaceWaterHeaterM(self) do 
	    sgnInterfaceWaterHeaterMMainESM($a, self) := false
	   forall $b in fromMainESMtoInterfaceTemperatureM(self) do 
	    sgnInterfaceTemperatureMMainESM($b, self) := false
	endpar
	   
	//MAPE_ES: when the electricity is expensive do not use water heater and strong heating together   
	rule r_MainESM =
		if startMainESM then
			par
				r_MainESA[] //@A_MAPE_ES direct invocation (waterfall)
				r_CleanUp_MainESM[]
			endpar
		endif

	rule r_MainES =  r_MainESM[] //@M_MAPE_ES direct invocation (waterfall)
		
	rule r_CleanUp_InterfaceTemperatureM =
		loopCompletedIT(self) := false // reset 
      
    //Saves the desired room heating into the knowledge based on the
    //registered value of the room temperature sensor 
    rule r_SaveSensorsData_Heater= 
	 if roomTemp < 10 then
			heatingStatus := VERY_HOT  
		else
			if roomTemp < 18 then
				heatingStatus := FAIRLY_HOT 
			else
				heatingStatus := OFF //to turn off the heater
			endif
		endif
    
   
	  
	rule r_InterfaceTemperatureM =
	  if loopCompletedIT(self) then //***coordination***: for sequencing different MAPE loops executions
		if sensorsActivatedHeater(heaterManagedByInterfaceTemperature(self)) then
		  par	
			r_SaveSensorsData_Heater[]  
			r_start[sgnInterfaceTemperatureMMainESM(self,fromInterfaceTemperatureMtoMainESM(self))] //A_MAPE_CH  indirect invocation
			r_CleanUp_InterfaceTemperatureM[]
		  endpar
		endif
	  endif
		
	rule r_TriggerActuators_Heater($s in HeaterMdA) = skip  

	rule r_CleanUp_InterfaceTemperatureE =
     par
       sgnMainESEInterfaceTemperatureE(fromInterfaceTemperatureEtoMainESE(self),self):= false
       loopCompletedIT(self) := true
     endpar
     
	rule r_InterfaceTemperatureE =
	 if sgnMainESEInterfaceTemperatureE(fromInterfaceTemperatureEtoMainESE(self),self) then
				par
					r_TriggerActuators_Heater[heaterManagedByInterfaceTemperature(self)] //Actions are executed by invoking effectors (actuators)
					r_CleanUp_InterfaceTemperatureE[]
				endpar
			endif

	rule r_InterfaceTemperature =
		par
			r_InterfaceTemperatureM[]
			r_InterfaceTemperatureE[]
		endpar

	 rule r_CleanUp_InterfaceWaterHeaterM =
		loopCompletedIWH(self) := false // reset 
	
	//Register sensors' values into the kowledge for all active sensors of the managed system
    rule r_SaveSensorsData_WaterHeater= 
    if whONOFF then
        if waterHeaterON then waterHeaterON := false
        else waterHeaterON := true
        endif
	  endif


	rule r_InterfaceWaterHeaterM =
	 if loopCompletedIWH(self) then //***coordination***: for sequencing different MAPE loops executions
		if sensorsActivatedWaterHeater(waterheaterManagedByInterfaceWaterHeater(self)) then
		  par	
			r_SaveSensorsData_WaterHeater[]  
			r_start[sgnInterfaceWaterHeaterMMainESM(self,fromInterfaceWaterHeaterMtoMainESM(self))] //A_MAPE_CH  indirect invocation
			r_CleanUp_InterfaceWaterHeaterM[]
		  endpar
		endif
	  endif

	rule r_TriggerActuators_WaterHeater($s in WaterHeaterMdA) = skip  

	rule r_CleanUp_InterfaceWaterHeaterE =
     par
       sgnMainESEInterfaceWaterHeaterE(fromInterfaceWaterHeaterEtoMainESE(self),self):= false
       loopCompletedIWH(self) := true
     endpar
      

	rule r_InterfaceWaterHeaterE =
	 if sgnMainESEInterfaceWaterHeaterE(fromInterfaceWaterHeaterEtoMainESE(self),self) then
				par
					r_TriggerActuators_WaterHeater[waterheaterManagedByInterfaceWaterHeater(self)] //Actions are executed by invoking effectors (actuators)
					r_CleanUp_InterfaceWaterHeaterE[]
				endpar
			endif
			

	rule r_InterfaceWaterHeater =
		par
			r_InterfaceWaterHeaterM[]
			r_InterfaceWaterHeaterE[]
		endpar

    rule r_advanceTime =
		if timePassed then
			switch time
				case EARLY_MORN:
					time := MORN_AFT
				case MORN_AFT:
					time := EVENING
				case EVENING:
					time := EARLY_MORN
			endswitch
		endif
		
	main rule r_main =
     par
        r_advanceTime[]
		forall $a in Agent with true do
			program($a)
	 endpar		

default init s0:
	function sgnInterfaceTemperatureMMainESM($a in InterfaceTemperatureMgA, $b in MainESMgA) = false
	function sgnInterfaceWaterHeaterMMainESM($a in InterfaceWaterHeaterMgA, $b in MainESMgA) = false
	function sgnMainESEInterfaceTemperatureE($a in MainESMgA, $b in InterfaceTemperatureMgA) = false
	function sgnMainESEInterfaceWaterHeaterE($a in MainESMgA, $b in InterfaceWaterHeaterMgA) = false
	function fromInterfaceTemperatureMtoMainESM($a in InterfaceTemperatureMgA) =
		switch($a)
			case h: es
		endswitch

	function fromMainESMtoInterfaceTemperatureM($a in MainESMgA) =
		switch($a)
			case es: {h}
		endswitch

	function fromInterfaceWaterHeaterMtoMainESM($a in InterfaceWaterHeaterMgA) =
		switch($a)
			case wh: es
		endswitch

	function fromMainESMtoInterfaceWaterHeaterM($a in MainESMgA) =
		switch($a)
			case es: {wh}
		endswitch

	function fromMainESEtoInterfaceTemperatureE($a in MainESMgA) =
		switch($a)
			case es: {h}
		endswitch

	function fromInterfaceTemperatureEtoMainESE($a in InterfaceTemperatureMgA) =
		switch($a)
			case h: es
		endswitch

	function fromMainESEtoInterfaceWaterHeaterE($a in MainESMgA) =
		switch($a)
			case es: {wh}
		endswitch

	function fromInterfaceWaterHeaterEtoMainESE($a in InterfaceWaterHeaterMgA) =
		switch($a)
			case wh: es
		endswitch

	function heaterManagedByInterfaceTemperature($x in InterfaceTemperatureMgA) =
		switch($x)
			case h: hs1
		endswitch
		
	function waterheaterManagedByInterfaceWaterHeater($x in InterfaceWaterHeaterMgA) =
		switch($x)
			case wh: whs
		endswitch

	function loopCompletedIT ($a in InterfaceTemperatureMgA) = true 
	function loopCompletedIWH ($a in InterfaceWaterHeaterMgA) = true 
    function waterHeaterON = false
    function time = EARLY_MORN
    
	agent WaterHeaterMdA: r_WaterHeater[]
	agent InterfaceTemperatureMgA: r_InterfaceTemperature[]
	agent InterfaceWaterHeaterMgA: r_InterfaceWaterHeater[]
	agent HeaterMdA: r_Heater[]
	agent MainESMgA: r_MainES[]
