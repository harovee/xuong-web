<%--
  Created by IntelliJ IDEA.
  User: haove
  Date: 7/9/2024
  Time: 10:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/student/update" method="post"> <br>
    Ma SV: <input type="text" value="${std.studID}" name="studID" readonly><br>
    Ten SV: <input type="text" name="name" value="${std.name}"><br>
    Tuoi: <input type="number" name="age" value="${std.age}"><br>
    Gioi tinh: <input type="radio" name="gender" value="true" ${std.gender == true?"checked":""}>Nam
    <input type="radio" name="gender" value="false" ${std.gender == false?"checked":""}>Nu <br>
    <button type="submit">Update</button>
</form>
</body>
</html>
