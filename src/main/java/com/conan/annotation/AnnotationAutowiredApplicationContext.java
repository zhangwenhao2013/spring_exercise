package com.conan.annotation;

import com.conan.annotation.dao.IDao;
import com.conan.annotation.services.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

@Component(value = "aaac")
public class AnnotationAutowiredApplicationContext {

    @Autowired
    public ApplicationContext context;

    private Set<IDao> daos;

    Map<String, IDao> map;

    public void getSerice() {

        ServiceImpl myServiceImpl = (ServiceImpl) context.getBean("myServiceImpl");

        myServiceImpl.save("这里是AnnotationAutowiredApplicationContext");

    }

    @Autowired
    public void setDaos(Set<IDao> daos) {
        this.daos = daos;
    }

    @Autowired
    public void setDaoMap(Map<String, IDao> map) {
        this.map = map;
    }

    public void printlnDaosName() {

        for (IDao dao : daos) {
            System.out.println(dao.getClass().getName());
        }

    }

    public void printlnDaosNameforMap() {

        for (Map.Entry<String, IDao> entry : map.entrySet()) {
            System.out.println("entry  =  " + entry.getKey() + "  value  " + entry.getValue().getClass().getName());
        }

    }

}
