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

}
