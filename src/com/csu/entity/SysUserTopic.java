package com.csu.entity;

import org.json.JSONObject;
import javax.persistence.*;

@Entity
@Table(name="tab_sysuser_topic")
public class SysUserTopic {
	
	@Id
	@Column(name="Id")
	private int Id;
	
	@Column(name="u_account")
	private String u_account; //��¼���˺�
	
	@Column(name="topicId")
	private int topicId;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getU_account() {
		return u_account;
	}
	public void setU_account(String u_account) {
		this.u_account = u_account;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("Id", this.Id);
		jo.put("u_account", this.u_account);
		jo.put("topicId", this.topicId);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
	
}

/*
 * CREATE TABLE `tab_sysuser_topic` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `u_account` varchar(255) DEFAULT NULL COMMENT '��¼���˺�',
  `topicId` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COMMENT='ϵͳ�û���������Ӧ��ϵ��';
*/

