/**
 * 
 */
package pattern.template;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 8:06:15 PM
 */
public class TemplatePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) { // nice
	      Game game = new Cricket();
	      game.play();
	      System.out.println();
	      game = new Football();
	      game.play();  
	}

}
