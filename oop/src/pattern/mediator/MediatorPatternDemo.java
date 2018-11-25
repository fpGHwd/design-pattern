/**
 * 
 */
package pattern.mediator;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 6:32:33 PM
 */
public class MediatorPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		User robert = new User("Robert");
		User john = new User("John");
		
		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
		
	}

}
