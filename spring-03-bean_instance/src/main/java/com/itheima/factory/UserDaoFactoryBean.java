package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;
//use FactoryBean to create object
public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    //Replace instance factory‘s original method for creating objects
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    public Class<?> getObjectType() {
        return UserDao.class;
    }

}
