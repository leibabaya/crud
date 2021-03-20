package com.crud.demo.service;

import com.crud.demo.dao.UserMapper;
import com.crud.demo.entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> selectUser(){
       return userMapper.selectUser();
    }
}
