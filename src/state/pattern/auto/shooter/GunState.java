package state.pattern.auto.shooter;

public interface GunState {

	//this will execute when the state is entered
	public void enter(GunController gs);

    //this is called by the miner's update function each update step
	public void execute(GunController gs);

	//this will execute when the state is exited
	public void exit(GunController gs);

}
