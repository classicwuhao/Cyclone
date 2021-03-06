package org.nuim.cyclone.compiler;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Path;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.nuim.cyclone.parser.*;
import org.nuim.cyclone.util.*;
import org.nuim.cyclone.parser.ast.ASTMachine;
import org.nuim.cyclone.parser.ast.*;
import org.nuim.cyclone.model.Machine;
import org.nuim.cyclone.compiler.graph.StateMatrix;
import org.nuim.cyclone.compiler.gen.PathGenerator;
import org.nuim.cyclone.compiler.MachineSolver;
import uran.solver.Result;

public class MachineCompiler {

    public static final int COMPILE_ERROR=-1;
    public static final int UNEXPECTED_ERROR=-2;
    public static final int COMPILE_SUCCESS=0;
    public static final int SOLVE_SUCCESS=0;
    public static final int SOLVE_FAILED=-1;

    private static ColorPrint out = new ColorPrint();

    public static int compileMachine(InputStream in,String inName, PrintWriter err){
        ParseErrorHandler errHandler = new ParseErrorHandler(inName, err);
        ANTLRInputStream aInput;
        
        out.println("Launching compiler...",Color.DEFAULT);
        int COMPILE_RESULT=COMPILE_SUCCESS;
        out.println("Compiling "+inName,Color.BLUE);
        try {
            aInput = new ANTLRInputStream(in);
            aInput.name = inName;
		} catch (IOException e1) {
            err.println(e1.getMessage());
            return -1;
        }

        StateMachineLexer  lexer = new StateMachineLexer (aInput);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        StateMachineParser parser = new StateMachineParser(tokenStream);

        lexer.init(errHandler);
        parser.init(errHandler);
        ASTContext context = new ASTContext(inName, err);
        COMPILE_RESULT = COMPILE_SUCCESS;
        try{
            ASTMachine node=parser.machine();
            Machine machine=node.gen(context);
            //out.println(machine.toString(),Color.BLUE);
            
            if (errHandler.errorCount() > 0 ){
                out.println(errHandler.errorCount()+" syntax error(s).",Color.RED);
                COMPILE_RESULT = COMPILE_ERROR;
            }
            //out.println("Syntax checking done.",Color.GREEN);

            if (node.context().errors()>0){
                out.println(node.context().errors()+" semantic error(s).",Color.RED);
                COMPILE_RESULT = COMPILE_ERROR;
            }
            //out.println("Semantic checking done.",Color.GREEN);

            if (machine.errors() > 0){
                out.println(machine.errors()+" type/spec error(s).",Color.RED);
                COMPILE_RESULT = COMPILE_ERROR;
            }
            
            //out.println("Type/Spec checking done.",Color.GREEN);
            StateMatrix matrix = new StateMatrix(machine);
            //out.println(matrix.toString(),Color.BLUE); 
            
            if (matrix.errors()>0){
                out.println(matrix.errors()+" generation error(s).",Color.RED);
                COMPILE_RESULT = COMPILE_ERROR;
            }
            
            if (COMPILE_RESULT == COMPILE_SUCCESS){
                out.println("Lanuching solver...",Color.DEFAULT);
                compile(matrix);
            }
            else{
                out.println("Compile is failed.",Color.RED);
                //return COMPILE_RESULT;
            }
            out.println(" ",Color.WHITE);
            return COMPILE_RESULT;
        }
        catch(RecognitionException e){
            err.println(parser.getSourceName() +":" + 
            e.line + ":" +
            e.charPositionInLine + ": " + 
            e.getMessage());
        }

        out.println("Compile is finished\n\n.",Color.GREEN);
        return COMPILE_SUCCESS;
    }

    private static int compile(StateMatrix matrix){
        if (!matrix.machine().hasGoal()){
            out.println("No goal section is found, solving is not performed.",Color.YELLOW);
            return SOLVE_FAILED;
        }

        PathGenerator pgen = new PathGenerator(matrix);
        MachineSolver msolver = new MachineSolver(pgen);
        out.println("Compile is successful.",Color.GREEN);
        out.println("Solver: "+ msolver.solver(),Color.DEFAULT);
        out.println("Enumeration Mode: "+ msolver.isEnumerative(),Color.DEFAULT);
        PathResult pr = msolver.solve();
        out.println("Generated Formulas: "+ msolver.size(),Color.DEFAULT);
        if (pr.result()==Result.SAT){
            out.println("Solving completed:" + pr.time()+" msc ",Color.GREEN);
            if (msolver.isEnumerative()){
                PathResultCollection prc = msolver.PathCollection();
                for (int i=0;i<prc.size();i++){
                    if ((i & 1) !=0){
                        out.println("Path "+i+": "+prc.get(i).path(),Color.CYAN);
                    }
                    else{
                        out.println("Path "+i+": "+prc.get(i).path(),Color.BLUE);
                    }
                }
                out.println("Total Path(s): "+ prc.size(),Color.GREEN);
            }
            else{
                out.println("Path found: "+pr.path(),Color.BLUE);
            }
        }
        else{
            out.println("Solving completed:" + pr.time()+" msc ",Color.RED);
            out.println(pr.result().toString(),Color.RED);
            out.println("No path found.",Color.RED);
        }
        
        return SOLVE_SUCCESS;
    }
}