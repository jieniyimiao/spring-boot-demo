package com.example.demo.controller;

import com.example.demo.service.UserServiceJdbc;
import com.example.demo.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class JdbcController {


    @Autowired
    private UserServiceJdbc userServiceJdbc;

    @RequestMapping("/list")
    public List<User> getStus() {
        return userServiceJdbc.getList();
    }
}