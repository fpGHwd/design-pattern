/**
 * 
 */
package pattern.strategy;

// 这个模式来平衡内部太多的if-else结构

/**
 * @author Suzumiya
 * @version Nov 24, 2018 7:49:21 PM
 */
public interface Strategy {
	public int doOperation(int num1, int num2);
}
