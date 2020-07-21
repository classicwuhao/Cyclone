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

    public Expression gen(ASTContext context) throws SemanticException{
        if (this.insideExpression){
            Variable var = context.variables().getVariable(this.name());
            if (var==null){
                context.logError(token, " no variable "+this.name()+" is found.",true);
                throw new SemanticException(token, " no variable "+this.name()+" is found.");
            }
            return var;
        }
        else{
            return new IdentExpr(this.token.getText());
        }
    }

}