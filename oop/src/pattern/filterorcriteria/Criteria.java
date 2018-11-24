/**
 * 
 */
package pattern.filterorcriteria;

import java.util.List;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 1:26:55 PM
 */
public interface Criteria {
	List<Person> meetCriteria(List<Person> persons);
}
