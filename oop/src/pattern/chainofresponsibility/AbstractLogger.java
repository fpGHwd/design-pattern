/**
 * 
 */
package pattern.chainofresponsibility;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 3:36:47 PM
 */
public abstract class AbstractLogger {

	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;

	protected int level;

	protected AbstractLogger nextLogger;

	public void setNextLogger(AbstractLogger nextLogger) {
		this.nextLogger = nextLogger;
	};

	public void logMessage(int level, String message) {
		if (this.level <= level) {
			this.write(message); // this method
		}
		if (nextLogger != null) {
			nextLogger.logMessage(level, message);
		}
	};

	public abstract void write(String message); // sub-class has this method
}
