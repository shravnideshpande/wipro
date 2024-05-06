package com.capstonepro.tenantservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstonepro.tenantservice.entity.Tenant;
import com.capstonepro.tenantservice.exception.TenantModuleNotFoundException;
import com.capstonepro.tenantservice.repository.TenantRepository;

@Service
public class TenantServiceImpl implements TenantService {
	@Autowired
	private TenantRepository tenantRepository;

	@Override
	public Tenant saveTenant(Tenant tenant) {
		tenantRepository.save(tenant);
		return tenant;
	}

	@Override
	public Tenant getTenantById(int tntId) {
		Optional<Tenant> optionalTenant = tenantRepository.findById(tntId);
		if (optionalTenant.isEmpty()) {
			throw new TenantModuleNotFoundException("Tenant not existing with id: " + tntId);

		}
		Tenant tenant = optionalTenant.get();
		return tenant;

	}

	@Override
	public List<Tenant> getAllTenants() {
		List<Tenant> tenants = tenantRepository.findAll();
		return tenants;
	}

	@Override
	public Tenant updateTenantDetails(Tenant tenant) {
		Optional<Tenant> optionalTenant = tenantRepository.findById(tenant.getTntId());
		if (optionalTenant.isEmpty()) {
			throw new TenantModuleNotFoundException("Tenant not existing with id: " + tenant.getTntId());

		}
		tenantRepository.save(tenant);
		return tenant;
	}

	@Override
	public void deleteTenant(int tenantId) {
		Optional<Tenant> optionalTenant = tenantRepository.findById(tenantId);
		if (optionalTenant.isEmpty()) {

			throw new TenantModuleNotFoundException("Tenant not existing with id: " + tenantId);

		}
		Tenant tenant = optionalTenant.get();
		tenantRepository.delete(tenant);

	}

}