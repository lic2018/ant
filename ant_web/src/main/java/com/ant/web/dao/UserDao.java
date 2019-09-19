package com.ant.web.dao;

import com.ant.web.entity.Role;
import com.ant.web.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserDao继承基类
 */
@Repository
public interface UserDao extends MyBatisBaseDao<User, Integer> {

//    UserResponse findUser(User user);

    User findUserByInvitationCode(@Param("invitationCode") String invitationCode);

    List<Role> getRolesByHrId(Integer id);
}