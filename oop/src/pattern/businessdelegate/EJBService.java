package pattern.businessdelegate;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 8:59:15 PM
 * 
 */

public class EJBService implements BusinessService {

	@Override
	public void doProcessing() {
		 System.out.println("Processing task by invoking EJB Service");
	}

}
