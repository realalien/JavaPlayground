package state.pattern.auto.shooter;

public class GunStateAttackHumanOperating implements GunState {

	// Singleton
	public static GunStateAttackHumanOperating instance;
	private GunStateAttackHumanOperating() {}
	public static GunStateAttackHumanOperating getInstance(){
		if (instance == null){
			instance = new GunStateAttackHumanOperating();
		}
		return instance;
	}
	
	@Override
	public void enter(GunController gs) {
		// TODO Auto-generated method stub

	}

	@Override
	public void execute(GunController gs) {
		//TODO: How to reuse other GunStatusAutoAttack? 

		if ( !gs.isHumanOperating() ){
			gs.changeGunState(GunStateAttackAuto.getInstance());
		}
		
		// can I call hide at the same time of reloading?
	}

	@Override
	public void exit(GunController gs) {
		// TODO Auto-generated method stub

	}

}
