package state.pattern.auto.shooter;

public class GunStateHide implements GunState {

	public static GunStateHide instance;
	private GunStateHide() {}
	public static GunStateHide getInstance(){
		if (instance == null){
			instance = new GunStateHide();
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
