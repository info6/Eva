package com.eva.sso.rpc.service;

import com.eva.sso.dao.entity.SsoPermission;
import com.eva.sso.dao.repository.SsoPermissionRepository;
import com.eva.sso.rpc.api.SsoPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SsoPermissionServiceImpl extends BaseServiceImpl<SsoPermission, Long, SsoPermissionRepository> implements SsoPermissionService {

	@Autowired
	private SsoPermissionRepository ssoPermissionRepository;

	@Override
	public SsoPermissionRepository getRepository() {
		return ssoPermissionRepository;
	}
}
