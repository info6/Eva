package com.eva.sso.rpc.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.eva.sso.dao.entity.SsoPermission;

@Service
public interface SsoPermissionService extends BaseService<SsoPermission, Long> {

}
