/**
 * 
 */
package pattern.bridge;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 12:51:41 PM
 */
public class RedCircle implements DrawAPI {

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.prototype.DrawAPI#drawCircle()
	 */
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color : red], radius: " + radius + ", x: " + x + ", y: " + y + "]");
	}

}
