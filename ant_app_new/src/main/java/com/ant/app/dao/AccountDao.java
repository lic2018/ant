package com.ant.app.dao;

import com.ant.app.entity.Account;
import org.springframework.stereotype.Repository;

/**
 * AccountDao继承基类
 */
@Repository
public interface AccountDao extends MyBatisBaseDao<Account, Account> {
}