package org.haim.springframwork.stackoverflow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceThatNeedsServiceInterface {
	// What to do here???
	//  @Autowired
	//  ServiceInterface service;
  	 
	 /*
	 * ServiceLocator lookup returns the desired implementation
	 * (ProductAService or ProductBService) 
	 */ 
 	 @Autowired
	 private ServiceLocator serviceLocatorFactoryBean;
	 
	 //Lets assume we got this from the web request 
	 public RequestContext context;
	 
	 public void useService() {
		  ServiceInterface service = serviceLocatorFactoryBean.lookup(context.getQualifier());
		  service.someMethod(); 		  
	  }
}
