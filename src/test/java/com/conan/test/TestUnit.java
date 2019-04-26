package com.conan.test;

import com.conan.annotation.AnnotationAutowiredApplicationContext;
import com.conan.annotation.AnnotationBean;
import com.conan.annotation.services.ServiceImpl;
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

        com.conan.services.ServiceImpl service = (com.conan.services.ServiceImpl) context.getBean("serviceImpl");
        service.save("wwwwww");
    }

    @Test
    public void testApplicationAware() {


    }

    @Test
    public void testAnnotationBean() {
        AnnotationBean anb = (AnnotationBean) context.getBean("anb");
        AnnotationBean anb2 = (AnnotationBean) context.getBean("anb");
        anb.print("测试成功" + anb.hashCode());
        anb.print("测试成功" + anb2.hashCode());
    }

    @Test
    public void testAnnotationBeanAutowired() {

        ServiceImpl myServiceImpl = (ServiceImpl) context.getBean("myServiceImpl");
        myServiceImpl.save("autowarid 测试");

    }

    /**
     * Autowired  直接提供 ApplicationContext
     */
    @Test
    public void testAnnotationAutowiredApplicationContext() {
        AnnotationAutowiredApplicationContext aaac = (AnnotationAutowiredApplicationContext) context.getBean("aaac");
        aaac.getSerice();

    }

    /**
     * Autowired  提供 set
     */
    @Test
    public void testAnnotationAutowiredSets() {
        AnnotationAutowiredApplicationContext aaac = (AnnotationAutowiredApplicationContext) context.getBean("aaac");
        aaac.printlnDaosName();
    }

    /**
     * Autowired  提供 map
     */
    @Test
    public void testAnnotationAutowiredMap() {
        AnnotationAutowiredApplicationContext aaac = (AnnotationAutowiredApplicationContext) context.getBean("aaac");
        aaac.printlnDaosNameforMap();
    }
}
