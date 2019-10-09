package com.ant.web.request;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Author: lic
 * @data: 2019/10/9
 */
@Getter
@Setter
public class BaseForm {

    private Integer pageIndex = 0;

    private Integer pageSize = 9;

    private Date beginTime;

    private Date endTime;


}
