package com.eva.sso.rpc.service;

import com.eva.sso.dao.entity.SsoPermission;
import com.eva.sso.dao.repository.SsoPermissionRepository;
import com.eva.sso.rpc.api.SsoPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class SsoPermissionServiceImpl extends BaseServiceImpl<SsoPermission, Long, SsoPermissionRepository> implements SsoPermissionService {

	private final SsoPermissionRepository ssoPermissionRepository;

	@Autowired
	public SsoPermissionServiceImpl(SsoPermissionRepository ssoPermissionRepository) {
		Assert.notNull(ssoPermissionRepository, "[ERROR] ssoPermissionRepository must not be null");
		this.ssoPermissionRepository = ssoPermissionRepository;
	}

	@Override
	public SsoPermissionRepository getRepository() {
		return ssoPermissionRepository;
	}
}
