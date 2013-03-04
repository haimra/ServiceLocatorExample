package org.haim.springframwork.stackoverflow;

import org.springframework.stereotype.Component;

@Component
// @Scope( value = WebApplicationContext.SCOPE_REQUEST )
public class RequestContext {
	private String qualifier;

	public String getSomeQualifierProperty() {
		return qualifier;
	}

	public String getQualifier() {
		return qualifier;
	}

	public void setQualifier(String qualifier) {
		this.qualifier = qualifier;
	}

}