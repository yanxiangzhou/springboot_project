package com.baidu.springboot.response.service;

import com.baidu.springboot.response.entity.User;
import com.baidu.springboot.response.mapper.UserMapper;
import com.baidu.springboot.response.utils.LoggerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author zhangsan
 * @name UserService
 * @date 2025-05-10 20:50
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers() {
        LoggerUtils.info("Fetching all users from database");
        return userMapper.getAllUsers();
    }

    public Optional<User> getUserById(int id) {
        LoggerUtils.info("Fetching user with id: {}", id);
        return userMapper.getUserById(id);
    }

    public User addUser(User user) {
        LoggerUtils.info("Adding new user to database: {}", user);
        userMapper.addUser(user);
        return user;
    }

    public boolean deleteUserById(int id) {
        LoggerUtils.info("Deleting user with id: {}", id);
        return userMapper.deleteUserById(id);
    }
}
