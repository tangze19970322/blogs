package com.blogs.mapper;

import com.blogs.entity.User;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface UserMapper {

    /**
     * 根据账号密码查询用户是否存在
     * @param account
     * @param password
     * @return
     */
    public User findUserByAccountWithPassword(@Param("account")String account,@Param("password")String password);

}
