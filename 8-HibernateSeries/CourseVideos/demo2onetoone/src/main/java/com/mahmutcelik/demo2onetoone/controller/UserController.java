package com.mahmutcelik.demo2onetoone.controller;

import com.mahmutcelik.demo2onetoone.model.Users;
import com.mahmutcelik.demo2onetoone.service.user.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    private List<Users> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    private Users getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }
}
