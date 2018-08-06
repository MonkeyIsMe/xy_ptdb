package com.csu.entity;

import java.io.Serializable;
import java.util.Date;

import org.json.JSONObject;
import javax.persistence.*;

@Entity
@Table(name="tab_user")
public class User implements Serializable{
	
	@Id
	@Column(name="U_ID")
	private int U_ID;
	
	@Column(name="U_LOGID")
	private String U_LOGID;
	
	@Column(name="U_NAME")
	private String U_NAME;  //����
	
	@Column(name="U_STATE")
	private String U_STATE;
	
	@Column(name="U_PW")
	private String U_PW;
	
	@Column(name="U_SPW")
	private String U_SPW;
	
	@Column(name="U_Right")
	private Long U_Right;
	
	@Column(name="U_INDEX")
	private int U_INDEX;
	
	@Column(name="U_SEX")
	private String U_SEX;
	
	@Column(name="U_Birthday")
	private Date U_Birthday;
	
	@Column(name="U_Marriage")
	private String U_Marriage;
	
	@Column(name="U_EHistory")
	private String U_EHistory;
	
	@Column(name="U_Group")
	private String U_Group;
	
	@Column(name="U_Impression")
	private String U_Impression;
	
	@Column(name="U_Tel")
	private String U_Tel;
	
	@Column(name="U_Address")
	private String U_Address;
	
	@Column(name="U_LOGSTATE")
	private String U_LOGSTATE;
	
	@Column(name="U_LOGNUM")
	private int U_LOGNUM;
	
	@Column(name="U_LASTLOG")
	private Date U_LASTLOG;
	
	@Column(name="U_REMARK")
	private String U_REMARK;
	
	@Column(name="U_Ethnic")
	private String U_Ethnic; //����
	
	@Column(name="DiseaseCourse")
	private String DiseaseCourse; //�ܲ���_____��
	
	@Column(name="attackMedication")
	private String attackMedication;//���η�����ҩ
	
	@Column(name="Occupation")
	private String Occupation;//ְҵ
	
	@Column(name="Handedness")
	private String Handedness;//���֣����ֻ������֣�
	
	@Column(name="HistoryPhysicalIllness")
	private String HistoryPhysicalIllness;//�ش����弲��ʷ
	
	@Column(name="PastMentalIllness")
	private String PastMentalIllness; //�������񼲲�ʷ
	
	@Column(name="LongTermMedication")
	private String LongTermMedication; //����������ҩʷ
	
	@Column(name="OralContraceptives")
	private String OralContraceptives; //Ŀǰ�ڷ�����ҩ
	
	@Column(name="FamilyDisease")
	private String FamilyDisease; //�����У��Ƿ����˻���ĳ�ּ���
	
	@Column(name="FamilyMentalDisease")
	private String FamilyMentalDisease; //�����У��Ƿ����˻���������������ʷ
	
	@Column(name="Smoking")
	private String Smoking; //�Ƿ�����
	
	@Column(name="drinking")
	private String drinking; //�Ƿ�Ⱦ�
	
	@Column(name="PsychoactiveSubstances")
	private String PsychoactiveSubstances; //ʹ�þ����������ʷ
	
