package com.example.demo.mapper;

import com.example.demo.vo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User getById(long id);

    @Select("select * from user ")
    List<User> selectAll();
}
