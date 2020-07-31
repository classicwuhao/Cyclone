package org.nuim.cyclone.model;
import org.nuim.cyclone.model.operation.Operator;
import org.nuim.cyclone.model.operation.TypeException;
import org.nuim.cyclone.model.operation.OperatorNotDefinedException;
import org.nuim.cyclone.model.type.Type;
import org.nuim.cyclone.model.type.VoidType;
public class OpExpr extends Expression {
    private Expression[] exprs;
    private Operator operator;

    public OpExpr(String op, Expression[] exprs, SrcInfo info){
        super(op,info);
        // create an operator from registered operations.
        try{
            operator=Operator.lookup(op);
            //System.err.println(exprs[0].type().getClass());
            //System.err.println(exprs[1].type().getClass());
            Type type = type_checking(exprs);
            this.setType(type);
            this.exprs=exprs;
        }
        catch(OperatorNotDefinedException e){
            logErrors("operator error","not defined");
            System.err.println("operator error:"+e.getMessage());
        }
    }

    private Type type_checking(Expression[] exprs){
        StringBuffer sb = new StringBuffer();
        try{
            Type type = TypeChecker.checkOperator(this.operator,exprs);
            return type;
        }
        catch (TypeException e){
            for (int i=0;i<exprs.length-1;i++)
                sb.append(exprs[i].toString()+",");
            sb.append(exprs[exprs.length-1].toString());
            System.err.println(e.getMessage()+this.info().toString()+
                " operator "+this.operator.name()+" cannot be applied to "+sb.toString());
            logErrors("Type error","wrong type(s).");
        }
        catch (NullPointerException e){
            logErrors("Type error","null type.");
            //System.err.println("null type.");
        }
        
        return new VoidType();
    }

    public Expression[] args (){
        return this.exprs;
    }   

    public int size(){
        return exprs.length;
    }

    public Operator operator(){return this.operator;}

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();

        sb.append("("+ operator.name()+" ");
        for (int i=0;i<exprs.length-1;i++)
            sb.append(exprs[i].toString()+",");
        
        
        sb.append(exprs[exprs.length-1].toString()+")");
        sb.append("->");
        sb.append(this.type().name());

        return sb.toString();
    }
    
}