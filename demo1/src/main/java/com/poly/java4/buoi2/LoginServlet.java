package com.poly.java4.buoi2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("buoi2/login.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //get value user & psw from form
        String user = req.getParameter("user");
        String psw = req.getParameter("psw");

        //forward value to new .jsp
        req.setAttribute("user", user);
        req.setAttribute("psw", psw);

        //new .jsp result
        req.getRequestDispatcher("buoi2/result.jsp").forward(req, res);
    }
}
