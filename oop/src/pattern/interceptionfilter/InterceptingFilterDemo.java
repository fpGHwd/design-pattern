/**
 * 
 */
package pattern.interceptionfilter;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 11:56:02 PM
 */
public class InterceptingFilterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.addFilter(new AuthenticationFilter());
		filterManager.addFilter(new DebugFilter());

		Client client = new Client();
		client.setFilterManager(filterManager);
		client.sendRequest("HOME");
	}

}
