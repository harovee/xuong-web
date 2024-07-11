package com.poly.java4.buoi4.controller;

import com.poly.java4.buoi4.entity.Student;
import com.poly.java4.buoi4.service.StudService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.SneakyThrows;
import org.apache.commons.beanutils.BeanUtils;
import org.eclipse.tags.shaded.org.apache.xpath.operations.Bool;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StudentController", value = {
        "/student/display", //get
        "/student/view-add", //get
        "/student/view-update", //get
        "/student/delete", //get
        "/student/detail", //get
        "/student/add", //post
        "/student/update" //post
})
public class StudentController extends HttpServlet {
    StudService svc = new StudService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("display")){
            display(req, resp);
        }else if (uri.contains("view-add")){
            viewAdd(req, resp);
        }else if(uri.contains("view-update")){
            viewUpdate(req, resp);
        }else if(uri.contains("delete")){
            deleteStd(req, resp);
        }else if(uri.contains("detail")){
            detail(req, resp);
        }
    }

    private void deleteStd(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Student std = svc.getByStudID(req.getParameter("id"));
//        System.out.println(svc.getAll().size());

//        System.out.println(std);
        svc.deleteStud(std.getStudID());
//        System.out.println(svc.getAll().size());
        resp.sendRedirect("/student/display");

    }

    private void detail(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student std = svc.getByStudID(req.getParameter("id"));
//        System.out.println(std);
        req.setAttribute("std", std);
        req.getRequestDispatcher("/buoi4/detail.jsp").forward(req, resp);
    }

    private void viewUpdate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student std = svc.getByStudID(req.getParameter("id"));
        req.setAttribute("std", std);
        req.getRequestDispatcher("/buoi4/update.jsp").forward(req, resp);
    }

    private void viewAdd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/buoi4/add.jsp").forward(req, resp);
    }

    private void display(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> list = svc.getAll();
        req.setAttribute("list", list);
        req.getRequestDispatcher("/buoi4/display.jsp").forward(req, resp);
    }


    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI();
        if (uri.contains("add")) {
            addStudent(req, resp);
        }else if (uri.contains("update")) {
            updateStudent(req, resp);
        }
    }

    private void updateStudent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Student std = svc.getByStudID(req.getParameter("id"));
        String stdID = req.getParameter("studID");
        String name = req.getParameter("name");
        int age = Integer.valueOf(req.getParameter("age"));
        boolean gender = Boolean.valueOf(req.getParameter("gender"));
        Student std = new Student(stdID, name, age, gender);
        svc.updateStudent(std);
        resp.sendRedirect("/student/display");

    }

    private void addStudent(HttpServletRequest req, HttpServletResponse resp) throws IOException, InvocationTargetException, IllegalAccessException {
//        String studID = req.getParameter("studID");
//        String name = req.getParameter("name");
//        int age = Integer.valueOf(req.getParameter("age"));
//        boolean gender = Boolean.valueOf(req.getParameter("gender"));
//        Student std = new Student(studID, name, age, gender);
        Student std = new Student();
        BeanUtils.populate(std, req.getParameterMap());
        svc.addStudent(std);
        resp.sendRedirect("/student/display");
    }
}
