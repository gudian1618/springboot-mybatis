package com.github.gudian1618.springbootmybatis;

import com.github.gudian1618.springbootmybatis.controller.UserController;
import com.github.gudian1618.springbootmybatis.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2020/3/1 9:09 下午
 * 这两个注解表示添加springboot的测试类注解,以及运行关联SpringRunner的字节码对象
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class TestCRUD {

    // 从spring容器中取值
    @Autowired
    private UserController userController;

    @Test
    public void insertUser() {
        User user = new User();
        user.setName("苏妲己").setAge(18).setSex("女");
        userController.insertUser(user);
        System.out.println("入库成功!");
    }

    // 测试修改
    @Test
    public void updateUser() {
        User user = new User();
        user.setAge(18).setName("哈利波特!");
        userController.updateUser(user);
    }


}
