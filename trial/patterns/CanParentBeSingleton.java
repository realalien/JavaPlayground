package patterns;

/**
 * For class GunStatus and subclasses 
 * 
 * Test if the parent class can be implemented as singleton, so that children
 * could be singleton without coding. it's a language feature test.
 * 
 * 
 * links:
 * http://java.sun.com/developer/technicalArticles/Programming/singletons/
 * 
 * */
public class CanParentBeSingleton {

	public static void main(String args[]) {
		for (int i = 0; i < 3; i++) {
			Parent p = Parent.getOnlyInstance();
			System.out.println(p.name + "  objID:" + p.toString());
		}
	}

}

class Parent {

	private static Parent instance;
	public String name;
	private final static String DEFAULT_NAME = "NO_NAME";

	private Parent() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Parent getOnlyInstance() {
		if (instance == null) {
			instance = new Parent();
			instance.setName(DEFAULT_NAME);
		}
		return instance;
	}
}


//class Child extends Parent{
//	
//	/**
//	 * HINT: Implicit super constructor Parent() is not visible. Must explicitly invoke another constructor
//	 */
//	
////	private Child(){
////		
////	}
//	
//	/**
//	 * Case study:
//	 * * http://userpages.umbc.edu/~tarr/dp/lectures/Singleton-2pp.pdf
//	 * 	 HINT: parent use protected ctor, and become abstract? 
//	 * */
//	
//}