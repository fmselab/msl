//Seventh refinement of Adaptive Exterior Light and Speed Control System
//Setting and modifying desired speed - 
//Cruise control - Speed limit - Traffic sign detection
//from SCS-1 to SCS-17
//from SCS-29 to SCS-35
//from SCS-36 to SCS-39
//from SCS-18 to SCS-26

asm AdaptiveSpeedControl
import StandardLibrary

signature:
	// DOMAINS
	enum domain SCSLever = {DOWNWARD5_SCS | UPWARD5_SCS | DOWNWARD7_SCS | UPWARD7_SCS | NEUTRAL | FORWARD_SCS | BACKWARD_SCS | HEAD} // Cruise control lever positions
	enum domain KeyPosition = {NOKEYINSERTED | KEYINSERTED | KEYINIGNITIONONPOSITION} // Key state
	enum domain CruiseControlMode = {CCM0 | CCM1 | CCM2}
	//CCM0: cruise control disabled
	//CCM1: cruise control active
	//CCM2: adaptive cruise control active
	enum domain RangeRadarState = {READY | DIRTY | NOTREADY}
	enum domain SpeedLimitSignDetection = {UNLIMITED | SIGNDETECTED | NOSIGNDETECTED}
	domain CurrentSpeed subsetof Integer // Speed
	domain RangeRadarSensor subsetof Integer
	domain BrakePedal subsetof Integer // Deflection of the brake pedal
	domain GasPedalPerc subsetof Integer // Deflection of the gas pedal in percentage	
	domain SafetyDistance subsetof Real // Safety distance
	domain BrakePressure subsetof Integer
	//====================================	
	domain TimeImpactBrake subsetof Integer
	
	// FUNCTIONS

	monitored cruiseControlMode: CruiseControlMode // State of cruise control
	monitored sCSLever: SCSLever // Position of the Cruise control lever
	controlled sCSLeve_Previous: SCSLever // Position of the Cruise control lever in previous state 
	//-- sCSLeve_Previous (senza r perchè quando traduce in model checker la vede come regola e dice che non la trova)
	monitored currentSpeed: CurrentSpeed // Current speed of the vehicle
	monitored keyState: KeyPosition // Position of the key
	controlled keyState_Previous: KeyPosition // Position of the key in the previous state
	controlled setVehicleSpeed: CurrentSpeed // Cruise control speed 
	controlled desiredSpeed: CurrentSpeed // Desired speed 
	monitored brakePedal: BrakePedal //It is discritezed 0 - 0°, 225 - 45° Resolution 0.2°
	monitored passed1Sec: Boolean // Is 1 second passed?
	monitored passed2Sec: Boolean // Are 2 seconds passed?
	controlled passed2SecYes: Boolean // Are 2 seconds passed?
	monitored accelerationUserHighCruiseControl: Boolean // User acceleration is higher than cruise control
