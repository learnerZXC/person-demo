<%@ page language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
  <head>
    <title>登陆</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet" media="screen">
    
    <style type="text/css">
      body {
        padding-top: 40px;
        padding-bottom: 40px;
        background-color: #f5f5f5;
      }

      .form-signin {
        max-width: 300px;
        padding: 19px 29px 29px;
        margin: 0 auto 20px;
        background-color: #fff;
        border: 1px solid #e5e5e5;
        -webkit-border-radius: 5px;
           -moz-border-radius: 5px;
                border-radius: 5px;
        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
           -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
                box-shadow: 0 1px 2px rgba(0,0,0,.05);
      }
      .form-signin .form-signin-heading,
      .form-signin .checkbox {
        margin-bottom: 10px;
      }
      .form-signin input[type="text"],
      .form-signin input[type="password"] {
        font-size: 16px;
        height: auto;
        margin-bottom: 15px;
        padding: 7px 9px;
      }

    </style>
    
  </head>
  <body>
    <div class="container">
      <form class="form-signin" action="${pageContext.request.contextPath}/person/doLogin" method="post">
        <h3 class="form-signin-heading">登陆</h3>
        <input type="text" name="userName" class="input-block-level" placeholder="邮箱/用户名/手机号">
        <input type="password" name="password" class="input-block-level" placeholder="密码">
        <label class="checkbox">
          <input type="checkbox" value="remember-me"> 记住密码
        </label>
        <button class="btn btn-large btn-primary" type="submit">登陆</button>
      </form>
    </div>
    
    
    <script src="http://code.jquery.com/jquery.js"></script>
    <script src="../js/bootstrap.min.js"></script>
  </body>
</html>