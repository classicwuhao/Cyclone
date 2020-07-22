package org.nuim.cyclone.parser.ast;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.Expression;
import org.nuim.cyclone.model.IdentExpr;
import org.nuim.cyclone.model.Variable;

public class ASTIdentifier  extends ASTExpression {
    private Token token;
    //indicate if this identifier is inside an expression.
    private boolean insideExpression=false;

    public ASTIdentifier (Token token){
        super(token.getText());
        this.token=token;
    }

    public String toString(){return this.token.getText();}
    public String identifier(){return this.token.getText();}
    public void setExpression(){this.insideExpression=true;}
    public void unsetExpression(){this.insideExpression=false;}
    public Token token(){return this.token;}

    public Expression gen(ASTContext context) throws SemanticException{
        if (this.insideExpression && !context.flag()){
            Variable var = context.variables().getVariable(this.name());
            if (var==null){
                context.logError(token, " no variable "+this.name()+" is found.",true);
                throw new SemanticException(token, " no variable "+this.name()+" is found.");
            }
            return var;
        } 
        else if (context.flag()) {
            //where expression: we do not allow other variables to appear in the expression.
            Variable var = context.containsLocalInfo(this.name());
            if (var==null){
                context.logError(token, " variable "+this.name()+" is not allowed in " + context.getLocalInfo() + " where expression",true);
                throw new SemanticException(token, " variable "+this.name()+" is not allowed in " + context.getLocalInfo() + " where expression");
            }

            return new IdentExpr(this.token.getText(), var.type());
        }
        else{
            return new IdentExpr(this.token.getText());
        }
    }

}