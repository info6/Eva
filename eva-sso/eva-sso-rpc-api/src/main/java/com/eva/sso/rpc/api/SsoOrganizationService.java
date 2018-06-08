package com.eva.sso.rpc.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.eva.sso.dao.entity.SsoOrganization;
import com.eva.sso.dao.repository.SsoOrganizationRepository;

@Service
public interface SsoOrganizationService extends BaseService<SsoOrganization, Long, SsoOrganizationRepository> {

}
