package state.pattern.auto.shooter;

import java.util.Map;

public class EntityManager {
	// Singleton
	public static EntityManager instance;

	private EntityManager() {
	}

	public static EntityManager getInstance() {
		if (instance == null) {
			instance = new EntityManager();
		}
		return instance;
	}

	private Map<Integer, BaseGameEntity> entityMap;

	// this method stores a pointer to the entity in the std::vector
	// m_Entities at the index position indicated by the entity's ID
	// (makes for faster access)
	public void RegisterEntity(BaseGameEntity NewEntity) {
	}

	// returns a pointer to the entity with the ID given as a parameter
	public static BaseGameEntity GetEntityFromID(int id) {
		
		return null;
	}

	// this method removes the entity from the list
	public void RemoveEntity(BaseGameEntity Entity) {

	}

	//TODO: read more about the reference and soft/hard copy
	
	
	//test
	public static void main(String args[]){
		GunController gc = new GunController(1122);
		
	}
}
