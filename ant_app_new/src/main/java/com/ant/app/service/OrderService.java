package com.ant.app.service;

import com.ant.app.bean.Result;

/**
 * @Author: lic
 * @data: 2019/10/14
 */
public interface OrderService {
    Result list(int userId, String state);
}
