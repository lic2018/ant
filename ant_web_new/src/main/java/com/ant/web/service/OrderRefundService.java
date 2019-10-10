package com.ant.web.service;

import com.ant.web.bean.Result;
import com.ant.web.request.OrderForm; /**
 * @Author: lic
 * @data: 2019/10/10
 */
public interface OrderRefundService {
    Result update(OrderForm form);

    Result list(OrderForm form);
}
