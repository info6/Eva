package com.eva.sso.rpc.service;

import com.eva.sso.dao.entity.SsoRole;
import com.eva.sso.dao.repository.SsoRoleRepository;
import com.eva.sso.rpc.api.SsoRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SsoRoleServiceImpl extends BaseServiceImpl<SsoRole, Long, SsoRoleRepository> implements SsoRoleService {

	@Autowired
	private SsoRoleRepository ssoRoleRepository;

	@Override
	public SsoRoleRepository getRepository() {
		return ssoRoleRepository;
	}
}
