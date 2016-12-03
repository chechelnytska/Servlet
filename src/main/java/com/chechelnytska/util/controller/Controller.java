package com.chechelnytska.util.controller;

import com.chechelnytska.util.util.Request;
import com.chechelnytska.util.view.ViewModel;

import javax.servlet.http.HttpServletRequest;

public interface Controller {
    ViewModel process (Request request);
}
