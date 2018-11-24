/**
 * 
 */
package pattern.state;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 7:22:12 PM
 */
public class StopState implements State {

	/* (non-Javadoc)
	 * @see pattern.state.State#doAction(pattern.state.Context)
	 */
	@Override
	public void doAction(Context context) {
		System.out.println("Player is in stop state");
		context.setState(this);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StopState [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
