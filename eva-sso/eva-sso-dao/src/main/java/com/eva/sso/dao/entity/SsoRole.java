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
public class SsoRole implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long   roleId;
	private String name;
	private String title;
	private String description;
	private String status;
	private Date   createTime;

}
