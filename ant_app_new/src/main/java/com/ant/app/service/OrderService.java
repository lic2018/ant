package com.ant.app.service;

import com.ant.app.bean.Result;
import com.ant.app.request.OrderSubmitRequest;

/**
 * @Author: lic
 * @data: 2019/10/14
 */
public interface OrderService {
    Result list(int userId, String state);

    Result submit(OrderSubmitRequest orderSubmitRequest);
}
