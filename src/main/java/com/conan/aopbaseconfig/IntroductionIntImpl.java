package com.conan.aopbaseconfig;

public class IntroductionIntImpl implements IntroductionInterface {
    public String upcase(String srt) {

        String s = srt.toUpperCase();
        return s;
    }
}
