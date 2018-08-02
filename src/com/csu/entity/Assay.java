package com.csu.entity;

import java.io.Serializable;
import javax.persistence.*;
import org.json.JSONObject;

//基本临床化验表：该表主要用于保存患者的各项指标，每一项都有一个正常区间
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
	private String twoHourGlucose;  //饭后两小时血糖
	
	public String getTwoHourGlucose() {
		return twoHourGlucose;
	}
	
	public void setTwoHourGlucose(String twoHourGlucose) {
		this.twoHourGlucose = twoHourGlucose;
	}
	
	@Column(name="FTriglycerides")
	private String ftriglycerides;  //空腹甘油三酯
	
	public String getFtriglycerides() {
		return ftriglycerides;
	}
	
	public void setFtriglycerides(String ftriglycerides) {
		this.ftriglycerides = ftriglycerides;
	}
	
	@Column(name="HDLipoprotein	")
	private String hdLipoprotein;  //高密度脂蛋白
	
	public String getHdLipoprotein() {
		return hdLipoprotein;
	}
	
	public void setHdLipoprotein(String hdLipoprotein) {
		this.hdLipoprotein = hdLipoprotein;
	}
	
	@Column(name="BMI")
	private String bmi;            //体重（公斤）/身高（米）
	
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
	private int UserID; //对应的患者ID
	
	public int getUserID() {
		return UserID;
	}
	
	public void setUserID(int userID) {
		UserID = userID;
	}
	
	@Column(name="FPGlucose")
	private String FPGlucose; //空腹血糖
	
	public String getFPGlucose() {
		return FPGlucose;
	}
	
	public void setFPGlucose(String fPGlucose) {
		FPGlucose = fPGlucose;
	}
	
	@Column(name="BloodPressure")
	private String BloodPressure; //血压
	
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
	 * private String twoHourGlucose;  //饭后两小时血糖
	private String ftriglycerides;  //空腹甘油三酯
	private String hdLipoprotein;  //高密度脂蛋白
	private String bmi;            //体重（公斤）/身高（米）
	private String assayDate;
	private int UserID; //对应的患者ID
	private int Id;
	private String FPGlucose; //空腹血糖
	private String BloodPressure; //血压
	 */
	   
}
