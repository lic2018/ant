package com.ant.app.dao;

import com.ant.app.entity.AccountStatement;
import org.springframework.stereotype.Repository;

/**
 * AccountStatementDao继承基类
 */
@Repository
public interface AccountStatementDao extends MyBatisBaseDao<AccountStatement, Integer> {
}