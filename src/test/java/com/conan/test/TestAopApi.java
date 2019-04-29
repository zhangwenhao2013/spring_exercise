package com.conan.test;

import com.conan.aopbaseconfig.BizLogic;
import com.conan.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestAopApi extends UnitTestBase {
    public TestAopApi() {
        super("classpath:spring-aop-api.xml");
    }

    @Test
    public void testMyAdvice() {

        BizLogic bizLogic = (BizLogic) context.getBean("bizLogicImpl");
        bizLogic.save();

    }

    @Test
    public void testMyAdvice1() {

        BizLogic bizLogic = (BizLogic) context.getBean("bizLogicImpl1");
        bizLogic.save();

    }

}
