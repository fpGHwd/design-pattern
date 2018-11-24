/**
 * 
 */
package pattern.filterorcriteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 1:35:12 PM
 */
public class CriteriaSingle implements Criteria {

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.filterorcriteria.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> singlePersons = new ArrayList<Person>();
		for (Person person : persons) {
			if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
				singlePersons.add(person);
			}
		}
		return null;
	}

}
