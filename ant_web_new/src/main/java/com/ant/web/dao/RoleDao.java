package com.ant.web.dao;

import com.ant.web.entity.Role;
import org.springframework.stereotype.Repository;

/**
 * RoleDao继承基类
 */
@Repository
public interface RoleDao extends MyBatisBaseDao<Role, Integer> {
}