/**
 * 
 */
package pattern.strategy;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 7:50:18 PM
 */
public class OperationAdd implements Strategy {

	/* (non-Javadoc)
	 * @see pattern.strategy.Strategy#doOperation()
	 */
	@Override
	public int doOperation(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 +num2;
	}

}
