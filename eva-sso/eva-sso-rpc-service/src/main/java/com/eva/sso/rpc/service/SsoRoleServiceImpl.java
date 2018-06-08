package com.eva.sso.rpc.service;

import com.eva.sso.dao.entity.SsoRole;
import com.eva.sso.dao.repository.SsoRoleRepository;
import com.eva.sso.rpc.api.SsoRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class SsoRoleServiceImpl extends BaseServiceImpl<SsoRole, Long, SsoRoleRepository> implements SsoRoleService {

	private final SsoRoleRepository ssoRoleRepository;

	@Autowired
	public SsoRoleServiceImpl(SsoRoleRepository ssoRoleRepository) {
		Assert.notNull(ssoRoleRepository, "[ERROR] ssoRoleRepository must not be null");
		this.ssoRoleRepository = ssoRoleRepository;
	}

	@Override
	public SsoRoleRepository getRepository() {
		return ssoRoleRepository;
	}
}
