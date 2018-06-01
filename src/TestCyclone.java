public class TestCyclone{

	public static void main (String args[]){
		Case1();Case2();
		Case3();Case4();
		Case5();Case6();
		Case7();Case8();
	}

	public static void Case1(){
	
		int[][] t = {{0,1},{1,0}};
		String[] c = {"0","1"};
		int[] fs ={1};
		DFA dfa = new DFA ("simple_odd_1", t,c,0,fs);
		
		System.out.println(dfa);
		Cyclone cyclone = new Cyclone(dfa,6);
		cyclone.Enumerate();
		
	}

	/**
	 * From the dragon book (1st edition), p120.
	 */
	public static void Case2(){
		int[][] t={
			{1,2},
			{1,3},
			{1,2},
			{1,4},
			{1,2}
		};
		String[] c= {"a","b"};		
		int[] fs={4};
		
		DFA dfa = new DFA ("abb_from_dragon_book_p_120",t,c,0,fs);
		System.out.println(dfa);
		Cyclone cyclone = new Cyclone(dfa,5);
		cyclone.Enumerate();
	}

	/**
	 * From Sipser's book, p76. A three-state DFA
	 */
	public static void Case3(){
		int[][] t={
			{1,2},
			{0,1},
			{1,0}
		};
	
		String[] c={"a","b"};
		int[] fs={1,2};
	
		DFA dfa = new DFA ("three_state_from_sipser's_book_p_76",t,c,0,fs);
		System.out.println(dfa);
		Cyclone cyclone = new Cyclone(dfa,3);
		cyclone.Enumerate();
		
	}	
	
	/**
	 * From Sipser's book, p38. A five-state DFA (accepts strings that start and end with the same symbol).
	 */
	public static void Case4(){		
		int[][] t={
			{1,2},
			{1,3},
			{4,2},
			{1,3},
			{4,2}
		};
	
		String[] c={"a","b"};
		int[] fs={1,2};
	
		DFA dfa = new DFA ("five_state_from_sipser's_book_p_38",t,c,0,fs);
		System.out.println(dfa);
		Cyclone cyclone = new Cyclone(dfa,6);
		cyclone.Enumerate();	
	}
	
	public static void Case5(){
		int[][] t={
			{0,0}
		};
		
		String[] c={"a","b"};
		int[] fs={0};
		
		DFA dfa = new DFA ("one state",t,c,0,fs);
		Cyclone cyclone = new Cyclone (dfa,2);
		cyclone.Enumerate();	
	}

	public static void Case6(){
		int[][] t={
			{0,1},
			{2,2},
			{1,1}
		};
		
		String[] c={"a","b"};
		int[] fs={2};
				
		DFA dfa = new DFA ("three states",t,c,0,fs);
		Cyclone cyclone = new Cyclone (dfa,3);
		cyclone.Enumerate();
				
	}
	
	/**
	 * Try it with CFG.
	 * Algorithm:
	 * Input: A CFG.
	 * Output: Sentence that can be derived from CFG within k steps.
	 * Rules: Map every element in RHS to a unique state, then construct a transisiton table based on specific element in the RHS.
	 *
 	 * Sampel Grammar:
	 * S => A | B
	 * A => a 
	 * B => b 
	 */
	public static void Case7(){
	/* Let m be our mapping function: (V \\union \\Sigma) => Q
	 */
	
		int[][] t={
			{5,1,2,5,5,5},
			{5,5,5,3,5,5},
			{5,5,5,5,4,5},
			{5,5,5,5,5,5},
			{5,5,5,5,5,5}
		};
		
		String[] c={"S","A","B","a","b","e*"};
		int[] fs={3,4};
	
		DFA dfa = new DFA ("States for CFG ",t,c,0,fs);
		Cyclone cyclone = new Cyclone (dfa,3);
		cyclone.Enumerate();
		
	}
	
	public static void Case8(){
		int[][] t={
			{3,1,2,3},
			{3,3,3,0},
			{3,3,3,3},
			{3,3,3,3},
		};
		
		String[] c={"S","Sa","b","e*"};
		int[] fs={2};
	
		DFA dfa = new DFA ("States for CFG ",t,c,0,fs);
		Cyclone cyclone = new Cyclone (dfa,3);
		cyclone.Enumerate();		
	}
	
	
}
