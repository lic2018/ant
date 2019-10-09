package com.ant.web.request;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: lic
 * @data: 2019/10/9
 */
@Getter
@Setter
public class RegisterForm extends BaseForm {


    private String register; // 注册手机号/昵称/ID搜索

    private String inviter; // 邀请人昵称/ID搜索

    private String role; // 1 团长 0 非团长 null 团长+非团长

}
