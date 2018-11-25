/**
 * 
 */
package pattern.interpreter;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 5:32:59 PM
 */
public class OrExpression implements Expression {

	Expression expr1,expr2;
	
	/**
	 * 
	 */
	public OrExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	/* (non-Javadoc)
	 * @see pattern.interpreter.Expression#interpret()
	 */
	@Override
	public boolean interpret(String context) {
		return (expr1.interpret(context) || expr2.interpret(context));
	}

}
