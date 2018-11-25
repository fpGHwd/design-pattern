package pattern.builder;

/**
 * @author Suzumiya
 * @version Nov 22, 2018 6:13:43 PM
 * 
 */

public abstract class Burger implements Item {

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();

}
