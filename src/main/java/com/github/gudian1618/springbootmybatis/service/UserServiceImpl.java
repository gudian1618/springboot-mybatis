package com.github.gudian1618.springbootmybatis.service;

import com.github.gudian1618.springbootmybatis.mapper.UserMapper;
import com.github.gudian1618.springbootmybatis.pojo.User;
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
     有接口是 本身是接口,或者实现了接口
     JDK必须要有接口
     cglib有无接口都可以创建,一般没有接口时用的多
     cglib创建代理对象是目标对象的子类
          如果代理者没有实现接口,则使用cglib
     中介(代理) 被代理对象相对于代理,是要被执行的对象
     */

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateUser(user);
    }
}
