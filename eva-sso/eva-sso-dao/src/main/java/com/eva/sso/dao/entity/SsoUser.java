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
public class SsoUser implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long    userId;
	private String  username;
	private String  title;
	private String  description;
	private String  password;
	private String  salt;
	private String  realName;
	private String  orders;
	private String  sex;
	private String  email;
	private String  phone;
	private Date    createTime;
	private Integer status;

}
