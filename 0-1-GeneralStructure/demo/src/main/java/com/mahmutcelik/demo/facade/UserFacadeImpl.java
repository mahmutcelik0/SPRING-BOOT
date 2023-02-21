package com.mahmutcelik.demo.facade;

import com.mahmutcelik.demo.dto.UserDto;
import com.mahmutcelik.demo.exception.UserNotFoundException;
import com.mahmutcelik.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserFacadeImpl implements UserFacade{

    private final UserService userService;

    public UserFacadeImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDto getUserByUsername(String username){
        return userService.getUserByUsername(username);
    }
}
