package com.ant.web.service.impl;

import com.ant.web.dao.MenuDao;
import com.ant.web.entity.Menu;
import com.ant.web.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lic
 * @data: 2019/9/18
 */
@Service
public class MenuServiceImple implements MenuService {

    @Autowired
    private MenuDao menuDao;

    @Override
    public List<Menu> getAllMenu() {
        return menuDao.findList();
    }
}
