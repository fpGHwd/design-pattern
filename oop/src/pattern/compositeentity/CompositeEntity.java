package pattern.compositeentity;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 9:13:57 PM
 * 
 */

public class CompositeEntity {
	private CoarseGrainedObject cgo = new CoarseGrainedObject();

	public void setData(String data1, String data2) {
		cgo.setData(data1, data2);
	}

	public String[] getData() {
		return cgo.getData();
	}
}
