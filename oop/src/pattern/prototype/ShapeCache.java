/**
 * shapecache
 */
package pattern.prototype;

import java.util.Hashtable;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 11:47:14 AM
 */
public class ShapeCache {

	/**
	 * 
	 */
	public ShapeCache() {
	}
	
	// database
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();
	
	public static Shape getShape(String shapeId){
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}
	
	
	public static void loadCache(){
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
	}

}

// 把所有的问题都通过大脑说出来就可以了，这是一个很重要的方法
