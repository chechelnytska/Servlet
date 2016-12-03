package com.chechelnytska.util.service;

import com.chechelnytska.util.dao.Interfaces.UserDao;
import com.chechelnytska.util.model.User;
import com.chechelnytska.util.service.Interfaces.UserMailService;
import com.chechelnytska.util.service.Interfaces.UserService;

public class UserSeviceImpl implements UserService{
    private final UserMailService userMailService;
    private final UserDao userDao;

    public UserSeviceImpl(UserMailService userMailService, UserDao userDao) {
        this.userMailService = userMailService;
        this.userDao = userDao;
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }
}
