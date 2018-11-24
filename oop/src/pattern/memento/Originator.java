/**
 * 
 */
package pattern.memento;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 6:38:53 PM
 */
public class Originator {

	private String state;
	
	public void setState(String state){
		this.state = state;
	}
	
	public String getState(){
		return this.state;
	}
	
	public Memento saveStateToMemento(){
		return new Memento(this.state);
	}
	
	public void getStateFromMemento(Memento memento){
//		System.out.println( memento.getState());
		state = memento.getState();
	}
}
