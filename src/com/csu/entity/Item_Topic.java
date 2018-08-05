package com.csu.entity;

import org.json.JSONObject;

import javax.persistence.*;

@Entity
@Table(name="tab_item_topic")
public class Item_Topic {
	
	@Id
	@Column(name="Id")
	private Integer id;
	
	@Column(name="topicId")
	private Integer topicId; //¿ÎÌâID
	
	@Column(name="itemId")
	private Integer itemId; //ÏîÄ¿ID
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTopicId() {
		return topicId;
	}
	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}
	public Integer getItemtId() {
		return itemId;
	}
	public void setItemtId(Integer itemtId) {
		this.itemId = itemtId;
	}
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("id", this.id);
		jo.put("topicId", this.topicId);
		jo.put("itemtId", this.itemId);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
}
