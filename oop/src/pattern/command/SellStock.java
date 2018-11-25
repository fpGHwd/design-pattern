/**
 * 
 */
package pattern.command;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 5:15:12 PM
 */
public class SellStock implements Order {
	
	private Stock stock;

	/**
	 * 
	 */
	public SellStock(Stock stock) {
		this.stock = stock;
	}

	/* (non-Javadoc)
	 * @see pattern.command.Order#execute()
	 */
	@Override
	public void execute() {
		stock.sell();
	}

}
