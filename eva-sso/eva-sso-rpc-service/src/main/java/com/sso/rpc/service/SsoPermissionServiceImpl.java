package com.sso.rpc.service;

import com.eva.sso.dao.entity.SsoPermission;
import com.eva.sso.dao.repository.BaseRepository;
import com.eva.sso.rpc.api.SsoPermissionService;
import org.springframework.stereotype.Service;

@Service
public class SsoPermissionServiceImpl extends BaseServiceImpl<SsoPermission, Long> implements SsoPermissionService {

	public SsoPermissionServiceImpl(BaseRepository<SsoPermission, Long> baseRepository) {
		super(baseRepository);
	}

}
