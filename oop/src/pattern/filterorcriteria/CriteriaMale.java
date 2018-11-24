/**
 * 
 */
package pattern.filterorcriteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 1:29:58 PM
 */
public class CriteriaMale implements Criteria {

	/* (non-Javadoc)
	 * @see pattern.filterorcriteria.Criteria#meetCriteria()
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> malePersons = new ArrayList<Person>();
		for(Person person:persons){
			if(person.getGender().equalsIgnoreCase("MALE")){
				malePersons.add(person);
			}
		}
		return null;
	}

}
