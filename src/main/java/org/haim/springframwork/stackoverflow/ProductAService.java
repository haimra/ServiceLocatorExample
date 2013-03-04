package org.haim.springframwork.stackoverflow;

import org.springframework.stereotype.Component;

@Component("ProductAService")
public class ProductAService implements ServiceInterface {

	public void someMethod() {
		 System.out.println("Hello, A Service");
	}

	
}
