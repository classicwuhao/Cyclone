
public class State{
	private String name;

	public State(String name){ this.name = name;}
	public String name(){return this.name;}
	
	/* shallow checking */
	public boolean isEqual(State state){return this.name().equals(state.name());}
	
}
