/**
 * 
 */
package pattern.proxy;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 3:19:40 PM
 */
public class ProxyImage implements Image {
	
	private RealImage realImage;
	private String fileName;
		
	/**
	 * 
	 */
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	/* (non-Javadoc)
	 * @see pattern.proxy.Image#display()
	 */
	@Override
	public void display() {
		if(realImage == null){
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
