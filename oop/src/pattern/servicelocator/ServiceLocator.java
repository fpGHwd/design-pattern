/**
 * 
 */
package pattern.servicelocator;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 12:10:27 AM
 */
public class ServiceLocator {
	private static Cache cache = new Cache();

	/*
	 * static { cache = new Cache(); }
	 */

	public static Service getService(String jndiName) {

		Service service = cache.getService(jndiName);

		if (service != null) {
			return service;
		}

		InitialContext context = new InitialContext();
		Service service1 = (Service) context.lookup(jndiName);
		cache.addService(service1);
		return service1;
	}
}
