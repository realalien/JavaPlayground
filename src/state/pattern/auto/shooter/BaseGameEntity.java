package state.pattern.auto.shooter;

public abstract class BaseGameEntity implements CanBeUpdate {

	// every entity has a unique identifying number
	protected int id; 
	//TODO: why in cpp, the modifier is 'private'?

	// this is the next valid ID. Each time a BaseGameEntity is instantiated
	// this value is updated
	private static int nextValidID;

	// this is called within the constructor to make sure the ID is set
	// correctly. It verifies that the value passed to the method is greater
	// or equal to the next valid ID, before setting the ID and incrementing
	// the next valid ID

	public BaseGameEntity() {
	}

	public BaseGameEntity(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

}
