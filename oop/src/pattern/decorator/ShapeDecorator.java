/**
 * 
 */
package pattern.decorator;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 2:34:17 PM
 */
public abstract class ShapeDecorator implements Shape {

	protected Shape decoratedShape; // 在抽象类中添加高层信息//所以还是高层的部分
	
	/**
	 * 
	 */
	public ShapeDecorator(Shape decoratedShape) {
		this.decoratedShape = decoratedShape;
	}

	/* (non-Javadoc)
	 * @see pattern.decorator.Shape#draw()
	 */
	@Override
	public void draw() {
		decoratedShape.draw();
	}

}
