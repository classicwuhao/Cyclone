public class testDFA{

	public static void main (String args[]){
		Case1();
	}

	public static void Case1(){
	
		int[][] t = {{0,1},{1,0}};
		char[] c = {'0','1'};
		int[] fs ={1};
		DFA dfa = new DFA ("simple_even_1", t,c,0,fs);
		
		System.out.println(dfa);
		Cyclone cyclone = new Cyclone(dfa,3);
		cyclone.Enumerate();
		
	}

}
