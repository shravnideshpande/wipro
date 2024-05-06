package com.capstonepro.tenantservice.exception;

@SuppressWarnings("serial")
public class TenantModuleNotFoundException extends RuntimeException {
	
	public TenantModuleNotFoundException() {
		
	}
	
	public TenantModuleNotFoundException(String msg) {
		super(msg);
	}

}
