package com.ant.app.service;

import com.ant.app.bean.Result;
import com.ant.app.entity.UserAddress;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
public interface AddressService {

    Result list(int userId);

    Result add(UserAddress userAddress);

    Result update(UserAddress userAddress);

    Result delete(UserAddress userAddress);
}
