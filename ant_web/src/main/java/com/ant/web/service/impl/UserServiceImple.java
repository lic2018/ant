package com.ant.web.service.impl;

import com.ant.bean.Result;
import com.ant.exception.CodeException;
import com.ant.exception.ExceptionCode;
import com.ant.web.dao.UserDao;
import com.ant.web.entity.User;
import com.ant.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
@Service
public class UserServiceImple implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Result login(User user) {
//        UserResponse daoUser = userDao.findUser(user);
//        if (daoUser == null) {
//            throw new CodeException(ExceptionCode.EX_USER_USERNAME);
//        }
        return Result.success();
    }
}
