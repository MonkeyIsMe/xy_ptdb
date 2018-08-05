package com.csu.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.json.JSONObject;

@Entity
@Table(name="tab_uresult")
public class Uresult implements Serializable{
	
	@EmbeddedId
	private UresultPK upk;
	
	@Column(name="C_Num")
	private int C_Num;
	
	@Column(name="C_SubNum")
	private int C_SubNum;
	
	
	public int getC_Num() {
		return C_Num;
	}
	public void setC_Num(int c_Num) {
		C_Num = c_Num;
	}
	public int getC_SubNum() {
		return C_SubNum;
	}
	public void setC_SubNum(int c_SubNum) {
		C_SubNum = c_SubNum;
	}
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("C_Num", this.C_Num);
		jo.put("C_SubNum", this.C_SubNum);
		jo.put("upk", this.upk);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
}
/*
CREATE TABLE `tab_uresult` (
`U_ID` int(11) NOT NULL,
`S_ID` int(11) NOT NULL,
`I_ID` int(11) NOT NULL,
`T_Time` datetime NOT NULL,
`C_Num` int(11) DEFAULT NULL,
`C_SubNum` int(11) DEFAULT NULL,
PRIMARY KEY (`U_ID`,`S_ID`,`I_ID`,`T_Time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
*/
