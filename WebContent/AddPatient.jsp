<%@page import="com.csu.entity.*"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>病人管理</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <!-- 可选的Bootstrap主题文件（一般不使用） -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<style>
    .input{
        width: 1300px;
        height:400px;
        margin-left:auto;
        margin-right:auto;
    }

    .left{
        float: left;
        width: 280px;
    }

    .right{
        margin-left: 40px;
        float: left;
        width: 280px;
    }

    .left-right{
        margin-left: 40px;
        float: left;
        width: 280px;
    }

    .right-left{
        margin-left: 40px;
        float: left;
        width: 280px;
    }

</style>
<body>
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
<div class="input">
    <div class="left">
        <form>
            <div class="form-group change_input">
                <label>姓名</label>
                <input type="text" class="form-control" id="u_name" placeholder="患者姓名">
            </div>

            <div class="form-group change_input">
                <label>身份证号</label>
                <input type="text" class="form-control" id="identity" placeholder="患者身份证号">
            </div>

            <div class="form-group change_input">
                <label>编号</label>
                <input type="text" class="form-control" id="patientId" placeholder="患者编号">
            </div>

            <div class="form-group change_input">
                <label>住院号，门诊号</label>
                <input type="text" class="form-control" id="admissionNumber" placeholder="住院号，门诊号">
            </div>

            <div class="form-group change_input">
                <label>出生地</label>
                <input type="text" class="form-control" id="birthArea" placeholder="出生地">
            </div>


        </form>
    </div>
    <div class="left-right">
        <form>
            <div class="form-group change_input">
                <label>是否被领养</label>
                <input type="text" class="form-control" id="isAdopted" placeholder="是否被领养">
            </div>

            <div class="form-group change_input">
                <label>亲生父亲出生地</label>
                <input type="text" class="form-control" id="fatherBirthArea" placeholder="亲生父亲出生地">
            </div>

            <div class="form-group change_input">
                <label>亲生父亲名族</label>
                <input type="text" class="form-control" id="fatherNation" placeholder="亲生父亲名族">
            </div>

            <div class="form-group change_input">
                <label>幼年在何处长大</label>
                <input type="text" class="form-control" id="growthArea" placeholder="幼年在何处长大">
            </div>

            <div class="form-group change_input">
                <label>创建者Id</label>
                <input type="text" class="form-control" id="builderId" placeholder="创建者Id">
            </div>
        </form>
    </div>

    <div class="right-left">
        <form>
            <div class="form-group change_input">
                <label>受试编号</label>
                <input type="text" class="form-control" id="testNumber" placeholder="受试编号">
            </div>

            <div class="form-group change_input">
                <label>性别</label>
                <input type="text" class="form-control" id="gender" placeholder="性别">
            </div>


            <div class="form-group change_input">
                <label>名族</label>
                <input type="text" class="form-control" id="nation" placeholder="名族">
            </div>

            <div class="form-group change_input">
                <label>出生年月</label>
                <input type="text" class="form-control" id="birthday" placeholder="出生年月">
            </div>

            <div class="form-group change_input">
                <label>亲生母亲出生地</label>
                <input type="text" class="form-control" id="motherBirthArea" placeholder="亲生母亲出生地">
            </div>

        </form>
    </div>
    <div class="right">
        <form>

            <div class="form-group change_input">
                <label>亲生母亲名族</label>
                <input type="text" class="form-control" id="motherNation" placeholder="亲生母亲名族">
            </div>

            <div class="form-group change_input">
                <label>左右利手</label>
                <input type="text" class="form-control" id="hand" placeholder="左右利手">
            </div>

            <div class="form-group change_input">
                <label>与先证者的关系</label>
                <input type="text" class="form-control" id="relationship" placeholder="与先证者的关系">
            </div>

            <div class="form-group change_input">
                <label>先证者姓名</label>
                <input type="text" class="form-control" id="preName" placeholder="先证者姓名">
            </div>

            <div class="form-group change_input">
                <label>籍贯</label>
                <input type="text" class="form-control" id="comefrom" placeholder="籍贯">
            </div>

        </form>
    </div>
</div>
<div style="margin-left:45%">
    <input id="to" class="btn btn-default" type="submit" value="提交">
</div>
<script src="js/patient.js"></script>
</body>
</html>