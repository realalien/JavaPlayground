package state.pattern.auto.shooter;

public interface GunState {

	//this will execute when the state is entered
	public void enter(GunController gs);

    //this is called by the miner's update function each update step
	public void execute(GunController gs);

	//this will execute when the state is exited
	public void exit(GunController gs);

	
	// Q: when come to cmp, there is alway special rules, but I can't 
	//    just put the override to here, then, what about an abstract
	//    class between GunState interface and children implementation
	//    class?  What pattern it is called?(path of euristic study.)
	//public boolean equals(GunState otherState);
}
