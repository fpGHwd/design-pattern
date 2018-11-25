/**
 * 
 */
package principle.SingleResponsibilityPrinciple.refactor1;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 4:38:31 PM
 */
public class Animal {

	// 花销 == 修改。
	/*
	 * 蕴含的假设： 修改原有的东西总是成本很大，而添加（继承和接口）就会很简单。
	 * 
	 */

	/*
	 * 可以看到，这种修改方式要简单的多。但是却存在着隐患：有一天需要将鱼分为呼吸
	 * 淡水的鱼和呼吸海水的鱼，则又需要修改Animal类的breathe方法，
	 */
	// 带上了人如何分类水生动物和陆生动物的因素，将会很复杂。就一个指标，包含什么的因素
	public void breathe(String animal) {
		if ("鱼".equals(animal)) {
			System.out.println(animal + "呼吸水");
		} else {
			System.out.println(animal + "呼吸空气");
		}
	}
}
