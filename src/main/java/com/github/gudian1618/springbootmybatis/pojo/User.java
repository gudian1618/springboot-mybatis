package com.github.gudian1618.springbootmybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2020/2/29 9:20 下午
 */

// 常用默认注解 set/get/toString
@Data
// 链式加载注解
@Accessors(chain = true)
// 无参构造注解
@NoArgsConstructor
// 有参构造
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = -154270977947197391L;

    private Integer id;
    private String name;
    private Integer age;
    private String sex;

}
