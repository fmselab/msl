asm SimpleMAPE

import StandardLibrary

signature:
	domain SMdA subsetof Agent
	domain MainMgA subsetof Agent
	domain InterfaceMgA subsetof Agent
	controlled sManagedByInterface: InterfaceMgA -> SMdA
	//I: Interface.M -> Main.M
	controlled sgnInterfaceMMainM: Prod(InterfaceMgA, MainMgA) -> Boolean
	controlled fromInterfaceMtoMainM: InterfaceMgA -> MainMgA
	controlled fromMainMtoInterfaceM: MainMgA -> Powerset(InterfaceMgA)
	derived startMainM: Boolean
	//I: Main.E -> Interface.E
	controlled sgnMainEInterfaceE: Prod(MainMgA, InterfaceMgA) -> Boolean
	controlled fromMainEtoInterfaceE: MainMgA -> Powerset(InterfaceMgA)
	controlled fromInterfaceEtoMainE: InterfaceMgA -> MainMgA
	//SimpleMapeInst
	static s1: SMdA
	static s2: SMdA
	static mape0: MainMgA
	static me1: InterfaceMgA
	static me2: InterfaceMgA

definitions:
	function startMainM =
		(forall $a in fromMainMtoInterfaceM(self) with sgnInterfaceMMainM($a, self))

	rule r_S =
		skip //placeholder

	rule r_CleanUp_MainE =
		skip //TODO

	rule r_MainE =
		par
			forall $a in fromMainEtoInterfaceE(self) do sgnMainEInterfaceE(self, $a) := true
			r_CleanUp_MainE[]
		endpar

	rule r_CleanUp_MainP =
		skip //TODO

	rule r_MainP =
		par
			r_MainE[]
			r_CleanUp_MainP[]
		endpar

	rule r_CleanUp_MainA =
		skip //TODO

	rule r_MainA =
		par
			r_MainP[]
			r_CleanUp_MainA[]
		endpar

	rule r_CleanUp_MainM =
		forall $a in fromMainMtoInterfaceM(self) do sgnInterfaceMMainM($a, self) := false

	rule r_MainM =
		if startMainM then
			par
				r_MainA[]
				r_CleanUp_MainM[]
			endpar
		endif

	rule r_Main =
		r_MainM[]

	rule r_CleanUp_InterfaceM =
		skip //TODO

	rule r_InterfaceM =
		par
			if not sgnInterfaceMMainM(self,fromInterfaceMtoMainM(self)) then sgnInterfaceMMainM(self,fromInterfaceMtoMainM(self)) := true endif
			r_CleanUp_InterfaceM[]
		endpar

	rule r_CleanUp_InterfaceE =
		sgnMainEInterfaceE(fromInterfaceEtoMainE(self), self) := false

	rule r_InterfaceE =
		par
			skip //TODO
			r_CleanUp_InterfaceE[]
		endpar

	rule r_Interface =
		par
			r_InterfaceM[]
			r_InterfaceE[]
		endpar

	main rule r_mainRule =
		forall $a in Agent with true do
			program($a)

default init s0:
	function sgnInterfaceMMainM($a in InterfaceMgA, $b in MainMgA) = false
	function sgnMainEInterfaceE($a in MainMgA, $b in InterfaceMgA) = false
	function fromInterfaceMtoMainM($a in InterfaceMgA) =
		switch($a)
			case me1: mape0
			case me2: mape0
		endswitch

	function fromMainMtoInterfaceM($a in MainMgA) =
		switch($a)
			case mape0: {me1, me2}
		endswitch

	function fromMainEtoInterfaceE($a in MainMgA) =
		switch($a)
			case mape0: {me1, me2}
		endswitch

	function fromInterfaceEtoMainE($a in InterfaceMgA) =
		switch($a)
			case me1: mape0
			case me2: mape0
		endswitch

	function sManagedByInterface($x in InterfaceMgA) =
		switch($x)
			case me1: s1
			case me2: s2
		endswitch

	agent SMdA: r_S[]
	agent MainMgA: r_Main[]
	agent InterfaceMgA: r_Interface[]
