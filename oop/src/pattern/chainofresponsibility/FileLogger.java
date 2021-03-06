/**
 * 
 */
package pattern.chainofresponsibility;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 3:48:09 PM
 */
public class FileLogger extends AbstractLogger {

	/**
	 * 
	 */
	public FileLogger(int level) {
		this.level = level;
	}

	/* (non-Javadoc)
	 * @see pattern.chainofresponsibility.AbstractLogger#write(java.lang.String)
	 */
	@Override
	public void write(String message) {
		System.out.println("File::Logger: " + message);

	}

}
