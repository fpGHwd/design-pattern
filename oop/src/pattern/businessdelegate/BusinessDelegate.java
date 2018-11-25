package pattern.businessdelegate;

/**
 * @author Suzumiya
 * @version Nov 24, 2018 9:01:55 PM
 * 
 */

public class BusinessDelegate {
	   private BusinessLookUp lookupService = new BusinessLookUp();
	   private BusinessService businessService;
	   private String serviceType;
	 
	   public void setServiceType(String serviceType){
	      this.serviceType = serviceType;
	   }
	 
	   public void doTask(){
	      businessService = lookupService.getBusinessService(serviceType);
	      businessService.doProcessing();     
	   }
}
