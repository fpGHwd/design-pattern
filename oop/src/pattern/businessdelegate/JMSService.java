package pattern.businessdelegate;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 8:59:48 PM
 * 
 */

public class JMSService implements BusinessService {

	@Override
	public void doProcessing() {
		System.out.println("Processing task by invoking JMS Service");
	}

}
