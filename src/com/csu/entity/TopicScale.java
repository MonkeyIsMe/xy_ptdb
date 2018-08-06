package com.csu.entity;

import org.json.JSONObject;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="tab_topic_scale")
public class TopicScale implements Serializable{
	
	@Id
	@Column(name="Id")
	private int Id;
	
	@Column(name="topicID")
	private int topicID; //����ID
	
	@Column(name="S_ID")
	private int S_ID; //����ID
	
	
	public int getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	public int getTopicID() {
		return topicID;
	}
	public void setTopicID(int topicID) {
		this.topicID = topicID;
	}
	public int getS_ID() {
		return S_ID;
	}
	public void setS_ID(int s_ID) {
		S_ID = s_ID;
	}
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("Id", this.Id);
		jo.put("topicID", this.topicID);
		jo.put("S_ID", this.S_ID);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
	
}

/*
CREATE TABLE `tab_topic_scale` (
`Id` int(11) NOT NULL AUTO_INCREMENT,
`topicID` int(11) DEFAULT NULL COMMENT '����ID',
`S_ID` int(11) DEFAULT NULL COMMENT '����ID',
PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8 COMMENT='�����������Ӧ��ϵ';
*/