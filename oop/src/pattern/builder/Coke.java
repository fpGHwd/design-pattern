package pattern.builder;

/**
 * @author Suzumiya
 * @version Nov 22, 2018 6:31:42 PM
 * 
 */

public class Coke extends ColdDrink {

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public String pack() {
		return null;
	}

	@Override
	public float price() {
		return 30.0f;
	}

}
