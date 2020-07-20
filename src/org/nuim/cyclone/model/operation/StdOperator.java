package org.nuim.cyclone.model.operation;

/*
 *  Generic class for standard operators
 * 
 * */
 
public abstract class StdOperator extends Operator{
    
    public StdOperator(){}

    public StdOperator(String operator, int arity){
        super(operator,arity);
    }

    public boolean isStdOperator(){return true;}

}