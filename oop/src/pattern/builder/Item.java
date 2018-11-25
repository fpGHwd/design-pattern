package pattern.builder;

/**
 * @author Suzumiya
 * @version Nov 22, 2018 6:07:26 PM
 * 
 */

public interface Item extends Packing {
	public String name();
	public Packing packing();
	public float price();
}
