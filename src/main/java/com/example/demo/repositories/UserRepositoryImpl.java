package com.example.demo.repositories;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.database.JdbcConnectionFactory;
import com.example.demo.entities.User;

import org.springframework.beans.factory.annotation.Autowired;

public class UserRepositoryImpl implements UserRepository {

    // Abilitare l'annotazione @Autowired per iniettare tramite l'annotazione
    // (preferire Constructor injection)
    // @Autowired
    private final JdbcConnectionFactory jdbcConnectionFactory;

    // Constructor Injection
    public UserRepositoryImpl(JdbcConnectionFactory connectionFactory) {
        this.jdbcConnectionFactory = connectionFactory;
    }

    @Override
    public List<User> findUsers() throws Exception {
        List<User> usersList = new ArrayList<User>();
        // TODO Auto-generated method stub
        return usersList;
    }
}
