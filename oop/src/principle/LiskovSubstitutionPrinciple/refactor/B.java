/**
 * 
 */
package principle.LiskovSubstitutionPrinciple.refactor;

import principle.LiskovSubstitutionPrinciple.old.A;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 3:51:29 PM
 */
public class B extends A {
	
	// 原因就是类B在给方法起名时无意中重写了父类的方法
	public int func1(int a, int b){
		return a + b;
	}
	
	public int func2(int a, int b){
		return func1(a, b) + 100;
	}
}
