/**
 * 
 */
package principle.InterfaceSegregationPriciple.refactor;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 4:27:17 PM
 */
public class A {
	public void depend1(I1 i){
		i.method1();
	}
	public void depend2(I2 i){
		i.method2();
	}
	public void depend3(I2 i){
		i.method3();
	}
}
