//Without sensors and actuators APIs
//Waterfall execution schema for the main MAPE loop
asm simpleMAPEPatternInstance
import StandardLibrary
signature:
    //**** Managed System ****
    domain SMdA subsetof Agent
	
    //**** Managing System ****
	//Types of managing agents (an agent type per group)
	domain MainMgA subsetof Agent
	domain InterfaceMgA subsetof Agent  	
			
	//**** Knowledge ****		
	//Managing agents' associations
	controlled sManagedByInterface: InterfaceMgA -> SMdA 
     
	//Interactions Interface.M -> Main.M [*,1] and Main.E -> Interface.E [1,*]
	//For each interaction, two functions for referencing the opposite peer, and
	//a signal for coordination of MAPE components are generated
	controlled fromInterfaceMtoMainM: InterfaceMgA -> MainMgA
	controlled fromMainMtoInterfaceM: MainMgA -> Powerset(InterfaceMgA)
	controlled sgnInterfaceMMainM: Prod(InterfaceMgA, MainMgA) -> Boolean
	
	controlled fromMainEtoInterfaceE: MainMgA -> Powerset(InterfaceMgA) 
	controlled fromInterfaceEtoMainE: InterfaceMgA -> MainMgA 
	controlled sgnMainEInterfaceE: Prod(MainMgA, InterfaceMgA) -> Boolean
		
	//**** Managed System (instance level) ****
	static s1: SMdA
	static s2: SMdA
	
    //**** Managing System (instance level) ****
	static me1: InterfaceMgA
	static me2: InterfaceMgA
	static mape0: MainMgA
	
	//**** Function for the coordination of the overall system  ****
	derived startMainM: Boolean
	derived adaptationRequiredMainA: Boolean
	monitored sensorsActivatedS: SMdA -> Boolean //Used to trigger the model execution; it means some sensors are ready for reading
	
	//Used to strictly sequence different MAPE loop executions
	//(just an example of a MAPE execution schema)
	controlled loopCompleted: InterfaceMgA -> Boolean
	
definitions:
	  	   
    function startMainM = //AND-semantics: all MM relations must be true
     (forall $a in fromMainMtoInterfaceM(self) with sgnInterfaceMMainM($a,self) = true)
   
    //Checks if adaptation is required by looking at aggregated data of the knowledge
    function adaptationRequiredMainA = true //default value

    rule r_TriggerActuators_S($s in SMdA) = skip  
    
    rule r_CleanUp_InterfaceE = 
     par
      sgnMainEInterfaceE(fromInterfaceEtoMainE(self),self):= false
      loopCompleted(self) := true
     endpar
     
	rule r_InterfaceE =
			if sgnMainEInterfaceE(fromInterfaceEtoMainE(self),self) then
				par
					r_TriggerActuators_S[sManagedByInterface(self)] //Actions are executed by invoking effectors (actuators)
					r_CleanUp_InterfaceE[]
				endpar
			endif
	
	rule r_CleanUp_MainE = skip
	
	rule r_MainE = 
	 par
	   //AND-semantics of EE relations: send signals to all E components to adapt
	   forall $a in fromMainEtoInterfaceE(self) do 
	     sgnMainEInterfaceE(self,$a) := true
	   r_CleanUp_MainE[]    
	 endpar
	 
	rule r_CleanUp_MainP = 
	  skip
		     	          
    rule r_MainP = 
      par
         r_MainE[] //@E
         r_CleanUp_MainP[]
      endpar
      
    rule r_CleanUp_MainA = skip
	    
     //Check if an adaptation is necessary, and then trigger the Plan. 
     //Here just waterfall invocations of P and E components
    rule r_MainA = 
      if adaptationRequiredMainA then
      par
          r_MainP[] //@P
          r_CleanUp_MainA[]
      endpar
      endif   
         
    rule r_CleanUp_MainM = 
       forall $ag in fromMainMtoInterfaceM(self) do 
          sgnInterfaceMMainM($ag,self) := false // reset all MM signals 
		  
				  
    rule r_MainM = 
     //AND-semantics of MM relations is the triggering condition for Analyze (just an example)
	  if startMainM
	  then 
		par
		  r_MainA[] //@A
		  r_CleanUp_MainM[]
		endpar  
	  endif  

    
	rule r_Main = r_MainM[] //@M Just a waterfall invocations of MAPE computations.
    //Alternatively, an indirect invocation schema can be adopted  	
//	 par
//	     r_MainM[] //@M
//       r_MainA[] //@A
//       r_MainP[] //@P
//       r_MainE[] //@E
//     endpar
		
	
    rule r_CleanUp_InterfaceM  =
      loopCompleted(self) := false // reset 
      
    //Register sensors' values into the kowledge for all active sensors of the managed system
    rule r_SaveSensorsData_S= skip
	
	rule r_StartMainM($a in MainMgA) =
        if sgnInterfaceMMainM(self,$a) = false then 
           sgnInterfaceMMainM(self,$a) := true endif 
              
	//Save data from latest reading of "activated" sensors in the knowledge 
	//and notify the main component M 
	rule r_InterfaceM = 
	  if loopCompleted(self) then //***coordination***: for sequencing different MAPE loops executions
		if sensorsActivatedS(sManagedByInterface(self)) then
		  par	
			r_SaveSensorsData_S[] 
			r_StartMainM[fromInterfaceMtoMainM(self)]
			r_CleanUp_InterfaceM[]
		  endpar
		endif
	  endif	
  
	
  	//Programs of the managing agents that start/end the MAPE loops	
	rule r_Interface =
	 par
	   r_InterfaceM[] //@M
       r_InterfaceE[] //@E
     endpar


	//managed agents' behavior: run actuators and sensors, other than the application logic
	rule r_S =  
	 skip

	main rule r_mainRule =
		forall $a in Agent with true do
			program($a)


default init s0:
    function sManagedByInterface($a in InterfaceMgA) =
       switch($a)
         case me1: s1
         case me2: s2
       endswitch	   
		
	function fromInterfaceMtoMainM($a in InterfaceMgA) =  mape0
    function fromInterfaceEtoMainE($a in InterfaceMgA) =  mape0
    function fromMainMtoInterfaceM($a in MainMgA) =  {me1,me2} //{mape0_a -> {me1_a,me2_a}}
    function fromMainEtoInterfaceE($a in MainMgA) =  {me1,me2}
    
    
    //Initial values for knowledge's MAPE components signals
	function sgnInterfaceMMainM ($a in InterfaceMgA, $ma in MainMgA) = false 
	function sgnMainEInterfaceE ($ma in MainMgA, $a in InterfaceMgA) = false 
	       
    function loopCompleted ($a in InterfaceMgA) = true 
      
//setting of the managing agents' programs 
agent MainMgA: r_Main[]
agent InterfaceMgA: r_Interface[] 
//managed agents
agent SMdA: r_S[]
