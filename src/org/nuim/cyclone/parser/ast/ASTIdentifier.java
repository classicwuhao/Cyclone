package org.nuim.cyclone.parser.ast;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.IdentExpr;
import org.nuim.cyclone.model.Variable;
import org.nuim.cyclone.model.SrcInfo;

public class ASTIdentifier extends ASTExpression {
    private Token token;
    //indicate if this identifier is inside an expression.
    private boolean insideExpression=false;
    private boolean previous = false;
    private boolean minus = false;

    public ASTIdentifier (Token token){
        super(token.getText());
        this.token=token;
    }

    public String toString(){return this.token.getText();}
    public String identifier(){return this.token.getText();}
    public boolean previous(){return this.previous;}
    public boolean minus(){return this.minus;}
    public void setPrevious(){this.previous=true;}
    public void setMinus(){this.minus=true;}
    public void setExpression(){this.insideExpression=true;}
    public void unsetExpression(){this.insideExpression=false;}
    public Token token(){return this.token;}
    @Override
    public boolean isASTIdentifier(){return true;}

    public IdentExpr gen(ASTContext context) throws SemanticException{
        if (this.insideExpression && !context.flag()){
            /* try local variable first then global variables. */ 
            Variable var = context.local_variables().lookup(this.name());
            if (var==null){
                var = context.variables().getVariable(this.name());
                if (var==null){
                    context.logError(token, " no variable "+this.name()+" is found.",true);
                    throw new SemanticException(token, " no variable "+this.name()+" is found.");
                }
            }
            //var.setSrcInfo(new SrcInfo(token.getText(),token.getLine(),token.getCharPositionInLine()));
            IdentExpr ident = new IdentExpr(this.token.getText(), var.type(), 
                new SrcInfo(token.getText(),token.getLine(),token.getCharPositionInLine()),this.previous);
            
            ident.setMinus(this.minus);
            return ident;
        } 
        else if (context.flag()) {
            //where expression with initialized constraints: we do not allow other variables to appear in the expression.
            Variable var = context.containsLocalInfo(this.name());
            if (var==null){
                context.logError(token, " variable "+this.name()+" is not allowed in " + context.getLocalInfo() + " where expression",true);
                throw new SemanticException(token, " variable "+this.name()+" is not allowed in " + context.getLocalInfo() + " where expression");
            }

            IdentExpr ident = new IdentExpr(this.token.getText(), var.type(), 
                new SrcInfo(token.getText(),token.getLine(),token.getCharPositionInLine()),this.previous);

            ident.setMinus(this.minus);
            return ident;
        }
        else{
            IdentExpr ident = new IdentExpr(this.token.getText());
            ident.setSrcInfo(new SrcInfo(token.getText(),token.getLine(),token.getCharPositionInLine()));
            ident.setMinus(this.minus);
            return ident;
        }
    }

}