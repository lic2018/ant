package com.ant.app.service;

import com.ant.app.entity.Role;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
@Validated
public interface UserService {

    Role findById(Integer id);

    Integer insert(@Valid Role role);
}
