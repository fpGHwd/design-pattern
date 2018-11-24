/**
 * 
 */
package pattern.memento;

import java.util.ArrayList;
import java.util.List;

// 知道自己需要什么，并去立即追逐。我就不会像现在这样了。

/**
 * @author Suzumiya
 * @version Nov 24, 2018 6:54:22 PM
 */
public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	public int getState(){
		return state;
	}
	
	public void setState(int state){
		this.state = state;
		notifyAllObservers();
	}
	
	public void attach(Observer observer){
		this.observers.add(observer);
	}
	
	public void notifyAllObservers(){
		for(Observer observer:observers){
			observer.update();
		}
	}
}
