package org.nuim.cyclone.parser.ast;
import java.util.HashMap;

public class SymTable {
    HashMap<Integer,Variable> table32 = new HashMap<Integer,Variable>();
    HashMap<Long,Variable> table64 = new HashMap<Long,Variable>();

    public void store(Variable variable){
        int hashcode = variable.name().hashCode();
        if (table32.containsKey(hashcode))
            throw new RuntimeException("Variable "+variable.name()+" is already defined.");
        else
            table32.put(hashcode,variable); 
    }

    public void store64(Variable variable){
        long hashcode = hash(variable.name());
        if (table64.containsKey(hashcode))
            throw new RuntimeException("Variable "+variable.name()+" is already defined.");
        else 
            table64.put(hashcode,variable);
    }
    
    public Variable lookup(String name){
        return table32.get(name.hashCode());
    }

    public Variable lookup64(String name){
        return table64.get(hash(name));
    }

    public int size(){return table32.size();}
    public int size64(){return table64.size();}

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
        sb.append("{ (");
        for (Integer I : table32.keySet()) 
            sb.append(table32.get(I).toString()+") ");
        sb.append("}");
        return sb.toString();
    }


    public String toString64(){
        StringBuffer sb = new StringBuffer();
        sb.append("{ (");
        for (Long L : table64.keySet()) 
            sb.append(table64.get(L).toString()+") ");
        sb.append("}");
        return sb.toString();
    }

}