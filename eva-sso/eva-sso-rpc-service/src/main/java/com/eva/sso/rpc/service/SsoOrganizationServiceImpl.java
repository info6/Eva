package com.eva.sso.rpc.service;

import com.eva.sso.dao.entity.SsoOrganization;
import com.eva.sso.dao.repository.SsoOrganizationRepository;
import com.eva.sso.rpc.api.SsoOrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SsoOrganizationServiceImpl extends BaseServiceImpl<SsoOrganization, Long, SsoOrganizationRepository> implements SsoOrganizationService {

	@Autowired
	private SsoOrganizationRepository ssoOrganizationRepository;

	@Override
	public SsoOrganizationRepository getRepository() {
		return ssoOrganizationRepository;
	}
}
