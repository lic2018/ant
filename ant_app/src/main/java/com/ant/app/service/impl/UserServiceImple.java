package com.ant.app.service.impl;

import com.ant.app.dao.RoleDao;
import com.ant.app.entity.Role;
import com.ant.app.service.UserService;
import com.ant.exception.CodeException;
import com.ant.exception.ExceptionCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
@Service
public class UserServiceImple implements UserService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Role findById(Integer id) {
        Role role = roleDao.selectByPrimaryKey(id);
        if (role == null) {
            throw new CodeException(ExceptionCode.EX_NOT_UPDATE_USER_INFO_VERIFYING);
        }
        return role;
    }

    @Override
    public Integer insert(Role role) {
        int i = roleDao.insertSelective(role);
        return i;
    }

}
