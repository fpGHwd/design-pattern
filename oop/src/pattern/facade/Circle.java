/**
 * 
 */
package pattern.facade;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 2:49:32 PM
 */
public class Circle implements Shape {

	/* (non-Javadoc)
	 * @see pattern.facade.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Circle drawed");
	}

}
