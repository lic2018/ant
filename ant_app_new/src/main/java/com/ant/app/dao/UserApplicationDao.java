package com.ant.app.dao;

import com.ant.app.entity.UserApplication;
import org.springframework.stereotype.Repository;

/**
 * UserApplicationDao继承基类
 */
@Repository
public interface UserApplicationDao extends MyBatisBaseDao<UserApplication, Integer> {
}