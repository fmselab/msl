//Manual and adaptive high beam headlights
//from ELS-30 to ELS-38

//We assume a max illumination area of 360 m and 100% of luminous strenght in the flasher mode.
//We assume key is inserted to activate high beam in a fixed way

asm AdaptiveHighBeamLights_refined

import StandardLibrary

signature:
	//DOMAINS
	
	domain HighBeamLightsMdA subsetof Agent
	domain MainMgA subsetof Agent
	
	//Added by incremental refinement
	enum domain CameraState = {READY | DIRTY | NOTREADY} // Camera state
	domain CurrentSpeed subsetof Integer // Speed
	enum domain LightSwitch = {OFF | AUTO | ON} // Light rotary switch positions
	domain HighBeamRange subsetof Integer // High beam luminous strenght
	domain HighBeamMotor  subsetof Integer // High beam illumination distance
	//0=65,1=100,2 = 120, 3 = 140, 4 = 160, 5= 180, 6 = 200, 7=220, etc. See table at page 23.
	enum domain KeyPosition = {NOKEYINSERTED | KEYINSERTED | KEYINIGNITIONONPOSITION} // Key state
	enum domain PitmanArmForthBack = {BACKWARD | FORWARD | NEUTRAL_FB} // Pitman arm positions - horizontal position
    enum domain CruiseControlMode = {CCM0 | CCM1 | CCM2}		

	//FUNCTIONS
	
	controlled highbeamlightsManagedByMain: MainMgA -> HighBeamLightsMdA
	//derived startMainM: MainMgA -> Boolean
	derived startMainA: MainMgA -> Boolean
	derived startMainP: MainMgA -> Boolean
	derived startMainE: MainMgA -> Boolean

	static hbl: HighBeamLightsMdA
	static ahbl: MainMgA

	//Added by incremental refinement
	monitored cameraState: CameraState // Camera state: ready, dirty or not ready
	monitored currentSpeed: CurrentSpeed // Current speed of the vehicle
	monitored keyState: KeyPosition // Position of the key
	monitored lightRotarySwitch: LightSwitch // Position of the light rotary switch
	monitored oncomingTraffic: Boolean // Camera signal to detect oncoming vehicles. True -> vehicles oncoming, False -> no vehicles
	monitored pitmanArmForthBack: PitmanArmForthBack // Position of the pitman arm - horizontal position
	monitored cruiseControlMode: CruiseControlMode // State of cruise control
	
	controlled highBeamOn: Boolean // High beam headlights (left and right) are on (True) or not (False)
	controlled highBeamRange: HighBeamRange // High beam luminous strenght
	controlled highBeamMotor: HighBeamMotor // Control the high beam illumination - 20m step size
	controlled pitmanArmForthBackPrevious: PitmanArmForthBack // Position of the pitman arm - horizontal position - in the previous state
	controlled setVehicleSpeed: CurrentSpeed // Desired speed in case an adaptive cruise control is part of the vehicle
	
	derived adaptiveHighBeamActivated: Boolean
	derived adaptiveHighBeamDeactivated: Boolean
	derived engineOn: Boolean // Depending on keyState engineOn is true or false
	derived headlampFlasherActivated: Boolean //Temporary activation of the high beam (without engaging, so-called flasher)
	derived headlampFlasherDeactivated: Boolean
	derived headlampFixedActivated: Boolean //Fixed activation of the high beam
	derived headlampFixedDeactivated: Boolean
	derived calculateSpeed: CurrentSpeed
	
	derived lightIlluminationDistance: HighBeamMotor
	derived luminousStrength: HighBeamRange
	
