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
<div style="width:500px">
    <div class="alert alert-info">
        <div id="problem" style="margin-left: 35%"></div>
    </div>
    <div class="btn-group" data-toggle="buttons">

        <button type="button" class="btn btn-info" id="buttonA" style="width:500px">
	        <div style="float:left;margin-left: 36%">A.</div>
	        <div id="option1" style="float:left;margin-left: 10px"></div>
        </button><br><br>

       <button type="button" class="btn btn-info" id="buttonB" style="width:500px">
	        <div style="float:left;margin-left: 36%">B.</div>
	        <div id="option2" style="float:left;margin-left: 10px"></div>
       </button><br><br>

       <button type="button" class="btn btn-info" id="buttonC" style="width:500px">
            <div style="float:left;margin-left: 36%">C.</div>
        	<div id="option3" style="float:left;margin-left: 10px"></div>
       </button><br><br>
        
       <button type="button" class="btn btn-info" id="buttonD" style="width:500px">
	        <div style="float:left;margin-left: 36%">D.</div>
	        <div id="option4" style="float:left;margin-left: 10px"></div>
       </button><br><br>
        
      <button type="button" class="btn btn-info" id="buttonE" style="width:500px">
	        <div style="float:left;margin-left: 36%">E.</div>
	        <div id="option5" style="float:left;margin-left: 10px"></div>
      </button><br><br>
    </div>
</div>
<script src="js/DoScaleTest.js"></script>
</body>

<html>