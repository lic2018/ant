package com.ant.app.dao;

import com.ant.app.entity.AppConfigure;
import org.springframework.stereotype.Repository;

/**
 * AppConfigureDao继承基类
 */
@Repository
public interface AppConfigureDao extends MyBatisBaseDao<AppConfigure, Integer> {
}