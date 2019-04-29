package com.conan.aopbaseconfig.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class MyMethodAfterReturningAdvice implements AfterReturningAdvice {

    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println(method.getName() + "  执行之后 执行 MyMethodAfterReturningAdvice  的  after ");

    }
}
