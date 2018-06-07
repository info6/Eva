package com.sso.rpc.service;

import com.eva.sso.dao.entity.SsoOrganization;
import com.eva.sso.dao.repository.BaseRepository;
import com.eva.sso.rpc.api.SsoOrganizationService;
import org.springframework.stereotype.Service;

@Service
public class SsoOrganizationServiceImpl extends BaseServiceImpl<SsoOrganization, Long> implements SsoOrganizationService {

	public SsoOrganizationServiceImpl(BaseRepository<SsoOrganization, Long> baseRepository) {
		super(baseRepository);
	}
}
