# Cyclone: A General Framework for Solving Graph-based Structural Constraints.
Cyclone comes with its own specification language and compiler. It works together with our engine [uran](https://github.com/classicwuhao/uran) to explore all possible path 
in a graph-based structures with user-defined properties.

## Cyclone Front-end
The front-end of Cyclone consists of a set of grammar rules (See [here](files/parser/garmmar.txt)), generates ASTs to allow a simple type checker to walk through and generate intermediate model for the back-end.

## Cyclone Compiler [Work-in-Progress]
The back-end of Cyclone builds graphs and uses specialised algorithms together with uran (See [here](https://github.com/classicwuhao/uran)) to generate SMT formulas that can be efficiently checked by a SMT solver. Currently, the back-end of Cyclone is constantly under development. I set up this page to track current progress and status of cyclone's compiler development. Intially, Cyclone was designed to verify Cyber-Physical-Systems. However, as the development progresses I am designing Cyclone at a much more general level and aims to solve challenging problems from the areas such as:
* Control Flow Analysis (See [choice.machine](files/path/choice.machine))
* String Analysis (See [odd_even.machine](files/model/odd_even.machine))
* Cyber-Physical-Systems Verification (See [counter.machine](files/model/counter.machine))
* Graph Searching (See [simple.machine](files/path/simple.machine) and [pentangle.machine](files/path/pentangle.machine))
* Test case generation (See enumeration section in [choice.machine](files/path/choice.machine))

I am currently working on designing more algorithms to work with current path generation engine. Much more interesting things are coming up... :-)

### Main developer: Hao Wu.

# Summary

Date : 2020-08-31 17:31:53

Directory c:\Users\class\Cyclone

Total : 283 files,  24805 codes, 3213 comments, 3726 blanks, all 31744 lines

[details](details.md)

## Languages
| language | files | code | comment | blank | total |
| :--- | ---: | ---: | ---: | ---: | ---: |
| Java | 279 | 23,212 | 3,174 | 3,619 | 30,005 |
| ANTLR | 1 | 1,173 | 32 | 77 | 1,282 |
| Markdown | 2 | 341 | 0 | 18 | 359 |
| XML | 1 | 79 | 7 | 12 | 98 |

## Directories
| path | files | code | comment | blank | total |
| :--- | ---: | ---: | ---: | ---: | ---: |
| . | 283 | 24,805 | 3,213 | 3,726 | 31,744 |
| build | 161 | 4,954 | 1,127 | 28 | 6,109 |
| build\classes | 161 | 4,954 | 1,127 | 28 | 6,109 |
| build\classes\org | 158 | 4,877 | 1,127 | 28 | 6,032 |
| build\classes\org\nuim | 158 | 4,877 | 1,127 | 28 | 6,032 |
| build\classes\org\nuim\cyclone | 158 | 4,877 | 1,127 | 28 | 6,032 |
| build\classes\org\nuim\cyclone\compiler | 6 | 308 | 0 | 2 | 310 |
| build\classes\org\nuim\cyclone\compiler\gen | 1 | 104 | 0 | 0 | 104 |
| build\classes\org\nuim\cyclone\compiler\graph | 1 | 49 | 0 | 1 | 50 |
| build\classes\org\nuim\cyclone\model | 94 | 1,505 | 0 | 6 | 1,511 |
| build\classes\org\nuim\cyclone\model\operation | 31 | 527 | 0 | 2 | 529 |
| build\classes\org\nuim\cyclone\model\type | 18 | 180 | 0 | 0 | 180 |
| build\classes\org\nuim\cyclone\model\type\spec | 6 | 52 | 0 | 0 | 52 |
| build\classes\org\nuim\cyclone\model\value | 7 | 82 | 0 | 0 | 82 |
| build\classes\org\nuim\cyclone\parser | 50 | 2,916 | 1,127 | 20 | 4,063 |
| build\classes\org\nuim\cyclone\parser\ast | 42 | 906 | 14 | 1 | 921 |
| build\classes\org\nuim\cyclone\util | 8 | 148 | 0 | 0 | 148 |
| build\classes\test | 3 | 77 | 0 | 0 | 77 |
| build\classes\test\test | 3 | 77 | 0 | 0 | 77 |
| build\classes\test\test\model | 1 | 29 | 0 | 0 | 29 |
| build\classes\test\test\parser | 1 | 23 | 0 | 0 | 23 |
| build\classes\test\test\path | 1 | 25 | 0 | 0 | 25 |
| src | 116 | 19,254 | 2,057 | 3,637 | 24,948 |
| src\org | 104 | 18,568 | 1,986 | 3,513 | 24,067 |
| src\org\nuim | 104 | 18,568 | 1,986 | 3,513 | 24,067 |
| src\org\nuim\cyclone | 104 | 18,568 | 1,986 | 3,513 | 24,067 |
| src\org\nuim\cyclone\compiler | 6 | 520 | 33 | 100 | 653 |
| src\org\nuim\cyclone\compiler\gen | 1 | 190 | 13 | 31 | 234 |
| src\org\nuim\cyclone\compiler\graph | 1 | 90 | 3 | 19 | 112 |
| src\org\nuim\cyclone\model | 59 | 2,105 | 205 | 570 | 2,880 |
| src\org\nuim\cyclone\model\operation | 8 | 814 | 142 | 218 | 1,174 |
| src\org\nuim\cyclone\model\type | 18 | 181 | 12 | 67 | 260 |
| src\org\nuim\cyclone\model\type\spec | 6 | 54 | 3 | 24 | 81 |
| src\org\nuim\cyclone\model\value | 7 | 102 | 4 | 37 | 143 |
| src\org\nuim\cyclone\parser | 34 | 15,707 | 1,733 | 2,774 | 20,214 |
| src\org\nuim\cyclone\parser\ast | 28 | 1,105 | 79 | 252 | 1,436 |
| src\org\nuim\cyclone\util | 5 | 236 | 15 | 69 | 320 |
| test | 3 | 177 | 22 | 31 | 230 |
| test\model | 1 | 75 | 11 | 12 | 98 |
| test\parser | 1 | 40 | 0 | 8 | 48 |
| test\path | 1 | 62 | 11 | 11 | 84 |

[details](details.md)