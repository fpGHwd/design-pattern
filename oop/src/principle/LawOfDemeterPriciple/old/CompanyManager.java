/**
 * 
 */
package principle.LawOfDemeterPriciple.old;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 4:03:20 PM
 */
public class CompanyManager {
	public List<Employee> getAllEmployee(){
		List<Employee> list = new ArrayList<Employee>();
		for(int i=0; i<30; i++){
			Employee emp = new Employee();
			//为总公司人员按顺序分配一个ID
			emp.setId("总公司"+i);
			list.add(emp);
		}
		return list;
	}
	
	// ?
	public void printAllEmployee(SubCompanyManager sub){
		List<SubEmployee> list1 = sub.getAllEmployee();
		for(SubEmployee e:list1){
			System.out.println(e.getId());
		}
 
		List<Employee> list2 = this.getAllEmployee();
		for(Employee e:list2){
			System.out.println(e.getId());
		}
	}
}
