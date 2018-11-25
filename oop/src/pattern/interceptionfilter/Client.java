/**
 * 
 */
package pattern.interceptionfilter;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 11:55:06 PM
 */
public class Client {
	FilterManager filterManager;

	public void setFilterManager(FilterManager filterManager) {
		this.filterManager = filterManager;
	}

	public void sendRequest(String request) {
		filterManager.filterRequest(request);
	}
}
