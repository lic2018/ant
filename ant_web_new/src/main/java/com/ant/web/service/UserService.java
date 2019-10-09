package com.ant.web.service;

import com.ant.web.bean.Result;
import com.ant.web.entity.User;
import com.ant.web.request.ApplicationForm;
import com.ant.web.request.RegisterForm;
import org.springframework.validation.annotation.Validated;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
@Validated
public interface UserService {

    Result registerList(RegisterForm form);

    Result registerChange(User user);

    Result registerDetail(Integer id);

    Result applicationList(ApplicationForm form);

    Result applicationUpdate(Integer id, Integer userId);
}
