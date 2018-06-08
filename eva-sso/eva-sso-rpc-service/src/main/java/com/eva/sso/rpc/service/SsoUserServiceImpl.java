package com.eva.sso.rpc.service;

import com.eva.sso.dao.entity.SsoUser;
import com.eva.sso.dao.repository.SsoUserRepository;
import com.eva.sso.rpc.api.SsoUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class SsoUserServiceImpl extends BaseServiceImpl<SsoUser, Long, SsoUserRepository> implements SsoUserService {

	private final SsoUserRepository ssoUserRepository;

	@Autowired
	public SsoUserServiceImpl(SsoUserRepository ssoUserRepository) {
		Assert.notNull(ssoUserRepository, "[ERROR] ssoUserRepository must not be null");
		this.ssoUserRepository = ssoUserRepository;
	}

	@Override
	public SsoUserRepository getRepository() {
		return ssoUserRepository;
	}
}
