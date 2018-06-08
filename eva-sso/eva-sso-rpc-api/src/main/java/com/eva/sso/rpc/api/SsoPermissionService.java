package com.eva.sso.rpc.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.eva.sso.dao.entity.SsoPermission;
import com.eva.sso.dao.repository.SsoPermissionRepository;

@Service
public interface SsoPermissionService extends BaseService<SsoPermission, Long, SsoPermissionRepository> {

}
