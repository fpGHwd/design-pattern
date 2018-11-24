/**
 * 
 */
package pattern.strategy;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 7:51:16 PM
 */
public class OperationMultiply implements Strategy {

	/* (non-Javadoc)
	 * @see pattern.strategy.Strategy#doOperation()
	 */
	@Override
	public int doOperation(int num1, int num2) {	
		return num1*num2;
	}

}
