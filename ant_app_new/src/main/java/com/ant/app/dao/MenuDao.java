package com.ant.app.dao;

import com.ant.app.entity.Menu;
import org.springframework.stereotype.Repository;

/**
 * MenuDao继承基类
 */
@Repository
public interface MenuDao extends MyBatisBaseDao<Menu, Integer> {
}