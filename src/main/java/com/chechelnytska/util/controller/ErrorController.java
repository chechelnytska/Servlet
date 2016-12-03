package com.chechelnytska.util.controller;

import com.chechelnytska.util.util.Request;
import com.chechelnytska.util.view.ViewModel;

/**
 * Created by marina on 03.12.16.
 */
public class ErrorController implements Controller {
    @Override
    public ViewModel process(Request request) {
        return new ViewModel("/error.jsp").withAttribute("error", request.getParameter("error"));
    }
}
