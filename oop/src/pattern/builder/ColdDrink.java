package pattern.builder;

/**
 * @author Suzumiya
 * @version Nov 22, 2018 6:16:36 PM
 * 
 */

public abstract class ColdDrink implements Item {

	@Override
	public Packing packing() {
		return new Bottle();
	}

	@Override
	public abstract float price();

}
