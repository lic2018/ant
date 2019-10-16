package com.ant.app.service.impl;

import com.ant.app.bean.Result;
import com.ant.app.constant.BaseConst;
import com.ant.app.dao.UserAddressDao;
import com.ant.app.entity.UserAddress;
import com.ant.app.exception.CodeableException;
import com.ant.app.exception.ExceptionCode;
import com.ant.app.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lic
 * @data: 2019/9/6
 */
@Service
public class AddressServiceImple implements AddressService {

    @Autowired
    private UserAddressDao userAddressDao;


    @Override
    public Result list(int userId) {
        List<UserAddress> list = userAddressDao.list(userId);
        return Result.success(list);
    }

    @Override
    public Result add(UserAddress userAddress) {
        int insert = userAddressDao.insert(userAddress);
        if (insert != 1) {
            throw new CodeableException(ExceptionCode.EX_SQL);
        }
        return Result.success();
    }

    @Override
    public Result update(UserAddress userAddress) {
        if (BaseConst.ADDRESS_DEFAULT.ISDEFAULT.equals(userAddress.getDefault())) {
            userAddressDao.updateAddressDefault(userAddress.getUserId());
        }
        int update = userAddressDao.updateByPrimaryKeySelective(userAddress);
        if (update != 1) {
            throw new CodeableException(ExceptionCode.EX_SQL);
        }
        return Result.success();
    }

    @Override
    public Result delete(UserAddress userAddress) {
        int delete = userAddressDao.deleteByPrimaryKey(userAddress.getId());
        if (delete != 1) {
            throw new CodeableException(ExceptionCode.EX_SQL);
        }
        return Result.success();
    }


}
