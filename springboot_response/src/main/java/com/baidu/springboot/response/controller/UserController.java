package com.baidu.springboot.response.controller;

import com.baidu.springboot.response.common.Result;
import com.baidu.springboot.response.entity.User;
import com.baidu.springboot.response.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhangsan
 * @name UserController
 * @date 2025-05-10 20:48
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/queryAll")
    public Result<List<User>> getAllUsers() {
        return Result.success(userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public Result<User> getUserById(@PathVariable int id) {
        return userService.getUserById(id)
                .map(Result::success)
                .orElseGet(() -> Result.fail(404, "User not found"));
    }

    @PostMapping("/add")
    public Result<User> addUser(@RequestBody User user) {
        return Result.success(userService.addUser(user));
    }

    @DeleteMapping("/{id}")
    public Result<Void> deleteUserById(@PathVariable int id) {
        boolean deleted = userService.deleteUserById(id);
        if (deleted) {
            return Result.success();
        } else {
            return Result.fail(404, "User not found");
        }
    }
}

