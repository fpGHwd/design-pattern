/**
 * 
 */
package pattern.interceptionfilter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 11:44:37 PM
 */
public class FilterChain {
	
	private List<Filter> filters = new ArrayList<Filter>();
	private Target target;
	
	public void addFilter(Filter filter){
		filters.add(filter);
	}
	
	public void execute(String request){
		for(Filter filter:this.filters){
			filter.execute(request);
		}
		this.target.execute(request);
	}
	
	public void setTarget(Target target){
		this.target = target;
	}

}
