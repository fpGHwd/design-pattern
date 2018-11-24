/**
 * 
 */
package pattern.interpreter;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 5:30:36 PM
 */
public class AndExpression implements Expression{
	Expression expr1, expr2;
	
	public AndExpression(Expression expr1, Expression expr2){
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
	
	public boolean interpret(String context){
		return (expr1.interpret(context) && expr2.interpret(context));
	}
	
}
