package com.mahmutcelik.demo.service;

import com.mahmutcelik.demo.dto.UserDto;
import com.mahmutcelik.demo.exception.UserNotFoundException;
import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();

    UserDto getUserByUsername(String username) throws UserNotFoundException;

}
