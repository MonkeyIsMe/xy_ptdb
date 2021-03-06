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
<div class="container" style="width: 80%">
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
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
                <h4 class="modal-title" id="myModalLabel">
                    是否确定删除改用户
                </h4>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭
                </button>
                <button type="button" class="btn btn-primary" id="delete">确定 </button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
</body>
<script type="text/javascript">

    $('#patientlist').bootstrapTable({
    	url : 'PatientInfo.action', // 请求后台的URL（*）
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
                field : "u_name",
                title : "姓名",
                width : "60"
            },
            {
                field : "gender",
                title : "性别",
                width : "60"
            },
            {
                field : "birthday",
                title : "出生年月",
                width : "80"
            },
        	{
				field : "action",
				formatter : "Formatter",
				events : "operateEvents",
				align : "center",
				title : "查看-测试-删除",
				width : "120"
			}

        ]
    });
    function Formatter(value, row, index) {
		return '<a id="res"><span class="glyphicon glyphicon-user" style="cursor:pointer;"></span></a>&nbsp;&nbsp;&nbsp;' +
			'<a id="pic" ><span class="glyphicon glyphicon-list-alt" style="cursor:pointer;"></span></a>&nbsp;&nbsp;&nbsp;'+
			'<a id="minus" ><span class="glyphicon glyphicon-minus" data-toggle="modal" data-target="#myModal" style="cursor:pointer;"></span></a>&nbsp;&nbsp;&nbsp;';
	}
    window.operateEvents = {
    		'click #res' : function(e, value, row, index) {
    			var oRow = JSON.parse(JSON.stringify(row));
    			console.log(oRow);
    			//alert(oRow.patientId);
    			window.open("SeeScale.jsp?patientId="+ oRow.patientId);
    			//window.open("ScaleInfo.jsp");
    		},
    		'click #pic' : function(e, value, row, index) {
    			var oRow = JSON.parse(JSON.stringify(row));
    			console.log(oRow);
    			//alert(oRow.patientId);
    			window.open("ScaleInfo.jsp?patientId="+ oRow.patientId);
    			//window.open("ScaleInfo.jsp");
    		},
    		'click #minus' : function(e, value, row, index) {
/*     			var oRow = JSON.parse(JSON.stringify(row));
    			console.log(oRow);
    			//alert(oRow.patientId);
    			window.open("ScaleInfo.jsp?patientId="+ oRow.patientId); */
    			//window.open("ScaleInfo.jsp");
    			var oRow = JSON.parse(JSON.stringify(row));
    			$("#delete").click(function(){
    				DeletePatient(oRow.u_id);
    			});
    			
    		},
    }
    
    function DeletePatient(p_id){
    //alert(p_id);
      	$.post(
    			"DeletePatient.action",
    			{
    				p_id:p_id,
    			},
    			function(data){
    				data = data.replace(/^\s*/, "").replace(/\s*$/, "");
    				if(data == "SUCCESS") alert("删除成功");
    				window.location.replace("PatientInfo.jsp")
    			}
    	) 
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