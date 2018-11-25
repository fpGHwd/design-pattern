/**
 * 
 */
package principle.InterfaceSegregationPriciple.refactor;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 4:28:42 PM
 */
public class C {
	public void depend1(I1 i){
		i.method1();
	}
	public void depend2(I3 i){
		i.method4();
	}
	public void depend3(I3 i){
		i.method5();
	}
}
