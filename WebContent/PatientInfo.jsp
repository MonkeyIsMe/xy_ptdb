<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">心理测评系统</a>
        </div>
        <div class="collapse navbar-collapse" id="example-navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="#">病人管理</a></li>
                <li><a href="#">课题管理</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        量表管理 <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="#">查看量表</a></li>
                        <li class="divider"></li>
                        <li><a href="#">增加量表</a></li>
                        <li class="divider"></li>
                        <li><a href="#">修改量表</a></li>
                    </ul>
                </li>
                <li><a href="#">系统管理</a></li>
            </ul>
        </div>
    </div>
</nav>
</nav>
<div class="container" style="width: 1400px">
    <div class="panel panel-default">
        <div class="panel-heading" style="padding-bottom: 10px;">
            <h3 class="panel-title">
                <i class="glyphicon glyphicon-tasks"></i> 病人列表
            </h3>
        </div>
        <div class="panel-body">
            <div>
                <table id="patientlist" class="table table-bordered table-hover table-striped" data-toggle="table">
                </table>
            </div>
        </div>

    </div>
</div>
</body>
<script type="text/javascript">

    $('#patientlist').bootstrapTable({
    	url : 'http://localhost/xy_ptdb/PatientInfo.action', // 请求后台的URL（*）
 		method : "post",
 		//toolbar : "#toolbar",
 		pagination : "true",
 		search : "true",
 		showRefresh : "true",
 		showToggle : "true",
 		showColumns : "true",
 		pageSize : "25",
 		clickToSelect : "true",
        columns:[
            {
                field : "u_name",
                title : "姓名",
                width : "100"
            },
            {
                field : "identity",
                title : "身份证",
                width : "100"
            },
            {
                field : "patientId",
                title : "患者编号",
                width : "100"
            },
            {
                field : "admissionNumber",
                title : "住院号，门诊号",
                width : "100"
            },
            {
                field : "testNumber",
                title : "受试编号",
                width : "100"
            },
            {
                field : "gender",
                title : "性别",
                width : "100"
            },
            {
                field : "nation",
                title : "名族",
                width : "100"
            },
            {
                field : "birthday",
                title : "出生年月",
                width : "100"
            },
            {
                field : "birthArea",
                title : "出生地",
                width : "100"
            },
            {
                field : "builderId",
                title : "创建者Id",
                width : "100"
            },
        ]
    });


</script>
</html>