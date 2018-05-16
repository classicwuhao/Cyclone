public class testDFA{

	public static void main (String args[]){
		Case1();
		Case2();
		Case3();
	}

	public static void Case1(){
	
		int[][] t = {{0,1},{1,0}};
		char[] c = {'0','1'};
		int[] fs ={1};
		DFA dfa = new DFA ("simple_even_1", t,c,0,fs);
		
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
		char[] c= {'a','b'};		
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
	
		char[] c={'a','b'};
		int[] fs={1,2};
	
		DFA dfa = new DFA ("three_state_from_sipser's_book_p_76",t,c,0,fs);
		System.out.println(dfa);
		Cyclone cyclone = new Cyclone(dfa,3);
		cyclone.Enumerate();
		
	}	
}
