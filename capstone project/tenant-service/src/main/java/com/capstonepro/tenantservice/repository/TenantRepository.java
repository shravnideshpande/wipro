package com.capstonepro.tenantservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstonepro.tenantservice.entity.Tenant;


public interface TenantRepository extends JpaRepository<Tenant, Integer> {
    
}