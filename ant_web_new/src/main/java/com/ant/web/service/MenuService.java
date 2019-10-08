package com.ant.web.service;

import com.ant.web.response.MenuResponse;
import org.springframework.validation.annotation.Validated;

import java.util.List;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
@Validated
public interface MenuService {

    List<MenuResponse> getAllMenu();
}
