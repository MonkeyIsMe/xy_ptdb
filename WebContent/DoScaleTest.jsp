<%@page import="com.csu.entity.*"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <!-- 可选的Bootstrap主题文件（一般不使用） -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<% String scale_id = request.getParameter("scale_id"); 
   session.setAttribute("scale_id",scale_id);
%>
<div style="width:400px">
    <div class="alert alert-info">
        <div id="problem"></div>
    </div>
    <div class="btn-group" data-toggle="buttons">

        <label class="btn btn-primary" style="width:400px">
            A<input type="radio" name="options" id="option1">
            <div id="op1"></div>
        </label><br><br>

        <label class="btn btn-primary" style="width:400px">
            B<input type="radio" name="options" id="option2">
            <div id="op2"></div>
        </label><br><br>

        <label class="btn btn-primary" style="width:400px">
            C<input type="radio" name="options" id="option3">
            <div id="op3"></div>
        </label><br><br>
        
        <label class="btn btn-primary" style="width:400px">
            D<input type="radio" name="options" id="option4">
            <div id="op4"></div>
        </label><br><br>
        
        <label class="btn btn-primary" style="width:400px">
            E<input type="radio" name="options" id="option5">
            <div id="op5"></div>
        </label><br><br>
    </div>
</div>
<div>
    <button type="button" class="btn btn-default btn-lg " id="first">上一题</button>
    <button type="button" class="btn btn-default btn-lg " id="next">下一题</button>
</div>
<script src="js/DoScaleTest.js"></script>
</body>

<html>