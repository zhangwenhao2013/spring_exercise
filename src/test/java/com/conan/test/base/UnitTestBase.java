package com.conan.test.base;

import org.junit.After;
import org.junit.Before;

public class UnitTestBase {

    @Before
    public void beforeTest() {
        System.out.println("beforeTest");
    }

    @After
    public void after() {
        System.out.println("after");
    }
}
