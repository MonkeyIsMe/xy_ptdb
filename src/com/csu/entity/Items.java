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
	private int itemId; //主键
	
	@Column(name="parentId")
	private int parentId; //父节点ID
	
	@Column(name="itemName")
	private String itemName; //项目名称
	
	@Column(name="isInputData")
	private String isInputData; //是否录入数据
	
	@Column(name="dataType")
	private String dataType; //数据类型(单选，多选，文本，真值)
	
	@Column(name="introduction")
	private String introduction; //说明
	
	@Column(name="isChildrenOpen")
	private String isChildrenOpen; //
	
	@Column(name="status")
	private String status; //状态
	
	@Column(name="sortValue")
	private String sortValue; //排序值
	
	
	
	
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
	 * private int itemId; //主键
	private int parentId; //父节点ID
	private String itemName; //项目名称
	private String isInputData; //是否录入数据
	private String dataType; //数据类型(单选，多选，文本，真值)
	private String introduction; //说明
	private String isChildrenOpen; //
	private String status; //状态
	private String sortValue; //排序值
	 */
}
