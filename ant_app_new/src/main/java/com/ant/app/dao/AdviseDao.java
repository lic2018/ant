package com.ant.app.dao;

import com.ant.app.entity.Advise;
import org.springframework.stereotype.Repository;

/**
 * AdviseDao继承基类
 */
@Repository
public interface AdviseDao extends MyBatisBaseDao<Advise, Integer> {
}