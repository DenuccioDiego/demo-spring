package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.User;

public interface UserService {

    List<User> findUsers() throws Exception;

}
