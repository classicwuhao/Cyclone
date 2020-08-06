
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
import org.nuim.cyclone.util.AdjList;
import java.util.List;

public class ModelTest {
    public ModelTest(){

    }

    public static void main (String args[]){
        ModelTest parser = new ModelTest();
    }

    @Test
    public void test0(){
        ModelTest model = new ModelTest();
        assertEquals(MachineCompiler.COMPILE_SUCCESS,model.Case0());
    }

   @Test
    public void test1(){
        ModelTest model = new ModelTest();
        assertEquals(MachineCompiler.COMPILE_SUCCESS,model.Case1());
    }

    @Test
    public void test2(){
        ModelTest model = new ModelTest();
        assertEquals(MachineCompiler.COMPILE_SUCCESS,model.Case2());

        AdjList<Integer> al = new AdjList<Integer>(5);
        al.set_head(Integer.valueOf(5),1);
        al.add(Integer.valueOf(2),1);
        al.add(Integer.valueOf(3),1);
        al.add(Integer.valueOf(4),1);

        List<Integer> list = al.get_head_all(1);
        for (Integer i:list){
            System.out.print(i +" ");
        }
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

    public int Case1(){
        PrintWriter err = new PrintWriter(System.err);
        try{
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("files/model/empty.machine"));
            int k=MachineCompiler.compileMachine(in,"File",err);
            return k;
        }
        catch(FileNotFoundException e){
            err.println("Error:"+e.getMessage());
            return -1;
        }
    }

    public int Case2(){
        PrintWriter err = new PrintWriter(System.err);
        try{
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("files/model/odd_even.machine"));
            int k=MachineCompiler.compileMachine(in,"File",err);
            return k;
        }
        catch(FileNotFoundException e){
            err.println("Error:"+e.getMessage());
            return -1;
        }
    }

}