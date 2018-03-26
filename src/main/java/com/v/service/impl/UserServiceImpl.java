package com.v.service.impl;


import com.v.dao.UserDao;
import com.v.model.User;
import com.v.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * IUserService数据库操作接口类
 *
 * @author QAQ*/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User login(User user) {
        user = userDao.selectByModel(user);
        return user;
    }
}