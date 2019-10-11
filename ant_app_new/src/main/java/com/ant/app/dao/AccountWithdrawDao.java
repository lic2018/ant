package com.ant.app.dao;

import com.ant.app.entity.AccountWithdraw;
import org.springframework.stereotype.Repository;

/**
 * AccountWithdrawDao继承基类
 */
@Repository
public interface AccountWithdrawDao extends MyBatisBaseDao<AccountWithdraw, Integer> {
}