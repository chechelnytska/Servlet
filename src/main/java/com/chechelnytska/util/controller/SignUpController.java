package com.chechelnytska.util.controller;


import com.chechelnytska.util.util.Request;
import com.chechelnytska.util.view.ViewModel;

import javax.servlet.http.HttpServletRequest;

public class SignUpController implements Controller {


    @Override
    public ViewModel process(Request request) {
        return new ViewModel("/login.jsp");
    }
}
