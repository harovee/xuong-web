package com.poly.java4.buoi3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "CRUDServlet", value = {
        "/crud/index",
        "/crud/add",
        "/crud/detail",
        "/crud/delete"
})
public class CRUDServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("index")){
            this.showIndex(req, res);
        } else if (uri.contains("delete")) {
            System.out.println("U delete what?");
        }

    }

    protected void showIndex(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("/buoi3/login.jsp").forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        String user = req.getParameter("user");
        String nation = req.getParameter("national");
        String gender = req.getParameter("gender");
        boolean single = req.getParameter("isSingle") != null;

        req.setAttribute("user", user);
        req.setAttribute("national", nation);
        req.setAttribute("gender", gender);
        req.setAttribute("isSingle", single);

        req.getRequestDispatcher("/buoi3/result.jsp").forward(req, res);
    }
}
