asm ComfortableHeating_ref
import StandardLibrary

signature:
	//ComfortableHeatingMAPE
	domain HeaterMdA subsetof Agent
	domain MainCHMgA subsetof Agent
	domain IntTempMgA subsetof Agent
	
	//domains added in refinement
	enum domain HeatingStatus = {FAIRLY_HOT | VERY_HOT | OFF}
	domain Temperature subsetof Integer
	enum domain Time = {EARLY_MORN | MORN_AFT | EVENING}


	derived startMainCHM: MainCHMgA -> Boolean
	derived startMainCHA: MainCHMgA -> Boolean
	derived startMainCHP: MainCHMgA -> Boolean
	derived startMainCHE: MainCHMgA -> Boolean
	controlled heaterManagedByIntTemp: IntTempMgA -> HeaterMdA
	derived startIntTempM: IntTempMgA -> Boolean
	derived startIntTempE: IntTempMgA -> Boolean
	//I: IntTemp.M -> MainCH.M [*-ONE,1]
	controlled sgnIntTempMMainCHM: Prod(IntTempMgA, MainCHMgA) -> Boolean
	controlled fromIntTempMtoMainCHM: IntTempMgA -> MainCHMgA
	controlled fromMainCHMtoIntTempM: MainCHMgA -> Powerset(IntTempMgA)
	//I: MainCH.E -> IntTemp.E [1,*-ALL]
	controlled sgnMainCHEIntTempE: Prod(MainCHMgA, IntTempMgA) -> Boolean
	controlled fromMainCHEtoIntTempE: MainCHMgA -> Powerset(IntTempMgA)
	controlled fromIntTempEtoMainCHE: IntTempMgA -> MainCHMgA
	//ComfortableHeating
	static hs0: HeaterMdA
	static hs1: HeaterMdA
	static ch: MainCHMgA
	static h0: IntTempMgA
	static h1: IntTempMgA

	//functions added in refinement
	monitored roomTemp: IntTempMgA -> Temperature //room sensor
	controlled roomTempSaved: IntTempMgA -> Temperature //room sensor
	monitored timePassed: Boolean
	controlled time: Time
	derived avgTemp: MainCHMgA -> Real
	derived computeHeating : MainCHMgA -> HeatingStatus
	controlled desiredHeating: MainCHMgA -> HeatingStatus //heating status to set
	//shared between managed and managing agents
	controlled setHeatingStatus: HeaterMdA -> HeatingStatus

	//**** Function for the coordination of the overall system ****
	//derived startMainM: Boolean
	//derived adaptationRequiredMainA: Boolean
	monitored sensorsActivatedHeater: HeaterMdA -> Boolean //Used to trigger the model execution; it means some sensors are ready for reading

	//Used to strictly sequence different MAPE loop executions
	//(just an example of a MAPE execution schema)
	controlled loopCompletedIT: IntTempMgA -> Boolean

