/**
 * 
 */
package pattern.state;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 7:29:07 PM
 */
public class StatePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Context context = new Context();

		StartState startState = new StartState();
		startState.doAction(context);

		System.out.println(context.getState().toString());

		StopState stopState = new StopState();
		stopState.doAction(context);

		System.out.println(context.getState().toString());
	}

}
