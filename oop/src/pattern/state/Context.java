/**
 * 
 */
package pattern.state;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 7:23:14 PM
 */
public class Context {
	private State state;
	
	public Context(){
		this.state = null;
	}
	
	public State getState(){
		return this.state;
	}
	
	public void setState(State state){
		this.state = state;
	}
}
