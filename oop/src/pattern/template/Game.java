/**
 * 
 */
package pattern.template;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 7:59:16 PM
 */
public abstract class Game {
	public abstract void initialize();
	public abstract void startPlay();
	public abstract void endPlay();
	
	// template体现在这里
	public final void play(){
		initialize();
		startPlay();
		endPlay();
	}
}
