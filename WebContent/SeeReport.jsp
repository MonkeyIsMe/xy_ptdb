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
    <script type="text/javascript" src="./js/canvg2.js"></script>
    <script type="text/javascript" src="./js/html2canvas.js"></script>
    <script type="text/javascript" src="./js/jsPdf.debug.js"></script>
    <script type="text/javascript" src="./js/jspdf.min.js"></script>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <!-- 可选的Bootstrap主题文件（一般不使用） -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"></script>
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="https://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<style>

    #contianer{
        border-style:solid;
        width: 800px;
        height: 100%;
        margin: 0 auto;
    }

    #head{
    	border-top:solid;
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
    
    #pdf{
    	text-align: center;
    }
    
    #result{
    	font-size:30px;
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
<div style="text-align: center;">
<button id="pdf">DOWNLOAD PDF</button>
</div>
<div id="contianer">
<div id="ol_article_content">
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
</div>
</body>
<script type="text/javascript">

var p_id = <%= patientId%>;

    $("#pdf").click(function () {
        DownloadPdf();
    })

    function DownloadPdf() {

        var myDate = new Date();
        myDate.getYear();      //获取当前年份(2位)
        myDate.getFullYear(); //获取完整的年份(4位,1970-????)
        myDate.getMonth();      //获取当前月份(0-11,0代表1月)
        myDate.getDate();      //获取当前日(1-31)
        myDate.getDay();        //获取当前星期X(0-6,0代表星期天)
        myDate.getTime();      //获取当前时间(从1970.1.1开始的毫秒数)
        myDate.getHours();      //获取当前小时数(0-23)
        myDate.getMinutes();    //获取当前分钟数(0-59)
        myDate.getSeconds();    //获取当前秒数(0-59)
        myDate.getMilliseconds(); //获取当前毫秒数(0-999)
        myDate.toLocaleDateString();    //获取当前日期
        var mytime=myDate.toLocaleTimeString();    //获取当前时间
        myDate.toLocaleString( );      //获取日期与时间----如果涉及到时分秒，直接使用即可。
        var pdf = new jsPDF('p', 'mm', 'a4');
        var print_content = $('#ol_article_content');
        var filename = myDate;
        console.log(filename);
        filename = filename + "+";
        filename = filename + p_id;
        console.log(filename);


        $('#ol_article_content').css("background", "#fff")

        // 分页
        var options = { pagesplit: true };

        pdf.addHTML($('#ol_article_content'), options, function(){
            pdf.output("save", filename)
        })
    }


</script>
</html>