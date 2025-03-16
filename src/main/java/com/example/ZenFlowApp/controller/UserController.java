package com.example.ZenFlowApp.controller;

import com.example.ZenFlowApp.model.User;
import com.example.ZenFlowApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }
}
