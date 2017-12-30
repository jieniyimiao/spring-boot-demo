package com.example.demo.service;

import com.example.demo.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class UserServiceJdbc {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<User> getList() {
        String sql = "select id,username,password from user where id = 7";
        return jdbcTemplate.query(sql, new RowMapper<User>(){

            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getLong("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                return user;
            }
        });
    }
}