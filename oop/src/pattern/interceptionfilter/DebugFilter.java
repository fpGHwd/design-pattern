/**
 * 
 */
package pattern.interceptionfilter;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 11:42:28 PM
 */
public class DebugFilter implements Filter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.interceptionfilter.Filter#execute(java.lang.String)
	 */
	@Override
	public void execute(String request) {
		System.out.println(""
				+ "request log: " + request);
	}

}
