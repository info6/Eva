package com.eva.sso.dao.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class SsoApp {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long   appId;
	private String name;
	private String title;
	private String description;
	private String path;
	private Date   createTime;
	private Long   orders;

}
