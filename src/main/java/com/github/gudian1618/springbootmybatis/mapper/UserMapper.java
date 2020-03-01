package com.github.gudian1618.springbootmybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.github.gudian1618.springbootmybatis.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2020/2/29 9:23 下午
 */

//@Mapper
public interface UserMapper extends BaseMapper<User> {
    /**
     * 查询全部的user表中的数据
     */
    @Select("select * from user")
    List<User> findAll();

    /**
     * 规定:mybatis中要求数据传参必须是单值
     * 多参数属性解决方案:
     * 0.本身就是单值
     * 1.利用对象将数据封装 User id age name sex
     * 2.将数据封装为map集合 @Param("key")int id
     * 3.将数据封装为array/list集合
     *
     * @param user
     * @return
     */
    @Insert("insert into user values(null,#{name},#{age},#{sex})")
    int insertUser(User user);

    // 实现用户的修改 age=18的 名字修改
    @Update("update user set name=#{name} where age=#{age}")
    int updateUser(User user);

}
