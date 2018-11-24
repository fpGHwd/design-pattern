package pattern.businessdelegate;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 9:03:58 PM
 * 
 */

public class BusinessDelegatePatternDemo {
	public static void main(String[] args) {

		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");

		Client client = new Client(businessDelegate);
		client.doTask();

		businessDelegate.setServiceType("JMS");
		client.doTask();
	}

}
