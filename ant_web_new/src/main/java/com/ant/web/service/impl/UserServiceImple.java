package com.ant.web.service.impl;

import com.ant.web.bean.Result;
import com.ant.web.constant.BaseConst;
import com.ant.web.constant.UserConst;
import com.ant.web.dao.UserApplicationDao;
import com.ant.web.dao.UserDao;
import com.ant.web.entity.User;
import com.ant.web.entity.UserApplication;
import com.ant.web.exception.CodeableException;
import com.ant.web.exception.ExceptionCode;
import com.ant.web.request.ApplicationForm;
import com.ant.web.request.RegisterForm;
import com.ant.web.response.UserResponse;
import com.ant.web.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.security.provider.MD5;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
@Service
public class UserServiceImple implements UserService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private UserApplicationDao userApplicationDao;

    @Override
    public UserResponse login(String username, String password) {
        UserResponse user = userDao.findByUsername(username);
        if (user == null ) {
            throw new CodeableException(ExceptionCode.EX_USER_NOT_FOUND);
        }
        // 密码没有加密
        if (!password.equals(user.getPassword())) {
            throw new CodeableException(ExceptionCode.EX_USER_USERNAME_PASSWORD);
        }
        user.setPassword(null);
        return user;
    }

    @Override
    public Result registerList(RegisterForm form) {
        PageHelper.startPage(form.getPageIndex(), form.getPageSize());

        List<User> list = userDao.registerList(form);
        PageInfo<User> pageInfo = new PageInfo<>(list);

        return Result.success(pageInfo);
    }

    @Override
    public Result registerChange(User user) {
        int update = userDao.updateByPrimaryKeySelective(user);
        if (update != 1) {
            throw new CodeableException(ExceptionCode.EX_SQL);
        }
        return Result.success();
    }

    @Override
    public Result registerDetail(Integer id) {
        UserResponse userResponse = userDao.registerDetail(id);
        return Result.success(userResponse);
    }

    @Override
    public Result applicationList(ApplicationForm form) {
        PageHelper.startPage(form.getPageIndex(), form.getPageSize());
        List<UserApplication> list = userApplicationDao.applicationList(form);
        PageInfo<UserApplication> pageInfo = new PageInfo<>(list);
        return Result.success(pageInfo);

    }

    @Transactional
    @Override
    public Result applicationUpdate(Integer id, Integer userId) {
        User user = new User();
        user.setId(userId);
        user.setRole(UserConst.ROLE.COLONEL);
        userDao.updateByPrimaryKeySelective(user);

        UserApplication userApplication = new UserApplication();
        userApplication.setId(id);
        userApplication.setState(BaseConst.STATE.DELETE);
        userApplicationDao.updateByPrimaryKeySelective(userApplication);
        return Result.success();
    }


}
