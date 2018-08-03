package com.csu.entity;

import java.util.Date;

import javax.persistence.*;

import org.json.JSONObject;
@Entity
@Table(name="tab_report")
public class Report {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="u_id")
	private int u_id;
	
	@Column(name="s_id")
	private int s_id;
	
	@Column(name="t_time")
	private String t_time;
	
	@Column(name="isAudited")
	private int isAudited;
	
	@Column(name="sysID")
	private String sysID;  //执行医生
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public int getS_id() {
		return s_id;
	}
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}
	public String getT_time() {
		return t_time;
	}
	public void setT_time(String datetime) {
		this.t_time = datetime;
	}
	public int getIsAudited() {
		return isAudited;
	}
	public void setIsAudited(int isAudited) {
		this.isAudited = isAudited;
	}
	public String getSysID() {
		return sysID;
	}
	public void setSysID(String sysID) {
		this.sysID = sysID;
	}
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("id", this.id);
		jo.put("u_id", this.u_id);
		jo.put("s_id", this.s_id);
		jo.put("t_time", this.t_time);
		jo.put("isAudited", this.isAudited);
		jo.put("sysID", this.sysID);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
	
}

/*
CREATE TABLE `tab_report` (
`id` int(10) unsigned NOT NULL AUTO_INCREMENT,
`u_id` int(10) unsigned NOT NULL,
`s_id` int(10) unsigned NOT NULL,
`t_time` datetime NOT NULL,
`isAudited` tinyint(3) unsigned NOT NULL DEFAULT '0',
`sysID` varchar(255) DEFAULT NULL COMMENT '执行医生',
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1139 DEFAULT CHARSET=utf8;
*/