/**
 * 
 */
package pattern.visitor;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 8:16:11 PM
 */
public class Mouse implements ComputerPart {

	/* (non-Javadoc)
	 * @see pattern.visitor.ComputerPart#accept()
	 */
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
