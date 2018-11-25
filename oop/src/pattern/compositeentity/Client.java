package pattern.compositeentity;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 9:14:23 PM
 * 
 */

public class Client {
	private CompositeEntity compositeEntity = new CompositeEntity();

	public void printData() {
		for (int i = 0; i < compositeEntity.getData().length; i++) {
			System.out.println("Data: " + compositeEntity.getData()[i]);
		}
	}

	public void setData(String data1, String data2) {
		compositeEntity.setData(data1, data2);
	}
}
