/**
 * 
 */
package pattern.bridge;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 1:10:17 PM
 */
public class BridgePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape redCircle = new Circle(100,100,10,new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
	}

}
