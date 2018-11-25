/**
 * 
 */
package pattern.command;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 5:13:28 PM
 */
public class Stock {
	public String name = "ABC";
	public int quantity = 10;
	
	public void buy(){
		System.out.println("Stock [ Name: "+name+", " + 
		         "Quantity: " + quantity +" ] bought");
	}
	
	public void sell(){
		System.out.println("Stock [ Name: "+name+", "+
		         "Quantity: " + quantity +" ] sold");
	}
	
}
