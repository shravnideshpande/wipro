package com.capstonepro.landlordservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.capstonepro.landlordservice.model.Tenant;


@FeignClient(name="TENANT-SERVICE")
public interface TenantServiceConsumer {

	@GetMapping("/tenants/{id}")
	Tenant getTenantById (@PathVariable("id") int tntId);
}
