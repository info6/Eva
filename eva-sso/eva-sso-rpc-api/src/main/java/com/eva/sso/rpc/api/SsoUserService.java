package com.eva.sso.rpc.api;

import com.alibaba.dubbo.config.annotation.Service;
import com.eva.sso.dao.entity.SsoUser;
import com.eva.sso.dao.repository.SsoUserRepository;

@Service
public interface SsoUserService extends BaseService<SsoUser, Long, SsoUserRepository> {

}
