/**
 * 
 */
package principle.InterfaceSegregationPriciple.old;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 4:19:10 PM
 */
public class B implements I {

	/* (non-Javadoc)
	 * @see principle.InterfaceSegregationPriciple.old.I#method1()
	 */
	@Override
	public void method1() {
		System.out.println("类B实现接口I的方法1");
	}

	/* (non-Javadoc)
	 * @see principle.InterfaceSegregationPriciple.old.I#method2()
	 */
	@Override
	public void method2() {
		System.out.println("类B实现接口I的方法2");
	}

	/* (non-Javadoc)
	 * @see principle.InterfaceSegregationPriciple.old.I#method3()
	 */
	@Override
	public void method3() {
		System.out.println("类B实现接口I的方法3");

	}

	
	//对于类B来说，method4和method5不是必需的，但是由于接口A中有这两个方法，
		//所以在实现过程中即使这两个方法的方法体为空，也要将这两个没有作用的方法进行实现。
	/* (non-Javadoc)
	 * @see principle.InterfaceSegregationPriciple.old.I#method4()
	 */
	@Override
	public void method4() {

	}

	/* (non-Javadoc)
	 * @see principle.InterfaceSegregationPriciple.old.I#method5()
	 */
	@Override
	public void method5() {

	}

}
