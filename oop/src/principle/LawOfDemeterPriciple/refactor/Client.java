/**
 * 
 */
package principle.LawOfDemeterPriciple.refactor;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 4:04:04 PM
 */
public class Client {
	public static void main(String[] args){
		CompanyManager e = new CompanyManager();
		e.printAllEmployee(new SubCompanyManager());
	}
}
