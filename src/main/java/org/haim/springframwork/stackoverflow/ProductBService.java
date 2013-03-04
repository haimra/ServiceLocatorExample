package org.haim.springframwork.stackoverflow;

import org.springframework.stereotype.Component;

@Component("ProductBService")
public class ProductBService implements ServiceInterface {

	public void someMethod() {
	    System.out.println("Hello, B Service"); 	
	}

	
}
