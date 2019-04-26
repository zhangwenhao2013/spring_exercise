package com.conan.test.base;

import org.junit.After;
import org.junit.Before;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.StringUtils;

public class UnitTestBase {

    protected ClassPathXmlApplicationContext context;
    private String springXmlpath;

    public UnitTestBase(String springXmlpath) {
        this.springXmlpath = springXmlpath;
    }

    @Before
    public void beforeTest() {
        System.out.println("beforeTest");
        if (StringUtils.isEmpty(springXmlpath)) {
            springXmlpath = "classpath*:spring-*.xml";
        }
        try {
            String[] split = springXmlpath.split("[,\\s]+");
            context = new ClassPathXmlApplicationContext(split);
            context.start();
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }

    @After
    public void after() {
        System.out.println("after");
        context.close();
    }
}
