package state.pattern.auto.shooter;

public class GunStateReload implements GunState {

	public static GunStateReload instance;
	private GunStateReload() {}
	public static GunStateReload getInstance(){
		if (instance == null){
			instance = new GunStateReload();
		}
		return instance;
	}
	
	@Override
	public void enter(GunController gs) {
		// TODO Auto-generated method stub

	}

	@Override
	public void execute(GunController gs) {
		// change cartridge
		gs.changeCartridge();
		if (gs.isAttacking()){
			//ESP: from here, I forsee overlaid boolean checking, is there any way could mgmt? dictionary map?
			gs.changeGunState(GunStateAttackAuto.getInstance());
		}

	}

	@Override
	public void exit(GunController gs) {
		// TODO Auto-generated method stub

	}

}
