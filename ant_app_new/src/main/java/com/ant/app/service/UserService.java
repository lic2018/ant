package com.ant.app.service;

import com.ant.app.bean.Result;
import com.ant.app.entity.User;
import com.ant.app.entity.UserApplication;
import org.springframework.validation.annotation.Validated;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
@Validated
public interface UserService {

    User loginOrbinding(String tel, String invitationCode, String wechatCode);

    Result userAgreement();


    Result applyForColonel(UserApplication userApplication);
}
