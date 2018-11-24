/**
 * 
 */
package pattern.servicelocator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Suzumiya
 * @version Nov 25, 2018 12:02:46 AM
 */
public class Cache {
	private List<Service> services;
	
	
	public Cache(){
		services = new ArrayList<Service>(); // or put in class domain
	}
	
	public Service getService(String serviceName){
		for(Service service:services){
			if(serviceName.equalsIgnoreCase(service.getName())){
				System.out.println("Returning cached  "+serviceName+" object");
				return service;
			}
		}
		return null;
	}
	
	public void addService(Service newService){
		boolean exists = false;
		for(Service service:services){
			if(newService.getName().equalsIgnoreCase(service.getName())){
				exists = true;
			}
		}
		if(!exists){
			services.add(newService);
		}
	}
}
