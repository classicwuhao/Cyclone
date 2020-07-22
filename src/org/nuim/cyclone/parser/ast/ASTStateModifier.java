package org.nuim.cyclone.parser.ast;

public enum ASTStateModifier{
        START{public String toString(){return "start";}}, 
        FINAL{public String toString(){return "final";}},
        NORMAL{public String toString(){return "normal";}},
        ABSTRACT {public String toString(){return "abstract";}}
};