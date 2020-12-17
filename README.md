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

## To be completed:
* Path Expression Design
* Content Constraints (simple instructions)


### Main developer: Hao Wu.

# Summary

Date : 2020-10-12 12:46:12

Directory c:\Users\class\Cyclone

Total : 497 files,  29908 codes, 4622 comments, 4630 blanks, all 39160 lines

[details](details.md)

## Languages
| language | files | code | comment | blank | total |
| :--- | ---: | ---: | ---: | ---: | ---: |
| Java | 493 | 28,051 | 4,583 | 4,523 | 37,157 |
| ANTLR | 1 | 1,172 | 33 | 77 | 1,282 |
| Markdown | 2 | 604 | 0 | 18 | 622 |
| XML | 1 | 81 | 6 | 12 | 99 |

## Directories
| path | files | code | comment | blank | total |
| :--- | ---: | ---: | ---: | ---: | ---: |
| . | 497 | 29,908 | 4,622 | 4,630 | 39,160 |
| build | 292 | 7,050 | 1,142 | 40 | 8,232 |
| build\classes | 292 | 7,050 | 1,142 | 40 | 8,232 |
| build\classes\org | 159 | 4,917 | 1,127 | 30 | 6,074 |
| build\classes\org\nuim | 159 | 4,917 | 1,127 | 30 | 6,074 |
| build\classes\org\nuim\cyclone | 159 | 4,917 | 1,127 | 30 | 6,074 |
| build\classes\org\nuim\cyclone\compiler | 7 | 350 | 0 | 4 | 354 |
| build\classes\org\nuim\cyclone\compiler\gen | 1 | 112 | 0 | 0 | 112 |
| build\classes\org\nuim\cyclone\compiler\graph | 1 | 49 | 0 | 1 | 50 |
| build\classes\org\nuim\cyclone\model | 94 | 1,506 | 0 | 6 | 1,512 |
| build\classes\org\nuim\cyclone\model\operation | 31 | 527 | 0 | 2 | 529 |
| build\classes\org\nuim\cyclone\model\type | 18 | 180 | 0 | 0 | 180 |
| build\classes\org\nuim\cyclone\model\type\spec | 6 | 52 | 0 | 0 | 52 |
| build\classes\org\nuim\cyclone\model\value | 7 | 82 | 0 | 0 | 82 |
| build\classes\org\nuim\cyclone\parser | 50 | 2,913 | 1,127 | 20 | 4,060 |
| build\classes\org\nuim\cyclone\parser\ast | 42 | 912 | 14 | 1 | 927 |
| build\classes\org\nuim\cyclone\util | 8 | 148 | 0 | 0 | 148 |
| build\classes\test | 3 | 78 | 0 | 0 | 78 |
| build\classes\test\test | 3 | 78 | 0 | 0 | 78 |
| build\classes\test\test\model | 1 | 29 | 0 | 0 | 29 |
| build\classes\test\test\parser | 1 | 23 | 0 | 0 | 23 |
| build\classes\test\test\path | 1 | 26 | 0 | 0 | 26 |
| build\classes\uran | 130 | 2,055 | 15 | 10 | 2,080 |
| build\classes\uran\err | 12 | 98 | 0 | 0 | 98 |
| build\classes\uran\formula | 110 | 1,808 | 15 | 10 | 1,833 |
| build\classes\uran\formula\array | 4 | 54 | 0 | 0 | 54 |
| build\classes\uran\formula\bv | 42 | 520 | 0 | 0 | 520 |
| build\classes\uran\formula\cnf | 9 | 178 | 0 | 1 | 179 |
| build\classes\uran\formula\cnf\visitor | 1 | 5 | 0 | 0 | 5 |
| build\classes\uran\formula\smt2 | 2 | 164 | 0 | 6 | 170 |
| build\classes\uran\formula\type | 5 | 52 | 0 | 0 | 52 |
| build\classes\uran\formula\value | 3 | 34 | 0 | 0 | 34 |
| build\classes\uran\formula\visitor | 1 | 5 | 0 | 0 | 5 |
| build\classes\uran\solver | 6 | 117 | 0 | 0 | 117 |
| build\classes\uran\test | 2 | 32 | 0 | 0 | 32 |
| build\classes\uran\test\util | 2 | 32 | 0 | 0 | 32 |
| src | 199 | 21,983 | 3,447 | 4,527 | 29,957 |
| src\org | 104 | 18,640 | 1,991 | 3,521 | 24,152 |
| src\org\nuim | 104 | 18,640 | 1,991 | 3,521 | 24,152 |
| src\org\nuim\cyclone | 104 | 18,640 | 1,991 | 3,521 | 24,152 |
| src\org\nuim\cyclone\compiler | 6 | 584 | 36 | 103 | 723 |
| src\org\nuim\cyclone\compiler\gen | 1 | 214 | 14 | 35 | 263 |
| src\org\nuim\cyclone\compiler\graph | 1 | 89 | 3 | 19 | 111 |
| src\org\nuim\cyclone\model | 59 | 2,110 | 205 | 572 | 2,887 |
| src\org\nuim\cyclone\model\operation | 8 | 814 | 142 | 218 | 1,174 |
| src\org\nuim\cyclone\model\type | 18 | 181 | 12 | 67 | 260 |
| src\org\nuim\cyclone\model\type\spec | 6 | 54 | 3 | 24 | 81 |
| src\org\nuim\cyclone\model\value | 7 | 102 | 4 | 37 | 143 |
| src\org\nuim\cyclone\parser | 34 | 15,710 | 1,735 | 2,777 | 20,222 |
| src\org\nuim\cyclone\parser\ast | 28 | 1,109 | 79 | 254 | 1,442 |
| src\org\nuim\cyclone\util | 5 | 236 | 15 | 69 | 320 |
| src\uran | 83 | 2,657 | 1,385 | 882 | 4,924 |
| src\uran\err | 12 | 127 | 145 | 63 | 335 |
| src\uran\formula | 67 | 2,403 | 1,195 | 797 | 4,395 |
| src\uran\formula\array | 4 | 92 | 6 | 32 | 130 |
| src\uran\formula\bv | 16 | 454 | 370 | 193 | 1,017 |
| src\uran\formula\cnf | 9 | 351 | 128 | 112 | 591 |
| src\uran\formula\cnf\visitor | 1 | 7 | 13 | 8 | 28 |
| src\uran\formula\smt2 | 2 | 362 | 25 | 59 | 446 |
| src\uran\formula\type | 5 | 87 | 61 | 38 | 186 |
| src\uran\formula\value | 3 | 29 | 36 | 7 | 72 |
| src\uran\formula\visitor | 1 | 24 | 12 | 9 | 45 |
| src\uran\solver | 2 | 105 | 45 | 15 | 165 |
| src\uran\test | 2 | 22 | 0 | 7 | 29 |
| src\uran\test\util | 2 | 22 | 0 | 7 | 29 |
| test | 3 | 190 | 27 | 33 | 250 |
| test\model | 1 | 76 | 10 | 12 | 98 |
| test\parser | 1 | 40 | 0 | 8 | 48 |
| test\path | 1 | 74 | 17 | 13 | 104 |

[details](details.md)
