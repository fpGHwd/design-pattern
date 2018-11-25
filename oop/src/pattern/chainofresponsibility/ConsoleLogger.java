/**
 * 
 */
package pattern.chainofresponsibility;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 3:45:34 PM
 */
public class ConsoleLogger extends AbstractLogger {

	/**
	 * 
	 */
	public ConsoleLogger(int level) {
		this.level = level;
	}

	/* (non-Javadoc)
	 * @see pattern.chainofresponsibility.AbstractLogger#write(java.lang.String)
	 */
	@Override
	public void write(String message) {

		System.out.println("Standard Console::Logger: " +message);
	}

}
