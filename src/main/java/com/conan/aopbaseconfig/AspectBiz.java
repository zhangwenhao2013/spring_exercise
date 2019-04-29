package com.conan.aopbaseconfig;

public class AspectBiz {

    public void init() {
        System.out.println("这里是 AspectBiz 类的 init  方法");
    }

    public void after() {
        System.out.println("这里是 AspectBiz 类的 after  方法");
    }

    public void doSomethingWithException() {
        System.out.println("这里是 AspectBiz 类的 after  方法");
        throw new RuntimeException("执行 doSomethingWithException  出现异常");
    }

    public void doArround() {
        System.out.println("这里是 AspectBiz 类的 doArround  方法");
    }
}
