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
	
// Deprecated: delegate to the stateMachine.	
//	private GunState globalGunState ;  // to avoid status duplicate in most subclasses of GunState
//	private GunState presentGunState;
//	private GunState previousGunState ;
	
	//TODO: other properties, also get update in update()
	
	//Q: why should be 'final'?
	private GunStateMachine stateMachine ;
	
	//ctor
	public GunController(int id){
		 this.id = id ;		
	}
	
	public GunController(){
		// set flags and init values
		this.stateMachine = new GunStateMachine(this);
		this.stateMachine.setCurrentsGunStatus(GunStatePatrol.getInstance());
		this.stateMachine.setGlobalGunStatus(GunStateGlobal.getInstance());
	}
	
	public void changeGunState(GunState newGunState) {
		assert (newGunState != null);
		
		this.stateMachine.getCurrentsGunStatus().exit(this);
		this.stateMachine.setCurrentsGunStatus(newGunState);
		this.stateMachine.getCurrentsGunStatus().enter(this);
//		assert (presentGunState != null && newGunState != null);
//		presentGunState.exit(this);
//		presentGunState = newGunState;
//		newGunState.enter(this);
	}
	
	public GunStateMachine getStateMachine() {
		return stateMachine;
	}

	public void RevertToPreviousState(){
		this.stateMachine.RevertToPreviousState();
	}
	
	
	@Override
	public void update() {
		// shall I clean and re-calibrate here? 
		this.stateMachine.update();
		
		//deprected due to intro of stateMachine
//		if (presentGunState != null){
//			presentGunState.execute(this);
//		}
	}

	public void ceaseFile() {
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