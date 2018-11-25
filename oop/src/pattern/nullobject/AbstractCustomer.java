/**
 * 
 */
package pattern.nullobject;

//复杂的分布式人类系统中，任何定律都可能表现有大的偏差。

/**
 * @author Suzumiya
 * @version Nov 24, 2018 7:35:53 PM
 */
public abstract class AbstractCustomer {
	protected String name; // 这个不是公用或者共用
	
	public abstract boolean isNil();
	public abstract String getName();  //这个方法就是让后面的类不要忘了这个属性，所以不用实现
}
