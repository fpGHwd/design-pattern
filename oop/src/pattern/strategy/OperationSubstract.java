/**
 * 
 */
package pattern.strategy;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 7:50:57 PM
 */
public class OperationSubstract implements Strategy {

	/* (non-Javadoc)
	 * @see pattern.strategy.Strategy#doOperation()
	 */
	@Override
	public int doOperation(int num1, int num3) { //参数名字和接口不一样并不报错
		// TODO Auto-generated method stub
		return num1-num3;
	}

}
