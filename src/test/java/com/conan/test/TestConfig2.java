/**
 * Copyright (C) 2011-2019 ShenZhen iBOXCHAIN Information Technology Co.,Ltd.
 * <p>
 * All right reserved.
 * <p>
 * This software is the confidential and proprietary
 * information of iBOXCHAIN Company of China.
 * ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only
 * in accordance with the terms of the contract agreement
 * you entered into with iBOXCHAIN inc.
 */

package com.conan.test;

import com.conan.aopbaseconfig.L3Config;
import com.conan.beans.L2Bean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author: zhangwenhao
 * @since: 2019/6/20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = L3Config.class)
public class TestConfig2 {

    @Autowired
    L2Bean l2Bean;

    @Autowired
    L2Bean l2Bean2;

    @Test
    public void testL2JavaConfig(){

        l2Bean.print();

        l2Bean2.print();

    }
}
