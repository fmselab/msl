# MSL: MAPE Specification Language

## Introduction
In architecture-based self-adaptation, the adaptation logic is usually structured in terms of MAPE-K (Monitor-Analyze-Plan-Execute over a shared Knowledge) loops dealing with the adaptation concerns of the managed system. In case of large, complex and decentralized systems, multiple interacting MAPE loops are introduced. Some common design patterns of interactive MAPE loops have been proposed in the [literature](https://doi.org/10.1007/978-3-642-35813-5_4).

MAPE Specification Language (MSL) allows to describe MAPE patterns in a precise and unambiguous way.

The MSL language's semantics is formally defined trough a *semantic mapping* that transforms MSL models of MAPE pattern instances into formal executable descriptions based on the framework of *self-adaptive Abstract State Machines* (see [related paper](http://doi.acm.org/10.1145/3019598)).
The model generator **MSL2ASM** implements such a mapping, i.e., it transforms an MSL model into a self-adaptive ASM model (written in the textual notation AsmetaL) automatically. The produced ASM model can be used for formal analysis using the [ASMETA framework](http://asmeta.sourceforge.net/).

The framework also provides a translator (**MSL2OpenHAB**) from MSL models to [*Open Home Automation Bus* (OpenHAB)](https://www.openhab.org/), which is an open source runtime platform for home automation, to synthesize control home automation processes from MAPE loop models of smart home gateways. Typical and complex control home automation processes of smart home gateways can be designed in terms of structured MAPE-K feedback loops in MSL. The MAPE components of a MAPE-K feedback loop in MSL are mapped into *Event-Condition-Actions* rules of the OpenHAB automation rule engine. These rules share a common execution context (i.e., they can access and exchange variables with each other) and trigger each other according to the underlying execution order of the feedback loop and the component interactions as established by the MAPE pattern. The *Action* block of these rules can be then further refined to add application-specific control logic (any kind of task, e.g., ''send a command to home devices'', ''do mathematical calculations'', ''start timers'', etc.).

## Documents

[MSL Xtext grammar](http://fmse.di.unimi.it/sw/msl/MSL.xtext) ([syntax graph](http://fmse.di.unimi.it/sw/msl/MSL.png))

[Library of MAPE patterns](http://fmse.di.unimi.it/sw/msl/MAPEpatterns.zip)

Eclipse update site of MSL editor, ASM generator, and OpenHAB generator: [http://fmse.di.unimi.it/sw/msl/updatesite/](http://fmse.di.unimi.it/sw/msl/updatesite/)

[Smart heating case study for ECSA 2018 (MAPE concretization, generated ASM, and refined ASM)](http://fmse.di.unimi.it/sw/msl/smartHeatingCaseStudyECSA2018.zip)

## Papers

Arcaini P., Mirandola R., Riccobene E., Scandurra P. (2018) A DSL for MAPE Patterns Representation in Self-adapting Systems. In: Cuesta C., Garlan D., Pérez J. (eds) Software Architecture. ECSA 2018. Lecture Notes in Computer Science, vol 11048. Springer, Cham \[[doi](https://doi.org/10.1007/978-3-030-00761-4_1)\]

Arcaini P., Mirandola R., Riccobene E., Scandurra P. (2019) A Pattern-oriented Design Framework for Self-adaptive Software Systems. In ICSA 2019 Companion Proceedings. (to appear)