	public int getU_ID() {
		return U_ID;
	}
	public void setU_ID(int u_ID) {
		U_ID = u_ID;
	}
	public String getU_LOGID() {
		return U_LOGID;
	}
	public void setU_LOGID(String u_LOGID) {
		U_LOGID = u_LOGID;
	}
	public String getU_NAME() {
		return U_NAME;
	}
	public void setU_NAME(String u_NAME) {
		U_NAME = u_NAME;
	}
	public String getU_STATE() {
		return U_STATE;
	}
	public void setU_STATE(String u_STATE) {
		U_STATE = u_STATE;
	}
	public String getU_PW() {
		return U_PW;
	}
	public void setU_PW(String u_PW) {
		U_PW = u_PW;
	}
	public String getU_SPW() {
		return U_SPW;
	}
	public void setU_SPW(String u_SPW) {
		U_SPW = u_SPW;
	}
	public Long getU_Right() {
		return U_Right;
	}
	public void setU_Right(Long u_Right) {
		U_Right = u_Right;
	}
	public int getU_INDEX() {
		return U_INDEX;
	}
	public void setU_INDEX(int u_INDEX) {
		U_INDEX = u_INDEX;
	}
	public String getU_SEX() {
		return U_SEX;
	}
	public void setU_SEX(String u_SEX) {
		U_SEX = u_SEX;
	}
	public Date getU_Birthday() {
		return U_Birthday;
	}
	public void setU_Birthday(Date u_Birthday) {
		U_Birthday = u_Birthday;
	}
	public String getU_Marriage() {
		return U_Marriage;
	}
	public void setU_Marriage(String u_Marriage) {
		U_Marriage = u_Marriage;
	}
	public String getU_EHistory() {
		return U_EHistory;
	}
	public void setU_EHistory(String u_EHistory) {
		U_EHistory = u_EHistory;
	}
	public String getU_Group() {
		return U_Group;
	}
	public void setU_Group(String u_Group) {
		U_Group = u_Group;
	}
	public String getU_Impression() {
		return U_Impression;
	}
	public void setU_Impression(String u_Impression) {
		U_Impression = u_Impression;
	}
	public String getU_Tel() {
		return U_Tel;
	}
	public void setU_Tel(String u_Tel) {
		U_Tel = u_Tel;
	}
	public String getU_Address() {
		return U_Address;
	}
	public void setU_Address(String u_Address) {
		U_Address = u_Address;
	}
	public String getU_LOGSTATE() {
		return U_LOGSTATE;
	}
	public void setU_LOGSTATE(String u_LOGSTATE) {
		U_LOGSTATE = u_LOGSTATE;
	}
	public int getU_LOGNUM() {
		return U_LOGNUM;
	}
	public void setU_LOGNUM(int u_LOGNUM) {
		U_LOGNUM = u_LOGNUM;
	}
	public Date getU_LASTLOG() {
		return U_LASTLOG;
	}
	public void setU_LASTLOG(Date u_LASTLOG) {
		U_LASTLOG = u_LASTLOG;
	}
	public String getU_REMARK() {
		return U_REMARK;
	}
	public void setU_REMARK(String u_REMARK) {
		U_REMARK = u_REMARK;
	}
	public String getU_Ethnic() {
		return U_Ethnic;
	}
	public void setU_Ethnic(String u_Ethnic) {
		U_Ethnic = u_Ethnic;
	}
	public String getDiseaseCourse() {
		return DiseaseCourse;
	}
	public void setDiseaseCourse(String diseaseCourse) {
		DiseaseCourse = diseaseCourse;
	}
	public String getAttackMedication() {
		return attackMedication;
	}
	public void setAttackMedication(String attackMedication) {
		this.attackMedication = attackMedication;
	}
	public String getOccupation() {
		return Occupation;
	}
	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
	public String getHandedness() {
		return Handedness;
	}
	public void setHandedness(String handedness) {
		Handedness = handedness;
	}
	public String getHistoryPhysicalIllness() {
		return HistoryPhysicalIllness;
	}
	public void setHistoryPhysicalIllness(String historyPhysicalIllness) {
		HistoryPhysicalIllness = historyPhysicalIllness;
	}
	public String getPastMentalIllness() {
		return PastMentalIllness;
	}
	public void setPastMentalIllness(String pastMentalIllness) {
		PastMentalIllness = pastMentalIllness;
	}
	public String getLongTermMedication() {
		return LongTermMedication;
	}
	public void setLongTermMedication(String longTermMedication) {
		LongTermMedication = longTermMedication;
	}
	public String getOralContraceptives() {
		return OralContraceptives;
	}
	public void setOralContraceptives(String oralContraceptives) {
		OralContraceptives = oralContraceptives;
	}
	public String getFamilyDisease() {
		return FamilyDisease;
	}
	public void setFamilyDisease(String familyDisease) {
		FamilyDisease = familyDisease;
	}
	public String getFamilyMentalDisease() {
		return FamilyMentalDisease;
	}
	public void setFamilyMentalDisease(String familyMentalDisease) {
		FamilyMentalDisease = familyMentalDisease;
	}
	public String getSmoking() {
		return Smoking;
	}
	public void setSmoking(String smoking) {
		Smoking = smoking;
	}
	public String getDrinking() {
		return drinking;
	}
	public void setDrinking(String drinking) {
		this.drinking = drinking;
	}
	public String getPsychoactiveSubstances() {
		return PsychoactiveSubstances;
	}
	public void setPsychoactiveSubstances(String psychoactiveSubstances) {
		PsychoactiveSubstances = psychoactiveSubstances;
	}
	
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("U_ID", this.U_ID);
		jo.put("U_LOGID", this.U_LOGID);
		jo.put("U_NAME", this.U_NAME);
		jo.put("U_STATE", this.U_STATE);
		jo.put("U_PW", this.U_PW);
		jo.put("U_SPW", this.U_SPW);
		jo.put("U_Right", this.U_Right);
		jo.put("U_INDEX", this.U_INDEX);
		jo.put("U_SEX", this.U_SEX);
		jo.put("U_Birthday", this.U_Birthday);
		jo.put("U_Marriage", this.U_Marriage);
		jo.put("U_EHistory", this.U_EHistory);
		jo.put("U_Group", this.U_Group);
		jo.put("U_Impression", this.U_Impression);
		jo.put("U_Tel", this.U_Tel);
		jo.put("U_Address", this.U_Address);
		jo.put("U_LOGSTATE", this.U_LOGSTATE);
		jo.put("U_LOGNUM", this.U_LOGNUM);
		jo.put("U_LASTLOG", this.U_LASTLOG);
		jo.put("U_REMARK", this.U_REMARK);
		jo.put("U_Ethnic", this.U_Ethnic);
		jo.put("DiseaseCourse", this.DiseaseCourse);
		jo.put("attackMedication", this.attackMedication);
		jo.put("Occupation", this.Occupation);
		jo.put("Handedness", this.Handedness);
		jo.put("HistoryPhysicalIllness", this.HistoryPhysicalIllness);
		jo.put("PastMentalIllness", this.PastMentalIllness);
		jo.put("LongTermMedication", this.LongTermMedication);
		jo.put("OralContraceptives", this.OralContraceptives);
		jo.put("FamilyDisease", this.FamilyDisease);
		jo.put("FamilyMentalDisease", this.FamilyMentalDisease);
		jo.put("Smoking", this.Smoking);
		jo.put("drinking", this.drinking);
		jo.put("PsychoactiveSubstances", this.PsychoactiveSubstances);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
}

