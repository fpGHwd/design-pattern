package pattern.frontcontrollerpattern;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 9:37:19 PM
 * 
 */

public class FrontControllerPatternDemo {

	public static void main(String[] args) {

		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
	}

	// 设计模式可能是算法的一个实际化。实际上任何东西都有联系。当然专注于自己当前做的，而是以前玄学的执念并没有完成应该更有意义。
	// 毕竟现在的认识比以前更加成熟了。
}
