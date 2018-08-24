/**
 * 
 */

$("document").ready(function () {
    $("#alert_login").fadeOut(0);
});

$("#to").click(function () {
    addpatient();
});

function addpatient(){
	var u_name = $("#u_name").val();
	var identity = $("#identity").val();
	var patientId = $("#patientId").val();
	var admissionNumber = $("#admissionNumber").val();
	var testNumber = $("#testNumber").val();
	var nation = $("#nation").val();
	var birthday = $("#birthday").val();
	var birthArea = $("#birthArea").val();
	var isAdopted = $("#isAdopted").val();
	var motherBirthArea = $("#motherBirthArea").val();
	var motherNation = $("#motherNation").val();
	var fatherBirthArea = $("#fatherBirthArea").val();
	var fatherNation = $("#fatherNation").val();
	var hand = $("#hand").val();
	var relationship = $("#relationship").val();
	var preName = $("#preName").val();
	var growthArea = $("#growthArea").val();
	var builderId = $("#builderId").val();
	var gender = $("#gender").val();

	$.post(
		"AddPatient.action",
		{
			u_name:u_name,
			identity:identity,
			patientId:patientId,
			admissionNumber:admissionNumber,
			testNumber:testNumber,
			nation:nation,
			birthday:birthday,
			birthArea:birthArea,
			isAdopted:isAdopted,
			motherBirthArea:motherBirthArea,
			motherNation:motherNation,
			fatherBirthArea:fatherBirthArea,
			fatherNation:fatherNation,
			hand:hand,
			relationship:relationship,
			preName:preName,
			growthArea:growthArea,
			builderId:builderId,
			gender:gender,
		},
		function(data){
			data = data.replace(/^\s*/, "").replace(/\s*$/, "");
			//alert(data);
			if(data == "success"){
				//alert(111);
				setAlertText("<strong>提示：</strong>添加成功.");
			}
		}
	);
}

function setAlertText(text) {
    var html_text = text;
    var login_alert = $("div[id='alert_login']");
    login_alert.fadeOut(0);
    login_alert.empty();
    login_alert.html(html_text);
    login_alert.fadeIn(1500);
    login_alert.fadeOut(1000);
}

/*
CREATE TABLE `tab_patientinfo` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_name` varchar(50) DEFAULT NULL,
  `identity` varchar(20) DEFAULT NULL COMMENT '身份证',
  `patientId` varchar(20) DEFAULT NULL COMMENT '患者编号',
  `admissionNumber` varchar(20) DEFAULT NULL COMMENT '住院号，门诊号',
  `testNumber` varchar(20) DEFAULT NULL COMMENT '受试编号',
  `gender` varchar(4) DEFAULT NULL COMMENT '性别',
  `nation` varchar(20) DEFAULT NULL COMMENT '名族',
  `birthday` varchar(200) DEFAULT NULL COMMENT '出生年月',
  `birthArea` varchar(100) DEFAULT NULL COMMENT '出生地',
  `isAdopted` varchar(5) DEFAULT NULL COMMENT '是否被领养',
  `motherBirthArea` varchar(100) DEFAULT NULL COMMENT '亲生母亲出生地',
  `motherNation` varchar(20) DEFAULT NULL COMMENT '亲生母亲名族',
  `fatherBirthArea` varchar(100) DEFAULT NULL COMMENT '亲生父亲出生地',
  `fatherNation` varchar(20) DEFAULT NULL COMMENT '亲生父亲名族',
  `hand` varchar(5) DEFAULT NULL COMMENT '左右利手',
  `relationship` varchar(10) DEFAULT NULL COMMENT '与先证者的关系',
  `preName` varchar(20) DEFAULT NULL COMMENT '先证者姓名',
  `growthArea` varchar(20) DEFAULT NULL COMMENT '幼年在何处长大',
  `builderId` int(11) DEFAULT NULL COMMENT '创建者Id',
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB AUTO_INCREMENT=89 DEFAULT CHARSET=utf8;




 */