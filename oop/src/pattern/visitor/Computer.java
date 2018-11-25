/**
 * 
 */
package pattern.visitor;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 8:16:54 PM
 */
public class Computer implements ComputerPart {
	private ComputerPart[] computerParts;
	
	public Computer(){
		computerParts = new ComputerPart[]{new Keyboard(), new Mouse(), new Monitor()}; //差点对了啊
	}

	/* (non-Javadoc)
	 * @see pattern.visitor.ComputerPart#accept()
	 */
	public void accept(ComputerPartVisitor computerPartVisitor) {
		for(ComputerPart computerPart:computerParts){
			computerPart.accept(computerPartVisitor);
		}
		computerPartVisitor.visit(this);
	}

}
