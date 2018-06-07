package com.sso.rpc.service;

import com.eva.sso.dao.entity.SsoRole;
import com.eva.sso.dao.repository.BaseRepository;
import com.eva.sso.rpc.api.SsoRoleService;
import org.springframework.stereotype.Service;

@Service
public class SsoRoleServiceImpl extends BaseServiceImpl<SsoRole, Long> implements SsoRoleService {

	public SsoRoleServiceImpl(BaseRepository<SsoRole, Long> baseRepository) {
		super(baseRepository);
	}
}
