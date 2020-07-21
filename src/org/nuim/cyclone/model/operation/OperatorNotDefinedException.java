package org.nuim.cyclone.model.operation;

public class OperatorNotDefinedException extends RuntimeException{
    private static final long serialVersionUID = 3L;
    private String operator;

    public OperatorNotDefinedException(String operator){
        super();
        this.operator=operator;
    }
    
    public OperatorNotDefinedException(String operator, String message){
        super(message);
        this.operator=operator;
    }

    public String getMessage(){
        return "Type Error: Operator "+this.operator+" is not semantically defined.";
    }

}