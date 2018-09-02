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
<div class="container" style="width: 100%">
    <div class="panel panel-default">
        <div class="panel-heading" style="padding-bottom: 10px;">
            <h3 class="panel-title">
                <i class="glyphicon glyphicon-tasks"></i> 标本列表
            </h3>
        </div>
        <div class="panel-body">
            <div>
                <table id="Specimenlist" class="table table-bordered table-hover table-striped" data-toggle="table">
                </table>
            </div>
        </div>

    </div>
</div>
</body>
<script type="text/javascript">

    $('#Specimenlist').bootstrapTable({
    	url : 'PaSpecimenInfo.action', // 请求后台的URL（*）
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
                field : "specimen_name",
                title : "标本名称",
                width : "100"
            },
            {
                field : "specimen_type",
                title : "标本类型",
                width : "100"
            },
            {
                field : "specimen_place",
                title : "地点存放",
                width : "100"
            },
            {
                field : "specimen_record",
                title : "使用记录",
                width : "100"
            },
            {
                field : "patientId",
                title : "标本对应的患者编号",
                width : "100"
            },
            {
                field : "specimen_num",
                title : "标本数量",
                width : "100"
            },
            {
                field : "concentration",
                title : "标本浓度",
                width : "100"
            },
            {
                field : "latestTime",
                title : "最近使用时间",
                width : "100"
            },
            {
                field : "description",
                title : "备注",
                width : "100"
            },
        ]
    });


</script>
</html>