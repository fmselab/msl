asm smartHome_patterns

//Adapted from "Self-Adaptation with End-User Preferences: Using Run-Time Models and Constraint Solving?"

//with managed agents

//different MAPE use different channels to communicate with rules doing the E
import StandardLibrary
signature:
    //**** Managed System ****
    //managed agents
	domain HeaterMdA subsetof Agent
	domain WaterHeaterMdA subsetof Agent
	domain WindowMdA subsetof Agent 
	
	//**** Managing System ****
	domain MainAQMgA subsetof Agent
	domain MainMDMgA subsetof Agent
	domain MainESMgA subsetof Agent
	domain MainCHMgA subsetof Agent
	domain MWHMgA subsetof Agent
	domain InterfaceTemperatureMgA subsetof Agent
	domain InterfaceWaterHeaterMgA subsetof Agent
	domain InterfaceWindowMgA subsetof Agent
	
	//**** Knowledge ****
	enum domain HeatingStatus = {FAIRLY_HOT | VERY_HOT | OFF}
	enum domain WindowStatus = {OPEN | CLOSED}
	enum domain WaterHeatingStatus = {WH_ON | WH_OFF}
	enum domain AirQualityStatus = {BAD | GOOD}
	enum domain Time = {EARLY_MORN | MORN_AFT | EVENING}
    domain Temperature subsetof Integer
    
    //States of managed agents, sensors and actuators values savings
	controlled time: Time
	controlled airQuality: AirQualityStatus
	controlled waterHeaterON: Boolean
	controlled heatingON: Boolean
	//desired state values:
	controlled waterHeatingStatus: WaterHeatingStatus
	controlled heatingStatus: HeatingStatus
	controlled windowStatus: WindowStatus
	
    //Managing agents' associations
	controlled managedSyS: Agent -> Agent 
    
	//Information shared among MAPE components for their coordination 
	
	//Interactions: 
	//Interaction Interface.M -> Main.M [*,1] 
	//two functions MainM and InterfaceM for referencing the opposite peer:
	controlled mainM_IT_ES: InterfaceTemperatureMgA -> MainESMgA // (peer of Interface.M) -- mainAg  
	controlled interfaceM_ES_IT: MainESMgA -> Powerset(InterfaceTemperatureMgA)// (peers of Main.M) 
	controlled mainM_IWH_ES: InterfaceWaterHeaterMgA -> MainESMgA // (peer of Interface.M) -- mainAg  
	controlled interfaceM_ES_IWH: MainESMgA -> Powerset(InterfaceWaterHeaterMgA)// (peers of Main.M) 
	controlled mainM_IT_MD: InterfaceTemperatureMgA -> MainMDMgA // (peer of Interface.M) -- mainAg  
	controlled interfaceM_MD_IT: MainMDMgA -> Powerset(InterfaceTemperatureMgA)// (peers of Main.M) 
	controlled mainM_IW_MD: InterfaceWindowMgA -> MainMDMgA // (peer of Interface.M) -- mainAg  
	controlled interfaceM_MD_IW: MainMDMgA -> Powerset(InterfaceWindowMgA)// (peers of Main.M) 
	
	//interaction Main.E -> Interface.E [1,*]
	//two functions for referencing the opposite peer:
	controlled interfaceE_ES_IT: MainESMgA -> Powerset(InterfaceTemperatureMgA)// (peers of Main.E) 
	controlled mainE_IT_ES: InterfaceTemperatureMgA -> MainESMgA // (peer of Interface.E)  
	controlled interfaceE_ES_IWH: MainESMgA -> Powerset(InterfaceWaterHeaterMgA)// (peers of Main.E) 
	controlled mainE_IWH_ES: InterfaceWaterHeaterMgA -> MainESMgA // (peer of Interface.E)  
	
	controlled interfaceE_MD_IW: MainMDMgA -> Powerset(InterfaceWindowMgA)// (peers of Main.E) 
	controlled mainE_IW_MD: InterfaceWindowMgA -> MainMDMgA // (peer of Interface.E)  
	
	//Interaction InterfaceTemperature.M -> MainCH.A [*,1] 
	//two functions for referencing peers
	controlled mainA_IT_CH: InterfaceTemperatureMgA -> MainCHMgA // (peer of Interface.M) -- mainAg  
	controlled interfaceM_CH_IT: MainCHMgA -> Powerset(InterfaceTemperatureMgA)// (peers of Main.M) 
	//Interaction MainCH.E -> InterfaceTemperature.E [1,*]
	controlled interfaceE_CH_IT: MainCHMgA -> Powerset(InterfaceTemperatureMgA)// (peers of Main.E) 
	controlled mainE_IT_CH: InterfaceTemperatureMgA -> MainCHMgA // (peer of Interface.E)  
	
	//Interaction InterfaceWindow.M -> MainAQ.A [*,1] 
	//two functions for referencing peers
	controlled mainA_IW_AQ: InterfaceWindowMgA -> MainAQMgA // (peer of Interface.M) -- mainAg  
	controlled interfaceM_AQ_IW: MainAQMgA -> Powerset(InterfaceWindowMgA)// (peers of Main.M) 
	//Interaction MainAQ.E -> InterfaceWindow.E [1,*] 
	//two functions for referencing peers
	controlled interfaceE_AQ_IW: MainAQMgA -> Powerset(InterfaceWindowMgA)// (peers of Main.E) 
	controlled mainE_IW_AQ: InterfaceWindowMgA -> MainAQMgA // (peer of Interface.E)  
	
	//interaction MWH.A->InterfaceWaterHeater.E [1,1]
    controlled interfaceE_MWH_IWH: MWHMgA -> InterfaceWaterHeaterMgA 
    controlled mwhA_IWH_MWH: InterfaceWaterHeaterMgA -> MWHMgA  
    
    //Signals for indirect interaction: 
    //From interaction Interface.M -> Main.M [*,1]
    controlled sgnMM_IT_ES: Prod(InterfaceTemperatureMgA,MainESMgA) -> Boolean
	controlled sgnMM_IWH_ES: Prod(InterfaceWaterHeaterMgA,MainESMgA) -> Boolean
    controlled sgnMM_IT_MD: Prod(InterfaceTemperatureMgA,MainMDMgA) -> Boolean
	controlled sgnMM_IW_MD: Prod(InterfaceWindowMgA,MainMDMgA) -> Boolean
	
	//From interaction Main.E -> Interface.E [1,*]
	controlled sgnEE_ES_IT: Prod(MainESMgA,InterfaceTemperatureMgA) -> Boolean
	controlled sgnEE_ES_IWH: Prod(MainESMgA,InterfaceWaterHeaterMgA) -> Boolean
	controlled sgnEE_MD_IW: Prod(MainMDMgA,InterfaceWindowMgA) -> Boolean
	
	//From interactions InterfaceTemperature.M -> CH.A [*,1] 
	//and CH.E -> InterfaceTemperature.E [1,*]
	controlled sgnMA_IT_CH: Prod(InterfaceTemperatureMgA,MainCHMgA) -> Boolean
	controlled sgnEE_CH_IT: Prod(MainCHMgA,InterfaceTemperatureMgA) -> Boolean
	
	//From interactions AQ.E -> InterfaceWindow.E [1,*] 
	//and AQ.E -> InterfaceWindow.E [1,*] 
	controlled sgnMA_IW_AQ: Prod(InterfaceWindowMgA,MainAQMgA) -> Boolean
	controlled sgnEE_AQ_IW: Prod(MainAQMgA,InterfaceWindowMgA) -> Boolean
	
	//From interaction MWH.A->Interface.E [1,1]
	controlled sgnAE_MWH_IWH: Prod(MWHMgA,InterfaceWaterHeaterMgA) -> Boolean
	
    //shared between managed and managing agents
	controlled setWaterHeatingStatus: WaterHeaterMdA -> WaterHeatingStatus
	controlled setHeatingStatus: HeaterMdA -> HeatingStatus
	controlled setWindowStatus: WindowMdA -> WindowStatus
	
	 //**** Managing System (instance level)****
	static ch_a:MainCHMgA 
	static es_a:MainESMgA 
	static aq_a:MainAQMgA 
	static mwh_a:MWHMgA
	static md_a:MainMDMgA 
	static h_a:InterfaceTemperatureMgA 
	static wh_a:InterfaceWaterHeaterMgA 
	static w_a:InterfaceWindowMgA 
	
	//**** Managed System and environment (instance level) ****
	//managed system's agents  
	static windowManaged: WindowMdA
	static heaterManaged: HeaterMdA
	static waterHeaterManaged: WaterHeaterMdA
   
    //sensors
	monitored timePassed: Boolean
    monitored roomTemp: Temperature
	monitored badAir: Boolean
	//dynamic monitored windowOPEN_CLOSED: Boolean //true (OPEN), false (CLOSED)
	monitored hONOFF: Boolean //true (ON), false (OFF)
	monitored whONOFF: Boolean //true (ON), false (OFF)
	monitored sensorsActivated: Agent -> Boolean //Sensors are ready for reading
	

	//**** Function for the coordination of the overall system  ****
	
	monitored esAdaptHeater: Boolean // used to nondeterministically choose between two adaptations actions

	dynamic controlled monitor: Boolean
	derived monMAPE_CH: Boolean
	derived monMAPE_MD: Boolean
	derived monMAPE_AQ: Boolean
	derived monMAPE_MWH: Boolean
	derived monMAPE_ES: Boolean
	derived execMAPE_CH: Boolean
	derived execMAPE_MD: Boolean
	derived execMAPE_AQ: Boolean
	derived execMAPE_MWH: Boolean
	derived execMAPE_ES: Boolean
	
	derived checkForAdaptation: Boolean
    derived adaptationRequiredCH: Boolean
    derived adaptationRequiredAQ: Boolean
    derived adaptationRequiredES: Boolean
    derived adaptationRequiredMD: Boolean
    derived startMainMonitorES: Boolean
    derived startMainMonitorMD: Boolean
    
