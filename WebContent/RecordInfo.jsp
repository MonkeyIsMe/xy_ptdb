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
<div>
<ul class="nav nav-tabs">
  <li role="presentation" class="navbar-header"><a href="PatientInfo.jsp" style="font-size:15px">心理测评系统</a></li>
  <li role="presentation"><a href="AddPatient.jsp">病人管理</a></li>
  <li role="presentation"><a href="#">课题管理</a></li>
   <li role="presentation" class="dropdown">
    <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
      信息管理  <span class="caret"></span>
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
                        <li class="divider"></li>
                        <li><a href="AssayInfo.jsp">病人详细信息管理</a></li>
                        <li class="divider"></li>
                        <li><a href="DiagInfo.jsp">诊断信息管理</a></li>
    </ul>
  </li>
   <li role="presentation" class="dropdown">
    <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
      量表管理 <span class="caret"></span>
    </a>
    <ul class="dropdown-menu">
       <li><a href="SeeScale.jsp">查看量表</a></li>
                        <li class="divider"></li>
                        <li><a href="#">增加量表</a></li>
    </ul>
  </li>
  <li role="presentation"><a href="#">系统管理</a></li>
</ul>
</div>
<div class="container" style="width: 100%">
    <div class="panel panel-default">
        <div class="panel-heading" style="padding-bottom: 10px;">
            <h3 class="panel-title">
                <i class="glyphicon glyphicon-tasks"></i> 病人列表
            </h3>
        </div>
        <div class="panel-body">
            <div>
                <table id="recordlist" class="table table-bordered table-hover table-striped" data-toggle="table">
                </table>
            </div>
        </div>

    </div>
</div>
</body>
<script type="text/javascript">

    $('#recordlist').bootstrapTable({
    	url : 'RecordInfo.action', // 请求后台的URL（*）
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
                field : "patientId",
                title : "病人Id",
                width : "100"
            },
            {
                field : "diagnosisDate",
                title : "诊断日期",
                width : "100"
            },
            {
                field : "doctorName",
                title : "就诊医生",
                width : "100"
            },
            {
                field : "recordName",
                title : "登记人",
                width : "100"
            },
            {
                field : "recordDate",
                title : "登记日期",
                width : "100"
            },
            {
                field : "r1",
                title : "备用1",
                width : "100"
            },
            {
                field : "r2",
                title : "备用2",
                width : "100"
            },
        ]
    });

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
</html>