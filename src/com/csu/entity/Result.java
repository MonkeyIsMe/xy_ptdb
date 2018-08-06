package com.csu.entity;

import org.json.JSONObject;

import java.io.Serializable;

import javax.persistence.*;

//���Խ�����ñ���Ҫ���ڱ��滼��ÿһ����������Ľ���������ֶ���Ϣ

@Entity
@Table(name="tab_result")
public class Result implements Serializable{
	
	@Id
	@Column(name="Id")
	private Integer id; 
	
	@Column(name="recordId")
	private Integer recordId; //��ϼ�¼Id
	
	@Column(name="itemId")
	private Integer itemId; //��Ŀid
	
	@Column(name="result")
	private String result; //���
	
	@Column(name="introduction")
	private String introduction; //˵��
	
	@Column(name="remark")	
	private String remark; //��ע
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getRecordId() {
		return recordId;
	}
	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;                                        
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("id", this.id);
		jo.put("recordId", this.recordId);
		jo.put("itemId", this.itemId);
		jo.put("result", this.result);
		jo.put("introduction", this.introduction);
		jo.put("remark", this.remark);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
	
	/*
	 * private Integer id; 
	private Integer recordId; //��ϼ�¼Id
	private Integer itemId; //��Ŀid
	private String result; //���
	private String introduction; //˵��
	private String remark; //��ע
	 */
}
