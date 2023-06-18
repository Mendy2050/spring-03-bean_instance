package com.itheima;

import com.itheima.dao.OrderDao;
import com.itheima.dao.UserDao;
import com.itheima.factory.OrderDaoFactory;
import com.itheima.factory.UserDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceUser {
    public static void main(String[] args) {
//        //create instance factory object
//        UserDaoFactory userDaoFactory = new UserDaoFactory();

//        //Create an object through the instance factory object
//        UserDao userDao = userDaoFactory.getUserDao();
//        userDao.save();


        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao1 = (UserDao) ctx.getBean("userDao");
        UserDao userDao2 = (UserDao) ctx.getBean("userDao");
        System.out.println(userDao1);
        System.out.println(userDao2);
//        userDao.save();

    }
}
