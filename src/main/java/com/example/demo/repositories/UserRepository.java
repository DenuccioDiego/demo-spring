package com.example.demo.repositories;

import java.util.List;

import com.example.demo.entities.User;

public interface UserRepository {

    List<User> findUsers() throws Exception;
}
