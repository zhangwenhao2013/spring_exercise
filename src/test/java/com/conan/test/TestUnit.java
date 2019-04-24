package com.conan.test;

import com.conan.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestUnit extends UnitTestBase {

    public TestUnit() {
        System.out.println("TestUnit");
    }

    @Test
    public void test() {
        System.out.println("xx");
    }
}
