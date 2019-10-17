package com.ant.app.service.impl;

import cn.hutool.core.util.RandomUtil;
import com.ant.app.bean.Result;
import com.ant.app.constant.BaseConst;
import com.ant.app.constant.UserConst;
import com.ant.app.dao.AppConfigureDao;
import com.ant.app.dao.UserDao;
import com.ant.app.entity.AppConfigure;
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
    @Autowired
    private AppConfigureDao appConfigureDao;

    @Override
    public User loginOrbinding(String tel, String invitationCode, String wechatCode) {

        if (StringUtils.isNotBlank(wechatCode)) {
            // 微信绑定
            userDao.updateWechatCodeByTel(tel, wechatCode);
        }

        User user = userDao.findUserByUsername(tel);
        if (user == null) {
            // 注册
            User newUser = new User();
            if (StringUtils.isNotBlank(invitationCode)) {
                User inviterPeople = userDao.findInvitationByCode(invitationCode);
                newUser.setInviterName(inviterPeople.getRealname());
                newUser.setInviterId(inviterPeople.getId());
            }
            newUser.setUsername(tel);
            newUser.setInvitationCode(RandomUtil.randomString(8));
            newUser.setRegisterTime(new Date());
            newUser.setRole(UserConst.ROLE.NORMAL);
            userDao.insertSelective(newUser);
            user = newUser;
        }

        return user;
    }

    @Override
    public Result userAgreement() {
        AppConfigure appConfigure = appConfigureDao.findByName(BaseConst.APP_CONFIG.USER_AGREEMENT);
        return Result.success(appConfigure);
    }

}
