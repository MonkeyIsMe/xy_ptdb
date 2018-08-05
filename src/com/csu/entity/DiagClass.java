package com.csu.entity;

import org.json.JSONObject;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="tab_diag_class")
public class DiagClass implements Serializable{
	
	@Id
	@Column(name="diagClassId")
	private Integer diagClassId;
	
	@Column(name="diagClassName")
	private String diagClassName;
	
	@Column(name="DiagNameId")
	private Integer diagNameId;
	
	@ManyToOne(fetch=FetchType.LAZY) //fentch: 设置了延迟加载 ，默认为立即加载，不设置则会和dept表外连接查询
    @JoinColumn(name="diagNameId")
	private DiagName dn;
	
	
	
	public DiagName getDn() {
		return dn;
	}
	public void setDn(DiagName dn) {
		this.dn = dn;
	}
	public Integer getDiagClassId() {
		return diagClassId;
	}
	public void setDiagClassId(Integer diagClassId) {
		this.diagClassId = diagClassId;
	}
	public String getDiagClassName() {
		return diagClassName;
	}
	public void setDiagClassName(String diagClassName) {
		this.diagClassName = diagClassName;
	}
	public Integer getDiagNameId() {
		return diagNameId;
	}
	public void setDiagNameId(Integer diagNameId) {
		this.diagNameId = diagNameId;
	}
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("diagClassId", this.diagClassId);
		jo.put("diagClassName", this.diagClassName);
		jo.put("diagNameId", this.diagNameId);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
}
