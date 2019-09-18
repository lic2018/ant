package com.ant.web.service.impl;

import com.ant.bean.Result;
import com.ant.constant.UserConst;
import com.ant.exception.CodeException;
import com.ant.exception.ExceptionCode;
import com.ant.web.Request.LoginRequest;
import com.ant.web.dao.UserDao;
import com.ant.web.entity.User;
import com.ant.web.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.Date;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
@Service
public class UserServiceImple implements UserService, UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    public Result login(@Valid LoginRequest request) {

        User daoUser = userDao.findUser(request);
        if (daoUser == null) {
            // 新增用户
            User user = new User();
            Date date = new Date();
            if (StringUtils.isNotBlank(request.getInvitationCode())) {
                User userByInvitationCode = userDao.findUserByInvitationCode(request.getInvitationCode());
                if (userByInvitationCode != null) {
                    user.setInviterPeople(userByInvitationCode.getRealname() + "(" + userByInvitationCode.getId() + ")");
                }
            }

            user.setUsername(request.getUsername());
            user.setRealname(request.getUsername());
            user.setNickname(request.getUsername());
            user.setRegistertime(date);
            user.setRole(UserConst.ROLE.NORMAL);
            user.setState(UserConst.STATE.NORMAL);

            int i = userDao.insertSelective(user);
            if (i != 1) {
                throw new CodeException(ExceptionCode.EX_USER_REGISTER);
            }
            return Result.success(userDao.findUser(request));
        }

        return Result.success(daoUser);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername(username);
        User user = userDao.findUser(loginRequest);
        if (user == null ) {
            throw new CodeException(ExceptionCode.EX_USER_REGISTER);
        }
        return user;
    }
}
