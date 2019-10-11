package com.ant.app.dao;

import com.ant.app.entity.UserRole;
import org.springframework.stereotype.Repository;

/**
 * UserRoleDao继承基类
 */
@Repository
public interface UserRoleDao extends MyBatisBaseDao<UserRole, Integer> {
}