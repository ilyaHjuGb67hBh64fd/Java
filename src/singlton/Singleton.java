/**
 * 
 */
package singlton;

/**
 * @author iluser
 *
 */
public class Singleton {
	
//  private static final Singleton singleton = new Singleton();
// 	
//	public static Singleton getInstance() {
//
//		return instance;
//		}
	
	private static Singleton instance;

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();						
		}
		return instance;
	}
	
	private Singleton() {

	}
	public void print() {
		System.out.println(this);
	}
	
}
