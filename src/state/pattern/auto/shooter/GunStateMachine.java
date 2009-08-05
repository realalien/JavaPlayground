package state.pattern.auto.shooter;

/**
 * Delegate the GunState changes
 * */
public class GunStateMachine {

	private GunController gunController;

	private GunState currentsGunStatus;

	private GunState previousGunStatus;

	private GunState globalGunStatus;

	// if I use ruby, the code will be more consice.
	// Q: why cpp's ctor looks quite intriguing?
	public GunStateMachine(GunController gc) { // maybe
		// later the
		// super
		// class
		this.gunController = gc;
	}

	public void setCurrentsGunStatus(GunState gs) {
		this.currentsGunStatus = gs;
	}

	public void setPreviousGunStatus(GunState gs) {
		this.previousGunStatus = gs;
	}

	public void setGlobalGunStatus(GunState gs) {
		this.globalGunStatus = gs;
	}

	// Q: how to enforce rule like cpp, 'void Update() const'
	// AFM: learn general rule of class/method modifier for this type of
	// class.Default? Protected?
	// call this to update the FSM
	public void update() {
		// if a global state exists, call its execute method
		if (this.globalGunStatus != null)
			this.globalGunStatus.execute(this.gunController);

		// same for the current state
		if (this.currentsGunStatus != null)
			this.currentsGunStatus.execute(this.gunController);

	}

	// change to a new state
	public void ChangeState(GunState newState) {
		assert (newState != null);
		// "<StateMachine::ChangeState>: trying to change to a null state");

		// keep a record of the previous state
		this.previousGunStatus = this.currentsGunStatus;

		// call the exit method of the existing state
		this.currentsGunStatus.exit(this.gunController);

		// change state to the new state
		this.currentsGunStatus = newState;

		// call the entry method of the new state
		this.currentsGunStatus.enter(this.gunController);
	}

	// change state back to the previous state
	public void RevertToPreviousState() {
		ChangeState(this.previousGunStatus);
	}

	//accessor 
	// Q: how to enforce rule like cpp, e.g. "State<entity_type>*  CurrentState()  const{return m_pCurrentState;}"
	public GunState getCurrentsGunStatus() {
		return currentsGunStatus;
	}

	public GunState getPreviousGunStatus() {
		return previousGunStatus;
	}

	public GunState getGlobalGunStatus() {
		return globalGunStatus;
	}
	
	//returns true if the current state's type is equal to the type of the
    //class passed as a parameter. // rule? const State<entity_type>& st
	public  boolean  isInState(final GunState  state){
		// because we use Singleton, equals() should be safe,
		//ESP: potiental weakness.(static tool for detection?)
		return this.currentsGunStatus.equals(state);
	}

	
	

}
