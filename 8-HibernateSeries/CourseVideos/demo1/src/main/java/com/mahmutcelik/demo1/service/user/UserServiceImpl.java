package com.mahmutcelik.demo1.service.user;

import com.mahmutcelik.demo1.exception.UserNotFoundException;
import com.mahmutcelik.demo1.model.User;
import com.mahmutcelik.demo1.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() throws UserNotFoundException {
        List<User> tempList = userRepository.findAll();
        if(tempList.size()>0) return tempList;
        throw new UserNotFoundException();
    }

    @Override
    public User getUserById(Long id) throws UserNotFoundException{
        return userRepository.findById(id).orElseThrow(UserNotFoundException::new);
    }
}
