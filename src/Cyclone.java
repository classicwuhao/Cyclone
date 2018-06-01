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
import java.util.*;

 public class Cyclone{
 	private DFA dfa;
	private int length;
	private FunctionFactory factory = new FunctionFactory(512,0.75f);
	private List<AbstractFormula> formulas = new ArrayList<AbstractFormula>();
	private List<Integer[][]> BoolMatrices = new ArrayList<Integer[][]>();
	
	private final String STATE="T";
	private final String STR="S";
	
 	public Cyclone (DFA dfa, int k){
		this.dfa = dfa;
		this.length = k;
 	}
 
 	public void Solve(){
 		generateConstraints();
 		solve();
 	}
 
 	public void Enumerate(){
 		constructBoolMatrix();
 		generateConstraints();
 		enumerate();
 	}
 
 	private void constructBoolMatrix(){
 		int m = this.dfa.transTable().length;
 		int n = this.dfa.transTable()[0].length;
 		int[][] trans_table = this.dfa.transTable();
 		
 		/* 1: marks no transition to a state on a particular alphabet, Otherwise it is marked as 0.*/
 		for (int i=0;i<m;i++){
	 		Integer[][] matrix = new Integer[m][n];
 			for (int j=0;j<n;j++) for (int k=0;k<trans_table.length;k++)
	 			matrix[k][j] = (trans_table[i][j]==k) ? 0 : 1 ;
 			
 			BoolMatrices.add (matrix);
 		}
 		
 		/*for (int i=0;i<BoolMatrices.size();i++){
 			Integer[][] matrix = BoolMatrices.get(i);
 			System.out.println();
 			for (int j=0;j<matrix.length;j++){
 				for (int k=0;k<matrix[j].length;k++){
 					System.out.print(matrix[j][k]+" ");
 				}
 				System.out.println();
 			}
 		}*/
 		
 	}
 
 	private void generateConstraints(){
 		List<Integer> union = new ArrayList<Integer>();
 		/* Create a tract T.*/
 		for (int i=0;i<=this.length;i++) {
 			Constant s = factory.createConstant(STATE+i,new Int());
 			formulas.add(FormulaBuilder.range(0,dfa.size()-1,s,true));
 		} //keep compiler happy? 
 		
 		
 		for (int i=0;i<=this.length-1;i++){
 			Constant w = factory.createConstant(STR+i, new Int());
 			formulas.add(FormulaBuilder.range(0,dfa.alphabet_size()-1,w,true));
 		}
 		
 		//set inital state
 		Constant s0 = factory.conLookup(STATE+"0");
 		formulas.add (new EqFormula(s0, new NumLiteral(dfa.startState())));
 		
 		/* generate constraints for each boolean matrix */
		for (int i=0;i<BoolMatrices.size();i++){
			Integer[][] matrix = BoolMatrices.get(i);
			for (int j=0;j<matrix.length;j++){
				for (int k=0;k<matrix[0].length;k++){
					if (matrix[j][k]==1)
						formulas.add(genBlockingConstraints(i,j,k));
				}
			}
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
 		HashSet<Integer> seta = new HashSet<Integer>();
 		HashSet<Integer> setb = new HashSet<Integer>();
 		for (int i=0;i<setA.length;i++) seta.add (setA[i]);
 		for (int i=0;i<setB.length;i++) setb.add (setB[i]);
		seta.removeAll(setb); 

		int [] comp = new int[seta.size()];
		int k=0;
		Iterator<Integer> it = seta.iterator();
	
		while (it.hasNext()) comp[k++]=it.next().intValue();
		
		return comp;
 	}
 	

 	/* iterate through every S_{i} in T and generating blocking constraints for impossible path. */
 	private AbstractFormula genBlockingConstraints (int current_state, int next_state, int alphabet){
 		List<AbstractFormula> bc = new ArrayList<AbstractFormula>();
 		
 		for (int i=0;i<=this.length-1;i++){
 			
 			Constant S_i = factory.conLookup(STATE+i);
	 		Constant S_j = factory.conLookup(STATE+(i+1)); 
		 	Constant W_k = factory.conLookup(STR+i);
	 		AbstractFormula formula = new OrFormula(
	 						new OrFormula(
 						new NegFormula (new EqFormula(S_i,new NumLiteral(current_state))), 
		 				new NegFormula (new EqFormula(S_j,new NumLiteral(next_state)))),
		 				new NegFormula (new EqFormula(W_k,new NumLiteral(alphabet))));
			bc.add (formula);
 		}
 		
 		return FormulaBuilder.all (bc.toArray(new OrFormula[bc.size()]));
 	}
 	
 	private AbstractFormula genBlockingConstraintsForGhostStates(){
 		List<AbstractFormula> bc = new ArrayList<AbstractFormula>();
 		
		for (Integer key : this.dfa.getGhostStates().keySet()){
			for (int i=0;i<=this.length-1;i++){
	 			Constant S_i = factory.conLookup(STATE+i);
		 		Constant S_j = factory.conLookup(STATE+(i+1)); 				
				for (int j=key;j>=0;j--){
		 			bc.add (new OrFormula(
 						new NegFormula (new EqFormula(S_i,new NumLiteral(key))), 
		 				new NegFormula (new EqFormula(S_j,new NumLiteral(j)))));
				}			
			}
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
 			IntValue v = (IntValue) factory.getValue(STR+i);
			sb.append(" -> "+dfa.alphabet(v.getValue()));
 		}
 		System.out.println(sb.toString());
 	}
 	
 }
