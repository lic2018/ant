package com.ant.app.dao;

import com.ant.app.entity.MenuRole;
import org.springframework.stereotype.Repository;

/**
 * MenuRoleDao继承基类
 */
@Repository
public interface MenuRoleDao extends MyBatisBaseDao<MenuRole, Integer> {
}