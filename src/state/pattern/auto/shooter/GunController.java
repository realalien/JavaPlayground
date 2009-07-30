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

	public static void ceaseFile() {
		// close 
		
		// open protection
		
	}

	public void calibrate() {
		// TODO Auto-generated method stub
		
	}

	public void checkArmor() {
		// TODO Auto-generated method stub
		
	}

	public void shoot() {
		// TODO Auto-generated method stub
		
	}

	public boolean isOverHeated() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isCartridgeEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isArmorRunningLow() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isArmorEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isHumanOperating() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isEnemySpotted() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isPreemptedMode() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isDefenseMode() {
		// TODO Auto-generated method stub
		return false;
	}

	public void changeCartridge() {
		// TODO Auto-generated method stub
		
	}

	public boolean isAttacking() {
		// TODO Auto-generated method stub
		return false;
	}

}


//AFM: deep study of 'State Design pattern'