package com.ant.app.dao;

import com.ant.app.entity.UserAddress;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserAddressDao继承基类
 */
@Repository
public interface UserAddressDao extends MyBatisBaseDao<UserAddress, Integer> {
    List<UserAddress> list(@Param("userId") int userId);

    int updateAddressDefault(Integer userId);
}