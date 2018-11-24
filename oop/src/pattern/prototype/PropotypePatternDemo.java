/**
 * 
 */
package pattern.prototype;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 11:55:15 AM
 */
public class PropotypePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		for(int i = 1; i <= 3; i++){
			Shape clonedShape = (Shape)ShapeCache.getShape(String.valueOf(i));
			System.out.println("Shape : " + clonedShape.getType());
		}
	}

}
