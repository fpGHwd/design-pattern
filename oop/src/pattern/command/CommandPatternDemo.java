/**
 * 
 */
package pattern.command;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 5:17:13 PM
 */
public class CommandPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	      Stock abcStock = new Stock();
	      
	      BuyStock buyStockOrder = new BuyStock(abcStock);
	      SellStock sellStockOrder = new SellStock(abcStock);
	 
	      Broker broker = new Broker();
	      broker.takeOrder(buyStockOrder);
	      broker.takeOrder(sellStockOrder);
	 
	      broker.placeOrders();

	}

}
