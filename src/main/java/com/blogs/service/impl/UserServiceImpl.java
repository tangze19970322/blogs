package com.blogs.service.impl;

import com.blogs.entity.User;
import com.blogs.mapper.UserMapper;
import com.blogs.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    public User findUserByAccountWithPassword(String account, String password) {
        return userMapper.findUserByAccountWithPassword(account,password);
    }
}
