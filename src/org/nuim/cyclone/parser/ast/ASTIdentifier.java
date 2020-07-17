package org.nuim.cyclone.parser.ast;
import org.antlr.runtime.Token;
import org.nuim.cyclone.model.Element;
import org.nuim.cyclone.model.NamedElement;
public class ASTIdentifier  extends ASTExpression {
    private Token token;

    public ASTIdentifier (Token token){
        super();
        this.token=token;
    }

    public String toString(){return this.token.getText();}
    public String identifier(){return this.token.getText();}
    
    public Element gen(){
        return new NamedElement(this.token.getText());
    }

}