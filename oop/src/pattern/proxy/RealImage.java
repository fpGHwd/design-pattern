/**
 * 
 */
package pattern.proxy;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 3:17:28 PM
 */
public class RealImage implements Image {

	private String fileName;
	// 很久之前就认为属性和方法差不了多少，现在一致化过后更差不了多少了
	// 认为方法应该展示属性，比如get()set()方法其实就是这样

	/**
	 * 
	 */
	public RealImage(String fileName) {
		this.fileName = fileName;
		this.loadFromDisk(fileName);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.proxy.Image#display()
	 */
	@Override
	public void display() {
		System.out.println("Displaying " + this.fileName);
	}

	private void loadFromDisk(String fileName) {
		System.out.println("Loading " + this.fileName);
	}

}
