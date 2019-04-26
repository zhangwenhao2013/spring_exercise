package com.conan.test;

import com.conan.services.ServiceImpl;
import com.conan.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestUnit extends UnitTestBase {

    public TestUnit() {
//        super("classpath:spring-injection.xml");
        super("classpath:spring-a.xml");
        System.out.println("TestUnit");
    }

    @Test
    public void test() {
        System.out.println("xx");

        ServiceImpl service = (ServiceImpl) context.getBean("serviceImpl");
        service.save("wwwwww");
    }

    @Test
    public void testApplicationAware() {

    }
}
