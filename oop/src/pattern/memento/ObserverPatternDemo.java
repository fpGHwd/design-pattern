/**
 * 
 */
package pattern.memento;


// 均匀的分到每个类，让每个类都有意义，这就是设计模式吧
// 着重于对象的设计

/**
 * @author Suzumiya
 * @version Nov 24, 2018 7:10:18 PM
 */
public class ObserverPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new HexaObserver(subject);
		new OctalObserver(subject);
		new BinaryObserver(subject);
		
		System.out.println("First state change: 15");
		subject.setState(15);
		System.out.println("Second state change: 10");
		subject.setState(10);
	}

}