definitions:
	function avgTemp($a in MainCHMgA) = //9.0 It works!
		(sum(<$k in asBag(fromMainCHMtoIntTempM($a)): roomTempSaved($k)>)/size(fromMainCHMtoIntTempM($a)))

	function computeHeating($a in MainCHMgA) =
		let ($t = avgTemp($a)) in
			if $t < 10.0 then
				VERY_HOT
			else
				if $t < 18.0 then
					FAIRLY_HOT
				else
					OFF
				endif
			endif
		endlet

	function startMainCHM($b in MainCHMgA) =
		(forall $a in fromMainCHMtoIntTempM($b) with sgnIntTempMMainCHM($a, $b))

	function startMainCHA($b in MainCHMgA) =
		neq(desiredHeating($b), computeHeating($b))

	function startIntTempE($b in IntTempMgA) =
		sgnMainCHEIntTempE(fromIntTempEtoMainCHE($b), $b)

	rule r_start($signal in Boolean) =
		if $signal = false then 
			$signal := true 
		endif

	rule r_Heater =
		if isDef(setHeatingStatus(self)) then
			setHeatingStatus(self) := undef //signal reset
		endif

	rule r_CleanUp_MainCHE =
		skip 

	rule r_MainCHE =
		par
			desiredHeating(self) := computeHeating(self)
			forall $a in fromMainCHEtoIntTempE(self) do
				sgnMainCHEIntTempE(self, $a) := true
			r_CleanUp_MainCHE[]
		endpar

	rule r_CleanUp_MainCHA =
		skip

	rule r_CleanUp_LoopCompletedCHA =
		//if no adaptation was necessary, cleaning of loop completion flags is done here
		forall $a in fromMainCHMtoIntTempM(self) do
			loopCompletedIT($a) := false

	rule r_MainCHA =
		if startMainCHA(self) then
			par
				r_MainCHE[] //@E_MAPE_CH direct invocation (waterfall), without planning
				r_CleanUp_MainCHA[]
			endpar
		else
			r_CleanUp_LoopCompletedCHA[] //for loop coordination
		endif

	rule r_CleanUp_MainCHM =
		forall $a in fromMainCHMtoIntTempM(self) do
			sgnIntTempMMainCHM($a, self) := false

	//MAPE_CH: ...
	rule r_MainCHM =
		if startMainCHM(self) then
			par
				r_MainCHA[] //@A_MAPE_CH direct invocation (waterfall)
				r_CleanUp_MainCHM[]
			endpar
		endif

	rule r_MainCH =
		r_MainCHM[] //@M_MAPE_CH direct invocation (waterfall)

	rule r_CleanUp_IntTempM =
		loopCompletedIT(self) := false // reset

	//Saves the room temperature into the knowledge based on the
	//registered value of the room temperature sensor 
	rule r_SaveSensorsData_Heater =
		roomTempSaved(self) := roomTemp(self)

	rule r_IntTempM =
		if loopCompletedIT(self) then //***coordination***: for sequencing different MAPE loops executions
			if sensorsActivatedHeater(heaterManagedByIntTemp(self)) then
				par
					r_SaveSensorsData_Heater[]
					r_start[sgnIntTempMMainCHM(self,fromIntTempMtoMainCHM(self))] //A_MAPE_CH indirect invocation
					r_CleanUp_IntTempM[]
				endpar
			endif
		endif

	rule r_TriggerActuators_Heater($s in HeaterMdA, $b in IntTempMgA) =
		setHeatingStatus($s) := desiredHeating(fromIntTempEtoMainCHE($b))

	rule r_CleanUp_IntTempE =
		par
			sgnMainCHEIntTempE(fromIntTempEtoMainCHE(self), self) := false
			loopCompletedIT(self) := true
		endpar

	rule r_IntTempE =
		if startIntTempE(self) then
			par
				r_TriggerActuators_Heater[heaterManagedByIntTemp(self), self] //Actions are executed by invoking effectors (actuators)
				r_CleanUp_IntTempE[]
			endpar
		endif

	rule r_IntTemp =
		par
			r_IntTempM[]
			r_IntTempE[]
		endpar

	main rule r_main =
		forall $a in Agent with true do
			program($a)

default init s0:
	function sgnIntTempMMainCHM($a in IntTempMgA, $b in MainCHMgA) = false
	function sgnMainCHEIntTempE($a in MainCHMgA, $b in IntTempMgA) = false
	function fromIntTempMtoMainCHM($a in IntTempMgA) =
		switch($a)
			case h0: ch
			case h1: ch
		endswitch

	function fromMainCHMtoIntTempM($a in MainCHMgA) =
		switch($a)
			case ch: {h0, h1}
		endswitch

	function fromMainCHEtoIntTempE($a in MainCHMgA) =
		switch($a)
			case ch: {h0, h1}
		endswitch

	function fromIntTempEtoMainCHE($a in IntTempMgA) =
		switch($a)
			case h0: ch
			case h1: ch
		endswitch

	function heaterManagedByIntTemp($x in IntTempMgA) =
		switch($x)
			case h0: hs0
			case h1: hs1
		endswitch

	function loopCompletedIT ($a in IntTempMgA) = true
	function time = EARLY_MORN
	function desiredHeating($a in MainCHMgA) = OFF

	agent MainCHMgA: r_MainCH[]
	agent IntTempMgA: r_IntTemp[]
	agent HeaterMdA: r_Heater[]
