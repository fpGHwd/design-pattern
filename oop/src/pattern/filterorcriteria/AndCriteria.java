/**
 * 
 */
package pattern.filterorcriteria;

import java.util.List;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 1:36:54 PM
 */
public class AndCriteria implements Criteria {

	private Criteria criteria1;
	private Criteria criteria2;

	public AndCriteria(Criteria criteria1, Criteria criterial2) {
		this.criteria1 = criteria1;
		this.criteria2 = criteria2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pattern.filterorcriteria.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> criteria1Persons = criteria1.meetCriteria(persons);
		return criteria2.meetCriteria(criteria1Persons);
	}

}
