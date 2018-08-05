package com.csu.entity;

import org.json.JSONObject;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="tab_refer")
@Embeddable
public class Reference implements Serializable{
	
	@EmbeddedId
	private ReferencePK rpk;
	
	@Column(name="R_Score1")
	private int R_Score1;
	
	@Column(name="R_Score2")
	private int R_Score2;
	
	@Column(name="R_Sex")
	private String R_Sex;
	
	@Column(name="R_Age1")
	private int R_Age1;
	
	@Column(name="R_Age2")
	private int R_Age2;
	
	@Column(name="R_Suggestion")
	private String R_Suggestion;
	
	
	
	public ReferencePK getRpk() {
		return rpk;
	}
	public void setRpk(ReferencePK rpk) {
		this.rpk = rpk;
	}
	
	public int getR_Score1() {
		return R_Score1;
	}
	public void setR_Score1(int r_Score1) {
		R_Score1 = r_Score1;
	}
	public int getR_Score2() {
		return R_Score2;
	}
	public void setR_Score2(int r_Score2) {
		R_Score2 = r_Score2;
	}
	public String getR_Sex() {
		return R_Sex;
	}
	public void setR_Sex(String r_Sex) {
		R_Sex = r_Sex;
	}
	public int getR_Age1() {
		return R_Age1;
	}
	public void setR_Age1(int r_Age1) {
		R_Age1 = r_Age1;
	}
	public int getR_Age2() {
		return R_Age2;
	}
	public void setR_Age2(int r_Age2) {
		R_Age2 = r_Age2;
	}
	public String getR_Suggestion() {
		return R_Suggestion;
	}
	public void setR_Suggestion(String r_Suggestion) {
		R_Suggestion = r_Suggestion;
	}
	
 
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("rpk", this.rpk);
		jo.put("R_Score1", this.R_Score1);
		jo.put("R_Score2", this.R_Score2);
		jo.put("R_Sex", this.R_Sex);
		jo.put("R_Age1", this.R_Age1);
		jo.put("R_Suggestion", this.R_Suggestion);
		jo.put("R_Age2", this.R_Age2);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
}

/*
CREATE TABLE `tab_refer` (
`S_ID` int(10) unsigned NOT NULL,
`F_Num` int(10) unsigned NOT NULL,
`F_Rid` int(10) unsigned NOT NULL,
`R_Score1` int(10) DEFAULT NULL,
`R_Score2` int(10) DEFAULT NULL,
`R_Sex` varchar(4) DEFAULT NULL,
`R_Age1` int(10) DEFAULT NULL,
`R_Age2` int(10) DEFAULT NULL,
`R_Suggestion` varchar(3000) DEFAULT NULL,
PRIMARY KEY (`S_ID`,`F_Num`,`F_Rid`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;
*/