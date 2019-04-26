package com.conan.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "myDaoImpl2")
public class Dao2Impl implements IDao {

    public void save(String arg) {
        System.out.println("这里是DAOimpl22222  保存数据  " + arg);
    }
}
