package com.ant.app.dao;

import com.ant.app.entity.Active;
import org.springframework.stereotype.Repository;

/**
 * ActiveDao继承基类
 */
@Repository
public interface ActiveDao extends MyBatisBaseDao<Active, Integer> {
}