<%--
  Created by IntelliJ IDEA.
  User: haove
  Date: 7/9/2024
  Time: 9:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add new student</title>
</head>
<body>
    <form action="/student/add" method="post"> <br>
        Ma SV: <input type="text" name="studID"><br>
        Ten SV: <input type="text" name="name"><br>
        Tuoi: <input type="number" name="age"><br>
        Gioi tinh: <input type="radio" name="gender" value="true">Nam
        <input type="radio" name="gender" value="false">Nu <br>
        <button type="submit">Add</button>
    </form>
</body>
</html>
