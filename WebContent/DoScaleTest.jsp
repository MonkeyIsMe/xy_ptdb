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
<style>

	#font{
		font-size:200px;
	}

	#panel{
	        text-align: center; /*让div内部文字居中*/
	        background-color: #fff;
	        border-radius: 20px;
	        width: 300px;
	        height: 350px;
	        margin: auto;
	        position: absolute;
	        top: 0;
	        left: 0;
	        right: 0;
	        bottom: 0;
	    }
</style>
<body>
<% String scale_id = request.getParameter("scale_id"); 
   session.setAttribute("scale_id",scale_id);
%>
<div style="width:600px" id="panel">
    <div class="alert alert-info">
        <div id="problem" style="text-align:center;height:60px;font-size:20px"></div>
    </div>
    <div class="btn-group" data-toggle="buttons" >

        <button type="button" class="btn btn-info" id="buttonA" style="width:600px;height:60px">
	        <div style="float:left;margin-left: 45%;font-size:20px;">A.</div>
	        <div id="option1" style="float:left;margin-left: 10px;font-size:20px"></div>
        </button><br><br>

       <button type="button" class="btn btn-info" id="buttonB" style="width:600px;height:60px;margin-top:10px">
	        <div style="float:left;margin-left: 45%;font-size:20px">B.</div>
	        <div id="option2" style="float:left;margin-left: 10px;font-size:20px"></div>
       </button><br><br>

       <button type="button" class="btn btn-info" id="buttonC" style="width:600px;height:60px;margin-top:10px">
            <div style="float:left;margin-left: 45%;font-size:20px">C.</div>
        	<div id="option3" style="float:left;margin-left: 10px;font-size:20px"></div>
       </button><br><br>
        
       <button type="button" class="btn btn-info" id="buttonD" style="width:600px;height:60px;margin-top:10px">
	        <div style="float:left;margin-left: 45%;font-size:20px">D.</div>
	        <div id="option4" style="float:left;margin-left: 10px;font-size:20px"></div>
       </button><br><br>
        
      <button type="button" class="btn btn-info" id="buttonE" style="width:600px;height:60px;margin-top:10px">
	        <div style="float:left;margin-left: 45%;font-size:20px">E.</div>
	        <div id="option5" style="float:left;margin-left: 10px;font-size:20px"></div>
      </button><br><br>
    </div>
</div>
<script src="js/DoScaleTest.js"></script>
</body>
<script>
var phoneWidth =  parseInt(window.screen.width);
var phoneScale = phoneWidth/640;
var ua = navigator.userAgent;
if (/Android (\d+\.\d+)/.test(ua)){
    var version = parseFloat(RegExp.$1);
    if(version>2.3){
        document.write('<meta name="viewport" content="width=640, minimum-scale = '+phoneScale+', maximum-scale = '+phoneScale+', target-densitydpi=device-dpi">');
    }else{
        document.write('<meta name="viewport" content="width=640, target-densitydpi=device-dpi">');
    }
} else {
    document.write('<meta name="viewport" content="width=640, user-scalable=no, target-densitydpi=device-dpi">');
}
</script>
<html>