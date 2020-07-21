package org.nuim.cyclone.model.operation;

public class TypeException extends Exception{

    private static final long serialVersionUID = 2L;
    private String source;
    private String rule;
    private final String head="Type Error:";

    public TypeException(String message){
        super(message);
    }

    public TypeException(String source, String rule, String message){
        super(message);
        this.source=source;
        this.rule=rule;
    }

    public String source(){return this.source;}
    public String rule(){return this.rule;}

    @Override
    public String getMessage(){
        StringBuffer sb = new StringBuffer();
        sb.append(head);
        if (this.source!=null) sb.append(this.source);
        if (this.rule!=null) sb.append("["+this.rule+"]");
        sb.append(super.getMessage());

        return sb.toString();
    }

}