package com.ant.app.service.impl;

import com.ant.app.bean.Result;
import com.ant.app.constant.BaseConst;
import com.ant.app.dao.MessageDao;
import com.ant.app.entity.Message;
import com.ant.app.exception.CodeableException;
import com.ant.app.exception.ExceptionCode;
import com.ant.app.service.MessageService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lic
 * @data: 2019/10/14
 */
@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageDao messageDao;

    @Override
    public Result list(int userId) {
        List<Message> list = messageDao.list(userId);
        return Result.success(list);
    }

    @Override
    public Result empty(int userId) {
        int empty = messageDao.empty(userId);
        if (empty != 1) {
            throw new CodeableException(ExceptionCode.EX_SQL);
        }
        return Result.success();
    }

    @Override
    public void insertNew(int userId) {
        messageDao.insertNew(userId);
    }


}
