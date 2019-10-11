package com.ant.app.dao;

import com.ant.app.entity.Push;
import org.springframework.stereotype.Repository;

/**
 * PushDao继承基类
 */
@Repository
public interface PushDao extends MyBatisBaseDao<Push, Integer> {
}