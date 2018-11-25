/**
 * 
 */
package pattern.facade;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 2:50:34 PM
 */
public class ShapeMaker {
	
	private Circle circle;
	private Rectangle rectangle;
	private Square square;

	/**
	 * 
	 */
	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}
	
	public void drawCircle(){
		circle.draw();
	}
	
	public void drawRectangle(){
		rectangle.draw();
	}
	
	public void drawSquare(){
		square.draw();
	}

}
