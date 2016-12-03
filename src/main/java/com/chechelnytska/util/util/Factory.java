package com.chechelnytska.util.util;

import com.chechelnytska.util.controller.Controller;
import com.chechelnytska.util.controller.CreateUserController;
import com.chechelnytska.util.dao.Interfaces.UserDao;
import com.chechelnytska.util.dao.UserDaoImpl;
import com.chechelnytska.util.service.Interfaces.UserMailService;
import com.chechelnytska.util.service.Interfaces.UserService;
import com.chechelnytska.util.service.UserSeviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Factory {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "Marina", "1234");
        }catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static Controller getCreateUserController() {
        return new CreateUserController(getUserService(getUserDao(getConnection())));
    }

    public static UserService getUserService(UserDao userDao) {
        return new UserSeviceImpl(null, userDao);  //TODO create UserMailServiceImpl;
    }

    public static UserDao getUserDao(Connection connection){
        return new UserDaoImpl(connection);
    }
}
