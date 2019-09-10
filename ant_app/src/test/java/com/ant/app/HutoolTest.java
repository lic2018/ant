package com.ant.app;

import cn.hutool.core.convert.Convert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author: lic
 * @data: 2019/9/10
 */
public class HutoolTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(HutoolTest.class);


    @Test
    public void test01() {
        int a = 1;
        String str = Convert.toStr(a);
        LOGGER.debug(str);
    }
}
