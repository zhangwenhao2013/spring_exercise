package com.conan.aopbaseconfig;

public class BizLogicImpl implements BizLogic {

    public String save() {
        System.out.println("BizLogicImpl类中: BizLogicImpl save.");
        return "BizLogicImpl save.";
    }
}
