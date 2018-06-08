package com.eva.sso.rpc.service;

import com.eva.sso.dao.entity.SsoUser;
import com.eva.sso.rpc.api.SsoUserService;
import org.springframework.stereotype.Service;

@Service
public class SsoUserServiceImpl extends BaseServiceImpl<SsoUser, Long> implements SsoUserService {

}
