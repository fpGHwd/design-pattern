/**
 * 
 */
package principle.LiskovSubstitutionPrinciple.old;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 3:47:03 PM
 */
public class Client {
	public static void main(String[] args) {
		A a = new A();
		System.out.println("100 - 50 = " + a.func1(100, 50));
		System.out.println("100 - 80 = " + a.func1(100, 80));
	}
}
