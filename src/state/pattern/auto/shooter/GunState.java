package state.pattern.auto.shooter;

public interface GunState {

	//this will execute when the state is entered
	public void enter(GunController gc);

    //this is called by the miner's update function each update step
	public void execute(GunController gc);

	//this will execute when the state is exited
	public void exit(GunController gc);

}
