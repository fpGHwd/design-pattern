/**
 * 
 */
package pattern.interceptionfilter;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 11:51:24 PM
 */
public class FilterManager {
	private FilterChain filterChain;

	public FilterManager(Target target) {
		this.filterChain = new FilterChain();
		filterChain.setTarget(target);
	}

	public void addFilter(Filter filter) { // set is add
		filterChain.addFilter(filter);
	}

	public void filterRequest(String request) {
		filterChain.execute(request);
	}

}
