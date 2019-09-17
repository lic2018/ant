package com.ant.web.dao;

import com.ant.web.Request.LoginRequest;
import com.ant.web.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * UserDao继承基类
 */
@Repository
public interface UserDao extends MyBatisBaseDao<User, Integer> {

    User findUser(LoginRequest user);

    User findUserByInvitationCode(@Param("invitationCode") String invitationCode);
}