package com.ant.app.dao;

import com.ant.app.entity.AppConfigure;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * AppConfigureDao继承基类
 */
@Repository
public interface AppConfigureDao extends MyBatisBaseDao<AppConfigure, Integer> {
    AppConfigure findByName(@Param("name") String name);
}