/**
 * 
 */
package pattern.interpreter;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 5:28:28 PM
 */
public class TerminalExpression implements Expression {

	private String data;
	
	public TerminalExpression(String data){
		this.data = data;
	}
	
	/* (non-Javadoc)
	 * @see pattern.interpreter.Expression#interpret()
	 */
	@Override
	public boolean interpret(String context) {
		if(context.contains(data)){
			return true;
		}else{
			return false;
		}

	}

}
