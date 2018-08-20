package com.csu.entity;

import org.json.JSONObject;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="tab_record")
public class Record implements Serializable{
	
	@Id
	@Column(name="id")
	private int Id;
	
	@Column(name="patientId")
	private int patientId; //����Id
	
	@Column(name="diagnosisDate")
	private String diagnosisDate; //�������
	
	@Column(name="doctorName")
	private String doctorName; //����ҽ��
	
	@Column(name="recordName")
	private String recordName; //�Ǽ���
	
	@Column(name="recordDate")
	private String recordDate; //�Ǽ�����
	
	@Column(name="r1")
	private String r1; //����1
	
	@Column(name="r2")
	private String r2; //����2
	
	@Column(name="topicId")
	private Integer topicId; //
	
	@Column(name="revisitDate")
	private String revisitDate;  //
	
	@Column(name="sysuserId")
	private int sysuserId; //
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getDiagnosisDate() {
		return diagnosisDate;
	}
	public void setDiagnosisDate(String diagnosisDate) {
		this.diagnosisDate = diagnosisDate;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getRecordName() {
		return recordName;
	}
	public void setRecordName(String recordName) {
		this.recordName = recordName;
	}
	public String getRecordDate() {
		return recordDate;
	}
	public void setRecordDate(String recordDate) {
		this.recordDate = recordDate;
	}
	public String getR1() {
		return r1;
	}
	public void setR1(String r1) {
		this.r1 = r1;
	}
	public String getR2() {
		return r2;
	}
	public void setR2(String r2) {
		this.r2 = r2;
	}
	
	public Integer getTopicId() {
		return topicId;
	}
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
	public String getRevisitDate() {
		return revisitDate;
	}
	public void setRevisitDate(String revisitDate) {
		this.revisitDate = revisitDate;
	}
	public int getSysuserId() {
		return sysuserId;
	}
	public void setSysuserId(int sysuserId) {
		this.sysuserId = sysuserId;
	}
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("Id", this.Id);
		jo.put("patientId", this.patientId);
		jo.put("diagnosisDate", this.diagnosisDate);
		jo.put("doctorName", this.doctorName);
		jo.put("recordName", this.recordName);
		jo.put("recordDate", this.recordDate);
		jo.put("r1", this.r1);
		jo.put("r2", this.r2);
		jo.put("topicId", this.topicId);
		jo.put("revisitDate", this.revisitDate);
		jo.put("sysuserId", this.sysuserId);
		return jo;
	}
	
	public String toString() {
		return this.toJSON().toString(); 
	}

	/*
	 * private int Id;
	private int patientId; //����Id
	private String diagnosisDate; //�������
	private String doctorName; //����ҽ��
	private String recordName; //�Ǽ���
	private String recordDate; //�Ǽ�����
	private String r1; //����1
	private String r2; //����2
	private int topicId; //
	private String revisitDate;  //
	private int sysuserId; //
	 */
}
