package com.github.gudian1618.springbootmybatis.service;

import com.github.gudian1618.springbootmybatis.pojo.User;

import java.util.List;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2020/2/29 9:53 下午
 */

public interface UserService {

    List<User> findAll();

    int insertUser(User user);

    int updateUser(User user);

}
