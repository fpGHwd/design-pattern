/**
 * 
 */
package pattern.state;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 7:21:52 PM
 */
public class StartState implements State {

	/* (non-Javadoc)
	 * @see pattern.state.State#doAction(pattern.state.Context)
	 */
	@Override
	public void doAction(Context context) {

		System.out.println("Player is in start state");
		context.setState(this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StartState []";
	}
	
}
