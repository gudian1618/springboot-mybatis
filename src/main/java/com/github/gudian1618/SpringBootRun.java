package com.github.gudian1618;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2020/2/29 9:17 下午
 */

@SpringBootApplication
// 为mapper接口创建代理对象
@MapperScan("com.github.gudian1618.mapper")
public class SpringBootRun {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRun.class, args);
    }

}
