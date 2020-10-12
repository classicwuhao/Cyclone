package org.nuim.cyclone.parser.ast;
import org.nuim.cyclone.model.Expression;
import org.nuim.cyclone.model.Assignment;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.SrcInfo;

public class ASTAssignment extends ASTExpression {
    private ASTExpression left;
    private ASTExpression right;
    private Token token;


    public ASTAssignment(Token token, ASTExpression left, ASTExpression right){
        this.token = token;
        this.left = left;
        this.right = right;
        
    }

    public ASTExpression leftExpr(){return this.left;}
    public ASTExpression rightExpr(){return this.right;}


    public String toString(){
        return this.left+" "+this.token.getText()+" "+this.right;
    }

    public Assignment gen (ASTContext context) throws SemanticException{
        Expression leftExpr=this.left.gen(context);
        Expression rightExpr=this.right.gen(context);

        // we leave it to our type checker. 

        /*if (!leftExpr.type().equals(rightExpr.type())){
            context.logError(token,"Type mismatch - "+ "expression has type "+rightExpr.type()+", exptected type "+leftExpr.type(),true);
            throw new SemanticException(token, "Type mismatch - "+ "expression has type "+rightExpr.type()+", exptected type "+leftExpr.type());
        }*/
       if (!leftExpr.isIdentExpr() && !leftExpr.isVariable()){
           context.logError(token,"unexpected type - " + " required variable here",true);
           throw new SemanticException(token,"unexpected type - " + " required variable here");
       }

       return new Assignment(token.getText(),leftExpr,rightExpr, 
                    new SrcInfo(token.getText(),token.getLine(),token.getCharPositionInLine()));
        
    }
}   