package com.csu.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.json.JSONObject;

import javax.persistence.*;


@Entity
@Table(name="tab_diag_rule")
public class DiagRule implements Serializable{
	
	@Id
	@Column(name="diagRuleId")
	private int diagRuleId;
	
	@Column(name="diagRuleName")
	private String diagRuleName;
	
	@Column(name="diagRuleIntroduction")
	private String diagRuleIntroduction;
	
	@Column(name="diagRuleLastModifyTime")
	private Date diagRuleLastModifyTime;
	
	@Column(name="diagRuleLastModifyPerson")
	private String diagRuleLastModifyPerson;
	
	
	@OneToMany(mappedBy="dr",cascade={CascadeType.ALL})
	private Set<DiagType> type = new HashSet<DiagType>();
	
	
	public Set<DiagType> getType() {
		return type;
	}
	public void setType(Set<DiagType> type) {
		this.type = type;
	}
	public int getDiagRuleId() {
		return diagRuleId;
	}
	public void setDiagRuleId(int diagRuleId) {
		this.diagRuleId = diagRuleId;
	}
	public String getDiagRuleName() {
		return diagRuleName;
	}
	public void setDiagRuleName(String diagRuleName) {
		this.diagRuleName = diagRuleName;
	}
	public String getDiagRuleIntroduction() {
		return diagRuleIntroduction;
	}
	public void setDiagRuleIntroduction(String diagRuleIntroduction) {
		this.diagRuleIntroduction = diagRuleIntroduction;
	}
	public Date getDiagRuleLastModifyTime() {
		return diagRuleLastModifyTime;
	}
	public void setDiagRuleLastModifyTime(Date diagRuleLastModifyTime) {
		this.diagRuleLastModifyTime = diagRuleLastModifyTime;
	}
	public String getDiagRuleLastModifyPerson() {
		return diagRuleLastModifyPerson;
	}
	public void setDiagRuleLastModifyPerson(String diagRuleLastModifyPerson) {
		this.diagRuleLastModifyPerson = diagRuleLastModifyPerson;
	}
	
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("diagRuleId", this.diagRuleId);
		jo.put("diagRuleName", this.diagRuleName);
		jo.put("diagRuleIntroduction", this.diagRuleIntroduction);
		jo.put("diagRuleLastModifyTime", this.diagRuleLastModifyTime);
		jo.put("diagRuleLastModifyPerson", this.diagRuleLastModifyPerson);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
	
}

/*CREATE TABLE `tab_diag_rule` (
  `diagRuleId` int(11) NOT NULL AUTO_INCREMENT,
  `diagRuleName` varchar(255) DEFAULT NULL,
  `diagRuleIntroduction` varchar(255) DEFAULT NULL,
  `diagRuleLastModifyTime` datetime DEFAULT NULL,
  `diagRuleLastModifyPerson` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`diagRuleId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
*/
