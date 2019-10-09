package com.ant.web.response;

import com.ant.web.entity.User;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author: lic
 * @data: 2019/10/9
 */
@Getter
@Setter
public class UserResponse extends User {

    private Integer age;
}
