package state.pattern.auto.shooter;

/**
 * 
 * Q: is it good design? 
 * by intuition, attack could be a bunch of statuses, like 'reload_with_defense', 
 * 'self explode', 'change weapon',
 * 
 * Shall I keep the maximum intelligence (if fully autonomous) or low intelligence
 * (provide best hands-on operations/safety for human beings?)
 * */
public class GunStateAttackAuto implements GunState {

	// Singleton
	public static GunStateAttackAuto instance;
	private GunStateAttackAuto() {}
	public static GunStateAttackAuto getInstance(){
		if (instance == null){
			instance = new GunStateAttackAuto();
		}
		return instance;
	}

	@Override
	public void enter(GunController gs) {
		//check the armor
		gs.checkArmor();		
		// calibrate
		gs.calibrate();

		System.out.println("Ready to attack!");

	}

	@Override
	public void execute(GunController gs) {
		//main task
		gs.shoot();
		
		//status changes
		if (gs.isOverHeated()){
			gs.changeGunState(GunStateCoolDown.getInstance());
		}
		
		if (gs.isCartridgeEmpty()){
			gs.changeGunState(null);			
		}
		
		if (gs.isArmorEmpty()){
			gs.changeGunState(null);
		}
		
		if (gs.isHumanOperating()){
			gs.changeGunState(GunStateAttackHumanOperating.getInstance());
		}
		
//		if (gs.isArmorRunningLow()){
//			//give warning
//		}

	}

	@Override
	public void exit(GunController gs) {
		System.out.println("Cease fire!");
		GunController.ceaseFile();
	}

}
