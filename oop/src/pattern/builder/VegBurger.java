package pattern.builder;

/**
 * @author Suzumiya
 * @version Nov 22, 2018 6:17:49 PM
 * 
 */

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "Veg Burger";
	}


	@Override
	public float price() {
		return 25.0f;
	}

	
	@Override
	public String pack() {
		return null;
	}

}
