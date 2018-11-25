/**
 * 
 */
package principle.InterfaceSegregationPriciple.refactor;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 4:28:07 PM
 */
public class B implements I1, I2 {

	/*
	 * (non-Javadoc)
	 * 
	 * @see principle.InterfaceSegregationPriciple.refactor.I2#method2()
	 */
	@Override
	public void method2() {
		System.out.println("类B实现接口I2的方法2");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see principle.InterfaceSegregationPriciple.refactor.I2#method3()
	 */
	@Override
	public void method3() {
		System.out.println("类B实现接口I2的方法3");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see principle.InterfaceSegregationPriciple.refactor.I1#method1()
	 */
	@Override
	public void method1() {
		System.out.println("类B实现接口I1的方法1");
	}

}
