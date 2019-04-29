package com.conan.aopbaseconfig.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice {

    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(method.getName() + "  执行之前 执行MyMethodBeforeAdvice  的  before ");
    }
}
