package com.csu.entity;

import org.json.JSONObject;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="tab_specimen")
public class Specimen implements Serializable{
	
	@Id
	@Column(name="Id")
	private int Id;//Primary Key
	
	@Column(name="specimen_name")
	private String specimen_name;  //�걾����
	
	@Column(name="specimen_type")
	private String specimen_type;  //�걾����
	
	@Column(name="specimen_place")
	private String specimen_place; //�걾���λ��
	
	@Column(name="specimen_record")
	private String specimen_record; //ʹ�ü�¼
	
	@Column(name="specimen_num")
	private int specimen_num;       //�걾����
	
	@Column(name="concentration")
	private String concentration;       //�걾Ũ��
	
	@Column(name="patientId")
	private int patientId;          //����ID
	
	
	@Column(name="latestTime")
	private String latestTime;      //���ʹ������
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getSpecimen_name() {
		return specimen_name;
	}
	public void setSpecimen_name(String specimen_name) {
		this.specimen_name = specimen_name;
	}
	public String getSpecimen_type() {
		return specimen_type;
	}
	public void setSpecimen_type(String specimen_type) {
		this.specimen_type = specimen_type;
	}
	public String getSpecimen_place() {
		return specimen_place;
	}
	public void setSpecimen_place(String specimen_place) {
		this.specimen_place = specimen_place;
	}
	public String getSpecimen_record() {
		return specimen_record;
	}
	public void setSpecimen_record(String specimen_record) {
		this.specimen_record = specimen_record;
	}
	public int getSpecimen_num() {
		return specimen_num;
	}
	public void setSpecimen_num(int specimen_num) {
		this.specimen_num = specimen_num;
	}
	public String getConcentration() {
		return concentration;
	}
	public void setConcentration(String concentration) {
		this.concentration = concentration;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getLatestTime() {
		return latestTime;
	}
	public void setLatestTime(String latestTime) {
		this.latestTime = latestTime;
	}
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("Id", this.Id);
		jo.put("specimen_name", this.specimen_name);
		jo.put("specimen_type", this.specimen_type);
		jo.put("specimen_place", this.specimen_place);
		jo.put("specimen_record", this.specimen_record);
		jo.put("specimen_num", this.specimen_num);
		jo.put("concentration", this.concentration);
		jo.put("patientId", this.patientId);
		jo.put("latestTime", this.latestTime);
		return jo;
	}
	
	public String toString() {
		return this.toJSON().toString(); 
	}
	/*
	 * private int Id;//Primary Key
	private String specimen_name;  //�걾����
	private String specimen_type;  //�걾����
	private String specimen_place; //�걾���λ��
	private String specimen_record; //ʹ�ü�¼
	private int specimen_num;       //�걾����
	private String concentration;       //�걾Ũ��
	private int patientId;          //����ID
	private String desc;            //��ע
	private String latestTime;      //���ʹ������
	 */
}
