<%@page import="com.csu.entity.MentalScale"%>
<%@page import="com.csu.dao.impl.MentalScaleDAOImpl"%>
<%@page import="com.csu.dao.MentalScaleDAO"%>
<%@page import="com.csu.dao.impl.ScaleDAOImpl"%>
<%@page import="com.csu.dao.ScaleDAO"%>
<%@page import="com.csu.entity.PatientInfo"%>
<%@page import="com.csu.dao.PatientInfoDAO"%>
<%@page import="com.csu.dao.impl.PatientInfoDAOImpl"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="java.io.*,java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>

    #contianer{
        border-style:solid;
        width: 800px;
        height: 100%;
        margin: 0 auto;
    }

    #head{
        width: 100%;
        height: 40px;
        border-bottom:solid;
    }

    #to_name{
        border-right: solid;
        height: 40px;
        width: 400px;
        float: left;
    }


    #to_scale{
        height: 40px;
        width: 390px;
        float: left;
    }


    #middle{
        border-bottom:solid;
        height: 40px;
    }

    .font{
        font-family: Consolas;
        font-size: 20px;
    }
    
    #name{
        margin-top: 1px;
        float: left;
        font-size: 20px;
        font-family: Consolas;
    }

    #scale{
        margin-top: 1px;
        float: left;
        font-size: 20px;
        font-family: Consolas;
    }

</style>
<%
	//获取结果
	String comments = session.getAttribute("comments").toString();

	String patientId =  session.getAttribute("p_id").toString();
	//获取名字
 	PatientInfoDAO pd = new PatientInfoDAOImpl();
	List<PatientInfo> list = pd.getPatientInfoByPatientId(patientId);
	PatientInfo pi = list.get(0);
	String name = pi.getU_name(); 
	
	//获取量表名字
	String scale_id =  session.getAttribute("s_id").toString();
 	int id = Integer.parseInt(scale_id);
	MentalScaleDAO msd = new MentalScaleDAOImpl();
	MentalScale ms = msd.getMentalScaleById(id);
	String scale_name = ms.getS_Name(); 
	
%>
<body>
<div id="contianer">
    <div id="head">
        <div id="to_name">
            <div class="font" style="float: left;">名字：</div>
            <div id="name"><%=name %></div>
        </div>
        <div id="to_scale">
            <div class="font" style="float: left;">量表名：</div>
            <div id="scale"><%=scale_name %></div>
        </div>
    </div>
    <div id="middle">
        <div class="font" style="text-align: center">以下为测试结果.</div>
    </div>
    <div id="result"><%= comments%></div>
</div>
</body>
</html>