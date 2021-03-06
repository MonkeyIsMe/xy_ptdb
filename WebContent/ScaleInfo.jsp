<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;">
<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
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
<% String use_id = request.getParameter("patientId"); 
   session.setAttribute("use_id",use_id);
%>
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
                <table id="scalelist" class="table table-bordered table-hover table-striped" data-toggle="table">
                </table>
            </div>
        </div>

    </div>
</div>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h3 class="modal-title" id="myModalLabel">
                    量表信息
                </h3>
                <h3>基本情况
                <div id="intro"></div>
                </h3>
                <h3>指导语
                <div  id="guide"></div>
                </h3>
                
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary" id="test">开始测试 </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
</body>
<script type="text/javascript">

$('#scalelist').bootstrapTable({
	url : 'ScaleInfo.action', // 请求后台的URL（*）
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
            field : "s_ID",
            title : "量表编号",
            width : "100"
        },
        {
            field : "s_Name",
            title : "量表名字",
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
	return '<a id="res"><span class="glyphicon glyphicon-list-alt" data-toggle="modal" data-target="#myModal" style="cursor:pointer;"></span></a>&nbsp;&nbsp;&nbsp;' +
		'<a id="pic" ><span class="glyphicon glyphicon-picture" style="cursor:pointer;"></span></a>';
}

var p_id = "${param.patientId}";
window.operateEvents = {
		'click #res' : function(e, value, row, index) {
			var oRow = JSON.parse(JSON.stringify(row));
			m_id = oRow.s_ID;
			$.post(
					"GetMental.action",
					{
						m_id:m_id,
					},
					function(data){
						//alert(data);
						//alert(data.S_Intro);
						$("#intro").prepend(data.S_Intro);
						$("#guide").prepend(data.S_Guide);
					},
					'json'
			)
			//window.open("DoScaleTest.jsp?patientId=" + p_id + "&scale_id=" + oRow.s_ID);
			$("#test").click(function(){
				//window.open("DoScaleTest.jsp?patientId=" + p_id + "&scale_id=" + oRow.s_ID);
				window.self.location = "DoScaleTest.jsp?patientId=" + p_id +  '&scale_id=' + oRow.s_ID;
			});
		},
}


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