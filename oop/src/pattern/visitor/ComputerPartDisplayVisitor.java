/**
 * 
 */
package pattern.visitor;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 8:12:56 PM
 */
public class ComputerPartDisplayVisitor implements ComputerPartVisitor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * pattern.template.ComputerPartVisitor#visit(pattern.template.Computer)
	 */
	@Override
	public void visit(Computer computer) {
		System.out.println("Displaying Computer.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.template.ComputerPartVisitor#visit(pattern.template.Mouse)
	 */
	@Override
	public void visit(Mouse mouse) {
		System.out.println("Displaying Mouse.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * pattern.template.ComputerPartVisitor#visit(pattern.template.Keyboard)
	 */
	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Displaying Keyboard.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.template.ComputerPartVisitor#visit(pattern.template.Monitor)
	 */
	@Override
	public void visit(Monitor monitor) {
		System.out.println("Displaying Monitor.");
	}

}
