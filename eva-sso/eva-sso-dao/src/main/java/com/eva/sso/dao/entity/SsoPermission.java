package com.eva.sso.dao.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
public class SsoPermission implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long   permissionId;
	private Long   appId;
	private String name;
	private String code;
	private String description;
	private Long   pid;
	private Long   isLeaf;
	private String uri;
	private Long   status;
	private Date   createTime;

}
