package test.content;
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

public class ContentTest {
    
    private final String path="files/content/";

    public static void main (String args[]){
        ContentTest ct = new ContentTest();
    }

    public ContentTest(){

    }

    @Test
    public void test0(){
        ContentTest content = new ContentTest();
        assertEquals(MachineCompiler.COMPILE_SUCCESS,content.Case0());
    }

    public int Case0(){
        PrintWriter err = new PrintWriter(System.err);
        String file = "example.machine";
        try{
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(path+file));
            int k=MachineCompiler.compileMachine(in,path+file,err);
            return k;
        }
        catch(FileNotFoundException e){
            err.println("Error:"+e.getMessage());
            return -1;
        }
    }


}
