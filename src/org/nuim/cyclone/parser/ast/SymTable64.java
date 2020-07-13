package org.nuim.cyclone.parser.ast;
import org.nuim.cyclone.model.Variable;
import java.util.HashMap;

public class SymTable64 {
    HashMap<Long,Variable> table64 = new HashMap<Long,Variable>();
    public SymTable64(){}

    public void store(Variable variable) throws SemanticException{
        long hashcode = hash(variable.name());
        if (table64.containsKey(hashcode))
            throw new SemanticException("Variable "+variable.name()+" is already defined.");
        else 
            table64.put(hashcode,variable);
    }
    
    public Variable lookup(String name){
        return table64.get(hash(name));
    }

    public Variable lookup(Variable var){
        return table64.get(hash(var.name()));
    }

    public int size(){return table64.size();}

    /* 64-bit hashing */
    public static long hash(String string) {
        long h = 1125899906842597L; // prime
        int len = string.length();
      
        for (int i = 0; i < len; i++) {
          h = 31*h + string.charAt(i);
        }
        return h;
      }
    
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("{ ");
        for (Long L : table64.keySet()) 
            sb.append("("+table64.get(L).toString()+") ");
        sb.append("}");
        return sb.toString();
    }

}