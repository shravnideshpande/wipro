package com.capstonepro.landlordservice.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Tenant {

	private int tenantId;
	private String tenantName;
	private int tenantAge;
	private String idPrrofType;
	private String idPrrofNo;
	private TenantAddress tenantAddress;

}
