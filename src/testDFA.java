public class testDFA{

	public static void main (String args[]){
		Case1();
		Case2();
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
	 * From dragon book (1st edition), p120.
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
		Cyclone cyclone = new Cyclone(dfa,20);
		cyclone.Enumerate();
	}

}
