/**
 * 
 */
package pattern.template;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 8:03:31 PM
 */
public class Football extends Game {

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.template.Game#initialize()
	 */
	@Override
	public void initialize() {
		System.out.println("Football Game Initialized! Start playing.");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.template.Game#startPlay()
	 */
	@Override
	public void startPlay() {
		System.out.println("Football Game Started. Enjoy the game!");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.template.Game#endPlay()
	 */
	@Override
	public void endPlay() {
		System.out.println("Football Game Finished!");

	}

}
