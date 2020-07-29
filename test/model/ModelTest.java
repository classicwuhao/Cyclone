
package test.model;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import uran.test.util.*;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.nuim.cyclone.compiler.MachineCompiler;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.nuim.cyclone.util.BitVector;

public class ModelTest {
    public ModelTest(){

    }

    public static void main (String args[]){
        ModelTest parser = new ModelTest();
        System.out.println("Testing semantics...");
    }

    @Test
    public void test0(){
        ModelTest model = new ModelTest();
        //BitVector bv = new BitVector(11,true);
        //System.out.println(bv.equals(1001));
       // System.out.println(bv.and(1111));

        assertEquals(MachineCompiler.COMPILE_SUCCESS,model.Case0());

    }

    public int Case0(){
        PrintWriter err = new PrintWriter(System.err);
        try{
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("files/model/counter.machine"));
            int k=MachineCompiler.compileMachine(in,"File",err);
            return k;
        }
        catch(FileNotFoundException e){
            err.println("Error:"+e.getMessage());
            return -1;
        }

    }

}