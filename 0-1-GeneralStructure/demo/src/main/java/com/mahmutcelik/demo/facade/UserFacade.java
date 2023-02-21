package com.mahmutcelik.demo.facade;

import com.mahmutcelik.demo.dto.UserDto;
import com.mahmutcelik.demo.exception.UserNotFoundException;

import java.util.Optional;

public interface UserFacade {
    UserDto getUserByUsername(String username) throws UserNotFoundException;
}
