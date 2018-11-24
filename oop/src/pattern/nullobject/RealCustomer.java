/**
 * 
 */
package pattern.nullobject;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 7:39:56 PM
 */
public class RealCustomer extends AbstractCustomer {

	/**
	 * 
	 */
	public RealCustomer(String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see patter.nullobject.AbstractCustomer#isNil()
	 */
	@Override
	public boolean isNil() {
		return false;
	}

	/* (non-Javadoc)
	 * @see patter.nullobject.AbstractCustomer#getName()
	 */
	@Override
	public String getName() {
		return name;
	}

}
