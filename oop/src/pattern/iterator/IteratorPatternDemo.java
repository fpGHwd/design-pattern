/**
 * 
 */
package pattern.iterator;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 6:23:31 PM
 */
public class IteratorPatternDemo {

	public static void main(String[] args) {
		NameRepository namesRepository = new NameRepository();

		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}

}
