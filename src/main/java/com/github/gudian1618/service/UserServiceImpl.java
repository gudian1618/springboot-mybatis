package com.github.gudian1618.service;

import com.github.gudian1618.mapper.UserMapper;
import com.github.gudian1618.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2020/2/29 9:54 下午
 */

@Service
public class UserServiceImpl implements UserService {

    /*
     接口实例化: 1.创建实现类 2.创建代理对象
     原则: 如果代理对象有接口,是使用JDK代理
          如果代理者没有实现接口,则使用cglib
     */

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
