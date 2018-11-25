/**
 * 
 */
package pattern.servicelocator;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 11:58:51 PM
 */
public class Service2 implements Service {

	/* (non-Javadoc)
	 * @see pattern.servicelocator.Service#getName()
	 */
	@Override
	public String getName() {
		return "Service2";
	}

	/* (non-Javadoc)
	 * @see pattern.servicelocator.Service#execute()
	 */
	@Override
	public void execute() {
		System.out.println("Executing Service2");
	}

}
