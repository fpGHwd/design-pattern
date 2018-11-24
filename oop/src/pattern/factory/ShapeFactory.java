package pattern.factory;

import org.junit.Test;

/**
 * @author Suzumiya
 * @version Nov 20, 2018 9:41:59 AM
 * 
 */

public class ShapeFactory {
	public Shape getShape(String pattern) {

		if (pattern == null)
			return null;
		
		if(pattern.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}else if(pattern.equalsIgnoreCase("SQUARE")){
			return new Square();
		}else if(pattern.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}else{
			return null;
		}
	}
	
	@Test
	public void test(){
		Shape c = getShape("circle"); c.draw();
		Shape s = getShape("square"); s.draw();
		Shape r = getShape("rectangle"); r.draw();
		return;
	}
}
