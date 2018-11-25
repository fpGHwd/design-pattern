package pattern.builder;

/**
 * @author Suzumiya
 * @version Nov 22, 2018 6:30:37 PM
 * 
 */

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "Chicken Burger";
	}

	@Override
	public String pack() {
		return null;
	}

	@Override
	public float price() {
		return 50.5f;
	}

}
