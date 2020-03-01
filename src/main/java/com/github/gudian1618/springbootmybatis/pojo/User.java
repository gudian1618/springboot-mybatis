package com.github.gudian1618.springbootmybatis.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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

// 所以只需要在pojo对象类头加一个@TableName注解和属性中的主键上加一个@TableId注解即可,这是最简写法
// 对象与数据表完成映射,如果名称一致可以省略不写
@TableName("user")
public class User implements Serializable {

    private static final long serialVersionUID = -154270977947197391L;

    // 主键自增
    @TableId(type = IdType.AUTO)
    private Integer id;
    // 如果字段属性与对象属性名称一致,注解可以省略不写
//    @TableField("name")
    private String name;
    private Integer age;
    private String sex;

}
