package com.chechelnytska.util.controller;

import com.chechelnytska.util.model.User;
import com.chechelnytska.util.service.Interfaces.UserService;
import com.chechelnytska.util.util.Request;
import com.chechelnytska.util.view.ViewModel;


public class CreateUserController implements Controller {
    private final UserService userService;

    public CreateUserController(UserService userService) {
        this.userService = userService;
    }

    public ViewModel process(Request request){
        String userName = request.getParameter("userName");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user = User.create(userName, email, password);
        userService.addUser(user);
        return new ViewModel("/success.jsp").withAttribute("user", user);
    }
}
