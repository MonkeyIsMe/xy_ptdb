package com.csu.entity;

import org.json.JSONObject;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="tab_topic")
public class Topic implements Serializable{
	
	@Id
	@Column(name="topicId")
	private Integer topicId;
	
	@Column(name="topicName")
	private String  topicName;//������
	
	@Column(name="builderId")
	private Integer builderId;
	
	public Integer getTopicId() {
		return topicId;
	}
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public Integer getBuilderId() {
		return builderId;
	}
	public void setBuilderId(Integer builderId) {
		this.builderId = builderId;
	}
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("topicName", this.topicName);
		jo.put("builderId", this.builderId);
		jo.put("topicId", this.topicId);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
	
}
