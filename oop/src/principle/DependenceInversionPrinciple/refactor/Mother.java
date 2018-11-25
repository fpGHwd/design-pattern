/**
 * 
 */
package principle.DependenceInversionPrinciple.refactor;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 3:39:55 PM
 */
public class Mother {
	public void narrate(IReader iReader){
		System.out.println("Mother starts telling a story");
		System.out.println(iReader.getContent());
	}
}
