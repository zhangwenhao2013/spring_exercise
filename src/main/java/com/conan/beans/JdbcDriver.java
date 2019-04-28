package com.conan.beans;


public class JdbcDriver {

    private String name;

    private String pwd;

    public JdbcDriver(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "JdbcDriver{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
