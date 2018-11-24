/**
 * 
 */
package pattern.decorator;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 2:39:19 PM
 */
public class RedShapeDecorator extends ShapeDecorator {

	/**
	 * @param decoratedShape
	 */
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override
	public void draw(){
		decoratedShape.draw(); // overide还是执行父抽象类的星座
		setRedBorder(decoratedShape);
	}
	
	private void setRedBorder(Shape decoratedShape){
		System.out.println("Border Color: Red");
	}
	
}
