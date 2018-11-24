/**
 * 
 */
package pattern.visitor;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 8:16:30 PM
 */
public class Monitor implements ComputerPart {

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.visitor.ComputerPart#accept()
	 */
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}
