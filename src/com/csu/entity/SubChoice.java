package com.csu.entity;

import java.io.Serializable;

import org.json.JSONObject;
import javax.persistence.*;

@Entity
@Table(name="tab_choice2")
public class SubChoice implements Serializable{
	
	@EmbeddedId
	private SubChoicePK scpk;
	
	@Column(name="C_Content")	
	private String C_Content; //答案内容
	
	@Column(name="C_Score")
	private int C_Score; //分值
	
	
	
	public SubChoicePK getScpk() {
		return scpk;
	}
	public void setScpk(SubChoicePK scpk) {
		this.scpk = scpk;
	}
	public String getC_Content() {
		return C_Content;
	}
	public void setC_Content(String c_Content) {
		C_Content = c_Content;
	}
	public int getC_Score() {
		return C_Score;
	}
	public void setC_Score(int c_Score) {
		C_Score = c_Score;
	}
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("scpk", this.scpk);
		jo.put("C_Content", this.C_Content);
		jo.put("C_Score", this.C_Score);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
	
}

/*
 * 
 * CREATE TABLE `tab_choice2` (
  `I_ID` int(11) NOT NULL,
  `C_Num` int(11) NOT NULL,
  `C_SubNum` int(11) NOT NULL,
  `C_Content` varchar(5000) DEFAULT NULL,
  `C_Score` int(11) DEFAULT NULL,
  PRIMARY KEY (`I_ID`,`C_Num`,`C_SubNum`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;
 * */
