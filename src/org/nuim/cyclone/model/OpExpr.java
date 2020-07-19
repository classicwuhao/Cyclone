package org.nuim.cyclone.model;
import org.nuim.cyclone.model.operation.Operator;
import org.nuim.cyclone.model.operation.TypeException;

public class OpExpr extends Expression {
    private Expression[] exprs;
    private Operator operator;

    public OpExpr(String op, Expression[] exprs){
        super(op);
        // create an operator from registered operations.
        try{
            operator=Operator.lookup(op);
        }
        catch (TypeException e){
            System.err.println(e.getMessage());
        }
        this.exprs=exprs;
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
        for (Expression expr : exprs)
            sb.append(expr.toString()+",");
        sb.append(")");

        return sb.toString();
    }
    
}