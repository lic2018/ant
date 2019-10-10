package com.ant.web.response;

import com.ant.web.entity.Order;
import lombok.Getter;
import lombok.Setter;

/**
 * @Author: lic
 * @data: 2019/10/10
 */
@Getter
@Setter
public class OrderResponse extends Order {

    private String name;
    private String number;

}
