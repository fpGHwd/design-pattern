/**
 * 
 */
package pattern.template;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 8:03:16 PM
 */
public class Cricket extends Game {

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.template.Game#initialize()
	 */
	@Override
	public void initialize() {
		System.out.println("Cricket Game Initialized! Start playing.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.template.Game#startPlay()
	 */
	@Override
	public void startPlay() {
		System.out.println("Cricket Game Started. Enjoy the game!");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.template.Game#endPlay()
	 */
	@Override
	public void endPlay() {
		System.out.println("Cricket Game Finished!");
	}

}
