package com.conan.annotation.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "myDaoImpl")
public class DaoImpl implements IDao {

    public void save(String arg) {
        System.out.println("这里是DAOimpl11111  保存数据  " + arg);
    }
}
