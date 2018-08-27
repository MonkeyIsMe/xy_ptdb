<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
    <script src="table/bootstrap-table.min.js"></script>
    <script src="table/bootstrap-table-zh-CN.js"></script>
    <script src="table/bootstrap-table.js"></script>
    <link href="table/bootstrap-table.css">
    
       <link rel="stylesheet" href="css/man-maincss.css" type="text/css">

    <script type="text/javascript" src="js/main.js"></script>	
    
</head>
<body>
<% String patientId = request.getParameter("patientId"); 
   session.setAttribute("patientId",patientId);
%>
<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="PatientInfo.jsp">心理测评系统</a>
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
                        <li class="divider"></li>
                        <li><a href="AssayInfo.jsp">病人详细信息管理</a></li>
                         <li class="divider"></li>
                        <li><a href="DiagInfo.jsp">诊断信息管理</a></li>
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
<div class="contain" id="contain">
    <div class="middle" id="middle">
        <div class="left" id="left">

            <div class="list-group left-list">
                <a href="#" class="list-group-item" id="list_tbl1" onclick="MenuDisplay_1()">病人详细信息</a>

                <a href="#" class="list-group-item" id="list_tbl2" onclick="MenuDisplay_2()">病人记录信息</a>


                <a href="#" class="list-group-item" id="list_tbl3" onclick="MenuDisplay_3()">病人标本信息</a>


            </div>
        </div>

        <div class="right" id="right">

			 <IFRAME src="PaAssayInfo.jsp" id="AssayInfo" frameBorder=0 width="1310px"
                    height="681px">
            </IFRAME>

            <IFRAME src="PaRecordInfo.jsp" id="RecordInfo" frameBorder=0 width="1310px"
                    height="681px"  style="display: none">
            </IFRAME>

            <IFRAME src="PaSpecimenInfo.jsp" id="SpecimenInfo" frameBorder=0 width="1310px"
                    height="681px"  style="display: none">
            </IFRAME>

        </div>

    </div>
</div>
</body>
</html>