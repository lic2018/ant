package com.ant.app.dao;

import com.ant.app.entity.Role;
import org.springframework.stereotype.Repository;

/**
 * RoleDao继承基类
 */
@Repository
public interface RoleDao extends MyBatisBaseDao<Role, Integer> {
}