//====================================			
	controlled orangeLed: Boolean //The orange led is on (true) or off (false)
	monitored gasPedal: GasPedalPerc //Gas pedal value in percentage
	controlled speedLimitActive: Boolean //speedLimiter is running
	controlled speedLimitSpeed: CurrentSpeed //Limit speed
	controlled speedLimitTempDeacti: Boolean //speedLimiter is temporarily deactivated
	monitored detectedTrafficSign: SpeedLimitSignDetection //Type of signed recognized
	monitored speedLimitDetected: CurrentSpeed //Speed detected when traffic sign detection is active
	monitored setSpeedLimitManually: Boolean //Set speed limit manually or automaticcly using traffic sign detection
	monitored trafficSignDetectionOn: Boolean // Traffic sign detector is on
	
	derived engineOn: KeyPosition -> Boolean // Depending on keyState engineOn is true or false
	derived adaptiveCruiseControlActivated: Boolean //Depending whether cruiseControlMode = CCM2 or not
	//derived adaptiveCruiseControlDeactivated: Boolean
	controlled acousticWarningOn: Boolean //Acoustic warning command True, False
	controlled visualWarningOn: Boolean
	monitored rangeRadarState: RangeRadarState
	monitored rangeRadarSensor: RangeRadarSensor
	derived obstacleAhead: Boolean 
	monitored safetyDistance: Real //secondi
	monitored speedVehicleAhead: CurrentSpeed //Speed of preceding vehicle in unity
	controlled speedVehicleAhead_Prec: CurrentSpeed //Speed of precedeing vehicle in state n-1
	controlled setSafetyDistance: Integer //metri
	derived bothVehicleStanding: Boolean
	controlled brakePressure: BrakePressure // Brake pressure
	controlled acelaration: Integer //m/s^2
	controlled acousticCollisionSignals: Boolean // acoustic signal SCS-21
	derived brakingDistance: Integer //in metri
	monitored stationaryObstacle: Boolean // A stationary obstacle is present 
	monitored movingObstacle: Boolean // A moving obstacle is present
	controlled acousticSignalImpact: Boolean // Acoustic signal of brake emergency assistant
	monitored timeImpact: TimeImpactBrake // Time to impact: depending on this value emergency brake is activated at 20%, 60% or 100%
//====================================	
	
definitions:	
	domain CurrentSpeed = {0..2000} //5000 Si può ridurre a 2000? che corrisponde a velocità massima di 200km/h??
	//1km/h = 10 unità
	domain BrakePedal = {0..225} //res 0.2° 0° - 45° -> 1° = 5 unità
//====================================		
	domain GasPedalPerc = {0..100}
	domain RangeRadarSensor = {0..200} //0 = no dectected obstacle in the travel corridor
									//1-200 = distance in meters of obstacle detected in the travel corridor
///	domain SafetyDistance = {2.0, 2.5, 3.0}
	domain BrakePressure = {0..100}
	domain TimeImpactBrake = {0..100}
	
	// FUNCTION DEFINITIONS
		
	//Engine state is determined by KeyPosition value. If the key is on the engine is on, otherwise is off
	function engineOn ($key in KeyPosition)=
		($key = KEYINIGNITIONONPOSITION)
		
	function adaptiveCruiseControlActivated = 
		(cruiseControlMode = CCM2)
		
	//function adaptiveCruiseControlDeactivated = 
	//	(sCSLever = BACKWARD_SCS or not cruiseControlMode = CCM2)
	
	function obstacleAhead = 
		(rangeRadarState = READY and not rangeRadarSensor = 0)
		
	function bothVehicleStanding = 
		(currentSpeed = 0 and speedVehicleAhead = 0)

	function brakingDistance = 
	 	 rtoi((currentSpeed*currentSpeed)/20)
	 	 
