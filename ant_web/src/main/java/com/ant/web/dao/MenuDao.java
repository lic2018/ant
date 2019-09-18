package com.ant.web.dao;

import com.ant.web.entity.Menu;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MenuDao继承基类
 */
@Repository
public interface MenuDao extends MyBatisBaseDao<Menu, Integer> {
    List<Menu> findList();
}