package com.example.demo.service;

import com.example.demo.vo.User;

import java.util.List;

public interface IUserService {
    User getById(long id);
    List<User> getByPage();
}
