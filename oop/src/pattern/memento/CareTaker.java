/**
 * 
 */
package pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 6:42:00 PM
 */
public class CareTaker {
	List<Memento> mementos = new ArrayList<Memento>();
	
	 public void add(Memento memento){
		 mementos.add(memento);
	 }
	 
	 public Memento get(int index){
		 return mementos.get(index);
	 }
}
