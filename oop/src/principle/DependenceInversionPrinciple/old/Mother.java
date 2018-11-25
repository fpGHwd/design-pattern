/**
 * 
 */
package principle.DependenceInversionPrinciple.old;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 3:33:02 PM
 */
public class Mother {
	public void narrate(Book book){
		System.out.println("妈妈开始讲故事");
		System.out.println(book.getContent());
	}
}
