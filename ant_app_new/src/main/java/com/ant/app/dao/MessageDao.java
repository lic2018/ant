package com.ant.app.dao;

import com.ant.app.entity.Message;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * MessageDao继承基类
 */
@Repository
public interface MessageDao extends MyBatisBaseDao<Message, Integer> {

    List<Message> list(@Param("userId") int userId);

    int empty(int userId);

    int insertNew(int userId);
}