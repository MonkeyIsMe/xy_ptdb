<%@page import="com.csu.entity.*"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;">
<meta charset="utf-8">
<title>心理测评系统</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <!-- 可选的Bootstrap主题文件（一般不使用） -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="table/bootstrap-table.min.js"></script>
    <script src="table/bootstrap-table-zh-CN.js"></script>
    <script src="table/bootstrap-table.js"></script>
    <link href="table/bootstrap-table.css">
</head>
<body>
<div id="div">

</div>
</body>
<script type="text/javascript">


var t = 0;
var x = 0;
$.ajax({ 
    url:'ScaleSee.action',
    type: "POST",
    async: false,
    dataType: "json",
    success: function(data) {
    	
    	for (var i = 0; i < data.length; i++){
    	    $("div").append('<span id="showdataid'+i+'">'+data[i].i_Content+'</span>'+'<br>');
    	    var id = data[i].i_ID;
    	    //将除第一个以外的题目置为隐藏
    	    /* if( i != 0){
    	    	$("#showdataid"+i).attr("style","display:none");
    	    } */
    	    $.ajax({ 
    	        url:'http://localhost/xy_ptdb/queryChoice.action',
    	        type: "POST",
    	        async: false,
    	        dataType: "json",
    	        data:{"id":id},
    	        success: function(date) {
    	        	//alert(i);
    	        	for (var j = 0 ; j < date.length; j++){
    	        	    //$("#showdataid"+i).append('<br>'+'<span id ="span'+i+'">'+date[j].c_Content+'</span>'+'<br>');
    	        	    /* <input id="r1" type="radio" value="0" name="gender">男</input> */
    	        	    $("#showdataid"+i).append('<input type="radio" name="select'+i+'" id ="span'+(t++)+'">'+date[j].c_Content+'<br>');
    	        	}
    	    }
    	    }); 
    	}
    	
}
});


</script>
</html>