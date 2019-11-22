package com.ant.web.service;

import com.ant.web.bean.Result;
import com.ant.web.entity.User;
import com.ant.web.request.ApplicationForm;
import com.ant.web.request.MustForm;
import com.ant.web.request.RegisterForm;
import com.ant.web.response.UserResponse;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
@Validated
public interface UserService {
    UserResponse login(String username, String password);




    Result registerList(RegisterForm form);

    Result registerChange(User user);
    Result registerDetail(Integer id);

    Result applicationList(ApplicationForm form);

    Result applicationUpdate(Integer id, Integer userId);

    boolean must(@Valid MustForm form);
}
