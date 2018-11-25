/**
 * 
 */
package pattern.chainofresponsibility;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 3:46:45 PM
 */
public class ErrorLogger extends AbstractLogger {

	/**
	 * 
	 */
	public ErrorLogger(int level) {
		this.level = level;
	}

	/* (non-Javadoc)
	 * @see pattern.chainofresponsibility.AbstractLogger#write(java.lang.String)
	 */
	@Override
	public void write(String message) {
		System.out.println("Error::Logger: "+ message);
	}
}
