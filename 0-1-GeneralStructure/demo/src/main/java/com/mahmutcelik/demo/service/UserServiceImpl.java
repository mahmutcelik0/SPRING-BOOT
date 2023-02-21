package com.mahmutcelik.demo.service;

import com.mahmutcelik.demo.dto.UserDto;
import com.mahmutcelik.demo.dto.UserDtoMapper;
import com.mahmutcelik.demo.exception.UserNotFoundException;
import com.mahmutcelik.demo.repository.UserRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    //CONSTRUCTOR INJECTION
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(UserDtoMapper::convert)
                .toList();
    }

    @Override
    public UserDto getUserByUsername(String username){
        return userRepository.findByUsername(username)
                .map(UserDtoMapper::convert)
                .orElseThrow(UserNotFoundException::new);
    }
}