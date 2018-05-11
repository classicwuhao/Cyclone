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
	private final String STATE="S";
	
 	public Cyclone (DFA dfa, int k){
		this.dfa = dfa;
		this.length = k;
 	}
 
 	public void Solve(){
 		generateConstraints();
 		solve();
 	}
 
 	public void Enumerate(){
 		generateConstraints();
 		enumerate();
 	}
 
 	private void generateConstraints(){
 		List<Integer> union = new ArrayList<Integer>();
 		/* Create a tract T.*/
 		for (int i=0;i<=this.length;i++) {
 			Constant s = factory.createConstant(STATE+i,new Int());
 			formulas.add(FormulaBuilder.range(0,dfa.size()-1,s,true));
 		} //keep compiler happy? 
 		
 		
 		//set inital state
 		Constant s0 = factory.conLookup(STATE+"0");
 		formulas.add (new EqFormula(s0, new NumLiteral(dfa.startState())));
 		
 		/* compute the complement set of each entry in the transition table */
		int[][] table = dfa.transTable();
		int[] states = new int[dfa.transTable().length];
		
		for (int i=0;i<states.length;i++) states[i]=i;
		
		for (int i=0;i<table.length;i++){
			union.clear();
			for (int j=0;j<table[i].length;j++) union.add (table[i][j]);
			int[] union_int = convertI2i(union);
			int[] comp = complement(states,union_int);
			for (int k=0;k<comp.length;k++) formulas.add (genBlockingConstraints(i,comp[k]));
		}
		
 		// the last state
 		Constant ls = factory.conLookup(STATE+this.length);
 		
 		//set the final state
		int[] final_states = dfa.finalState();
		List<AbstractFormula> fs = new ArrayList<AbstractFormula>();
		
		for (int i=0;i<final_states.length;i++) fs.add (new EqFormula(ls, new NumLiteral(final_states[i])));
		
		if (fs.size()<=1)
			formulas.add (fs.get(0));
		else
			formulas.add (FormulaBuilder.one(fs.toArray(new EqFormula[fs.size()])));
		
 	}
 	
 	private int[] convertI2i(List<Integer> list){
 		int[] array = new int[list.size()];
 		for (int i=0;i<list.size();i++) array[i]=list.get(i);
 		return array;
 	}
 	
 	
 	/* |setB| \subeq |setA| */
 	private int[] complement (int[] setA, int[] setB){	
 		int [] comp = new int[setA.length-setB.length];
 		boolean flag = false;

 		for (int i=0,k=0;i<setA.length;i++){
 			flag=false;
			for (int j=0;j<setB.length;j++){
				if (setB[j]==setA[i]) {
					flag=true;break;
				}
			}
			if (!flag) comp[k++]=setA[i];
 		}

		return comp;
 	}
 	
 	/* iterate through every S_{i} in T and generating blocking constraints for impossible path. */
 	private AbstractFormula genBlockingConstraints (int current_state, int next_state){
 		List<AbstractFormula> bc = new ArrayList<AbstractFormula>();
 		
 		for (int i=0;i<=this.length-1;i++){
 			Constant S_i = factory.conLookup(STATE+i);
	 		Constant S_j = factory.conLookup(STATE+(i+1)); 
 			bc.add (new OrFormula(
 						new NegFormula (new EqFormula(S_i,new NumLiteral(current_state))), 
		 				new NegFormula (new EqFormula(S_j,new NumLiteral(next_state)))));
 		}
 		
 		return FormulaBuilder.all (bc.toArray(new OrFormula[bc.size()]));
 	}
 	
 	
 	/* generate a single string. */
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
 
 	/* enumerate all possible strings. */
 	private void enumerate(){
 		SMT2Writer writer = new SMT2Writer("./dfa.smt2",factory,formulas);
		Z3SMT2Solver solver = new Z3SMT2Solver(writer);
		long current = System.currentTimeMillis();
		int solutions = 0;
		
		while(solver.solve() == Result.SAT){
			generateString();
			solutions++;
			writer.append(factory.negConstants());
		}
		
		if (solutions==0) {
			ColorPrint.println("unsat. no solutions.",Color.RED);
			return;
		}
		
		ColorPrint.println("Total Solutions: "+ solutions, Color.BLUE);
		ColorPrint.println("Solving Time: "+ (System.currentTimeMillis()-current)+" ms.",Color.BLUE);
 	}
 
 	private void generateString(){
 		StringBuffer sb = new StringBuffer();
 		for (int i=0;i<=this.length-1;i++){
 			Value v0 = factory.getValue(STATE+i);
			IntValue iv0 = (IntValue)v0;
 			Value v1 = factory.getValue(STATE+(i+1));
			IntValue iv1 = (IntValue)v1;
			sb.append(dfa.consultTable(iv0.getValue(),iv1.getValue()));
 		}
 		
 		System.out.println(sb.toString());
 		
 	}
 
 }
