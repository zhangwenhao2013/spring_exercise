package com.conan.annotation.services;

import com.conan.annotation.dao.DaoImpl;
import com.conan.annotation.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value = "myServiceImpl")
public class ServiceImpl implements IService {

    @Qualifier("myDaoImpl")
    @Autowired
    private IDao iDao;

    public ServiceImpl(DaoImpl iDao) {
        System.out.println("ServiceImpl 构造 ");
        this.iDao = iDao;
    }

    public void setiDao(DaoImpl iDao) {
        System.out.println("ServiceImpl 设置 ");
        this.iDao = iDao;
    }

    public void save(String arg) {
        System.out.println("这里是ServiceImpl  调用 iDao 的保存数据  数据内容 =   " + arg);
        iDao.save(arg);
    }
}
