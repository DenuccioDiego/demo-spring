package com.example.demo.repositories;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.database.JdbcConnectionFactory;
import com.example.demo.entities.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
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
        List<User> userList = new ArrayList<User>();

        Statement stmt = jdbcConnectionFactory.openConnection().createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM public.'user' ORDER BY codicefiscale ASC");

        while (rs.next()) {
            System.out.println(rs.getString("nome"));
            userList.add(new User());
        }

        return userList;
    }
}
