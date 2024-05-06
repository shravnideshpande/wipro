package com.capstonepro.tenantservice.service;

import java.util.List;

import com.capstonepro.tenantservice.entity.Tenant;

public interface TenantService {

	Tenant saveTenant(Tenant tenant);

	Tenant getTenantById(int tntId);

	List<Tenant> getAllTenants();
	
	Tenant updateTenantDetails(Tenant tenant);

	void deleteTenant(int tntId);

}
