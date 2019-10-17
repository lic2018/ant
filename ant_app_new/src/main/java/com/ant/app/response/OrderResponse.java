package com.ant.app.response;

import com.ant.app.entity.Goods;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @Author: lic
 * @data: 2019/10/17
 */
@Getter
@Setter
public class OrderResponse {

    private String code;
    private String money;
    private String state;

    private List<Goods> goodsList;
}
