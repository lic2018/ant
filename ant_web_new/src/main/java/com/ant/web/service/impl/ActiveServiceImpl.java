package com.ant.web.service.impl;

import com.ant.web.bean.Result;
import com.ant.web.dao.ActiveDao;
import com.ant.web.entity.Active;
import com.ant.web.entity.User;
import com.ant.web.exception.CodeableException;
import com.ant.web.exception.ExceptionCode;
import com.ant.web.request.ActiveForm;
import com.ant.web.service.ActiveService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lic
 * @data: 2019/10/11
 */
@Service
public class ActiveServiceImpl implements ActiveService {

    @Autowired
    private ActiveDao activeDao;

    @Override
    public Result list(ActiveForm form) {
        PageHelper.startPage(form.getPageIndex(), form.getPageSize());
        List<Active> list = activeDao.list(form);
        PageInfo<Active> pageInfo = new PageInfo<>(list);
        return Result.success(pageInfo);
    }

    @Override
    public Result delete(Active active) {
        int update = activeDao.updateByPrimaryKeySelective(active);
        if (update != 1) {
            throw new CodeableException(ExceptionCode.EX_SQL);
        }
        return Result.success();
    }

    @Override
    public Result update(Active active) {
        int update = activeDao.updateByPrimaryKeySelective(active);
        if (update != 1) {
            throw new CodeableException(ExceptionCode.EX_SQL);
        }
        return Result.success();
    }


}
