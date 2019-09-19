package com.ant.web.service;

import com.ant.bean.Result;
import com.ant.web.entity.User;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
@Validated
public interface UserService {

    Result login(User user);
}
