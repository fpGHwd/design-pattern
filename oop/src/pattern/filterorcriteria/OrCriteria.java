/**
 * 
 */
package pattern.filterorcriteria;

import java.util.List;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 1:42:37 PM
 */
public class OrCriteria implements Criteria {
	
	private Criteria criteria1;
	private Criteria criteria2;
	
	public OrCriteria(Criteria criteria1, Criteria criteria2){
		this.criteria1 = criteria1;
		this.criteria2 = criteria2;
	}
	

	/* (non-Javadoc)
	 * @see pattern.filterorcriteria.Criteria#meetCriteria(java.util.List)
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> criteria1Items = criteria1.meetCriteria(persons);
		List<Person> criteria2Items = criteria2.meetCriteria(persons);
		
		for(Person person:criteria1Items){
			if(!criteria2Items.contains(person)){
				criteria2Items.add(person);
			}
		}
		return criteria2Items;
	}

}
