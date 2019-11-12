package com.ant.web.dao;

import com.ant.web.entity.Menu;
import org.springframework.stereotype.Repository;

/**
 * MenuDao继承基类
 */
@Repository
public interface MenuDao extends MyBatisBaseDao<Menu, Integer> {
}