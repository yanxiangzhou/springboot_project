package com.baidu.springboot.response.mapper;

import com.baidu.springboot.response.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Optional;

@Mapper
public interface UserMapper {
    List<User> getAllUsers();
    Optional<User> getUserById(int id);
    void addUser(User user);
    boolean deleteUserById(int id);
}