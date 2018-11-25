/**
 * 
 */
package pattern.decorator;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 2:35:24 PM
 */
public class DecoratorPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Shape circle = new Circle();

		Shape redCircle = new RedShapeDecorator(new Circle());

		Shape redRectangle = new RedShapeDecorator(new Rectangle());
		System.out.println("Circle with normal border");
		circle.draw();

		System.out.println("\nCircle of red border");
		redCircle.draw();

		System.out.println("\nRectangle of red border");
		redRectangle.draw();

	}

}
