/**
 * 
 */
package principle.SingleResponsibilityPrinciple.refactor1;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 4:39:37 PM
 */
public class Client {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.breathe("牛");
		animal.breathe("羊");
		animal.breathe("猪");
		animal.breathe("鱼");
	}
}
