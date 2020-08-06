package org.nuim.cyclone.model;
import org.nuim.cyclone.model.type.spec.TransType;
public class Transition extends Expression {

    /* we use only src and tar in AST traversal */
    private String src;
    private String tar;

    /* The folloiwng objects are used for specification construction */ 
    private Machine owner;
    private State srcState;
    private State tarState;
    private String label="";
    //where expression
    private Expression whereExpr;

    public Transition(String name){
        super(name, new TransType());
    }
    
    public Transition(String name, String label){
        super(name, new TransType());
        this.setLabel(label);
    }

    public Transition (String name, String src, String tar, SrcInfo info){
        super(name, info);
        this.src = src;
        this.tar = tar;
        this.setType(new TransType());
    } 

    public void setSrc(String src){this.src=src;}
    public void setTar(String tar){this.tar=tar;}
    public String src(){return this.src;}
    public String tar(){return this.tar;}

    public void setLabel(String label){this.label=label;}
    public String label(){return this.label;}
    public boolean hasLabel(){return this.label!=null;}
    public Machine owner(){return this.owner;}
    public void setOwner(Machine owner){this.owner=owner;}
    public void setSource(State state){this.srcState=state;}
    public void setTarget(State state){this.tarState=state;}
    public State source(){return this.srcState;}
    public State target(){return this.tarState;}
    public Expression whereExpr(){return this.whereExpr;}
    public void setExpr(Expression expr){this.whereExpr=expr;}
    
    @Override 
    public boolean isTransition(){return true;}

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(super.name()+" : ");
        sb.append(srcState.name());
        sb.append(" -> ");
        sb.append(tarState.name());
        if (this.hasLabel()){
            sb.append(" on ");
            sb.append(label);
        }
        if (whereExpr!=null){
            sb.append(" where ");
            sb.append(whereExpr.toString());
        }

        return sb.toString();
    }

}