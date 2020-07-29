package org.nuim.cyclone.model;

/**
 * Bit vector for modifier: 
 * |START |NORMAL | ABSTRACT | FINAL |
 */

public enum StateModifier {
    START{
            public String toString(){return "start";}
    }, 
    FINAL{
            public String toString(){return "final";}
    },
    NORMAL{
            public String toString(){return "normal";}
    },
    ABSTRACT {
            public String toString(){return "abstract";}
    };

    static{
        START.bits=1000;
        FINAL.bits=1;
        NORMAL.bits=100;
        ABSTRACT.bits=10;
    }

    private int bits;

    public int bits(){return bits;}
};
