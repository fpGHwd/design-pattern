/**
 * 
 */
package principle.DependenceInversionPrinciple.refactor;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 3:41:39 PM
 */
public class Client {
	public static void main(String[] args){
		Mother mother = new Mother();
		mother.narrate(new Book());
		mother.narrate(new Newspaper());
	}
}