definitions:
	domain Temperature = {0 .. 35}
	function monMAPE_CH = monitor
	function monMAPE_MD = monitor
	function monMAPE_AQ = monitor
	function monMAPE_MWH = monitor
	function monMAPE_ES = monitor
	function execMAPE_CH = not monitor
	function execMAPE_MD = not monitor
	function execMAPE_AQ = not monitor
	function execMAPE_MWH = not monitor
	function execMAPE_ES = not monitor
	
	function checkForAdaptation =  isUndef(setWaterHeatingStatus(waterHeaterManaged)) and 
	  isUndef(setHeatingStatus(heaterManaged)) and isUndef(setWindowStatus(windowManaged))
   
    function adaptationRequiredCH = //AND-semantics
     (forall $a in interfaceM_CH_IT(self) with sgnMA_IT_CH($a,self) = true)
   
    function adaptationRequiredAQ = //AND-semantics
     (forall $a in interfaceM_AQ_IW(self) with sgnMA_IW_AQ($a,self) = true)

    function adaptationRequiredES =  time = MORN_AFT and 
       heatingStatus = VERY_HOT and waterHeaterON 
    
    function adaptationRequiredMD = 
    //do not open windows (close the open windows) when the heater is on 
	//heatingStatus != OFF and windowStatus = OPEN 
    heatingON and windowStatus = OPEN 
      
    function startMainMonitorES = //and-semantics
     (forall $a in interfaceM_ES_IT(self) with sgnMM_IT_ES($a,self) = true) 
     and
     (forall $b in interfaceM_ES_IWH(self) with sgnMM_IWH_ES($b,self) = true)
    
    function startMainMonitorMD = //and-semantics
     (forall $a in interfaceM_MD_IT(self) with sgnMM_IT_MD($a,self) = true) 
     and
     (forall $b in interfaceM_MD_IW(self) with sgnMM_IW_MD($b,self) = true)
    
    
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
		
	rule r_modifyHeatingStatus($newHeatingStatus in HeatingStatus) =
		    setHeatingStatus(managedSyS(self)) := $newHeatingStatus
			
	rule r_modifyWaterHeatingStatus($newWaterHeatingStatus in WaterHeatingStatus) =
			setWaterHeatingStatus(managedSyS(self)) := $newWaterHeatingStatus
			
	rule r_modifyWindowStatus($newWindowStatus in WindowStatus) =
			setWindowStatus(managedSyS(self)) := $newWindowStatus
		    
    rule r_signalCleanUp ($signal in Boolean) = 
            $signal := false
    
    rule r_start($signal in Boolean) =
        if $signal = false then 
           $signal := true 
        endif    
    
	rule r_InterfaceHeaterExec ($signal in Boolean, $newhs in HeatingStatus ) =		
		if $signal then
			par
			  r_modifyHeatingStatus[$newhs] //Actions to invoke effectors (actuators)
			  r_signalCleanUp[$signal]
			endpar
		endif	
	 	
	rule r_InterfaceWindowExec ($signal in Boolean, $newws in WindowStatus) =		
		if $signal then
			par
			  r_modifyWindowStatus[$newws] //Actions to invoke effectors (actuators)
			  r_signalCleanUp[$signal]
			endpar
		endif	 	

    rule r_InterfaceWaterHeaterExec ($signal in Boolean, $newwhs in WaterHeatingStatus) =
	   if $signal then
			par 
			  r_modifyWaterHeatingStatus[$newwhs] //Actions to invoke effectors (actuators)
			  r_signalCleanUp[$signal]
			endpar
		endif	
		  
    
    rule r_ExecCleanUpCH = skip
    rule r_ExecCleanUpAQ = skip
    rule r_ExecCleanUpES = skip
    rule r_ExecCleanUpMD = skip
          
    rule r_ExecCH = 
     par
	   //AND-semantics of EE relations
	   forall $a in interfaceE_CH_IT(self) do 
	     sgnEE_CH_IT(self,$a) := true 
	   r_ExecCleanUpCH[]    
	 endpar
    
    rule r_ExecAQ ($newws in WindowStatus) = 
     par
	   windowStatus := $newws //set the desiderata value OPEN or CLOSED into the knowledge
	   //AND-semantics of EE relations
	   forall $a in interfaceE_AQ_IW(self) do 
	     sgnEE_AQ_IW(self,$a) := true 
	   r_ExecCleanUpAQ[]    
	 endpar
  
    rule r_MainExecES = 
    par
	   //XOR-semantics of EE relations (non-deterministic choice)
	   if esAdaptHeater then // send signal to decrease the heater
			par
			  heatingStatus := FAIRLY_HOT
			  forall $a in interfaceE_ES_IT(self) do 
	                sgnEE_ES_IT(self,$a) := true
			endpar		 
	   else // send signal to turn the water heater off
		    par
		      waterHeatingStatus := WH_OFF
		      forall $b in interfaceE_ES_IWH(self) do 
	                sgnEE_ES_IWH(self,$b) := true
		    endpar   
	   endif
	   r_ExecCleanUpES[]    
	 endpar     
   
  rule r_MainExecMD = 
    par
      windowStatus := CLOSED
      //AND-semantics of EE relations
	  forall $a in interfaceE_MD_IW(self) do 
	     sgnEE_MD_IW(self,$a) := true 
	  r_ExecCleanUpMD[] 
    endpar
         
  rule r_AnalyzeCleanUpCH = 
       forall $a in interfaceM_CH_IT(self) do 
          r_signalCleanUp[sgnMA_IT_CH($a,self)] // reset all MA signals 	
	
  rule r_AnalyzeCleanUpAQ = 
       forall $a in interfaceM_AQ_IW(self) do 
          r_signalCleanUp[sgnMA_IW_AQ($a,self)] // reset all MA signals 
			  
  rule r_MonitorCleanUpES =
      par 
       forall $a in interfaceM_ES_IT(self) do 
          r_signalCleanUp[sgnMM_IT_ES($a,self)] // reset all MM signals 
	   forall $b in interfaceM_ES_IWH(self) do 
          r_signalCleanUp[sgnMM_IWH_ES($b,self)] // reset all MM signals 
	  endpar	
  		
  rule r_MonitorCleanUpMD =  
     par 
       forall $a in interfaceM_MD_IT(self) do 
          r_signalCleanUp[sgnMM_IT_MD($a,self)] // reset all MM signals 
	   forall $b in interfaceM_MD_IW(self) do 
          r_signalCleanUp[sgnMM_IW_MD($b,self)] // reset all MM signals 
	  endpar	
	  
  rule r_AnalyzeCH =   
       if adaptationRequiredCH then
          r_ExecCH[] //@E_MAPE_CH  direct invocation (waterfall)
       endif   
      
   rule r_AnalyzeAQ =    
       if adaptationRequiredAQ then
         par
          if airQuality = BAD and windowStatus = CLOSED then
			 r_ExecAQ[OPEN] //@E_MAPE_AQ direct invocation (waterfall) to open the window
		  endif
		  if airQuality = GOOD and windowStatus = OPEN then
			 r_ExecAQ[CLOSED] //@E_MAPE_AQ direct invocation (waterfall) to close the window
		  endif
         endpar
       endif  
   
    rule r_AnalyzeMWH =   
      if waterHeatingStatus = WH_OFF then
       par   
         waterHeatingStatus := WH_ON
         r_start[sgnAE_MWH_IWH(self,interfaceE_MWH_IWH(self))] //@E_MAPE_MWH  indirect invocation 
       endpar
      endif
          
    rule r_MainAnalyzeES = 
     if adaptationRequiredES then // time = MORN_AFT and heatingStatus = VERY_HOT and waterHeaterON  
         r_MainExecES[] //@E_MAPE_ES  direct invocation (waterfall)
     endif
         
      //electricity is expensive during the day
     rule r_MainAnalyzeMD = 
     if adaptationRequiredMD then //   
        r_MainExecMD[] //@E_MAPE_MD  direct invocation (waterfall)
     endif
                 
     rule r_saveDataAirQuality =     
     if badAir then
			airQuality := BAD  // to open the window
	 else
			airQuality := GOOD // to close the window
	 endif
	 
     rule r_saveDataWaterHeater =    
      if whONOFF then
        if waterHeaterON then waterHeaterON := false
        else waterHeaterON := true
        endif
	  endif
	  
	 rule r_saveDataHeater =    
      if hONOFF then 
        if heatingON then heatingON := false 
        else heatingON := true
        endif
      endif
      
	 rule r_saveDataRoomTemp =     
	 //Save the desired room heating into the knowledge
	 if roomTemp < 10 then
			heatingStatus := VERY_HOT  
		else
			if roomTemp < 18 then
				heatingStatus := FAIRLY_HOT 
			else
				heatingStatus := OFF //to turn off the heater
			endif
		endif
		
	rule r_InterfaceTemperatureMonitor =
	 if sensorsActivated(managedSyS(self)) then
		  par	
			r_saveDataRoomTemp[] 
			r_start[sgnMA_IT_CH(self,mainA_IT_CH(self))] //A_MAPE_CH  indirect invocation
		  endpar
	 endif
	 
	rule r_InterfaceWindowMonitor =
	if sensorsActivated(managedSyS(self)) then
		  par	
			r_saveDataAirQuality[] 
			r_start[sgnMA_IW_AQ(self,mainA_IW_AQ(self))] //A_MAPE_AQ  indirect invocation
		  endpar
	 endif
	
   
    rule r_InterfaceWaterHeaterMonitor = 
    if sensorsActivated(managedSyS(self)) then
		  par	
			r_saveDataWaterHeater[] 
			r_start[sgnMM_IWH_ES(self,mainM_IWH_ES(self))] //M_MAPE_ES  indirect invocation
		  endpar
	 endif

	rule r_MonitorMWH =
		if time = EARLY_MORN then
		   r_AnalyzeMWH[] //@A_MAPE_MWH  direct invocation (waterfall)
		endif

	rule r_MainMonitorES =
	 //electricity is expensive during the day
	 //AND-semantics of MM relations is the triggering condition for Analyze
	 if startMainMonitorES
	  then 
		par
		  r_MainAnalyzeES[] //@A_MAPE_ES direct invocation (waterfall)
		  r_MonitorCleanUpES[]
		endpar  
	  endif  
		
	rule r_MainMonitorMD =
	 //AND-semantics of MM relations is the triggering condition for Analyze
	 if startMainMonitorMD
	  then 
		par
		  r_MainAnalyzeMD[] //@A_MAPE_MD direct invocation (waterfall)
		  r_MonitorCleanUpMD[]
		endpar  
	  endif 
	  	        
    rule r_MainES = r_MainMonitorES[] //@M_MAPE_ES
    
    rule r_MainMD = r_MainMonitorMD[] //@M_MAPE_ES
    
    rule r_MainCH = r_AnalyzeCH[] //@A_MAPE_CH
          
    rule r_MainAQ = r_AnalyzeAQ[] //@A_MAPE_AQ
    
    //MAPE_MWH: keep water heater on in the early morning
    rule r_MWH = 
     if monMAPE_MWH then
			r_MonitorMWH[] //@M_MAPE_MWH
	 endif  
         
    //MAPE_CH: when it is cold, the heaters should be at sufficient settings for comfort
    //MAPE_ES: when the electricity is expensive do not use water heater and strong heating together
    rule r_InterfaceTemperature = 
      par
			if monMAPE_CH or monMAPE_AQ then
				r_InterfaceTemperatureMonitor[] //@M_MAPE_CH //@M_MAPE_MD
			endif
			if execMAPE_CH then
		    	r_InterfaceHeaterExec[sgnEE_CH_IT(mainE_IT_CH(self),self),heatingStatus] //@E_MAPE_CH 
			endif
			if execMAPE_ES then
				r_InterfaceHeaterExec[sgnEE_ES_IT(mainE_IT_ES(self),self),heatingStatus] //@E_MAPE_ES
			endif	
      endpar
     
    //MAPE_ES: when the electricity is expensive do not use water heater and strong heating together
    //MAPE_MWH: keep water heater on in the early morning
    rule r_InterfaceWaterHeater = 
       par
			if monMAPE_ES then 
			   	r_InterfaceWaterHeaterMonitor[] //@M_MAPE_ES
			endif
			if execMAPE_ES then 
				r_InterfaceWaterHeaterExec[sgnEE_ES_IWH(mainE_IWH_ES(self),self),waterHeatingStatus] //@E_MAPE_ES 
			endif
			if execMAPE_MWH then
			   r_InterfaceWaterHeaterExec[sgnAE_MWH_IWH(mwhA_IWH_MWH(self),self),waterHeatingStatus] //@E_MAPE_MWH
			endif
		endpar
       
      
    //MAPE_AQ: do open window when air quality is bad
    //MAPE_MD: do not open windows (close the open windows) when the heater is on 
    rule r_InterfaceWindow = 
       par
            if monMAPE_MD or monMAPE_AQ then
            	r_InterfaceWindowMonitor[] //@M_MAPE_MD @M_MAPE_AQ
			endif
			if execMAPE_MD then
				r_InterfaceWindowExec[sgnEE_MD_IW(mainE_IW_MD(self),self),windowStatus] //@E_MAPE_MD
			endif
			if execMAPE_AQ then //CLOSED or OPEN
				r_InterfaceWindowExec[sgnEE_AQ_IW(mainE_IW_AQ(self),self),windowStatus] //@E_MAPE_AQ
			endif
       endpar
    

	//managed agents' behavior: run actuators and sensors, other than the application logic
    //Here there's no a complete model; just placeholders 
	rule r_heater =
	   if isDef(setHeatingStatus(self)) then
			setHeatingStatus(self) := undef //signal reset
	   endif
       
    rule r_waterHeater = 
    if isDef(setWaterHeatingStatus(self)) then
			setWaterHeatingStatus(self) := undef
		endif
    
	rule r_window = 
	if isDef(setWindowStatus(self)) then
	   setWindowStatus(self) := undef
	endif

	main rule r_Main =
		//managed agents are not adapting
		if checkForAdaptation then
			par
				program(ch_a)
				program(es_a)
				program(aq_a) 
				program(mwh_a)
				program(md_a)
				program(h_a)
				program(wh_a)
				program(w_a)

				if monitor then
					r_advanceTime[]
				endif
				monitor := not monitor
			endpar
		else
			//managed agents are adapting
			par
				//managed agents
				program(windowManaged)
				program(heaterManaged)
				program(waterHeaterManaged)
			endpar
		endif

