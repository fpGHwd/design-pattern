/**
 * 
 */
package pattern.bridge;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 1:19:24 PM
 */
public class class3 implements interface3 {

	/* (non-Javadoc)
	 * @see pattern.bridge.interface1#interface1Method()
	 */
	public void interface1() {

	}

	/* (non-Javadoc)
	 * @see pattern.bridge.interface2#interface2()
	 */
	@Override
	public void interface2() {

	}

	/* (non-Javadoc)
	 * @see pattern.bridge.interface3#interface3()
	 */
	@Override
	public void interface3() {

	}

}
