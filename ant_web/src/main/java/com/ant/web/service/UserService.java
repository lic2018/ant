package com.ant.web.service;

import com.ant.bean.Result;
import com.ant.web.Request.LoginRequest;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
@Validated
public interface UserService extends UserDetailsService {

    Result login(@Valid LoginRequest user);
}
