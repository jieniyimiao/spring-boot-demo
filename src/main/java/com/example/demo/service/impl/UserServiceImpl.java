package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import com.example.demo.vo.User;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getById(long id) {
        return userMapper.getById(id);
    }

    @Override
    public List<User> getByPage() {
        PageHelper.startPage(1, 1);//页数 每页数据数
        return userMapper.selectAll();
    }
}