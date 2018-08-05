package com.csu.entity;

import org.json.JSONObject;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="tab_diag_name")
public class DiagName implements Serializable{
	
	@Id
	@Column(name="diagNameId")
	private Integer diagNameId;
	
	@Column(name="diagName")
	private String diagName;
	
	@Column(name="DiagTypeId")
	private Integer diagTypeId;
	
	@Column(name="diagDefine")
	private String diagDefine;
	
	@Column(name="diagPoint")
	private String diagPoint;
	
	@ManyToOne(fetch=FetchType.LAZY) //fentch: 设置了延迟加载 ，默认为立即加载，不设置则会和dept表外连接查询
    @JoinColumn(name="diagTypeId")
	private DiagType dt;
	
	@OneToMany(mappedBy="dn",cascade={CascadeType.ALL})
	private Set<DiagClass> dc = new HashSet<DiagClass>();
	
	
	public DiagType getType() {
		return dt;
	}
	public void setType(DiagType type) {
		this.dt = type;
	}
	public Integer getDiagNameId() {
		return diagNameId;
	}
	public void setDiagNameId(Integer diagNameId) {
		this.diagNameId = diagNameId;
	}
	public String getDiagName() {
		return diagName;
	}
	public void setDiagName(String diagName) {
		this.diagName = diagName;
	}
	public Integer getDiagTypeId() {
		return diagTypeId;
	}
	public void setDiagTypeId(Integer diagTypeId) {
		this.diagTypeId = diagTypeId;
	}
	public String getDiagDefine() {
		return diagDefine;
	}
	public void setDiagDefine(String diagDefine) {
		this.diagDefine = diagDefine;
	}
	public String getDiagPoint() {
		return diagPoint;
	}
	public void setDiagPoint(String diagPoint) {
		this.diagPoint = diagPoint;
	}
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("diagNameId", this.diagNameId);
		jo.put("diagName", this.diagName);
		jo.put("diagTypeId", this.diagTypeId);
		jo.put("diagDefine", this.diagDefine);
		jo.put("diagPoint", this.diagPoint);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
	/*
	 * private Integer diagNameId;
	private String diagName;
	private Integer diagTypeId;
	private String diagDefine;
	private String diagPoint;
	 */
}
