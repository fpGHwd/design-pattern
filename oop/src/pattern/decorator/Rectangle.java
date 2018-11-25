/**
 * 
 */
package pattern.decorator;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 2:23:32 PM
 */
public class Rectangle implements Shape {

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.decorator.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}

}
