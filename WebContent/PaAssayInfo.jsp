<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
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
<% String use_id = request.getParameter("patientId"); 
   session.setAttribute("use_id",use_id);
%>

<div class="container" style="width: 1000px">
    <div class="panel panel-default">
        <div class="panel-heading" style="padding-bottom: 10px;">
            <h3 class="panel-title">
                <i class="glyphicon glyphicon-tasks"></i> 病人列表
            </h3>
        </div>
        <div class="panel-body">
            <div>
                <table id="assaylist" class="table table-bordered table-hover table-striped" data-toggle="table">
                </table>
            </div>
        </div>

    </div>
</div>
</body>
<script type="text/javascript">

    $('#assaylist').bootstrapTable({
    	url : 'QueryAssay.action', // 请求后台的URL（*）
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
                field : "FPGlucose",
                title : "空腹血糖",
                width : "80"
            },
            {
                field : "twoHourGlucose",
                title : "2小时后血糖",
                width : "80"
            },
            {
                field : "ftriglycerides",
                title : "空腹甘油三酯",
                width : "80"
            },
            {
                field : "hdLipoprotein",
                title : "高密度脂蛋白",
                width : "80"
            },
            {
                field : "bmi",
                title : "体重（KG）/身高（米）",
                width : "80"
            },
            {
                field : "bloodPressure",
                title : "血压",
                width : "80"
            },
            {
                field : "assayDate",
                title : "创建日期",
                width : "80"
            },
        	{
				field : "action",
				formatter : "Formatter",
				events : "operateEvents",
				align : "center",
				title : "添加",
				width : "100"
			}

        ]
    });
    function Formatter(value, row, index) {
		return '<a id="res"><span class="glyphicon glyphicon-plus" style="cursor:pointer;"></span></a>&nbsp;&nbsp;&nbsp;';
	}
    window.operateEvents = {
    		'click #res' : function(e, value, row, index) {
    			var oRow = JSON.parse(JSON.stringify(row));
    			console.log(oRow);
    		}
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