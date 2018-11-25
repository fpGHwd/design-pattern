/**
 * 
 */
package principle.DependenceInversionPrinciple.old;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 3:34:03 PM
 */
public class Client {
	public static void main(String[] args){
		Mother mother = new Mother();
		mother.narrate(new Book());
	}
}
