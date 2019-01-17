package com.blogs.service;

import com.blogs.entity.User;

public interface UserService {

    /**
     * 根据账号密码查询用户是否存在
     * @param account
     * @param password
     * @return
     */
    public User findUserByAccountWithPassword(String account,String password);
}
