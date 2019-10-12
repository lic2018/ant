package com.ant.app.constant;

/**
 * @Author: lic
 * @data: 2019/9/10
 */
public interface UserConst {

    // 角色（0无 1团长 2 超级管理员 3 管理子账户)
    interface ROLE {
        String NORMAL = "0";
        String COLONEL = "1";
        String ADMIN_MANAGER = "2";
        String NORMAL_MANAGER = "3";
    }

    interface SEX {
        String MAN = "0";
        String WOMAN = "1";
    }

    interface STATE {
        String NORMAL = "0";
        String DISABLED = "1";
    }
}
