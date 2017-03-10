package com.hwadee.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by localdomain on 2017/3/9.
 */
/*

public class LoginControllerTest {
    private ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
    @Test
    public void testLogin()
    {
        LoginController loginController = (LoginController)  context.getBean("loginController");
        loginController.getAccountService().login("123@qq.com","123");
    }
}
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-context.xml")
public class LoginControllerTest {
    //private ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
    @Autowired
    LoginController loginController;
    @Test
    public void testLogin()
    {
        //LoginController loginController = (LoginController)  context.getBean("loginController");
        loginController.getAccountService().login("123@qq.com","password");
    }
}