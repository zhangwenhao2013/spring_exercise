package com.conan.aopbaseconfig.advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

public class MyAfterReturnThrowingAdvice implements ThrowsAdvice {

    public void afterThrowing(Method method, Object[] args, Object target, Exception ex){
        System.out.println("MoocThrowsAdvice afterThrowing 2 : " + method.getName() + "       " +
                target.getClass().getName());
    }
}
