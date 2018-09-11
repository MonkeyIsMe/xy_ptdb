<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>登录界面</title>
    <!-- Meta-Tags -->
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link href="css/login.css" type="text/css">
    <!-- //Meta-Tags -->
    <link rel="stylesheet" href="css/style.css" type="text/css">
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <!-- 可选的Bootstrap主题文件（一般不使用） -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<body>
<h1 style="font-family: cursive;font-size: 30px;color: white;margin-top: 100px">心理测试系统</h1>
<div class="container w3layouts agileits" style="width: 500px">
        <div class="login w3layouts agileits" style="margin-left: 25%">
            <h2 style="margin-left: 28%;font-family: serif;font-size: 30px;color: white;">登录界面</h2>
            <div>
                <input type="text" name="account" placeholder="用户名"  style="width: 250px" id="account">
            </div>
            <div>
            	<input type="password" name="password" placeholder="密码" style="width: 250px" id="password">
            </div>
            <div>
            	<input type="text" name="login_code" class="form-control" id="login_code" maxlength="4" 
            	autocomplete="off" style="width: 250px" placeholder="验证码">
            	<img src="SendCode.action" class="veri-code" id="code_img" style="margin-left:10px;width:250px;height:30px">
            </div>
            <div class="send-button w3layouts agileits" style="margin-top:20px;width:300px;margin-left:40px">
                <input type="submit" value="登 录"  align="right" id="submit-btn">
            </div>
        </div>
</div>
<div id="alert_login" class="alert-danger alert alert-login"
     style="position: relative; top: 52%; margin: 0 auto;width: 500px;height: 50px">
</div>
<script src="js/login.js"></script>
</body>
</html>