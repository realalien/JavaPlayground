package state.pattern.auto.shooter;

public class GunStateCoolDown implements GunState {

	public static GunStateCoolDown instance;
	private GunStateCoolDown() {}
	public static GunStateCoolDown getInstance(){
		if (instance == null){
			instance = new GunStateCoolDown();
		}
		return instance;
	}
	@Override
	public void enter(GunController gs) {
		// TODO Auto-generated method stub

	}

	@Override
	public void execute(GunController gs) {
		// introduce cool down utilities
		
		if( !gs.isOverHeated()){
			gs.changeGunState(GunStatePatrol.getInstance());
		}
		
	}

	@Override
	public void exit(GunController gs) {
		// TODO Auto-generated method stub

	}

}
