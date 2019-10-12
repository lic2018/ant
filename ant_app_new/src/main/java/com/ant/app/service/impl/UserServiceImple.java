package com.ant.app.service.impl;

import cn.hutool.core.util.RandomUtil;
import com.ant.app.bean.Result;
import com.ant.app.constant.UserConst;
import com.ant.app.dao.UserDao;
import com.ant.app.entity.User;
import com.ant.app.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
@Service
public class UserServiceImple implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Result binding(String tel, String invitationCode) {
        User user = userDao.findUserByUsername(tel);
        if ( user == null) {
            User newUser = new User();
            if (StringUtils.isNotBlank(invitationCode)) {
                String inviterPeople = userDao.findInvitationByCode(invitationCode);
                newUser.setInviterPeople(inviterPeople);
            }

            newUser.setUsername(tel);
            newUser.setInvitationCode(RandomUtil.randomString(4));
            newUser.setRegisterTime(new Date());
            newUser.setRole(UserConst.ROLE.NORMAL);
            userDao.insertSelective(newUser);
        } else {

            return Result.success(user);
        }
        return Result.success();
    }
}
