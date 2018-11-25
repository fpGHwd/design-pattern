/**
 * 
 */
package principle.SingleResponsibilityPrinciple.refactor2;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 4:41:01 PM
 */
public class Animal {
	/*
	 * 可以看到，这种修改方式没有改动原来的方法，而是在类中新加了一个方法，这样虽然也违背了
	 * 单一职责原则，但在方法级别上却是符合单一职责原则的，因为它并没有动原来方法的代码。
	 */
	public void breathe(String animal) {
		System.out.println(animal + "呼吸空气");
	}

	public void breathe2(String animal) {
		System.out.println(animal + "呼吸水");
	}
}
