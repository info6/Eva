package com.eva.sso.dao.repository;

import com.eva.sso.dao.entity.SsoUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SsoUserRepository extends BaseRepository<SsoUser, Long> {

}
