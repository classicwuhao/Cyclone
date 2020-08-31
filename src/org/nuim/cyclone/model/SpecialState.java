package org.nuim.cyclone.model;

public class SpecialState extends State {
    
    public SpecialState(){
        super();
    }
    
    public SpecialState(String name, SrcInfo info){
        super(name,info);
    }

    @Override
    public boolean isSpecial(){return true;}
    
    public boolean isOne(){
        return this.name().equals(PathOperator.ONE.toString());
    }

    public boolean isZeroOrOne(){
        return this.name().equals(PathOperator.ZERO_OR_ONE.toString());
    }

    public boolean isZeroOrMore(){
        return this.name().equals(PathOperator.ZERO_OR_MORE.toString());
    }

    public boolean isOneOrMore(){
        return this.name().equals(PathOperator.ONE_OR_MORE.toString());
    }

    public enum PathOperator {
        ONE{
                public String toString(){return "_";}
        }, 
        ZERO_OR_ONE{
                public String toString(){return "?";}
        },
        ZERO_OR_MORE{
                public String toString(){return "*";}
        },
        ONE_OR_MORE{
                public String toString(){return "+";}
        };
    }

}