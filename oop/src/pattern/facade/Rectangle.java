/**
 * 
 */
package pattern.facade;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 2:50:00 PM
 */
public class Rectangle implements Shape {

	/* (non-Javadoc)
	 * @see pattern.facade.Shape#draw()
	 */
	@Override
	public void draw() {

		System.out.println("Rectangle drawed");
	}

}
