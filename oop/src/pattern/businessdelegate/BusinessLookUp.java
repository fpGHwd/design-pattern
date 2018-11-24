package pattern.businessdelegate;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 9:00:43 PM
 * 
 */

public class BusinessLookUp {
	public BusinessService getBusinessService(String serviceType) {
		if (serviceType.equalsIgnoreCase("EJB")) {
			return new EJBService();
		} else {
			return new JMSService();
		}
	}
}
