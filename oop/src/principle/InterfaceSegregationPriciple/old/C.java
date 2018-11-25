/**
 * 
 */
package principle.InterfaceSegregationPriciple.old;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 4:24:50 PM
 */
public class C {
	public void depend1(I i){
		i.method1();
	}
	public void depend2(I i){
		i.method4();
	}
	public void depend3(I i){
		i.method5();
	}
}
