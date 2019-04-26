package com.conan.services;

import com.conan.dao.IDao;

public class ServiceImpl implements IService {

    private IDao iDao;

    public void setiDao(IDao iDao) {
        this.iDao = iDao;
    }

    public void save(String arg) {
        System.out.println("这里是ServiceImpl  调用 iDao 的保存数据  数据内容 =   " + arg);
        iDao.save(arg);
    }
}
