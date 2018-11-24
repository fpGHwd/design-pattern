/**
 * 
 */
package pattern.servicelocator;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 12:11:25 AM
 */
public class ServiceLocatorPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Service service = ServiceLocator.getService("Service1");
		service.execute();
		service = ServiceLocator.getService("Service2");
		service.execute();
		service = ServiceLocator.getService("Service1");
		service.execute();
		service = ServiceLocator.getService("Service2");
		service.execute();
	}

}
