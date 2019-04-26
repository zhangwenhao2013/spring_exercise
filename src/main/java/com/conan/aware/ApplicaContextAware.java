package com.conan.aware;

import com.conan.services.ServiceImpl;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;

import java.io.IOException;

public class ApplicaContextAware implements ApplicationContextAware, BeanNameAware {


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicaContextAware   ");
        ServiceImpl serviceImpl = (ServiceImpl) applicationContext.getBean("serviceImpl");
        serviceImpl.save("ApplicaContextAware");

        Resource resource = applicationContext.getResource("url:https://www.imooc.com/video/4030");
        System.out.println(resource.getFilename());
        try {
            System.out.println(resource.contentLength());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void setBeanName(String name) {
        //这个会先于 setApplicationContext 之前执行  先获取到自己的属性  在得到application的属性
        System.out.println("ApplicaContextAware   " + name);


    }
}
