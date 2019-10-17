package com.ant.web.service;

import com.ant.web.bean.Result;
import com.ant.web.entity.Active;
import com.ant.web.request.ActiveForm;

/**
 * @Author: lic
 * @data: 2019/10/11
 */
public interface ActiveService {
    Result list(ActiveForm form);

    Result delete(Active active);

    Result update(Active active);
}
