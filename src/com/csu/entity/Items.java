package com.csu.entity;

import java.io.Serializable;
import java.util.ArrayList;

import org.json.JSONObject;
import javax.persistence.*;

@Entity
@Table(name="tab_items")
public class Items implements Serializable{
	
	@Id
	@Column(name="itemId")
	private int itemId; //����
	
	@Column(name="parentId")
	private int parentId; //���ڵ�ID
	
	@Column(name="itemName")
	private String itemName; //��Ŀ����
	
	@Column(name="isInputData")
	private String isInputData; //�Ƿ�¼������
	
	@Column(name="dataType")
	private String dataType; //��������(��ѡ����ѡ���ı�����ֵ)
	
	@Column(name="introduction")
	private String introduction; //˵��
	
	@Column(name="isChildrenOpen")
	private String isChildrenOpen; //
	
	@Column(name="status")
	private String status; //״̬
	
	@Column(name="sortValue")
	private String sortValue; //����ֵ
	
	
	
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getIsInputData() {
		return isInputData;
	}
	public void setIsInputData(String isInputData) {
		this.isInputData = isInputData;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getIsChildrenOpen() {
		return isChildrenOpen;
	}
	public void setIsChildrenOpen(String isChildrenOpen) {
		this.isChildrenOpen = isChildrenOpen;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSortValue() {
		return sortValue;
	}
	public void setSortValue(String sortValue) {
		this.sortValue = sortValue;
	}
	
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("itemId", this.itemId);
		jo.put("parentId", this.parentId);
		jo.put("itemName", this.itemName);
		jo.put("isInputData", this.isInputData);
		jo.put("dataType", this.dataType);
		jo.put("introduction", this.introduction);
		jo.put("isChildrenOpen", this.isChildrenOpen);
		jo.put("status", this.status);
		jo.put("sortValue", this.sortValue);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
	
	/*
	 * private int itemId; //����
	private int parentId; //���ڵ�ID
	private String itemName; //��Ŀ����
	private String isInputData; //�Ƿ�¼������
	private String dataType; //��������(��ѡ����ѡ���ı�����ֵ)
	private String introduction; //˵��
	private String isChildrenOpen; //
	private String status; //״̬
	private String sortValue; //����ֵ
	 */
}
