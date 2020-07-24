package org.nuim.cyclone.model.operation;
import org.nuim.cyclone.model.NamedElement;
import org.nuim.cyclone.model.type.Type;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
/*
 * Generic class for all operators.
 * */ 
public abstract class Operator extends NamedElement{
    //arguments type.
    private List<TypeDef> typedef = new ArrayList<TypeDef>();
    private int arity;

    private static HashMap<Integer, Operator> opmap = new HashMap<Integer, Operator>(150);

    /* resiger all of our standard operators */ 
    static {
        registerStdOperators();
        registerBoolOperators();
        registerArithOperators();
        registerRelationalOperators();
    }

    public Operator(){}

    public Operator(String operator, int arity){
        super(operator);
        this.arity=arity;
    }

    public abstract void register();
    protected void registerTypeRule(Type[] args, Type result) 
    //throws TypeException
    {
      //  if (args==null) throw new TypeException("Missing arguments' type information.");
      //  if (result==null) throw new TypeException("Missing result's type information.");
      //  if (args.length!=this.arity()) throw new TypeException("The number of arguments are not matched with registered operation.");
        typedef.add(new TypeDef(args,result));
    }

    private static void registerStdOperators(){
        opmap.put(StdOperator.STD_EQUAL_EQUAL, new StdOperator.EqualEqual());
        opmap.put(StdOperator.STD_NOT_EQUAL, new StdOperator.NotEqual());
        opmap.put(StdOperator.STD_EQUAL, new StdOperator.Equal());
        opmap.put(StdOperator.STD_PLUS_EQUAL, new StdOperator.PlusEqual());
        opmap.put(StdOperator.STD_MINUS_EQUAL, new StdOperator.MinusEqual());
        opmap.put(StdOperator.STD_MUL_EQUAL, new StdOperator.MulEqual());
        opmap.put(StdOperator.STD_DIV_EQUAL, new StdOperator.DivEqual());
    }

    private static void registerBoolOperators(){
        opmap.put(BoolOperator.BOOL_AND,new BoolOperator.And());
        opmap.put(BoolOperator.BOOL_OR, new BoolOperator.Or());
        opmap.put(BoolOperator.BOOL_XOR, new BoolOperator.Xor());
        opmap.put(BoolOperator.BOOL_IMPLIES, new BoolOperator.Implies());
        opmap.put(BoolOperator.BOOL_NOT, new BoolOperator.Not());
    }

    private static void registerArithOperators(){
        opmap.put(ArithOperator.ARITH_PLUS, new ArithOperator.Plus());
        opmap.put(ArithOperator.ARITH_MINUS, new ArithOperator.Minus());
        opmap.put(ArithOperator.ARITH_MUL, new ArithOperator.Multiplication());
        opmap.put(ArithOperator.ARITH_DIV, new ArithOperator.Division());
        opmap.put(ArithOperator.ARITH_REM, new ArithOperator.Remainder());
        opmap.put(ArithOperator.ARITH_PLUS_PLUS, new ArithOperator.PlusPlus());
        opmap.put(ArithOperator.ARITH_MINUS_MINUS, new ArithOperator.MinusMinus());
    }
    
    private static void registerRelationalOperators(){
        opmap.put(RelationalOperator.REL_GREATER,new RelationalOperator.Greater());
        opmap.put(RelationalOperator.REL_GREATER_EQUAL,new RelationalOperator.GreaterEqual());
        opmap.put(RelationalOperator.REL_LESS,new RelationalOperator.Less());
        opmap.put(RelationalOperator.REL_LESS_EQUAL,new RelationalOperator.LessEqual());
    }

    public static Operator lookup(String name) throws OperatorNotDefinedException{
        if (!opmap.containsKey(name.hashCode()))
            throw new OperatorNotDefinedException(name);
        Operator operator=opmap.get(name.hashCode());
        return operator;
    }

    public TypeDef get(int i){return this.typedef.get(i);}
    public boolean isStdOperator(){return false;}
    public boolean isBinaryOperator(){return false;}
    public boolean isUnaryOperator(){return false;}
    public boolean isBooleanOperator(){return false;}
    public boolean isArithOperator(){return false;}
    public boolean isRelationalOperator(){return false;}
    public int size() {return this.typedef.size();}

    /*
     * To be changed: An operator may be overloaded so a fixed arity is not ideal here.
     * */ 
    public int arity(){return this.arity;}

    public TypeDef[] typeDefinitions(){
        TypeDef[] def = new TypeDef[this.typedef.size()];
        return this.typedef.toArray(def);
    }
    
    public String toString(){
        StringBuffer sb = new StringBuffer();

        sb.append(this.name()+":\n");
        for (TypeDef T : this.typedef)
            sb.append(T.toString()+"\n");
        
        return sb.toString();
    }

}