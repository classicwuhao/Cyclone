
/**
 * Each DFA consists of five tuples.
 * 
 * q_0: initial state, \Sigma: input alphabet, \Delta: transisition funciton, q_f: final state(s), Q: set of states.
 *
 */
 
 /* it is okay to use hash set here, since it is single threaded. */
import java.util.*;

public final class DFA extends FSM{
	private HashSet<State> States = new HashSet<State>();
	private HashSet<Character> Sigma = new HashSet<Character>();
	private HashMap<Integer, State> state_cache = new HashMap<Integer, State>(); // a copy of states
	private HashMap<Integer, Character>	sigma_cache = new HashMap<Integer, Character>(); // a copy of sigma
	private HashMap<Integer, HashSet<Integer>> ghost_Table = new HashMap<Integer, HashSet<Integer>>(); // make some ghost states which are not really states belonging to the actual DFAs.
	private HashMap<Integer, State> ghost_States = new HashMap<Integer, State>();
	private State initial_State;
	private HashSet<State> final_States = new HashSet<State>();
	private int [][] transTable;
	private int [] finals;
	private final String STATE_NAME="Q";
	
	public DFA(String name,int[][] table, char[] sigma, int i, int[] f){
		this.name=name;
		this.transTable = table;
		this.finals = f;
		construct(i,f,sigma);
	}
	
	private void construct (int is, int[] fs, char[] sigma){
		for (int i=0;i<transTable.length;i++) {
			State state = new State(STATE_NAME+"_"+i);
			States.add (state);state_cache.put(i,state);
			if (is == i) this.initial_State=state;
		}
		
		for (int i=0;i<sigma.length;i++){	
			Sigma.add (sigma[i]);
			sigma_cache.put (i,sigma[i]);
		}
		
		for (int i=0;i<fs.length;i++) final_States.add(state_cache.get(fs[i]));
		//makeGhostStates();
	}
	
	/* make some ghost states if we have a state that has multiple transitions to another on different alphabets.*/
	private void makeGhostStates(){
		int num = this.transTable.length;
		HashSet<Integer> set;

		for (int i=0;i<this.transTable.length;i++){
			for (int j=0;j<this.transTable[i].length-1;j++){
				for (int k=j+1;k<this.transTable[i].length;k++)
					if (this.transTable[i][j] == this.transTable[i][k]){
						this.transTable[i][k] = num;
						State ghost_state = new State(STATE_NAME+"_"+num);
						ghost_States.put(num,ghost_state);
						if (ghost_Table.containsKey(i)){
							ghost_Table.get(i).add(this.transTable[i][k]);
						}
						else{
							set = new HashSet<Integer>();
							set.add (this.transTable[i][k]);
							ghost_Table.put(i, set);
						}
			
						States.add (ghost_state);state_cache.put(num,ghost_state);
						num++;
						
						if (isContainedFinal(this.transTable[i][j])) final_States.add (ghost_state);
					}
					
			}
		}
				
	}
	
	private boolean isContainedFinal (int k){
		for (int i=0;i<this.finals.length;i++) if (this.finals[i]==k) return true;
		return false;
	}
	
	public HashMap<Integer,State> getGhostStates(){return this.ghost_States;}
	public State initialState(){return this.initial_State;}
	public HashSet<State> finalStates(){return this.final_States;}
	public String name(){return this.name;}
	public int[][] transTable(){return this.transTable;}
	public int size(){return this.States.size();}
	public State getState(int index){return this.state_cache.get(index);}
	public int startState(){
		for (Map.Entry<Integer, State> e : state_cache.entrySet())
			if (e.getValue()==initial_State) return e.getKey();
		return -1;
	}
	
	public int[] finalState(){
		int [] final_states = new int[final_States.size()];
		int k=0;
		for (Map.Entry<Integer, State> e : state_cache.entrySet()){	
			Iterator<State> it = final_States.iterator();
			for (int i=0;it.hasNext();i++){
				State final_state = it.next();
				if (e.getValue()==final_state) final_states[k++] = e.getKey();
			}
		}
		
		return final_states;
	}
	
	public String consultTable (int src, int tar){
		List<String> str = new ArrayList<String>(); 
		StringBuffer option = new StringBuffer();
		/*if (src >= transTable.length) {
			for (Integer key : ghost_Table.keySet()){
				if (ghost_Table.get(key).contains(src)) {
					src = key;
					break;
				}
			}
		}*/
		//System.out.println("src:"+src+" , "+"tar:"+tar);
		
		for (int i=0;i<transTable[src].length;i++){
			if (transTable[src][i]==tar) {
				 str.add(String.valueOf(sigma_cache.get(i)));
			}
		}
		
		if (str.size()>1){
			option.append("[");
			for (int i=0;i<str.size()-1;i++) option.append (str.get(i)+",");
			option.append(str.get(str.size()-1));
			option.append("]");
		}
		else if (str.size()==1){
			option.append(str.get(0));
		}
		else{
			throw new AlphabetException("Error: cannot find corresponding alphabet.");
		}
		
		return option.toString();
	}
		
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append(this.name()+"\n");
		sb.append("States: ");
		for (Map.Entry<Integer,State> e : state_cache.entrySet()) sb.append(e.getValue()+", ");
		sb.append("\n");
		
		sb.append("Start State: "+this.initial_State+"\n");
		sb.append("Final State(s): ");
		Iterator<State> it = final_States.iterator();
		while (it.hasNext()){
			State state = it.next();
			sb.append(state.name()+", ");
		}
		sb.append("\n");
		
		sb.append("Sigma: ");
		for (Map.Entry<Integer, Character> e : sigma_cache.entrySet()) sb.append(e.getValue()+", ");
		sb.append("\n");
	
		sb.append("Transition Table: \n");
		for (int i=0;i<transTable.length;i++){
			for (int j=0;j<transTable[i].length;j++){
				sb.append(" <"+state_cache.get(i)+" , "+ sigma_cache.get(j)+" , "+ state_cache.get(transTable[i][j])+"> ");	
			}		
			sb.append("\n");
		}

		return sb.toString();
	}
		
}