default init s0:
   function managedSyS($a in Agent) =
       switch($a)
         case wh_a: waterHeaterManaged
         case h_a: heaterManaged
         case wh_a: windowManaged
       endswitch
       
	function waterHeatingStatus = WH_OFF
	function heatingStatus = OFF
	function windowStatus = OPEN
	function time = EARLY_MORN
	function monitor = true
	function waterHeaterON = false
	function heatingON = false
	function airQuality = GOOD
	
	//interaction relations
	function mainM_IT_ES($a in InterfaceTemperatureMgA) = es_a 
    function interfaceM_ES_IT($a in MainESMgA) = {h_a} 
    function mainM_IWH_ES($a in InterfaceWaterHeaterMgA) = es_a 
    function interfaceM_ES_IWH($a in MainESMgA) = {wh_a} 
	function mainM_IT_MD($a in InterfaceTemperatureMgA) = md_a   
	function interfaceM_MD_IT($a in MainMDMgA) = {h_a}  
	function mainM_IW_MD($a in InterfaceWindowMgA) = md_a  
	function interfaceM_MD_IW($a in MainMDMgA) = {w_a} 
	function interfaceE_ES_IT($a in MainESMgA) = {h_a} 
	function mainE_IT_ES($a in InterfaceTemperatureMgA) = es_a  
	function interfaceE_ES_IWH($a in MainESMgA) = {wh_a} 
	function mainE_IWH_ES($a in InterfaceWaterHeaterMgA) = es_a  
	function interfaceE_MD_IW($a in MainMDMgA) = {md_a} 
	function mainE_IW_MD($a in InterfaceWindowMgA) = md_a  
    function mainA_IT_CH($a in InterfaceTemperatureMgA) = ch_a  
	function interfaceM_CH_IT($a in MainCHMgA) = {h_a} 
	function interfaceE_CH_IT($a in MainCHMgA) = {h_a}  
	function mainE_IT_CH($a in InterfaceTemperatureMgA) = ch_a  
	function mainA_IW_AQ($a in InterfaceWindowMgA) = aq_a  
	function interfaceM_AQ_IW($a in MainAQMgA) = {w_a}  
    function interfaceE_AQ_IW($a in MainAQMgA) = {w_a}  
	function mainE_IW_AQ($a in InterfaceWindowMgA) = aq_a   
	function interfaceE_MWH_IWH($a in MWHMgA) = wh_a 
    function mwhA_IWH_MWH($a in InterfaceWaterHeaterMgA) = mwh_a  
    
	
	
	//signals
	function sgnMM_IT_ES ($a in InterfaceTemperatureMgA, $ma in MainESMgA) = false
    function sgnMM_IWH_ES ($a in InterfaceWaterHeaterMgA, $ma in MainESMgA) = false
    function sgnMM_IT_MD ($a in InterfaceTemperatureMgA, $ma in MainMDMgA) = false
    function sgnMM_IW_MD ($a in InterfaceWindowMgA, $ma in MainMDMgA) = false
	function sgnEE_ES_IT ($ma in MainESMgA, $a in InterfaceTemperatureMgA) = false 
	function sgnEE_ES_IWH ($ma in MainESMgA, $a in InterfaceWaterHeaterMgA) = false
	function sgnEE_MD_IW ($ma in MainMDMgA, $a in InterfaceWindowMgA) = false
    function sgnMA_IT_CH ($a in InterfaceTemperatureMgA, $ma in MainCHMgA) = false
	function sgnEE_CH_IT ($ma in MainCHMgA, $a in InterfaceTemperatureMgA) = false
	function sgnMA_IW_AQ ($a in InterfaceWindowMgA, $ma in MainAQMgA) = false
	function sgnEE_AQ_IW ($ma in MainAQMgA, $a in InterfaceWindowMgA) = false
	function sgnAE_MWH_IWH ($ma in MWHMgA, $a in InterfaceWaterHeaterMgA) = false
	

//managing agents' programs

agent MainMDMgA: r_MainMD[]
agent MainESMgA: r_MainES[]
agent MainCHMgA: r_MainCH[]
agent MainAQMgA: r_MainAQ[]
agent MWHMgA: r_MWH[]
agent InterfaceWaterHeaterMgA: r_InterfaceWaterHeater[]
agent InterfaceWindowMgA: r_InterfaceWindow[]
agent InterfaceTemperatureMgA: r_InterfaceTemperature[]


//managed agents
agent WaterHeaterMdA: r_waterHeater[]
agent WindowMdA: r_window[]
agent HeaterMdA: r_heater[]