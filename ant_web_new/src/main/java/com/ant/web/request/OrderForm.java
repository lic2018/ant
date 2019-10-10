package com.ant.web.request;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: lic
 * @data: 2019/10/10
 */
@Getter
@Setter
public class OrderForm extends BaseForm{

    private String name; // 商品名称/订单号/下单手机号

    private String star; // 0 正常 1 星标

    private String state; // 订单状态0 已取消 1 待付款 2待发货 3待收货 4待评价 5已完成 6申请退款 7退款成功

}
