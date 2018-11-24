/**
 * 
 */
package pattern.interceptionfilter;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 11:43:13 PM
 */
public class Target {
	public void execute(String request){
		System.out.println("Executing request" + request);
	}
}
