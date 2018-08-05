package com.csu.entity;

import java.io.Serializable;
import java.util.Date;

import org.json.JSONObject;
import javax.persistence.*;

@Entity
@Table(name="tab_tresult")
public class Tresult implements Serializable{
	
	@EmbeddedId
	private TresultPK tpk;
	
	@Column(name="C_Num")
	private int C_Num;
	
	@Column(name="C_SubNum")
	private int C_SubNum;
	
	@Column(name="isAudited")
	private int isAudited;
	
	
	
	public TresultPK getTpk() {
		return tpk;
	}
	public void setTpk(TresultPK tpk) {
		this.tpk = tpk;
	}
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
	public int getIsAudited() {
		return isAudited;
	}
	public void setIsAudited(int isAudited) {
		this.isAudited = isAudited;
	}
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("U_ID", this.tpk);
		jo.put("C_Num", this.C_Num);
		jo.put("C_SubNum", this.C_SubNum);
		jo.put("isAudited", this.isAudited);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
}

/*
CREATE TABLE `tab_tresult` (
`U_ID` int(11) NOT NULL DEFAULT '0',
`S_ID` int(11) NOT NULL DEFAULT '0',
`I_ID` int(11) NOT NULL DEFAULT '0',
`T_Time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
`C_Num` int(11) DEFAULT NULL,
`C_SubNum` int(11) DEFAULT NULL,
`isAudited` int(10) unsigned NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
*/