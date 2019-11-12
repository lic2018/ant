package com.ant.web.dao;

import com.ant.web.entity.Active;
import com.ant.web.request.ActiveForm;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ActiveDao继承基类
 */
@Repository
public interface ActiveDao extends MyBatisBaseDao<Active, Integer> {

    List<Active> list(ActiveForm form);

}