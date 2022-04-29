package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List findAllUser() {
        return userMapper.findAllUser();
    }

    @Override
    public User findById(int id) {
        return userMapper.findById(id);

    }
}
