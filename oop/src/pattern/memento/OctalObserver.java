/**
 * 
 */
package pattern.memento;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 7:01:09 PM
 */
public class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		this.subject = subject;
		subject.attach(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.memento.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("Octal String: " + Integer.toOctalString(this.subject.getState()));
	}

}
