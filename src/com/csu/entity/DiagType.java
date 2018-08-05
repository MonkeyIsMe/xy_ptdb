package com.csu.entity;

import org.json.JSONObject;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="tab_diag_type")
public class DiagType {
	
	@Id
	@Column(name="diagTypeId")
	private Integer diagTypeId;
	
	@Column(name="diagTypeName")
	private String diagTypeName;
	
	@Column(name="DiagRuleId")
	private Integer diagRuleId;
	
	@Column(name="diagTypeIntroduction")
	private String diagTypeIntroduction;
	
	@ManyToOne(fetch=FetchType.LAZY) //fentch: 设置了延迟加载 ，默认为立即加载，不设置则会和dept表外连接查询
    @JoinColumn(name="diagRuleId")
	private DiagRule dr;
	
	@OneToMany(mappedBy="dt",cascade={CascadeType.ALL})
	private Set<DiagName> name = new HashSet<>();
	
	
	
	
	public DiagRule getDr() {
		return dr;
	}
	public void setDr(DiagRule dr) {
		this.dr = dr;
	}
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
