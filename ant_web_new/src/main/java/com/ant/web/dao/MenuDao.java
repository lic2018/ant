package com.ant.web.dao;

import com.ant.web.entity.Menu;
import com.ant.web.response.MenuResponse;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MenuDao继承基类
 */
@Repository
public interface MenuDao extends MyBatisBaseDao<Menu, Integer> {
    List<Menu> findList();

    List<MenuResponse> getAllMenu();
}