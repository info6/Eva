package com.eva.sso.rpc.service;

import com.eva.sso.dao.entity.SsoUser;
import com.eva.sso.dao.repository.SsoUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	private SsoUserRepository baseRepository;

	@GetMapping("/user")
	public List<SsoUser> list(){
		return baseRepository.findAll();
	}

}
