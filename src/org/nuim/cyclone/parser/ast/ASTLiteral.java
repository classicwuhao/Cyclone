package org.nuim.cyclone.parser.ast;

import org.nuim.cyclone.model.type.*;
import org.nuim.cyclone.model.value.*;
import org.antlr.runtime.Token;

public class ASTLiteral extends ASTExpression {
    public static enum LiteralType {
        INT, BOOL, REAL, STRING, CHAR
    };

    private LiteralType lt;
    private Token token;

    public ASTLiteral() {
        super();
    }

    public ASTLiteral(LiteralType lt, Token token) {
        this.lt = lt;
        this.token = token;
    }

    public Value gen() throws SemanticException {
        Value value;
        String str_value = this.token.getText();
        switch (this.lt) {
            case INT:
                value = new IntValue(Integer.parseInt(str_value));
                break;

            case BOOL:
                value = new BoolValue(Boolean.parseBoolean(str_value));
                break;

            case STRING:
                value = new StringValue(str_value);
                break;

            case CHAR:
                value = new CharValue(str_value.charAt(0));
                break;

            default:
                throw new SemanticException("cannot determine this literal: " + str_value);
           
        }
        return value;
    }

    @Override
    public String toString(){return this.token.getText();}
}