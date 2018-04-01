asm SimpleMAPE2

import StandardLibrary

signature:
	domain HeaterMdA subsetof Agent
	domain WaterHeaterMdA subsetof Agent
	domain MainESMgA subsetof Agent
	domain InterfaceTemperatureMgA subsetof Agent
	domain InterfaceWaterHeaterMgA subsetof Agent
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

definitions:
	function startMainESM =
		(forall $a in fromMainESMtoInterfaceTemperatureM(self) with sgnInterfaceTemperatureMMainESM($a, self)) and (forall $a0 in fromMainESMtoInterfaceWaterHeaterM(self) with sgnInterfaceWaterHeaterMMainESM($a0, self))

	rule r_Heater =
		skip //placeholder

	rule r_WaterHeater =
		skip //placeholder

	rule r_CleanUp_MainESE =
		skip //TODO

	rule r_MainESE =
		par
			forall $a in fromMainESEtoInterfaceWaterHeaterE(self) do sgnMainESEInterfaceWaterHeaterE(self, $a) := true
			r_CleanUp_MainESE[]
		endpar

	rule r_CleanUp_MainESP =
		skip //TODO

	rule r_MainESP =
		par
			r_MainESE[]
			r_CleanUp_MainESP[]
		endpar

	rule r_CleanUp_MainESA =
		skip //TODO

	rule r_MainESA =
		par
			r_MainESP[]
			r_CleanUp_MainESA[]
		endpar

	rule r_CleanUp_MainESM =
		forall $a in fromMainESMtoInterfaceWaterHeaterM(self) do sgnInterfaceWaterHeaterMMainESM($a, self) := false

	rule r_MainESM =
		if startMainESM then
			par
				r_MainESA[]
				r_CleanUp_MainESM[]
			endpar
		endif

	rule r_MainES =
		r_MainESM[]

	rule r_CleanUp_InterfaceTemperatureM =
		skip //TODO

	rule r_InterfaceTemperatureM =
		par
			if not sgnInterfaceTemperatureMMainESM(self,fromInterfaceTemperatureMtoMainESM(self)) then sgnInterfaceTemperatureMMainESM(self,fromInterfaceTemperatureMtoMainESM(self)) := true endif
			r_CleanUp_InterfaceTemperatureM[]
		endpar

	rule r_CleanUp_InterfaceTemperatureE =
		sgnMainESEInterfaceTemperatureE(fromInterfaceTemperatureEtoMainESE(self), self) := false

	rule r_InterfaceTemperatureE =
		par
			skip //TODO
			r_CleanUp_InterfaceTemperatureE[]
		endpar

	rule r_InterfaceTemperature =
		par
			r_InterfaceTemperatureM[]
			r_InterfaceTemperatureE[]
		endpar

	rule r_CleanUp_InterfaceWaterHeaterM =
		skip //TODO

	rule r_InterfaceWaterHeaterM =
		par
			if not sgnInterfaceWaterHeaterMMainESM(self,fromInterfaceWaterHeaterMtoMainESM(self)) then sgnInterfaceWaterHeaterMMainESM(self,fromInterfaceWaterHeaterMtoMainESM(self)) := true endif
			r_CleanUp_InterfaceWaterHeaterM[]
		endpar

	rule r_CleanUp_InterfaceWaterHeaterE =
		sgnMainESEInterfaceWaterHeaterE(fromInterfaceWaterHeaterEtoMainESE(self), self) := false

	rule r_InterfaceWaterHeaterE =
		par
			skip //TODO
			r_CleanUp_InterfaceWaterHeaterE[]
		endpar

	rule r_InterfaceWaterHeater =
		par
			r_InterfaceWaterHeaterM[]
			r_InterfaceWaterHeaterE[]
		endpar

	main rule r_mainRule =
		forall $a in Agent with true do
			program($a)

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

	agent WaterHeaterMdA: r_WaterHeater[]
	agent InterfaceTemperatureMgA: r_InterfaceTemperature[]
	agent InterfaceWaterHeaterMgA: r_InterfaceWaterHeater[]
	agent HeaterMdA: r_Heater[]
	agent MainESMgA: r_MainES[]
