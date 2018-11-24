/**
 * 
 */
package pattern.visitor;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 8:13:46 PM
 */
public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
