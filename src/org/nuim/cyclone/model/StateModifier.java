package org.nuim.cyclone.model;

public enum StateModifier {
    START{public String toString(){return "start";}}, 
    FINAL{public String toString(){return "final";}},
    NORMAL{public String toString(){return "normal";}},
    ABSTRACT {public String toString(){return "abstract";}}
};
