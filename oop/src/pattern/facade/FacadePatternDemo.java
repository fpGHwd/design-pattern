/**
 * 
 */
package pattern.facade;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 2:53:48 PM
 */
public class FacadePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();
		
		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
		
	}

}
