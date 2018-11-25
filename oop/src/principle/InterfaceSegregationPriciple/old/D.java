/**
 * 
 */
package principle.InterfaceSegregationPriciple.old;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 4:22:41 PM
 */
public class D implements I {

	/*
	 * (non-Javadoc)
	 * 
	 * @see principle.InterfaceSegregationPriciple.old.I#method1()
	 */
	@Override
	public void method1() {
		System.out.println("类D实现接口I的方法1");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see principle.InterfaceSegregationPriciple.old.I#method2()
	 */
	@Override
	public void method2() {

	}

	// 对于类D来说，method2和method3不是必需的，但是由于接口A中有这两个方法，
	// 所以在实现过程中即使这两个方法的方法体为空，也要将这两个没有作用的方法进行实现。
	/*
	 * (non-Javadoc)
	 * 
	 * @see principle.InterfaceSegregationPriciple.old.I#method3()
	 */
	@Override
	public void method3() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see principle.InterfaceSegregationPriciple.old.I#method4()
	 */
	@Override
	public void method4() {
		System.out.println("类D实现接口I的方法4");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see principle.InterfaceSegregationPriciple.old.I#method5()
	 */
	@Override
	public void method5() {
		System.out.println("类D实现接口I的方法5");
	}

}
