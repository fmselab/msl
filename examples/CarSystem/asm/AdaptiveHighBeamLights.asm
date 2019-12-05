asm AdaptiveHighBeamLights

import StandardLibrary

signature:
	//HighBeamMAPE
	domain HighBeamLightsMdA subsetof Agent
	domain MainMgA subsetof Agent
	controlled highbeamlightsManagedByMain: MainMgA -> HighBeamLightsMdA
	derived startMainM: MainMgA -> Boolean
	derived startMainA: MainMgA -> Boolean
	derived startMainP: MainMgA -> Boolean
	derived startMainE: MainMgA -> Boolean
	//AdaptiveHighBeamLights
	static hbl: HighBeamLightsMdA
	static ahbl: MainMgA

definitions:
	function startMainM($b in MainMgA) =
		true

	function startMainA($b in MainMgA) =
		true

	function startMainP($b in MainMgA) =
		true

	function startMainE($b in MainMgA) =
		true

	rule r_HighBeamLights =
		skip //<<TODO>>

	rule r_CleanUp_MainE =
		skip //<<TODO>>

	rule r_MainE =
		if startMainE(self) then
			par
				skip //<<TODO>>
				r_CleanUp_MainE[]
			endpar
		endif

	rule r_CleanUp_MainP =
		skip //<<TODO>>

	rule r_MainP =
		if startMainP(self) then
			par
				skip //<<TODO>>
				r_MainE[]
				r_CleanUp_MainP[]
			endpar
		endif

	rule r_CleanUp_MainA =
		skip //<<TODO>>

	rule r_MainA =
		if startMainA(self) then
			par
				skip //<<TODO>>
				r_MainP[]
				r_CleanUp_MainA[]
			endpar
		endif

	rule r_CleanUp_MainM =
		skip //<<TODO>>

	rule r_MainM =
		if startMainM(self) then
			par
				skip //<<TODO>>
				r_MainA[]
				r_CleanUp_MainM[]
			endpar
		endif

	rule r_Main =
		r_MainM[]

	main rule r_mainRule =
		forall $a in Agent with true do
			program($a)

default init s0:
	function highbeamlightsManagedByMain($x in MainMgA) =
		switch($x)
			case ahbl: hbl
		endswitch


	agent MainMgA: r_Main[]
	agent HighBeamLightsMdA: r_HighBeamLights[]
