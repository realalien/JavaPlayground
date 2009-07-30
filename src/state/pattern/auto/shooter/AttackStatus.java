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
public class AttackStatus implements GunState {

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
