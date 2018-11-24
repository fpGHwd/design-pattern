/**
 * 
 */
package pattern.nullobject;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 7:40:43 PM
 */
public class NullCustomer extends AbstractCustomer {

	/* (non-Javadoc)
	 * @see patter.nullobject.AbstractCustomer#isNil()
	 */
	@Override
	public boolean isNil() {
		return true;
	}

	/* (non-Javadoc)
	 * @see patter.nullobject.AbstractCustomer#getName()
	 */
	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}

}
