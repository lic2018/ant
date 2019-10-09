package com.ant.web.dao;

import com.ant.web.entity.UserApplication;
import com.ant.web.entity.UserApplicationExample;
import com.ant.web.request.ApplicationForm;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserApplicationDao继承基类
 */
@Repository
public interface UserApplicationDao extends MyBatisBaseDao<UserApplication, Integer> {
    List<UserApplication> applicationList(ApplicationForm form);
}