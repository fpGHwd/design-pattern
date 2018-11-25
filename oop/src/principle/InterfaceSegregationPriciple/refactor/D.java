/**
 * 
 */
package principle.InterfaceSegregationPriciple.refactor;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 4:29:42 PM
 */
public class D implements I1, I3 {

	/* (non-Javadoc)
	 * @see principle.InterfaceSegregationPriciple.refactor.I3#method4()
	 */
	@Override
	public void method4() {
		System.out.println("类D实现接口I3的方法4");
	}

	/* (non-Javadoc)
	 * @see principle.InterfaceSegregationPriciple.refactor.I3#method5()
	 */
	@Override
	public void method5() {
		System.out.println("类D实现接口I3的方法5");
	}

	/* (non-Javadoc)
	 * @see principle.InterfaceSegregationPriciple.refactor.I1#method1()
	 */
	@Override
	public void method1() {
		System.out.println("类D实现接口I1的方法1");
	}

}
