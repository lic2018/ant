package com.ant.app.dao;

import com.ant.app.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserDao继承基类
 */
@Repository
public interface UserDao extends MyBatisBaseDao<User, Integer> {
    User findUserByUsername(@Param("username") String tel);

    String findInvitationByCode(String invitationCode);

    List<User> findInvitation(int userId);
}