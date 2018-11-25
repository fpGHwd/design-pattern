/**
 * 
 */
package pattern.mediator;

import java.util.Date;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 6:30:29 PM
 */
public class ChatRoom {
	public static void showMessage(User user, String message) {
		System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
	}
}
