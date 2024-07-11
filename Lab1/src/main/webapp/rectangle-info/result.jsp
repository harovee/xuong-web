<%--
  Created by IntelliJ IDEA.
  User: haove
  Date: 6/27/2024
  Time: 8:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    *{
        box-sizing: border-box;
    }
    .container{
        border-radius: 5px;
        padding: 20px;
        border: groove;
        width: 500px;
    }
    .col-25{
        float: left;
        width: 25%;
        margin-top: 6px;
    }
    .col-75{
        float: left;
        width: 75%;
        margin-top: 18px;
    }
    .row::after{
        content: "";
        display: table;
        clear: both;
    }
    label{
        padding: 12px 12px 12px 0;
        display: inline-block;
    }
</style>
<body>
    <div class="container">
        <h1 style="text-align: center">Kết quả</h1>
        <div class="row">
            <div class="col-25">
                <label>Diện tích</label>
            </div>
            <div class="col-75">
                ${area}
            </div>
        </div>
        <div class="row">
            <div class="col-25">
                <label>Chu vi</label>
            </div>
            <div class="col-75">
                ${perimeter}
            </div>
        </div>
    </div>
</body>
</html>
