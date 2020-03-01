package com.github.gudian1618.springbootmybatis;

import com.github.gudian1618.springbootmybatis.mapper.UserMapper;
import com.github.gudian1618.springbootmybatis.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2020/3/1 11:33 下午
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestMybatisPlus {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void insert() {
        User user = new User();
        user.setName("mybatisPlus").setAge(18).setSex("男");
        int rows = userMapper.insert(user);
        System.out.println(rows);
    }
}
