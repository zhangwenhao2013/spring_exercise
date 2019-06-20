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

import com.conan.beans.L2Bean;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author: zhangwenhao
 * @since: 2019/6/20
 */
//@RunWith(BlockJUnit4ClassRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-xml-config.xml"})
public class TestXMlMixConfig {

    private ClassPathXmlApplicationContext context;

    @Before
    public void before() {

//        context = new ClassPathXmlApplicationContext("classpath:spring-xml-mix.xml");

    }

    @Autowired
    L2Bean l2Bean;

    @Test
    public void testXmlConfig() {
        l2Bean.print();
    }
}
