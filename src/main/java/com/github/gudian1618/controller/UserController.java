package com.github.gudian1618.controller;

import com.github.gudian1618.pojo.User;
import com.github.gudian1618.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2020/2/29 10:02 下午
 */

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    // 用户通过localhost:8090/findAll获取用户数
    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }
}
