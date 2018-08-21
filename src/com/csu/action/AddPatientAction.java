package com.csu.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.csu.dao.PatientInfoDAO;
import com.csu.dao.impl.PatientInfoDAOImpl;
import com.csu.entity.PatientInfo;
import com.opensymphony.xwork2.ActionSupport;

public class AddPatientAction extends ActionSupport{
	
	public String getPatient() {
		HttpServletRequest request= ServletActionContext.getRequest();
		
		String u_name = request.getParameter("u_name");
		String identity = request.getParameter("identity");
		String patientId = request.getParameter("patientId");
		String admissionNumber = request.getParameter("admissionNumber");
		String testNumber = request.getParameter("testNumber");
		String gender = request.getParameter("gender");
		String nation = request.getParameter("nation");
		String birthday = request.getParameter("birthday");
		String birthArea = request.getParameter("birthArea");
		String isAdopted = request.getParameter("isAdopted");
		String motherBirthArea = request.getParameter("motherBirthArea");
		String motherNation = request.getParameter("motherNation");
		String fatherBirthArea = request.getParameter("fatherBirthArea");
		String fatherNation = request.getParameter("fatherNation");
		String hand = request.getParameter("hand");
		String relationship = request.getParameter("relationship");
		String preName = request.getParameter("preName");
		String growthArea = request.getParameter("growthArea");
		String builderId = request.getParameter("builderId");
		int id = Integer.parseInt(builderId);
		
		//System.out.println(u_name+" "+patientId);
		PatientInfo pi = new PatientInfo();
		pi.setU_name(u_name);
		pi.setIdentity(identity);
		pi.setPatientId(patientId);
		pi.setAdmissionNumber(admissionNumber);
		pi.setTestNumber(testNumber);
		pi.setGender(gender);
		pi.setNation(nation);
		pi.setBirthday(birthday);
		pi.setBirthArea(birthArea);
		pi.setIsAdopted(isAdopted);
		pi.setMotherBirthArea(motherBirthArea);
		pi.setMotherNation(motherNation);
		pi.setFatherBirthArea(fatherBirthArea);
		pi.setFatherNation(fatherNation);
		pi.setHand(hand);
		pi.setRelationship(relationship);
		pi.setPreName(preName);
		pi.setGrowthArea(growthArea);
		pi.setBuilderId(id);
		
		PatientInfoDAO pd = new PatientInfoDAOImpl();
		if(pd.add(pi)) {
			return SUCCESS;
		}
		else return ERROR;
	}
	
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