package state.pattern.auto.shooter;

public class GunStatePatrol implements GunState {

	public static GunStatePatrol instance;
	private GunStatePatrol() {}
	public static GunStatePatrol getInstance(){
		if (instance == null){
			instance = new GunStatePatrol();
		}
		return instance;
	}
	
	@Override
	public void enter(GunController gs) {
		// TODO Auto-generated method stub

	}

	@Override
	public void execute(GunController gs) {
		if (gs.isEnemySpotted()){
			// Q: could it be a decorator pattern to add different kinds of attack ingrient?
			if (gs.isPreemptedMode())
				gs.changeGunState(GunStateAttackAuto.getInstance());
			if (gs.isDefenseMode())
				gs.changeGunState(GunStateHide.getInstance());
		}

	}

	@Override
	public void exit(GunController gs) {
		// TODO Auto-generated method stub

	}

}
