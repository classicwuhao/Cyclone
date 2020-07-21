package org.nuim.cyclone.model;
import org.nuim.cyclone.model.operation.*;
import org.nuim.cyclone.model.type.*;

/* We define our type checker here 
 *  
 * */ 
public class TypeChecker extends NamedElement{
    
    public TypeChecker(){
        super("type checker");
    }

    public static Type checkOperator(Operator operator, Expression args[]) throws TypeException{
    
        for (int i=0;i<operator.size();i++){
            TypeDef def = operator.get(i);
            if (def.size()==args.length){
                if (check(def,args)) 
                    return def.result();
            }
        }
        
        throw new TypeException(" no matched types are found.");
    }

    private static boolean check(TypeDef def, Expression[] args){
        for (int i=0;i<def.args().length;i++){
            if (!def.get(i).equals(args[i].type()))
                return false;
        }
        return true;     
    }

    private static boolean check(TypeDef def, Type[] types){
        for (int i=0;i<def.args().length;i++){
            if (!def.get(i).equals(types[i]))
                return false;
        }
        return true;
    }
    
}