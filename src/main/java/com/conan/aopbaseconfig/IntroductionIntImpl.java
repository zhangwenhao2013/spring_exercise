package com.conan.aopbaseconfig;

public class IntroductionIntImpl implements IntroductionInterface {
    public String upcase(String srt) {

        String s = srt.toUpperCase();

        System.out.println("这里是 IntroductionIntImpl 的 upcase   " + s);
        return s;
    }
}
