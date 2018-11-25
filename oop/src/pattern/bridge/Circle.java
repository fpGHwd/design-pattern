/**
 * 
 */
package pattern.bridge;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 1:03:12 PM
 */
public class Circle extends Shape {
	private int x, y, radius;

	/**
	 * @param drawAPI
	 */
	public Circle(int x, int y, int radius, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.bridge.Shape#draw()
	 */
	@Override
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}

	/* (non-Javadoc)
	 * @see pattern.bridge.DrawAPI#drawCircle(int, int, int)
	 */
	@Override
	public void drawCircle(int radius, int x, int y) {
		
	}

}
