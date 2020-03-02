package com.github.gudian1618.springbootmybatis;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.github.gudian1618.springbootmybatis.mapper.UserMapper;
import com.github.gudian1618.springbootmybatis.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

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

    // 查询用户列表信息
    // 将对象中部位null的属性当做where条件
    // 条件:age=18
    // 等于eq 大于gt 小于lt 大于等于ge 小于等于le
    @Test
    public void testFind() {
        // 1.方式一:使用对象封装
//        User user = new User();
//        user.setAge(18);

        // 2.直接使用字段赋值
//        QueryWrapper<User> queryWrapper = new QueryWrapper<>(user);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        // 测试等于 eq
//        queryWrapper.eq("age", 18);
        // 测试大于 gt
        queryWrapper.ge("age", 18);
        List<User> userList = userMapper.selectList(queryWrapper);
        System.out.println(userList);
    }

    /**
     * 3.数据更新
     * entity:需要修改数据的值
     * updateWrapper 条件构造器 充当where条件
     */
    @Test
    public void testUpdate() {
        User user = new User();
        user.setAge(19);
        UpdateWrapper<User> UpdateWrapper = new UpdateWrapper<>();
        userMapper.update(user, UpdateWrapper);
    }

    // 删除name字段为null的数据
    @Test
    public void deleteUser() {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.isNull("name");
        userMapper.delete(queryWrapper);
    }
}
