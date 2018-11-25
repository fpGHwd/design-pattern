package pattern.compositeentity;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 9:15:16 PM
 * 
 */

public class CompositeEntiryPatternDemo {

	public static void main(String[] args) {
		Client client = new Client();
		client.setData("Test", "Data");
		client.printData();
		client.setData("Second Test", "Data1");
		client.printData();
	}

}
