/**
 * Cyclone: this is our string generator for DFA.
 * Input 1: the length of k + an DFA D
 * Input 2[Optional]: a set of properties P including, state coverage, transtition coverage, etc.
 * Output: a string w that has length of k provably accepted by D.
 */
/**
 * NOTE: We use our uran engine here. One can simply use Z3 Java API here.
 */ 
  
import uran.test.util.*;
import uran.solver.*;
import uran.formula.*;
import uran.formula.value.*;
import uran.formula.type.*;
import uran.formula.smt2.*;
import uran.formula.type.*;
import uran.solver.*;
import java.util.List;
import java.util.ArrayList;

 public class Cyclone{
 	private DFA dfa;
	private int length;
	private FunctionFactory factory = new FunctionFactory(512,0.75f);
	private List<AbstractFormula> formulas = new ArrayList<AbstractFormula>();
	
	
 	public Cyclone (DFA dfa, int k){
		this.dfa = dfa;
		this.length = k;
 	}
 
 	public void Generate(){
 		generateConstraints();
 		solve();
 	}
 
 	public void Enumerate(){
 		generateConstraints();
 		enumerate();
 	}
 
 	private void generateConstraints(){
 		/* Create a tract T.*/
 		for (int i=0;i<=this.length;i++) {
 			Constant s = factory.createConstant("S"+i,new Int());
 			formulas.add(FormulaBuilder.range(0,dfa.size()-1,s,true));
 		} //keep compiler happy? 
 		
 		
 		//set inital state
 		Constant s0 = factory.conLookup("S0");
 		formulas.add (new EqFormula(s0, new NumLiteral(dfa.startState())));
 		
 		
 		// the last state
 		Constant ls = factory.conLookup("S"+this.length);
 		
 		//set the final state
		int[] final_states = dfa.finalState();
		List<AbstractFormula> fs = new ArrayList<AbstractFormula>();
		
		for (int i=0;i<final_states.length;i++) fs.add (new EqFormula(ls, new NumLiteral(final_states[i])));
		
		if (fs.size()<=1)
			formulas.add (fs.get(0));
		else
			formulas.add (FormulaBuilder.one(fs.toArray(new EqFormula[fs.size()])));
		
 	}
 	
 	private void solve(){
 		SMT2Writer writer = new SMT2Writer("./dfa.smt2",factory,formulas);
		Z3SMT2Solver solver = new Z3SMT2Solver(writer);
		long current = System.currentTimeMillis();
		
		Result result = solver.solve();
		
		if (result==Result.SAT){
			ColorPrint.println("Solving success.",Color.GREEN);
			generateString();
		}
		else{
			ColorPrint.println("unsat.",Color.RED);	
		}
		
		ColorPrint.println("Solving Time: "+ (System.currentTimeMillis()-current)+" ms.",Color.BLUE);
		
 	}
 
 	private void enumerate(){
 		SMT2Writer writer = new SMT2Writer("./dfa.smt2",factory,formulas);
		Z3SMT2Solver solver = new Z3SMT2Solver(writer);
		long current = System.currentTimeMillis();
		int solutions = 0;
		
		while( solver.solve() == Result.SAT){
			generateString();
			solutions++;
			writer.append(factory.negConstants());
		}
		
		ColorPrint.println("Total Solutions: "+ solutions, Color.BLUE);
		ColorPrint.println("Solving Time: "+ (System.currentTimeMillis()-current)+" ms.",Color.BLUE);
 	}
 
 	private void generateString(){
 		StringBuffer sb = new StringBuffer();
 		for (int i=0;i<=this.length-1;i++){
 			Value v0 = factory.getValue("S"+i);
			IntValue iv0 = (IntValue)v0;
 			Value v1 = factory.getValue("S"+(i+1));
			IntValue iv1 = (IntValue)v1;
			sb.append(dfa.consultTable(iv0.getValue(),iv1.getValue()));
 		}
 		
 		System.out.println(sb.toString());
 		
 	}
 
 }
