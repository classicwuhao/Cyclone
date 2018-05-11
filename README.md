# Cyclone: A String Generator For DFAs.

## Overview
Cyclone generates (enumerates) all possible (unique) strings that can be accepted by a DFA. Currently, Cyclone accepts the following items as its input.
* a DFA D.
* an integer k specifying the length of a string to be generated.

Essentailly, this is a synthesis problem. Cyclone synthesises all strings with the lenght of k via constraint solving. Properties such as state coverage, path coverage can be easily added to make more practical for real-world problems.

## Applications
Cyclone can synthesis test cases for anything that can be modelled as a DFA. 
