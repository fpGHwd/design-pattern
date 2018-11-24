package pattern.businessdelegate;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 9:02:53 PM
 * 
 */

public class Client {
	BusinessDelegate businessService;

	public Client(BusinessDelegate businessService) {
		this.businessService = businessService;
	}

	public void doTask() {
		businessService.doTask();
	}
}
