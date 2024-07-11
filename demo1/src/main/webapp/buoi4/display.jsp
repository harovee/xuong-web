<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: haove
  Date: 7/8/2024
  Time: 3:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <button><a href="/student/view-add">Add Student</a></button>
    <h2>Student List</h2>
    <table>
        <thead>
            <tr>
                <th>#</th>
                <th>Student ID</th>
                <th>Student Name</th>
                <th>Age</th>
                <th>Gender</th>
                <th colspan="3">Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${list}" var="std" varStatus="i">
                <tr>
                    <td>${i.index + 1}</td>
                    <td>${std.studID}</td>
                    <td>${std.name}</td>
                    <td>${std.age}</td>
                    <td>${std.gender}</td>
                    <td>
                        <a href="/student/detail?id=${std.studID}">Detail</a>
                        <a href="/student/view-update?id=${std.studID}">Update</a>
                        <a href="/student/delete?id=${std.studID}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
