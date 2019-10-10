package com.ant.web.service;

import com.ant.web.bean.Result;
import com.ant.web.entity.Order;
import com.ant.web.request.OrderForm; /**
 * @Author: lic
 * @data: 2019/10/10
 */
public interface OrderService {
    Result list(OrderForm form);

    Result remark(Order order);
}
