package com.ant.web.request;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: lic
 * @data: 2019/10/11
 */
@Getter
@Setter
public class ActiveForm extends BaseForm {

    private String title; // 标题
    private String type; // 1首页banner 2首页icon 3会场活动

}
