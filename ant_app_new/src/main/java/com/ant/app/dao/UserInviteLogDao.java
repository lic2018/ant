package com.ant.app.dao;

import com.ant.app.entity.UserInviteLog;
import org.springframework.stereotype.Repository;

/**
 * UserInviteLogDao继承基类
 */
@Repository
public interface UserInviteLogDao extends MyBatisBaseDao<UserInviteLog, Integer> {
}