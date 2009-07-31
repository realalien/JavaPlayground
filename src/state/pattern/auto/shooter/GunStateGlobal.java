package state.pattern.auto.shooter;


/**
 * 
 * A demo class which represents the state like 'going to the bathroom',
 * that can be reuse in changing of state.
 * */
public class GunStateGlobal implements GunState {

	public static GunStateGlobal instance;
	private GunStateGlobal() {}
	public static GunStateGlobal getInstance(){
		if (instance == null){
			instance = new GunStateGlobal();
		}
		return instance;
	}
	
	@Override
	public void enter(GunController gs) {
		// TODO Auto-generated method stub

	}

	@Override
	public void execute(GunController gs) {
		// TODO Auto-generated method stub

	}

	@Override
	public void exit(GunController gs) {
		// TODO Auto-generated method stub

	}

}
