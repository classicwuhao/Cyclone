package org.nuim.cyclone.parser.ast;
import org.nuim.cyclone.model.Element;
/*
 * The node of our AST 
 * */
public abstract class ASTNode extends Element{
    
    public ASTNode(){super();}
    public ASTNode(String name){super(name);}
    public abstract Element gen() throws SemanticException;
    
}