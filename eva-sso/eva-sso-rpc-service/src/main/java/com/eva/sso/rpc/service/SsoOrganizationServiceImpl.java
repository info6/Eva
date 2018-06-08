package com.eva.sso.rpc.service;

import com.eva.sso.dao.entity.SsoOrganization;
import com.eva.sso.dao.repository.SsoOrganizationRepository;
import com.eva.sso.rpc.api.SsoOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class SsoOrganizationServiceImpl extends BaseServiceImpl<SsoOrganization, Long, SsoOrganizationRepository> implements SsoOrganizationService {

	private final SsoOrganizationRepository ssoOrganizationRepository;

	@Autowired
	public SsoOrganizationServiceImpl(SsoOrganizationRepository ssoOrganizationRepository) {
		Assert.notNull(ssoOrganizationRepository, "[ERROR] ssoOrganizationRepository must not be null");
		this.ssoOrganizationRepository = ssoOrganizationRepository;
	}

	@Override
	public SsoOrganizationRepository getRepository() {
		return ssoOrganizationRepository;
	}
}
