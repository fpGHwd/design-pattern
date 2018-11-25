/**
 * 
 */
package principle.InterfaceSegregationPriciple.old;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 4:23:57 PM
 */
public class A {
	// 接口就是一个接口（实体）规范的东西，很容易想象。任一点都可以抽象。
	public void depend1(I i){
		i.method1();
	}
	public void depend2(I i){
		i.method2();
	}
	public void depend3(I i){
		i.method3();
	}

}
