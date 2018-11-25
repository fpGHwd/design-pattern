/**
 * 
 */
package principle.LawOfDemeterPriciple.old;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 4:02:34 PM
 */
public class SubCompanyManager {
	public List<SubEmployee> getAllEmployee() {
		List<SubEmployee> list = new ArrayList<SubEmployee>();
		for (int i = 0; i < 100; i++) {
			SubEmployee emp = new SubEmployee();
			// 为分公司人员按顺序分配一个ID
			emp.setId("分公司" + i);
			list.add(emp);
		}
		return list;
	}
}
