package com.conan.annotation;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component(value = "anb")
public class AnnotationBean {

    public void print(String str) {
        System.out.println("AnnotationBeans  " + str);
    }
}
