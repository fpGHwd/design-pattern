package pattern.builder;

/**
 * @author Suzumiya
 * @version Nov 22, 2018 6:32:29 PM
 * 
 */

public class Pepsi extends ColdDrink {

	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public String pack() {
		return null;
	}

	@Override
	public float price() {
		return 35.0f;
	}

}
