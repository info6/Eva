package com.eva.sso.rpc.service;

import com.eva.sso.dao.entity.SsoUser;
import com.eva.sso.dao.repository.SsoUserRepository;
import com.eva.sso.rpc.api.SsoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SsoUserServiceImpl extends BaseServiceImpl<SsoUser, Long, SsoUserRepository> implements SsoUserService {

	@Autowired
	private SsoUserRepository ssoUserRepository;

	@Override
	public SsoUserRepository getRepository() {
		return ssoUserRepository;
	}
}
