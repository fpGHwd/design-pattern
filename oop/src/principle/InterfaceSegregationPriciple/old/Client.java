/**
 * 
 */
package principle.InterfaceSegregationPriciple.old;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 4:25:10 PM
 */
public class Client {
	public static void main(String[] args){
		A a = new A();
		a.depend1(new B());
		a.depend2(new B());
		a.depend3(new B());
		
		C c = new C();
		c.depend1(new D());
		c.depend2(new D());
		c.depend3(new D());
	}
}
