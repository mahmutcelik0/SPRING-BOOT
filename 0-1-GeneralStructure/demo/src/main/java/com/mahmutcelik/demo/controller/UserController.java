package com.mahmutcelik.demo.controller;

import com.mahmutcelik.demo.dto.UserDto;
import com.mahmutcelik.demo.facade.UserFacade;
import com.mahmutcelik.demo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    private final UserFacade userFacade;
    private final UserService userService;

    public UserController(UserFacade userFacade, UserService userService) {
        this.userFacade = userFacade;
        this.userService = userService;
    }

    @GetMapping
    private List<UserDto> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/{username}")
    private UserDto getUserByUsername(@PathVariable("username") String username){
        return userFacade.getUserByUsername(username);
    }


}
