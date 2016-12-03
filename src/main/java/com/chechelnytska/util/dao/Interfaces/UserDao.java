package com.chechelnytska.util.dao.Interfaces;

import com.chechelnytska.util.model.User;

import java.sql.SQLException;

public interface UserDao {
    void addUser(User user);
}
