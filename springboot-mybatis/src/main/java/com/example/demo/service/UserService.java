package com.example.demo.service;

import com.example.demo.pojo.User;

import java.util.List;

public interface UserService {
    public List findAllUser();

    public User findById(int id);
}