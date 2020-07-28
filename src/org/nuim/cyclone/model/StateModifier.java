package org.nuim.cyclone.model;

public enum StateModifier {
    START{
            public String toString(){return "start";}
            public int bit(){return 1;}
    }, 
    FINAL{
            public String toString(){return "final";}
            public int bit(){return 4;}
    },
    NORMAL{
            public String toString(){return "normal";}
            public int bit(){return 8;}
    },
    ABSTRACT {
            public String toString(){return "abstract";}
            public int bit(){return 16;}
    }
};
