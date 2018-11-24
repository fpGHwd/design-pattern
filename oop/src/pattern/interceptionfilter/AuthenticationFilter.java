/**
 * 
 */
package pattern.interceptionfilter;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 11:41:53 PM
 */
public class AuthenticationFilter implements Filter {

	/* (non-Javadoc)
	 * @see pattern.interceptionfilter.Filter#execute(java.lang.String)
	 */
	@Override
	public void execute(String request) {
		System.out.println("Authenticating request: " + request);
	}

}
