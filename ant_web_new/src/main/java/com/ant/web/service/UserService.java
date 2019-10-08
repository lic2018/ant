package com.ant.web.service;

import com.ant.web.bean.Result;
import com.ant.web.entity.User;
import org.springframework.validation.annotation.Validated;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
@Validated
public interface UserService {

    Result login(User user);

    Result getAll(User user);
}
