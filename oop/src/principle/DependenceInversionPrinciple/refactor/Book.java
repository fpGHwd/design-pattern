/**
 * 
 */
package principle.DependenceInversionPrinciple.refactor;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 3:39:17 PM
 */
public class Book implements IReader {

	/* (non-Javadoc)
	 * @see priciple.DependenceInversionPrinciple.add.IReader#getContent()
	 */
	@Override
	public String getContent() {
		return "很久很久以前有一个阿拉伯的故事……";
	}

}
