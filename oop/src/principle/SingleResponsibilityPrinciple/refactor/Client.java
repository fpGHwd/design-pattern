/**
 * 
 */
package principle.SingleResponsibilityPrinciple.refactor;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 4:37:20 PM
 */
public class Client {
	public static void main(String[] args) {
		Terrestrial terrestrial = new Terrestrial();
		terrestrial.breathe("牛");
		terrestrial.breathe("羊");
		terrestrial.breathe("猪");

		Aquatic aquatic = new Aquatic();
		aquatic.breathe("鱼");
	}
}
