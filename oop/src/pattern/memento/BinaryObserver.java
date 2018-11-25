/**
 * 
 */
package pattern.memento;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 7:00:03 PM
 */
public class BinaryObserver extends Observer {
	
	public BinaryObserver(Subject subject){
		this.subject = subject;
		subject.attach(this);
	}

	/* (non-Javadoc)
	 * @see pattern.memento.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("Binary String: " + Integer.toBinaryString(this.subject.getState()).toUpperCase());
	}

}
