asm AdaptiveCruiseControl

import StandardLibrary

signature:
	//CruiseControlMAPE
	domain CruiseSpeedMdA subsetof Agent
	domain ACCMgA subsetof Agent
	controlled cruisespeedManagedByACC: ACCMgA -> CruiseSpeedMdA
	derived startACCM: ACCMgA -> Boolean
	derived startACCA: ACCMgA -> Boolean
	derived startACCP: ACCMgA -> Boolean
	derived startACCE: ACCMgA -> Boolean
	//AdaptiveCruiseControl
	static cs: CruiseSpeedMdA
	static acc: ACCMgA

definitions:
	function startACCM($b in ACCMgA) =
		true

	function startACCA($b in ACCMgA) =
		true

	function startACCP($b in ACCMgA) =
		true

	function startACCE($b in ACCMgA) =
		true

	rule r_CruiseSpeed =
		skip //<<TODO>>

	rule r_CleanUp_ACCE =
		skip //<<TODO>>

	rule r_ACCE =
		if startACCE(self) then
			par
				skip //<<TODO>>
				r_CleanUp_ACCE[]
			endpar
		endif

	rule r_CleanUp_ACCP =
		skip //<<TODO>>

	rule r_ACCP =
		if startACCP(self) then
			par
				skip //<<TODO>>
				r_ACCE[]
				r_CleanUp_ACCP[]
			endpar
		endif

	rule r_CleanUp_ACCA =
		skip //<<TODO>>

	rule r_ACCA =
		if startACCA(self) then
			par
				skip //<<TODO>>
				r_ACCP[]
				r_CleanUp_ACCA[]
			endpar
		endif

	rule r_CleanUp_ACCM =
		skip //<<TODO>>

	rule r_ACCM =
		if startACCM(self) then
			par
				skip //<<TODO>>
				r_ACCA[]
				r_CleanUp_ACCM[]
			endpar
		endif

	rule r_ACC =
		r_ACCM[]

	main rule r_mainRule =
		forall $a in Agent with true do
			program($a)

default init s0:
	function cruisespeedManagedByACC($x in ACCMgA) =
		switch($x)
			case acc: cs
		endswitch


	agent ACCMgA: r_ACC[]
	agent CruiseSpeedMdA: r_CruiseSpeed[]
