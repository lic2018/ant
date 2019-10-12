package com.ant.app.service;

import com.ant.app.bean.Result;
import com.ant.app.entity.User;
import org.springframework.validation.annotation.Validated;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
@Validated
public interface UserService {

    Result binding(String tel ,String invitationCode);
}
