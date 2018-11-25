/**
 * 
 */
package principle.LiskovSubstitutionPrinciple.refactor;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 3:52:53 PM
 */
public class Client {
	public static void main(String[] args){
		B b = new B();
		System.out.println("100-50="+b.func1(100, 50));
		System.out.println("100-80="+b.func1(100, 80));
		System.out.println("100+20+100="+b.func2(100, 20));
	}
}