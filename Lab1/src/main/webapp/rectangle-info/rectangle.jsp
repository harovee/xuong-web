
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
        width: 700px;
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
    .btn{
        margin-left: 162px;
        margin-top: 6px;
    }
    input{
        width: 80%;
    }
</style>
<body>
  <div class="container">
      <h1 style="text-align: center">Thông tin hình chữ nhật</h1>
      <form action="/calc" method="post">
          <div class="row">
              <div class="col-25">
                  <label for="width"> Chiều rộng</label>
              </div>
              <div class="col-75">
                  <input type="number" name="width" id="width">
              </div>
          </div>

          <div class="row">
              <div class="col-25">
                  <label for="length"> Chiều dài</label>
              </div>
              <div class="col-75">
                  <input type="number" name="length" id="length">
              </div>
          </div>

          <button type="submit" class="btn">Calculate</button>
      </form>
  </div>
</body>
</html>
