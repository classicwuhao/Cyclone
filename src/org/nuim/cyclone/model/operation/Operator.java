package org.nuim.cyclone.model.operation;
import org.nuim.cyclone.model.NamedElement;
import org.nuim.cyclone.model.type.Type;
import java.util.HashMap;

/*
 * Generic class for all operators.
 * */ 
public abstract class Operator extends NamedElement{
    //arguments type.
    private Type[] args;
    //resulting type
    private Type result;
    
    private static HashMap<Integer, Operator> opmap = new HashMap<Integer, Operator>(150);

    static {
        opmap.put(BoolOperator.BOOL_AND,new BoolOperator.And());
        opmap.put(BoolOperator.BOOL_OR, new BoolOperator.Or());
        opmap.put(BoolOperator.BOOL_OR, new BoolOperator.Xor());
        opmap.put(BoolOperator.BOOL_OR, new BoolOperator.Implies());
        opmap.put(BoolOperator.BOOL_OR, new BoolOperator.Not());
    }

    public Operator(){}

    public Operator(String operator, int arity){
        super(operator);
        args= new Type[arity];
    }

    public abstract void register();
    protected void registerTypeRule(Type[] args, Type result) 
    //throws TypeException
    {
      //  if (args==null) throw new TypeException("Missing arguments' type information.");
      //  if (result==null) throw new TypeException("Missing result's type information.");
      //  if (args.length!=this.arity()) throw new TypeException("The number of arguments are not matched with registered operation.");
        for (int i=0;i<args.length;i++)
            this.args[i]=args[i];
        this.result=result;
    }
    
    public static Operator lookup(String name) throws TypeException{
        if (!opmap.containsKey(name.hashCode()))
            throw new TypeException("Operator: "+name +" is not defined.");
        Operator operator=opmap.get(name.hashCode());
        return operator;
    }

    public boolean isBooleanOperator(){return false;}
    public boolean isArithOperator(){return false;}

    public int arity() {return this.args.length;}
    public Type[] args(){return this.args;}
    public Type result(){return this.result;}
    public boolean isBinaryOperator(){return this.args.length==2;}
    public boolean isUnaryOperator(){return this.args.length==1;}

}