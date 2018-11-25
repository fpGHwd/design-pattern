/**
 * 
 */
package pattern.bridge;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 12:58:37 PM
 */
public abstract class Shape implements DrawAPI {
	
	protected DrawAPI drawAPI;
	
	protected Shape(DrawAPI drawAPI){
		this.drawAPI = drawAPI;
	}

	public abstract void draw();

}
