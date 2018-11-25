/**
 * 
 */
package pattern.command;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 5:12:41 PM
 */
public class BuyStock implements Order {
	
	private Stock stock;

	/**
	 * 
	 */
	public BuyStock(Stock stock) {
		this.stock = stock;
		
	}

	/* (non-Javadoc)
	 * @see pattern.command.Order#execute()
	 */
	@Override
	public void execute() {
		stock.buy();

	}

}
