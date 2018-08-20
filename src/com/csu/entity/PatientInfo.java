package com.csu.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.json.JSONObject;

@Entity
@Table(name="tab_patientinfo")
public class PatientInfo implements Serializable{
	
	@Id
	@Column(name="u_id")
	private int u_id;
	
	@Column(name="u_name")
	private String u_name;
	
	@Column(name="identity")
	private String identity; //���֤
	
	@Column(name="patientId")
	private String patientId; //���߱��
	
	@Column(name="admissionNumber")
	private String admissionNumber; //סԺ�ţ������
	
	@Column(name="testNumber")
	private String testNumber; //���Ա��
	
	@Column(name="gender")
	private String gender;//�Ա�
	
	@Column(name="nation")
	private String nation;//����
	
	@Column(name="birthday")
	private String birthday;//��������
	
	@Column(name="birthArea")
	private String birthArea;//������
	
	@Column(name="isAdopted")
	private String isAdopted;//�Ƿ�����
	
	@Column(name="motherBirthArea")
	private String motherBirthArea;//����ĸ�׳�����
	
	@Column(name="motherNation")
	private String motherNation;//����ĸ������
	
	@Column(name="fatherBirthArea")
	private String fatherBirthArea;//�������׳�����
	
	@Column(name="fatherNation")
	private String fatherNation;//������������
	
	@Column(name="hand")
	private String hand;//��������
	
	@Column(name="relationship")
	private String relationship; //����֤�ߵĹ�ϵ
	
	@Column(name="preName")
	private String preName; //��֤������
	
	@Column(name="growthArea")
	private String growthArea; //�����ںδ�����
	
	@Column(name="builderId")
	private int builderId;  //������Id
	
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getAdmissionNumber() {
		return admissionNumber;
	}
	public void setAdmissionNumber(String admissionNumber) {
		this.admissionNumber = admissionNumber;
	}
	public String getTestNumber() {
		return testNumber;
	}
	public void setTestNumber(String testNumber) {
		this.testNumber = testNumber;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getBirthArea() {
		return birthArea;
	}
	public void setBirthArea(String birthArea) {
		this.birthArea = birthArea;
	}
	public String getIsAdopted() {
		return isAdopted;
	}
	public void setIsAdopted(String isAdopted) {
		this.isAdopted = isAdopted;
	}
	public String getMotherBirthArea() {
		return motherBirthArea;
	}
	public void setMotherBirthArea(String motherBirthArea) {
		this.motherBirthArea = motherBirthArea;
	}
	public String getMotherNation() {
		return motherNation;
	}
	public void setMotherNation(String motherNation) {
		this.motherNation = motherNation;
	}
	public String getFatherBirthArea() {
		return fatherBirthArea;
	}
	public void setFatherBirthArea(String fatherBirthArea) {
		this.fatherBirthArea = fatherBirthArea;
	}
	public String getFatherNation() {
		return fatherNation;
	}
	public void setFatherNation(String fatherNation) {
		this.fatherNation = fatherNation;
	}
	public String getHand() {
		return hand;
	}
	public void setHand(String hand) {
		this.hand = hand;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public String getPreName() {
		return preName;
	}
	public void setPreName(String preName) {
		this.preName = preName;
	}
	public String getGrowthArea() {
		return growthArea;
	}
	public void setGrowthArea(String growthArea) {
		this.growthArea = growthArea;
	}
	public int getBuilderId() {
		return builderId;
	}
	public void setBuilderId(int builderId) {
		this.builderId = builderId;
	}
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("u_id", this.u_id);
		jo.put("u_name", this.u_name);
		jo.put("identity", this.identity);
		jo.put("patientId", this.patientId);
		jo.put("admissionNumber", this.admissionNumber);
		jo.put("testNumber", this.testNumber);
		jo.put("gender", this.gender);
		jo.put("nation", this.nation);
		jo.put("birthday", this.birthday);
		jo.put("birthArea", this.birthArea);
		jo.put("isAdopted", this.isAdopted);
		jo.put("motherBirthArea", this.motherBirthArea);
		jo.put("motherNation", this.motherNation);
		jo.put("fatherBirthArea", this.fatherBirthArea);
		jo.put("fatherNation", this.fatherNation);
		jo.put("hand", this.hand);
		jo.put("relationship", this.relationship);
		jo.put("preName", this.preName);
		jo.put("growthArea", this.growthArea);
		jo.put("builderId", this.builderId);
		return jo;
	}
	
	public String toString() {
		return this.toJSON().toString(); 
	}
	/*
	 * private int u_id;
	private String u_name;
	private String identity; //���֤
	private String patientId; //���߱��
	private String admissionNumber; //סԺ�ţ������
	private String testNumber; //���Ա��
	private String gender;//�Ա�
	//private int age;//
	private String nation;//����
	private String birthday;//��������
	private String birthArea;//������
	private String isAdopted;//�Ƿ�����
	private String motherBirthArea;//����ĸ�׳�����
	private String motherNation;//����ĸ������
	private String fatherBirthArea;//�������׳�����
	private String fatherNation;//������������
	private String hand;//��������
	private String relationship=null; //����֤�ߵĹ�ϵ
	private String preName=null; //��֤������
	private String growthArea; //�����ںδ�����
	private String builderId;  //������Id
	 */
}