//====================================

	
	// RULE DEFINITIONS
	
	//SCS-2 SCS-3
	macro rule r_SCSLeverForward ($speed in CurrentSpeed) = 
		if (sCSLever = FORWARD_SCS) then
			if (currentSpeed < 200) then
				if (desiredSpeed = 0) then 
					$speed := 0
				else
					$speed := desiredSpeed
				endif
			else
				if (desiredSpeed = 0) then
					par
						$speed := currentSpeed
						desiredSpeed := currentSpeed
					endpar
				else
					$speed := desiredSpeed
				endif
			endif
		endif
	
	//SCS-4 SCS-5 SCS-6
	macro rule r_setDesiredSpeed ($speed in CurrentSpeed)= 
		if ($speed != 0) then
		//Lever has different value from previous state
			if (sCSLeve_Previous != sCSLever) then 
				par
					//reset function that indicates the long lever press
					if (passed2SecYes) then 
						passed2SecYes := false
					endif
					//SCS-4
					if (sCSLever = UPWARD5_SCS) then
						desiredSpeed := desiredSpeed + 10 //desired speed increased by 1 km/h
					endif
					//SCS-5
					if (sCSLever = UPWARD7_SCS) then
						desiredSpeed := desiredSpeed + (100-(desiredSpeed mod 100)) //desired speed increased to the next ten's place
					endif
					//SCS-6
					if (sCSLever = DOWNWARD5_SCS) then
						desiredSpeed := desiredSpeed - 10 //desired speed increased by 1 km/h
					endif
					//SCS-6
					if (sCSLever = DOWNWARD7_SCS) then
						if (desiredSpeed mod 100 = 0) then
							desiredSpeed := desiredSpeed - 100 //desired speed increased to the next ten's place
						else
							desiredSpeed := desiredSpeed - (desiredSpeed mod 100)
						endif
					endif
					//SCS-12 SCS-17
					if (sCSLever = BACKWARD_SCS) then
						$speed := 0
					endif
				endpar
			endif
		endif
		
	macro rule r_setVehicleSpeedLongLeverPress ($speed in CurrentSpeed) = 
		//SCS-7 SCS-8 SCS-9 SCS-10
		if ($speed != 0) then
			if (sCSLeve_Previous = sCSLever and sCSLever != NEUTRAL) then 
				if (not passed2SecYes) then
					if (passed2Sec) then
						passed2SecYes := true
					endif
				else
					par
						//SCS-7 SCS-9
						if (sCSLever = UPWARD5_SCS or sCSLever = DOWNWARD5_SCS) then
							if (passed1Sec) then
								par	
									if (sCSLever = UPWARD5_SCS) then
										$speed := $speed + 10 //desired speed increased by 1 km/h
									endif
									if (sCSLever = DOWNWARD5_SCS) then
										$speed := $speed - 10 //desired speed increased by 1 km/h
									endif
								endpar
							endif
						endif
						//SCS-8 SCS-10
						if (sCSLever = UPWARD7_SCS or sCSLever = DOWNWARD7_SCS) then
							if (passed2Sec) then
								par	
									if (sCSLever = UPWARD7_SCS) then
										$speed := $speed + (100-($speed mod 100))
									endif
									if (sCSLever = DOWNWARD7_SCS) then
										if ($speed mod 100 = 0) then
											$speed := $speed - 100 //desired speed increased to the next ten's place
										else
											$speed := $speed - ($speed mod 100)
										endif
									endif
								endpar
							endif
						endif
					endpar
				endif
			endif
		endif
	
	macro rule r_SetModifySpeed  ($speed in CurrentSpeed) = 
		//SCS-1
		if ((not engineOn(keyState_Previous)) and engineOn(keyState)) then
			par
				$speed := 0
				desiredSpeed := 0
			endpar
		else
			if (engineOn(keyState_Previous) and engineOn(keyState)) then
				par	
					r_SCSLeverForward[$speed] 
					//SCS-11
					if ((sCSLever = UPWARD5_SCS or sCSLever = UPWARD7_SCS or sCSLever = DOWNWARD5_SCS or sCSLever = DOWNWARD7_SCS) and $speed = 0) then
						desiredSpeed := currentSpeed
					endif
					r_setDesiredSpeed[$speed] 
					r_setVehicleSpeedLongLeverPress[$speed] 
				endpar
			endif
		endif
	
	macro rule  r_DesiredSpeedVehicleSpeed =
		if (brakePedal=0 and (sCSLever != HEAD and not speedLimitActive) ) then
			par
				if (cruiseControlMode=CCM2) then
					r_SetModifySpeed[setVehicleSpeed] 
				endif
				if (cruiseControlMode=CCM1) then
					//SCS-15
					if (setVehicleSpeed != 0) then
						if (accelerationUserHighCruiseControl) then
							setVehicleSpeed := 0
						else
							r_SetModifySpeed[setVehicleSpeed] 
						endif
					else
						r_SetModifySpeed[setVehicleSpeed] 
					endif
				endif
			endpar
		endif
		
	macro rule r_BrakePedal = 
		if (cruiseControlMode = CCM1 and setVehicleSpeed != 0) then
			//SCS-16
			if (brakePedal != 0) then
				setVehicleSpeed := 0
			endif
		endif
	
	macro rule r_SpeedLimit = 
	//from SCS-29 to SCS-35
		if (not speedLimitActive) then
			if (sCSLever = HEAD) then
				par
					speedLimitActive := true
					orangeLed := true
				endpar
			endif
		else
			par
			//SCS-36
				if (cruiseControlMode = CCM2 and trafficSignDetectionOn and not setSpeedLimitManually) then
					//SCS-37
					if (gasPedal = 0) then
						par
							//SCS-39
							if (detectedTrafficSign = UNLIMITED) then
								if (speedLimitSpeed < 1200) then
									speedLimitSpeed := 1200
								endif
							endif
							//SCS-38
							if (detectedTrafficSign = SIGNDETECTED) then
								speedLimitSpeed := speedLimitDetected
							endif
							if (detectedTrafficSign = NOSIGNDETECTED) then
								skip
							endif
						endpar
					endif
				endif
				if ((cruiseControlMode = CCM2 and trafficSignDetectionOn and setSpeedLimitManually) or (cruiseControlMode = CCM1) or (cruiseControlMode = CCM2 and not trafficSignDetectionOn)) then
					r_SetModifySpeed[speedLimitSpeed] 
				endif
				if (gasPedal > 90 and not speedLimitTempDeacti) then
					speedLimitTempDeacti := true
				endif
				if (gasPedal < 90 and speedLimitTempDeacti) then
					speedLimitTempDeacti := false
				endif
				if (sCSLever = HEAD or sCSLever = BACKWARD_SCS) then
					par
						speedLimitActive := false
						speedLimitTempDeacti := false
						orangeLed := false
					endpar
				endif
			endpar
		endif
	
	macro rule r_ReadMonitorFunctions = 
		par
			sCSLeve_Previous := sCSLever
			keyState_Previous := keyState
		endpar 
	
	//SCS-23 
	//@PE_MAPE_CC
	macro rule r_CalculateSafetyDistancePlan_CC = 
			if currentSpeed<200 then
				par
					speedVehicleAhead_Prec := speedVehicleAhead
					if (speedVehicleAhead < 200 and speedVehicleAhead > 0) then
						setSafetyDistance := rtoi(2.5 * (currentSpeed/36)) // div 10 -> from unity to km/h, div3.6 -> from km/h to m/s
					endif
					if (bothVehicleStanding) then
						setSafetyDistance := 2
					endif
					if (speedVehicleAhead > speedVehicleAhead_Prec) then
						setSafetyDistance := rtoi(3.0 * (currentSpeed/36))
					endif
				endpar
			endif
		
	//SCS-24
	//@PE_MAPE_CC
	macro rule r_SafetyDistanceByUser =
		if not adaptiveCruiseControlActivated then
			if (currentSpeed > 200) then
				if (sCSLever = HEAD) then
					setSafetyDistance := rtoi((currentSpeed/10)/3.6*(safetyDistance))
				endif
			endif
		endif
	
	//SCS-21
	//@PE_MAPE_CC
	macro rule r_CollisionDetection =
		 par
			 if (rangeRadarSensor < brakingDistance)  then //SCS-21 checks if adaptation is necessary
		 	 	acousticCollisionSignals := true
		 	 endif
		 	 if (rangeRadarSensor > brakingDistance and acousticCollisionSignals = true)  then //SCS-21 checks if adaptation is necessary
		 	 	acousticCollisionSignals := false
		 	 endif
	 	 endpar
	
	//@PE_MAPE_CC
	macro rule r_AcceleratePlan_CC =
	   	  if (currentSpeed != 0) then
	   	  	acelaration := -5
	   	  else
	   	  	acelaration := 0
	   	  endif
	
	//@PE_MAPE_CC
	macro rule r_DeceleratePlan_CC =
	   	  if currentSpeed < setVehicleSpeed then
	   	  	acelaration := 2
	   	  else
	   	  	acelaration := 0
	   	  endif
	
	//@PE_MAPE_CC
	macro rule r_WarningPlan_CC =
	  par
	  	if (itor(rangeRadarSensor) < ((currentSpeed/10)/3.6)*1.5) then 
	  		visualWarningOn := true 
	  	else
		  	if visualWarningOn then
		  		visualWarningOn := false
		  	endif
	  	endif
	  	if (itor(rangeRadarSensor) < ((currentSpeed/10)/3.6)*0.8) then  
	  		acousticWarningOn:= true 
	  	else
	  		if acousticWarningOn then
		  		acousticWarningOn := false
		  	endif
	  	endif 	  
	  endpar
	   	  
	//@MA_MAPE_CC
	//All MAPE computations of the MAPE loop are executed within one single ASM-step machine.
	macro rule r_Monitor_Analyze_CC =
	 if adaptiveCruiseControlActivated then
	   par	
	 	 if (obstacleAhead and rangeRadarSensor<setSafetyDistance) then //SCS-22 checks if adaptation is necessary
	 		r_DeceleratePlan_CC[]
	 	 endif
	 	 if (obstacleAhead and rangeRadarSensor>setSafetyDistance) then //SCS-20 checks if adaptation is necessary
	 		r_AcceleratePlan_CC[]
	 	 endif
	 	 r_CollisionDetection[] 
	 	 if obstacleAhead then //SCS-25, SCS-26 distance warning (if necessary)
	 	 	r_WarningPlan_CC[] 
	 	 endif
	 	 r_CalculateSafetyDistancePlan_CC[] //SCS-23
	   endpar
	 endif 
		
	
	macro rule r_MAPE_CC = //MAPE loop may start and stop
	//par 
	    r_Monitor_Analyze_CC[] 
		//if adaptiveCruiseControlDeactivated then //SCS-12
		//	r_SetModifySpeed[setVehicleSpeed] endif 
	//endpar
			
	//SCS-28
	macro rule r_activateEmergencyBrake = 
		if (timeImpact != 0) then
			par
				acousticSignalImpact := true
				if (timeImpact = 1) then
					brakePressure := 20
				endif
				if (timeImpact = 2) then
					brakePressure := 60
				endif
				if (timeImpact = 3) then
					brakePressure := 100
				endif
			endpar
		endif
	
	//SCS-27
	macro rule r_EmergencyBrake = 
		if ((currentSpeed > 0 and currentSpeed <= 60 and stationaryObstacle) or (currentSpeed > 0 and currentSpeed <= 120 and movingObstacle)) then
			r_activateEmergencyBrake[] 	
		else
			if (acousticSignalImpact) then
				acousticSignalImpact := false
			endif
		endif
				
	// INVARIANTS
	
	
	//PROPERTIES
	
	
	// MAIN RULE
	main rule r_Main =
		par
			r_ReadMonitorFunctions[] 
			r_DesiredSpeedVehicleSpeed[] 
			r_BrakePedal[] 
			r_SpeedLimit[] 
			r_MAPE_CC[] 
			r_SafetyDistanceByUser[] 			
			r_EmergencyBrake[] 
		endpar 

// INITIAL STATE
default init s0:
	function cruiseControlMode = CCM0
	//Cruise control lever is in NEUTRAL position
	function sCSLeve_Previous = NEUTRAL
	//Key is not inserted
	function keyState_Previous = NOKEYINSERTED
	function setVehicleSpeed = 0
	function desiredSpeed = 0
	function passed2SecYes = false
	function orangeLed = false
	function speedLimitActive = false
	function speedLimitTempDeacti = false
	function speedLimitSpeed = 0
	function setSafetyDistance = 2
	function acousticSignalImpact = false