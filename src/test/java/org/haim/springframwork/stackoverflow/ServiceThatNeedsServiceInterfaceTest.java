package org.haim.springframwork.stackoverflow;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/applicationContext.xml" })
public class ServiceThatNeedsServiceInterfaceTest {

	@Autowired
	ServiceThatNeedsServiceInterface serviceThatNeedsServiceInterface;

	@Test
	public void testUseService() {
		//As we are not running from a web container we set the context directly to the service 
		RequestContext context = new RequestContext();
		context.setQualifier("ProductAService");
		serviceThatNeedsServiceInterface.context = context;
		serviceThatNeedsServiceInterface.useService();
		
		context.setQualifier("ProductBService");
		serviceThatNeedsServiceInterface.context = context;
		serviceThatNeedsServiceInterface.useService();
		
		serviceThatNeedsServiceInterface.useService();
	}

}
