package com.ant.web.response;

import com.ant.web.entity.Menu;
import com.ant.web.entity.Role;
import com.ant.web.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author: lic
 * @data: 2019/10/9
 */
@Getter
@Setter
public class UserResponse extends User {

    private List<Role> roles;

    private List<Menu> menus;
}
