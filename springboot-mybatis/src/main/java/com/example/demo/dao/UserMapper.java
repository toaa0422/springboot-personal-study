package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    public List findAllUser();

    public User findById(int id);
}
