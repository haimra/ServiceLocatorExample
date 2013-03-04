package org.haim.springframwork.stackoverflow;

public interface ServiceLocator {
	public ServiceInterface lookup(String serviceName);
}
