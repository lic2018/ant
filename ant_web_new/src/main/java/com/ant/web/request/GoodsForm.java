package com.ant.web.request;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: lic
 * @data: 2019/10/10
 */
@Getter
@Setter
public class GoodsForm extends BaseForm{

    private String nameOrId; // 名称或者id;
    private String state; // 0 上架 1 下架 2 售罄


}
