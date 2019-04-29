package com.conan.aopbaseconfig;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

    public void before() {
        System.out.println("这里是 MyAspect 的before 方法");
    }

    public void after() {
        System.out.println("这里是 MyAspect 的 after 方法");
    }

    public void getException() {
        System.out.println("这里是 MyAspect 的 getException 方法");
    }

    public void returnSomething() {
        System.out.println("这里是 MyAspect 的 returnSomething 方法");
    }

    public Object aroundMethod(ProceedingJoinPoint ppj) {
        Object proceed = null;
        try {
            System.out.println("这里是 MyAspect 的 aroundMethod 在目标方法执行之前");
            proceed = ppj.proceed();
            System.out.println("这里是 MyAspect 的 aroundMethod 在目标方法执行之后");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return proceed;

    }

}
