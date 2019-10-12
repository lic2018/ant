package com.ant.app.service;

import com.ant.app.bean.Result;
import com.ant.app.entity.Advise;
import com.ant.app.entity.UserAddress;

/**
 * @Author: lic
 * @data: 2019/10/12
 */
public interface MyService {
    Result invitation(int userId);

    Result addressList(int userId);

    Result addressAdd(UserAddress userAddress);

    Result addressUpdate(UserAddress userAddress);

    Result addAdvise(Advise advise);
}
