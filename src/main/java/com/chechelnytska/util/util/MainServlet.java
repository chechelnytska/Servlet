package com.chechelnytska.util.util;




import com.chechelnytska.util.controller.Controller;
import com.chechelnytska.util.controller.ErrorController;
import com.chechelnytska.util.controller.HomePageController;
import com.chechelnytska.util.controller.SignUpController;
import com.chechelnytska.util.view.ViewModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class MainServlet extends HttpServlet {

    private int count=0;

    Map<Request, Controller> controllerMap = new HashMap<Request, Controller>();

    public void init() throws ServletException {
        controllerMap.put(Request.create("GET", "/home"), new HomePageController());
        controllerMap.put(Request.create("GET", "/login"), new SignUpController());
        controllerMap.put(Request.create("POST", "/login"), Factory.getCreateUserController());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        handle(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            handle(request, response);
    }

    private void handle(HttpServletRequest request,HttpServletResponse response)
        throws IOException, ServletException {
        Request req = new Request(request.getMethod(), request.getRequestURI(), request.getParameterMap());
        try {
            Controller controller = controllerMap.get(req);
            if (controller == null) {
               throw new RuntimeException("Cannot handle "+ req);
            }
            ViewModel viewModel = controller.process(req);
            forward(request, response, viewModel);
        } catch (Throwable t) {
            ViewModel viewModel = new ErrorController().process(req);
            viewModel.withAttribute("error", t.getClass() + " " + t.getMessage());
            forward(request, response, viewModel);
        }
    }

    private void forward(HttpServletRequest request, HttpServletResponse response, ViewModel viewModel) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher(getView(request, viewModel));
        setAttributes(request, viewModel);
        dispatcher.forward(request, response);
    }

    private void setAttributes(HttpServletRequest request, ViewModel viewModel) {
        for (String attr: viewModel.getAttribute().keySet()) {
            request.setAttribute(attr, viewModel.getAttribute(attr));
        }
    }

    private String getView(HttpServletRequest request, ViewModel viewModel) {
        return request.getContextPath() + viewModel.getView();
    }
}

