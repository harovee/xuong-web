<%--
  Created by IntelliJ IDEA.
  User: haove
  Date: 6/26/2024
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/crud/add" method="post">
        Username: <input type="text" name="user">
        <br>
        National:
        <select name="national">
            <option value="vn" label="Viet Nam"></option>
            <option value="usa" label="USA"></option>
        </select>
        <br>
        Gender:
        Nam <input type="radio" name="gender" value="male" checked>
        Nữ <input type="radio" name="gender" value="female">
        <br>
        Single? <input type="checkbox" name="isSingle">
        <button type="submit">Add</button>
    </form>
</body>
</html>
