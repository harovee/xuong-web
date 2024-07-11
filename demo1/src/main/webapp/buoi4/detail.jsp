<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: haove
  Date: 7/9/2024
  Time: 1:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    Ma SV: <input type="text" value="${std.studID}" name="studID" readonly><br>
    Ten SV: <input type="text" name="name" value="${std.name}" readonly><br>
    Tuoi: <input type="number" name="age" value="${std.age}" readonly><br>
    Gioi tinh: <input type="radio" name="gender" value="true" ${std.gender == true?"checked":""} readonly>Nam
    <input type="radio" name="gender" value="false" ${std.gender == false?"checked":""} readonly>Nu <br>
</body>
</html>
