package com.eva.sso.rpc.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.eva.sso.dao.entity.SsoRole;
import com.eva.sso.dao.repository.SsoRoleRepository;

@Service
public interface SsoRoleService extends BaseService<SsoRole, Long, SsoRoleRepository> {

}
