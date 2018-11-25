/**
 * 
 */
package pattern.proxy;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 3:21:19 PM
 */
public class ProxyPatternDemo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Image image = new ProxyImage("test_10mb.jpg");
		image.display();
		System.out.println("");
		
		image.display(); // 缓存一样的意思==代理
	}

}
