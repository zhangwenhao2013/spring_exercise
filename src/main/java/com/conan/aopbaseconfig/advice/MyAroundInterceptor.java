package com.conan.aopbaseconfig.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAroundInterceptor implements MethodInterceptor {
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("MyAroundInterceptor 1 : " + invocation.getMethod().getName() + "     " +
                invocation.getStaticPart().getClass().getName());
        Object obj = invocation.proceed();
        System.out.println("MyAroundInterceptor 2 : " + obj);
        return obj;
    }
}
