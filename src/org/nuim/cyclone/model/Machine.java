package org.nuim.cyclone.model;

public class Machine extends Expression{
    private GlobalVariables variables;

    public Machine(){
        super();
        setLog(new ErrorLog());
    }

    public Machine(String name){
        super(name);
        setLog(new ErrorLog());
    }
    
    public void setVariables (GlobalVariables variables){
        this.variables = variables;
        
    }

    public int errors(){
        return errorLog().errors();
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(this.name()+": \n");
        sb.append(variables.toString());

        return sb.toString();
    }

}