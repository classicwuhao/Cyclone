package org.nuim.cyclone.model;
import org.nuim.cyclone.model.operation.Operator;
import org.nuim.cyclone.model.operation.TypeException;
import org.nuim.cyclone.model.operation.OperatorNotDefinedException;
import org.nuim.cyclone.model.type.Type;
import org.nuim.cyclone.model.type.VoidType;

public class Assignment extends Expression{
    private Expression left;
    private Expression right;
    private Operator operator;

    public Assignment(String op,Expression left, Expression right){
        try{
            this.operator=Operator.lookup(op);
            //System.err.println(exprs[0].type().getClass());
            //System.err.println(exprs[1].type().getClass());
            this.left=left;
            this.right=right;
            Type type = type_checking(
                    new Expression[]{this.left,this.right}
                );
            this.setType(type);

        }
        catch(OperatorNotDefinedException e){
            logErrors("operator error","not defined");
            System.err.println(e.getMessage());
        }        
    }

    private Type type_checking(Expression[] exprs){
        StringBuffer sb = new StringBuffer();
        try{
            Type type = TypeChecker.checkOperator(this.operator,exprs);
            return type;
        }
        catch (TypeException e){
            for (int i=0;i<exprs.length;i++)
                sb.append(exprs[i].toString()+" (" + exprs[i].type() +") ");
            System.err.println(e.getMessage()+this.info().toString()+
                " operator "+this.operator.name()+" cannot be applied to "+sb.toString());
            logErrors("Type error","wrong type(s).");
        }
        catch (NullPointerException e){
            logErrors("Type error","null type.");
            //System.err.println("null type");
        }
        
        return new VoidType();
    }


    @Override
    public boolean isAssignmentExpr(){return true;}

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();

        sb.append(this.left.toString()+" "+this.right.toString());
        return sb.toString();
    }
}