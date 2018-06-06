package com.eva.sso.dao.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class SsoOrganization {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long   organizationId;
	private String name;
	private String description;
	private Long   pid;
	private Long   isLeaf;
	private Long   seq;
	private String status;

}
