package state.pattern.auto.shooter;

/**
 * 
 * To imitate the 'Miner' in "Programming AI by Example"
 * 
 * * I can't decide who uses GunStatus by passing-in as parameters of message
 * call, so treat the controller like something with a brain.
 * */
public class GunController extends BaseGameEntity{ 
	// TODO: extends Weapon<common properties>
	//       implements <standards of a weapon>

	public GunState presentGunState;
	
	//TODO: other properties

	public void changeGunState(GunState newGunState) {
		assert (presentGunState != null && newGunState != null);
		
		presentGunState.exit(this);
		
		presentGunState = newGunState;
		
		newGunState.enter(this);
	}

	@Override
	public void update() {
		// shall I clean and re-calibrate here? 
		
		if (presentGunState != null){
			presentGunState.execute(this);
		}
	}
}


//AFM: deep study of 'State Design pattern'