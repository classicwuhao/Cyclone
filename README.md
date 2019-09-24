# Cyclone: A Framework for testing and verifying Cyber Physical Systems.

## Overview
Cyclone generates (enumerates) test cases that can be provenly accepted by CPS . Currently, Cyclone accepts the following items as its input.
* a Finite State Machine D.
* an integer k specifying the size of a test case to be generated.

Essentailly, this is a synthesis problem. Cyclone synthesises all test cases with the size of k via constraint solving. Properties such as state coverage, path coverage can be easily added to make more practical for real-world CPS problems.

## Applications (Cyber Physical Systems)
Cyclone can synthesis test cases for anything that can be modelled as a Finite State Machine. 

## In Progress
We are currently working on extending Cyclone to accpet other version of FSM such as Timed Automata with Difference Equations.
