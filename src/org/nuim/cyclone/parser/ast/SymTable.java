package org.nuim.cyclone.parser.ast;
import org.nuim.cyclone.model.Variable;
import java.util.HashMap;

public class SymTable {
    HashMap<Integer,Variable> table32 = new HashMap<Integer,Variable>();
    
    public SymTable(){}
    public void store(Variable variable){
        int hashcode = variable.name().hashCode();
        if (table32.containsKey(hashcode))
            throw new RuntimeException("Variable "+variable.name()+" is already defined.");
        else
            table32.put(hashcode,variable); 
    }
    
    public Variable lookup(String name){
        return table32.get(name.hashCode());
    }

    public int size(){return table32.size();}
     
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("{ (");
        for (Integer I : table32.keySet()) 
            sb.append(table32.get(I).toString()+") ");
        sb.append("}");
        return sb.toString();
    }
}