definitions:
	

	// DOMAIN DEFINITIONS
	//Added by incremental refinement
	
	domain CurrentSpeed = {0..2000} // Value range: 0-5000 (0.0-500.0 km/h)
	domain HighBeamRange = {0..100} //Percentage of high beam brightness (0..300 desired light range)
	domain HighBeamMotor = {0..14} //0-14 desired position: 0 = 65 m, 1 = 100m, 2-14 = 120-360 m (20m step size)
	
		
	// FUNCTION DEFINITIONS
	
	//function startMainM($b in MainMgA) =
	//	true

	function startMainA($b in MainMgA) = adaptiveHighBeamActivated 
		
	function startMainP($b in MainMgA) =
		true

	function startMainE($b in MainMgA) =
		true
	
	//Added by incremental refinement

	//Formulas for graphs in Figure 7 and 8 (as "reverse engineered") 
	function lightIlluminationDistance =
		if calculateSpeed < 300 then 0 
		else if calculateSpeed < 400 then 1  
		else if calculateSpeed < 500 then 2 
		else if calculateSpeed < 600 then 3 
		else if calculateSpeed < 700 then 4 
		else if calculateSpeed < 800 then 5 
		else if calculateSpeed < 900 then 6 
		else if calculateSpeed < 1000 then 7 
		else if calculateSpeed < 1100 then 8 
		else if calculateSpeed < 1200 then 9 
		else if calculateSpeed < 1300 then 10
		else if calculateSpeed < 1400 then 11 
		else if calculateSpeed < 1500 then 12 
		else if calculateSpeed < 1600 then 13 
		else if calculateSpeed > 1700 then 14 
		endif endif endif endif endif endif endif endif endif endif endif endif endif endif endif
	
	//Discretized
	function luminousStrength = 
	if calculateSpeed >= 0 and calculateSpeed < 300 then 0 
	else if calculateSpeed < 400 then 30  //=(7*speed+60)/9
	else if calculateSpeed < 500 then 37 
	else if calculateSpeed < 600 then 45 
	else if calculateSpeed < 700 then 53 
	else if calculateSpeed < 800 then 61 
	else if calculateSpeed < 900 then 68 
	else if calculateSpeed < 1000 then 76 
	else if calculateSpeed < 1100 then 84 
	else if calculateSpeed < 1200 then 92 
	else if calculateSpeed > 1200 then 100 
	endif endif endif endif endif endif endif endif endif endif endif
	//ELS-37 If an adaptive cruise control is part of the vehicle, the light illumination distance is not calculated upon the actual 

	
	//Engine state is determined by KeyPosition value. If the key is on the engine is on, otherwise is off
	function engineOn =
		(keyState = KEYINIGNITIONONPOSITION)
		
	
	//ELS-37 If an adaptive cruise control is part of the vehicle, the light illumination distance is not calculated upon the actual 
   //vehicle speed but the target speed provided by the advanced cruise control.
	function calculateSpeed =
	  if (cruiseControlMode=CCM2) then setVehicleSpeed 
	  else  currentSpeed
	  endif
	
	//ELS32 If the light rotary switch is in position Auto, the adaptive high beam is activated by moving the pitman arm to the back
	function adaptiveHighBeamActivated =
		(lightRotarySwitch = AUTO and  engineOn and pitmanArmForthBack = BACKWARD)
	
	//ELS-38 If the pitman arm is moved again in the horizontal neutral position, the adaptive high beam headlight is deactivated.	
	function adaptiveHighBeamDeactivated =
		(lightRotarySwitch = AUTO and  pitmanArmForthBack = NEUTRAL_FB and pitmanArmForthBackPrevious = BACKWARD)
	
	function headlampFlasherActivated = 
	 	(pitmanArmForthBack = FORWARD and pitmanArmForthBackPrevious = NEUTRAL_FB)
	 	
	function headlampFlasherDeactivated = 
	 	(pitmanArmForthBack = NEUTRAL_FB and pitmanArmForthBackPrevious = FORWARD)
	
	function headlampFixedActivated = 
		(pitmanArmForthBack = BACKWARD and lightRotarySwitch = ON and (keyState = KEYINSERTED or engineOn)) 
		
	function headlampFixedDeactivated =
	 ( (pitmanArmForthBack = NEUTRAL_FB and pitmanArmForthBackPrevious = BACKWARD and lightRotarySwitch = ON) or 
    ((lightRotarySwitch = OFF or keyState = NOKEYINSERTED) and not headlampFlasherActivated))

	   
	// RULE DEFINITIONS 
	
	//Added by incremental refinement
	
	macro rule r_ReadMonitorFunctions = 
			pitmanArmForthBackPrevious := pitmanArmForthBack

	 
	macro rule r_set_high_beam_headlights($v in Boolean, $d in HighBeamMotor, $l in HighBeamRange) =
		par
			highBeamOn := $v
			highBeamMotor := $d 
			highBeamRange := $l 
		endpar
		
	macro rule r_Manual_high_beam_headlights = 
		par
			//ELS-30
			if (headlampFlasherActivated) then
				r_set_high_beam_headlights[true,14,100] //max illumination area 360m, 100% luminous strenght (percentage)
			endif
			//ELS-30-31
			if (headlampFlasherDeactivated or headlampFixedDeactivated) then
			    highBeamOn := false
			endif
			//ELS-31
			if (headlampFixedActivated) then
				r_set_high_beam_headlights[true,7,100] //illumination area of 220m, 100% luminous strenght (percentage)
			endif
	    endpar
					
	
	rule r_CleanUp_MainE =
		skip //<<TODO>>

	//ELS-33 @E_MAPE_AHB
	//Sets the values, as calculated by the planner, for the lighting high beam actuators: highBeamOn to activate and deactivate the high beam, 
	//highBeamRange to control the high beam luminous, and highBeamMotor to control the high beam illumination distance.  
	rule r_MainE($setHighBeam in Boolean,  $setHighBeamMotor in HighBeamMotor, $setHighBeamRange in HighBeamRange) =
		if startMainE(self) then
			par
				r_set_high_beam_headlights[$setHighBeam,$setHighBeamMotor,$setHighBeamRange]
				r_CleanUp_MainE[]
			endpar
		endif

	rule r_CleanUp_MainP =
		skip //<<TODO>>

	 //ELS-33 @P1_MAPE_AHB
	//Plans street illumination according to the characteristic curves for light illumination distance and for luminous strength 
	//depending on the vehicle speed
	rule r_MainIncreasingP =
		if startMainP(self) then
			par
				r_MainE[true,lightIlluminationDistance,luminousStrength]
				r_CleanUp_MainP[]
			endpar
		endif

  	  
	//ELS-34 @P2_MAPE_AHB
	//Reduce street illumination by reducing the area of illumination to 65 meters by an adjustment of the headlight position 
	//as well as by reduction of the luminous strength to 30%. 
	//depending on the vehicle speed
	rule r_MainDecreasingP =
		if startMainP(self) then
			par
				r_MainE[true,30,0]
				r_CleanUp_MainP[]
			endpar
		endif



	rule r_CleanUp_MainMA =
		skip 
		
	//ELS-33-34-35 @MA_MAPE_AHB
	//All MAPE computations of the MAPE loop are executed within one single ASM-step machine.
	//Note that we do not model the time constraints ('within 2 seconds', 'within 0.5 seconds')
	rule r_MainMA =
	  if startMainA(self) then
		par	
	 	 	if ((currentSpeed>=300) and not oncomingTraffic) then //ELS-33 ELS-35 (checks if adaptation is necessary)
	 		   //the street should be illuminated accordingly
	 		  r_MainIncreasingP[]
	 	    endif
	 	    if (oncomingTraffic) then //ELS-34 (checks if adaptation is necessary) 
	 			//an activated high beam headlight is reduced to low beam headlight.
	 		  r_MainDecreasingP[]
	 	    endif
			r_CleanUp_MainMA[]
		endpar
	   endif
	

	//rule r_CleanUp_MainM =
	//	skip //<<TODO>>

	//rule r_MainM =
	//	if startMainM(self) then
	//		par
	//			skip //<<TODO>>
	//			r_MainA[]
	//			r_CleanUp_MainM[]
	//		endpar
	//	endif

	//Program of the managing agent
	rule r_Main = //MAPE loop may start and stop
		//r_MainM[]
		par 
		    r_MainMA[] 
			if (adaptiveHighBeamDeactivated) then highBeamOn := false	endif //ELS-38 If the pitman arm is moved again in the horizontal neutral position, 														  //the adaptive high beam headlight is deactivated.
		endpar
			
		
	//Added by incremental refinement
		
	//Program of the managed agent	
	rule r_HighBeamLights =
			par 
				r_ReadMonitorFunctions[]
				r_Manual_high_beam_headlights[] 
			endpar
		
	main rule r_mainRule =
		forall $a in Agent with true do
			program($a)

default init s0:
	function highbeamlightsManagedByMain($x in MainMgA) =
		switch($x)
			case ahbl: hbl
		endswitch

    //Added by incremental refinement
	function highBeamOn = false
	function keyState = NOKEYINSERTED
	function lightRotarySwitch = OFF
	function pitmanArmForthBack = NEUTRAL_FB  
	function pitmanArmForthBackPrevious = NEUTRAL_FB 
	function currentSpeed = 0
	function oncomingTraffic = false
	function cruiseControlMode = CCM0
	function setVehicleSpeed = 0
	
	agent MainMgA: r_Main[]
	agent HighBeamLightsMdA: r_HighBeamLights[]
	