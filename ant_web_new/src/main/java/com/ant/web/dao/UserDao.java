package com.ant.web.dao;

import com.ant.web.entity.Menu;
import com.ant.web.entity.Role;
import com.ant.web.entity.User;
import com.ant.web.request.RegisterForm;
import com.ant.web.response.UserResponse;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserDao继承基类
 */
@Repository
public interface UserDao extends MyBatisBaseDao<User, Integer> {

    List<User> registerList(@Param("form") RegisterForm form);

    UserResponse registerDetail(@Param("id") Integer id);

    UserResponse findByUsername(@Param("username") String username);

    List<Role> getRolesByUserId(@Param("id") Integer id);

    List<Menu> getMenuByUserId(@Param("id") Integer id);

}