package com.csu.entity;

import java.io.Serializable;
import javax.persistence.*;
import org.json.JSONObject;

//�����ٴ�������ñ���Ҫ���ڱ��滼�ߵĸ���ָ�꣬ÿһ���һ����������
@Entity
@Table(name="tab_assay")
public class Assay implements Serializable{
	
	
	@Id
	@Column(name="Id")
	private int Id;
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}	
	
	@Column(name="twoHourGlucose")
	private String twoHourGlucose;  //������СʱѪ��
	
	public String getTwoHourGlucose() {
		return twoHourGlucose;
	}
	
	public void setTwoHourGlucose(String twoHourGlucose) {
		this.twoHourGlucose = twoHourGlucose;
	}
	
	@Column(name="FTriglycerides")
	private String ftriglycerides;  //�ո���������
	
	public String getFtriglycerides() {
		return ftriglycerides;
	}
	
	public void setFtriglycerides(String ftriglycerides) {
		this.ftriglycerides = ftriglycerides;
	}
	
	@Column(name="HDLipoprotein	")
	private String hdLipoprotein;  //���ܶ�֬����
	
	public String getHdLipoprotein() {
		return hdLipoprotein;
	}
	
	public void setHdLipoprotein(String hdLipoprotein) {
		this.hdLipoprotein = hdLipoprotein;
	}
	
	@Column(name="BMI")
	private String bmi;            //���أ����/��ߣ��ף�
	
	public String getBmi() {
		return bmi;
	}
	
	public void setBmi(String bmi) {
		this.bmi = bmi;
	}
	
	@Column(name="assayDate")
	private String assayDate;
	
	public String getAssayDate() {
		return assayDate;
	}
	
	public void setAssayDate(String assayDate) {
		this.assayDate = assayDate;
	}
	
	@Column(name="UserID")
	private int UserID; //��Ӧ�Ļ���ID
	
	public int getUserID() {
		return UserID;
	}
	
	public void setUserID(int userID) {
		UserID = userID;
	}
	
	@Column(name="FPGlucose")
	private String FPGlucose; //�ո�Ѫ��
	
	public String getFPGlucose() {
		return FPGlucose;
	}
	
	public void setFPGlucose(String fPGlucose) {
		FPGlucose = fPGlucose;
	}
	
	@Column(name="BloodPressure")
	private String BloodPressure; //Ѫѹ
	
	public String getBloodPressure() {
		return BloodPressure;
	}
	
	public void setBloodPressure(String bloodPressure) {
		BloodPressure = bloodPressure;
	}
	   
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("Id", this.Id);
		jo.put("twoHourGlucose", this.twoHourGlucose);
		jo.put("ftriglycerides", this.ftriglycerides);
		jo.put("hdLipoprotein", this.hdLipoprotein);
		jo.put("assayDate", this.assayDate);
		jo.put("bmi", this.bmi);
		jo.put("UserID", this.UserID);
		jo.put("FPGlucose", this.FPGlucose);
		jo.put("BloodPressure", this.BloodPressure);
		return jo;
	}
	
	public String toString() {
		return this.toJSON().toString(); 
	}
	   
	/*
	 * private String twoHourGlucose;  //������СʱѪ��
	private String ftriglycerides;  //�ո���������
	private String hdLipoprotein;  //���ܶ�֬����
	private String bmi;            //���أ����/��ߣ��ף�
	private String assayDate;
	private int UserID; //��Ӧ�Ļ���ID
	private int Id;
	private String FPGlucose; //�ո�Ѫ��
	private String BloodPressure; //Ѫѹ
	 */
	   
}
