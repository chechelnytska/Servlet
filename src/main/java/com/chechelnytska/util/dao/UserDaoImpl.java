package com.chechelnytska.util.dao;

import com.chechelnytska.util.dao.Interfaces.UserDao;
import com.chechelnytska.util.model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class UserDaoImpl implements UserDao {
    private final Connection connection;

    public UserDaoImpl(Connection connection){
        this.connection = connection;
    }

    public void addUser(User user) {
        String login = user.getUserName();
        String password = user.getPassword();
        String email = user.geteMail();

        try {
            Statement statement = connection.createStatement();
            String query = "INSERT INTO SHOP.USERS(NAME, PASSWORD, EMAIL) VALUES ('" + login + "', '" + password + "', '" + email + "');";
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
