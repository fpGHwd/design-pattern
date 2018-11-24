/**
 * 
 */
package pattern.memento;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 7:01:26 PM
 */
public class HexaObserver extends Observer {
	
	public HexaObserver(Subject subject){
		this.subject = subject;
		subject.attach(this);
	}

	/* (non-Javadoc)
	 * @see pattern.memento.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("Hexal String: "+ Integer.toHexString(this.subject.getState()));
	}

}
