package com.v.service;


import com.v.model.User;

/**
 * IUserService数据库操作接口类
 *
 * @author QAQ
 *
 * */

public interface UserService {
    User login(User user);
}