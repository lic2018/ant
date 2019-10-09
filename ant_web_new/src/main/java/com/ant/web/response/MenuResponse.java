package com.ant.web.response;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author: lic
 * @data: 2019/9/19
 */
@Getter @Setter
public class MenuResponse extends Menu {

    private List<Role> roles;
}
