package com.conan.test;

import com.conan.aopbaseconfig.AspectBiz;
import com.conan.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAopBase extends UnitTestBase {

    public TestAopBase() {
        super("classpath:spring-aop-base-config.xml");
    }

    @Test
    public void testAopAdviceBefore() {

        AspectBiz aspectBiz = (AspectBiz) context.getBean("aspectBiz");
        aspectBiz.init();

    }

    @Test
    public void testAopAdviceAfter() {

        AspectBiz aspectBiz = (AspectBiz) context.getBean("aspectBiz");
        aspectBiz.after();

    }

    @Test
    public void testAopThrowException() {
        AspectBiz aspectBiz = (AspectBiz) context.getBean("aspectBiz");
        aspectBiz.doSomethingWithException();

    }

    @Test
    public void testAopArround() {
        AspectBiz aspectBiz = (AspectBiz) context.getBean("aspectBiz");
        aspectBiz.doArround();

    }

}
