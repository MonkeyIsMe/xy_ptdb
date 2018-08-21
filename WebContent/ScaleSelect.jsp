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
<% String u_id = request.getParameter("u_id"); 
   String patientId = request.getParameter("patientId");
   session.setAttribute("u_id",u_id);   
   session.setAttribute("patientId",patientId);  //在开始测试时候有用
%>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">心理测评系统</a>
        </div>
        <div class="collapse navbar-collapse" id="example-navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="AddPatient.jsp">病人管理</a></li>
                <li><a href="#">课题管理</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        信息管理 <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="SpecimenInfo.jsp">标本信息管理</a></li>
                        <li class="divider"></li>
                        <li><a href="RecordInfo.jsp">记录信息管理</a></li>
                        <li class="divider"></li>
                        <li><a href="ReportInfo.jsp">报告信息管理</a></li>
                        <li class="divider"></li>
                        <li><a href="ResultInfo.jsp">结果信息管理</a></li>
                        <li class="divider"></li>
                        <li><a href="FkindInfo.jsp">大类管理</a></li>
                        <li class="divider"></li>
                        <li><a href="SkindInfo.jsp">小类管理</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        量表管理 <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="SeeScale.jsp">查看量表</a></li>
                        <li class="divider"></li>
                        <li><a href="#">增加量表</a></li>
                    </ul>
                </li>
                <li><a href="#">系统管理</a></li>
            </ul>
        </div>
    </div>
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
                <table id="skindlist" class="table table-bordered table-hover table-striped" data-toggle="table">
                </table>
            </div>
        </div>

    </div>
</div>
</body>
<script type="text/javascript">

    $('#skindlist').bootstrapTable({
    	url : 'http://localhost/xy_ptdb/SkindInfo.action', // 请求后台的URL（*）
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
				field : 'Number',
				title : '编号',
				formatter : function(value, row, index) {
					return index + 1;
				},
				width : "50"
			},
            {
                field : "sk_id",
                title : "姓名",
                width : "100"
            },
            {
                field : "f_id",
                title : "身份证",
                width : "100"
            },
            {
                field : "name",
                title : "患者编号",
                width : "100"
            },
        	{
				field : "action",
				formatter : "Formatter",
				events : "operateEvents",
				align : "center",
				title : "测试--查看",
				width : "100"
			}

        ]
    });
    function Formatter(value, row, index) {
		return '<a id="res"><span class="glyphicon glyphicon-list-alt" style="cursor:pointer;"></span></a>&nbsp;&nbsp;&nbsp;' +
			'<a id="pic" ><span class="glyphicon glyphicon-picture" style="cursor:pointer;"></span></a>';
	}
    var p_id = "${param.patientId}";
    var u_id = "${param.u_id}";
    window.operateEvents = {
    		'click #res' : function(e, value, row, index) {
    			var oRow = JSON.parse(JSON.stringify(row));
    			console.log(oRow);
    			console.log(u_id);
    			console.log(p_id);
    		},
    }
</script>
</html>