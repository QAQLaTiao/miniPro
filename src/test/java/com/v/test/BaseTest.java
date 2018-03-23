package com.v.test;

import com.v.dao.MoneyDao;
import com.v.dao.UserDao;
import com.v.model.User;
import com.v.service.MoneyService;
import com.v.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config-dao.xml")
public class BaseTest {
    @Autowired
    private MoneyDao moneyDao;
    @Autowired
    private UserDao userDao;
    @Autowired
    private MoneyService moneyService;
    @Autowired
    private UserService userService;


    @Test
    public void testLogin() {
        User user = new User();
        user.setUsername("aaa");
        user.setPassword("aaa");
        user = userService.login(user);
        if(user != null){
            System.out.println(111111111);
        }else {
            System.out.println(222222222);
        }
    }
}
