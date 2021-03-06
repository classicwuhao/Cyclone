
package test.path;
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

public class PathTest {
 
    public PathTest(){}

    public static void main (String args[]){
        PathTest path = new PathTest();
    }
    
  /* @Test
    public void test0(){
        PathTest path = new PathTest();
        assertEquals(MachineCompiler.COMPILE_SUCCESS,path.Case0());
    }

    @Test
    public void test1(){
        PathTest path = new PathTest();
        assertEquals(MachineCompiler.COMPILE_SUCCESS,path.Case1());
    }

    @Test
    public void test2(){
        PathTest path = new PathTest();
        assertEquals(MachineCompiler.COMPILE_SUCCESS,path.Case2());
    }*/

    @Test
    public void test3(){
        PathTest path = new PathTest();
        assertEquals(MachineCompiler.COMPILE_SUCCESS,path.Case3());
    }

    public int Case0(){
        PrintWriter err = new PrintWriter(System.err);
        try{
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("files/path/simple.machine"));
            int k=MachineCompiler.compileMachine(in,"files/path/simple.machine",err);
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
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("files/path/pentangle.machine"));
            int k=MachineCompiler.compileMachine(in,"files/path/pentangle.machine",err);
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
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("files/path/choice.machine"));
            int k=MachineCompiler.compileMachine(in,"files/path/choice.machine",err);
            return k;
        }
        catch(FileNotFoundException e){
            err.println("Error:"+e.getMessage());
            return -1;
        }
    }


    public int Case3(){
        PrintWriter err = new PrintWriter(System.err);
        try{
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("files/path/tree.machine"));
            int k=MachineCompiler.compileMachine(in,"files/path/tree.machine",err);
            return k;
        }
        catch(FileNotFoundException e){
            err.println("Error:"+e.getMessage());
            return -1;
        }
    }

}