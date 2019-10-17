package com.ant.app.constant;

/**
 * @Author: lic
 * @data: 2019/10/9
 */
public interface BaseConst {


    interface STATE {
        String NORMAL = "0";
        String DELETE = "1";
    }


    interface REDIS_KEY {
        String NORMAL = "0";
        String DELETE = "1";
    }




    /** 默认收货地址 */
    interface ADDRESS_DEFAULT {
        String ISDEFAULT = "0";
        String NORMAL = "1";
    }

    /** app配置 */
    interface APP_CONFIG {
        String USER_AGREEMENT = "user_agreement";
    }
}
