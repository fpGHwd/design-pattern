/**
 * 
 */
package pattern.flyweight;

import java.util.HashMap;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 3:00:14 PM
 */
public class ShapeFactory {

	private static final HashMap<String, Shape> circleMap = new HashMap<>();

	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);
		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}

}
