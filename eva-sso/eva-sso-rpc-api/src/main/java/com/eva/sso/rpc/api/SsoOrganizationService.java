package com.eva.sso.rpc.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.eva.sso.dao.entity.SsoOrganization;

@Service
public interface SsoOrganizationService extends BaseService<SsoOrganization, Long> {

}
