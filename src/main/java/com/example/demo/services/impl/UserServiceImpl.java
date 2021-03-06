package com.example.demo.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.services.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findUsers() throws Exception {
        List<User> userList = new ArrayList<User>();

        // TODO implementare e richiamare metodo per trasformare il Vo in Dto

        userRepository.findUsers();

        return userList;
    }
}
