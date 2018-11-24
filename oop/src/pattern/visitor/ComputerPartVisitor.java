/**
 * 
 */
package pattern.visitor;

// 我以前想得多的问题就是这类问题，现在要做的就是解决掉这类问题，然后向下一类问题出发。

/**
 * @author Suzumiya
 * @version Nov 24, 2018 8:07:34 PM
 */
public interface ComputerPartVisitor {
	public void visit(Computer computer);
	public void visit(Mouse mouse);
	public void visit(Keyboard keyboard);
	public void visit(Monitor monitor);
}