/*
CREATE TABLE `tab_user` (
`U_ID` int(11) NOT NULL AUTO_INCREMENT,1
`U_LOGID` varchar(20) NOT NULL,1
`U_NAME` varchar(20) NOT NULL,1
`U_STATE` char(1) DEFAULT NULL,1
`U_PW` varchar(20) NOT NULL,1
`U_SPW` varchar(20) DEFAULT NULL,1
`U_Right` bigint(20) NOT NULL,1
`U_INDEX` int(11) DEFAULT NULL,1
`U_SEX` char(2) DEFAULT NULL,1
`U_Birthday` date DEFAULT NULL,1
`U_Marriage` char(4) DEFAULT NULL,1
`U_EHistory` varchar(20) DEFAULT NULL,1
`U_Group` char(4) DEFAULT NULL,1
`U_Impression` varchar(200) DEFAULT NULL,1
`U_Tel` varchar(20) DEFAULT NULL,1
`U_Address` varchar(100) DEFAULT NULL,1
`U_LOGSTATE` char(1) DEFAULT NULL,1
`U_LOGNUM` int(11) DEFAULT NULL,1
`U_LASTLOG` datetime DEFAULT NULL,1
`U_REMARK` varchar(100) DEFAULT NULL,
`U_Ethnic` varchar(255) DEFAULT NULL COMMENT '����',
`DiseaseCourse` varchar(255) DEFAULT NULL COMMENT '�ܲ���_____��',
`attackMedication` varchar(255) DEFAULT NULL COMMENT '���η�����ҩ',
`Occupation` varchar(255) DEFAULT NULL COMMENT 'ְҵ',
`Handedness` varchar(255) DEFAULT NULL COMMENT '���֣����ֻ������֣�',
`HistoryPhysicalIllness` varchar(255) DEFAULT NULL COMMENT '�ش����弲��ʷ',
`PastMentalIllness` varchar(255) DEFAULT NULL COMMENT '�������񼲲�ʷ',
`LongTermMedication` varchar(255) DEFAULT NULL COMMENT '����������ҩʷ',
`OralContraceptives` varchar(255) DEFAULT NULL COMMENT 'Ŀǰ�ڷ�����ҩ',
`FamilyDisease` varchar(255) DEFAULT NULL COMMENT '�����У��Ƿ����˻���ĳ�ּ�����',
`FamilyMentalDisease` varchar(255) DEFAULT NULL COMMENT '�����У��Ƿ����˻���������������ʷ',
`Smoking` varchar(255) DEFAULT NULL COMMENT '�Ƿ�����',
`drinking` varchar(255) DEFAULT NULL COMMENT '�Ƿ�Ⱦ�',
`PsychoactiveSubstances` varchar(255) DEFAULT NULL COMMENT 'ʹ�þ����������ʷ',
PRIMARY KEY (`U_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
*/