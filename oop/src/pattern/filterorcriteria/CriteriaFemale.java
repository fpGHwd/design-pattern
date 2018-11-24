/**
 * 
 */
package pattern.filterorcriteria;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 1:33:26 PM
 */
public class CriteriaFemale implements Criteria {

	/* (non-Javadoc)
	 * @see pattern.filterorcriteria.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femalePersons = new ArrayList<Person>();
		for(Person person:persons){
			if(person.getGender().equalsIgnoreCase("FEMAIL")){
				femalePersons.add(person);
			}
		}
		return null;
	}

}
