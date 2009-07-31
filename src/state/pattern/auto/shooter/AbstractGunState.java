package state.pattern.auto.shooter;


/**
 * 
 * See the design purpose , from <interface>GunState
 * 
 * Shall children class subclasses this one?
 * */
public abstract class AbstractGunState implements GunState {

	@Override
	public abstract void  enter(GunController gs);

	@Override
	public abstract void execute(GunController gs);

	@Override
	public abstract void exit(GunController gs);
}
