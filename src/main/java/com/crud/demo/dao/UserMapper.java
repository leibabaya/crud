package com.crud.demo.dao;

import com.crud.demo.entry.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> selectUser();
}
