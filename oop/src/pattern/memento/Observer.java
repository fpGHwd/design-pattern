/**
 * 
 */
package pattern.memento;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 6:53:41 PM
 */
public abstract class Observer {
	protected Subject subject; // private -> protected
	
	public abstract void update();
}
