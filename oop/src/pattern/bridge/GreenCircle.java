/**
 * 
 */
package pattern.bridge;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 12:52:09 PM
 */
public class GreenCircle implements DrawAPI {

	/* (non-Javadoc)
	 * @see pattern.prototype.DrawAPI#drawCircle()
	 */
	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color : Green], radius: " + radius + ", x: " + x + ", y: " + y + "]");
	}

}
