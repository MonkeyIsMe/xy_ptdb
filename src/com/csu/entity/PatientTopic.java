package com.csu.entity;

import org.json.JSONObject;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="tab_patient_topic")
public class PatientTopic implements Serializable{
	
	@Id
	@Column(name="Id")
	private Integer Id;
	
	@Column(name="patientId")
	private Integer patientId; //ªº’ﬂId
	
	@Column(name="topicId")
	private Integer topicId;  //øŒÃ‚Id
	
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getPatientId() {
		return patientId;
	}
	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}
	public Integer getTopicId() {
		return topicId;
	}
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("Id", this.Id);
		jo.put("patientId", this.patientId);
		jo.put("topicId", this.topicId);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
}
