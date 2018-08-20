package com.csu.entity;

import org.json.JSONObject;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="tab_diag_type")
public class DiagType implements Serializable{
	
	@Id
	@Column(name="diagTypeId")
	private Integer diagTypeId;
	
	@Column(name="diagTypeName")
	private String diagTypeName;
	
	@Column(name="DiagRuleId")
	private Integer diagRuleId;
	
	@Column(name="diagTypeIntroduction")
	private String diagTypeIntroduction;
	

	
	
	public Integer getDiagTypeId() {
		return diagTypeId;
	}
	public void setDiagTypeId(Integer diagTypeId) {
		this.diagTypeId = diagTypeId;
	}
	public String getDiagTypeName() {
		return diagTypeName;
	}
	public void setDiagTypeName(String diagTypeName) {
		this.diagTypeName = diagTypeName;
	}
	public Integer getDiagRuleId() {
		return diagRuleId;
	}
	public void setDiagRuleId(Integer diagRuleId) {
		this.diagRuleId = diagRuleId;
	}
	public String getDiagTypeIntroduction() {
		return diagTypeIntroduction;
	}
	public void setDiagTypeIntroduction(String diagTypeIntroduction) {
		this.diagTypeIntroduction = diagTypeIntroduction;
	}
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("diagRuleId", this.diagRuleId);
		jo.put("diagTypeId", this.diagTypeId);
		jo.put("diagTypeName", this.diagTypeName);
		jo.put("diagTypeIntroduction", this.diagTypeIntroduction);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
}
