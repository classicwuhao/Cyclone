package org.nuim.cyclone.model.operation;
import org.nuim.cyclone.model.NamedElement;
import org.nuim.cyclone.model.type.Type;
/*
 * A single type definition
 */ 
public class TypeDef extends NamedElement{
    private Type[] args;
    private Type result;

    public TypeDef(){super();}
    public TypeDef(String name){super(name);}

    public TypeDef(Type[] args, Type result){
        this.args=args;
        this.result=result;
    }

    public TypeDef(Type[] args){
        this.args=args;
        this.result=this.args[this.args.length-1];
    }

    public Type[] args(){return this.args;}
    public Type result(){return this.result;}
    public Type get(int i){return this.args[i];}
    public int size(){return this.args.length;}
    
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append(this.name()+":");
        for (int i=0;i<this.args.length-1;i++){
            sb.append(this.args[i].toString());
            sb.append(" x ");
        }
        sb.append(this.args[this.args.length-1]);
        sb.append("->");
        sb.append(this.result);
        return sb.toString();
    }

}