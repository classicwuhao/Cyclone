package test.parser;
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

public class ParserTest {
    
    public ParserTest(){

    }

    public static void main (String args[]){
        ParserTest parser = new ParserTest();
        System.out.println("Testing parser...");
    }

    @Test
    public void test0(){
        ParserTest parser = new ParserTest();
        assertEquals(MachineCompiler.COMPILE_SUCCESS,parser.Case0());
    }

    public int Case0(){
        PrintWriter err = new PrintWriter(System.err);
        try{
            BufferedInputStream in = new BufferedInputStream(new FileInputStream("files/parser/test1.machine"));
            int k=MachineCompiler.compileMachine(in,"File",err);
            return k;
        }
        catch(FileNotFoundException e){
            err.println("Error:"+e.getMessage());
            return -1;
        }

    }

}