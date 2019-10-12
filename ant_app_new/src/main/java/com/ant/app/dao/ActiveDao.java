package com.ant.app.dao;

import com.ant.app.entity.Active;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ActiveDao继承基类
 */
@Repository
public interface ActiveDao extends MyBatisBaseDao<Active, Integer> {
    List<Active> findActiveByType(@Param("type") String type);
}