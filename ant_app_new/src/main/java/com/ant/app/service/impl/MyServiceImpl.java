package com.ant.app.service.impl;

import com.ant.app.bean.Result;
import com.ant.app.dao.AdviseDao;
import com.ant.app.dao.UserAddressDao;
import com.ant.app.dao.UserDao;
import com.ant.app.entity.Advise;
import com.ant.app.entity.User;
import com.ant.app.entity.UserAddress;
import com.ant.app.exception.CodeableException;
import com.ant.app.exception.ExceptionCode;
import com.ant.app.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lic
 * @data: 2019/10/12
 */
@Service
public class MyServiceImpl implements MyService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private UserAddressDao userAddressDao;
    @Autowired
    private AdviseDao adviseDao;

    @Override
    public Result invitation(int userId) {
        List<User> invitation = userDao.findInvitation(userId);
        return Result.success(invitation);
    }

    @Override
    public Result addressList(int userId) {
        List<UserAddress> list = userAddressDao.list(userId);
        return Result.success(list);
    }

    @Override
    public Result addressAdd(UserAddress userAddress) {
        int insert = userAddressDao.insert(userAddress);
        if (insert != 1) {
            throw new CodeableException(ExceptionCode.EX_SQL);
        }
        return Result.success();
    }

    @Override
    public Result addressUpdate(UserAddress userAddress) {
        int update = userAddressDao.updateByPrimaryKeySelective(userAddress);
        if (update != 1) {
            throw new CodeableException(ExceptionCode.EX_SQL);
        }
        return Result.success();
    }

    @Override
    public Result addAdvise(Advise advise) {
        int insert = adviseDao.insert(advise);
        if (insert != 1) {
            throw new CodeableException(ExceptionCode.EX_SQL);
        }
        return Result.success();
    }
}
