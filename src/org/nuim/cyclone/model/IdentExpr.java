package org.nuim.cyclone.model;
import org.nuim.cyclone.model.type.Type;
import org.nuim.cyclone.model.SrcInfo;

/*
 *  IdentExpr an alias expression for the named element.
 * */ 
public class IdentExpr extends Expression {

    /* An identifier referr to a value in previous state */ 
    private boolean previous = false;

    public IdentExpr(String name, Type type, SrcInfo info, boolean previous){
        super(name, type, info);
        this.previous=previous;
    }

    public IdentExpr(String name){
        super(name);
    }

    public boolean previous(){return this.previous;}
    public void setPrevious(boolean previous){this.previous=previous;}

    @Override
    public boolean isIdentExpr(){return true;}

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();

        if (previous){
            sb.append("prev(");
            sb.append(super.name());
            sb.append(")");
        }else{
            sb.append(super.name());
        }
        
        return sb.toString();
    }

}