/**
 * 
 */
package pattern.flyweight;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 2:58:18 PM
 */
public class Circle implements Shape {

	int x, y, radius;
	String color;

	/**
	 * 
	 */
	public Circle(String color) {
		this.color = color;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.flyweight.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Circle: Draw() [Colr : " + color + ", x : "
				+ x + ", y : " + y + ", radius : " + radius);
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}
