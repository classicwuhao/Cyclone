package org.nuim.cyclone.model;

/*
 * A generic class for recording information about source token. 
 */

public class SrcInfo extends NamedElement{
    private int line;
    private int column;
    
    public SrcInfo(String name, int line, int column){
        super(name);
        this.line=line;
        this.column=column;
    }
    
    public int line(){return this.line;}
    public int column(){return this.column;}
    public void setLine(int line){this.line=line;}
    public void setColumn(int column){this.column=column;}

    @Override
    public String toString(){
        return this.name()+" line: " +this.line+", column:"+this.column;
    }

}