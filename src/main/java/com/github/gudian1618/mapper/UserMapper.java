package com.github.gudian1618.mapper;

import com.github.gudian1618.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author gudian1618
 * @version 1.0
 * @date 2020/2/29 9:23 下午
 */

//@Mapper
public interface UserMapper {
    /*
    查询全部的user表中的数据
     */

    @Select("select * from user")
    List<User> findAll();

}
