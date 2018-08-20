package com.csu.entity;

import org.json.JSONObject;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
//������Ŀ���ñ����ڴ洢ÿһ�������Ӧ����Ŀ��������Ŀ�����ݣ���ֵ����Ϣ

@Entity
@Table(name="tab_scaleitem")
public class ScaleItem implements Serializable{
	
	@Id
	@Column(name="I_ID")
	private int I_ID;
	
	@Column(name="s_ID")
	private int s_ID; //������
	
	@Column(name="I_Content")
	private String I_Content; //��Ŀ����
	
	@Column(name="I_Factor")
	private int I_Factor;  //����
	
	@Column(name="I_TYPE")
	private String I_TYPE;  //����
	

	
	
	
	public int getI_ID() {
		return I_ID;
	}
	public void setI_ID(int i_ID) {
		I_ID = i_ID;
	}
	public int getS_ID() {
		return s_ID;
	}
	public void setS_ID(int s_ID) {
		s_ID = s_ID;
	}
	public String getI_Content() {
		return I_Content;
	}
	public void setI_Content(String i_Content) {
		I_Content = i_Content;
	}
	public int getI_Factor() {
		return I_Factor;
	}
	public void setI_Factor(int i_Factor) {
		I_Factor = i_Factor;
	}
	public String getI_TYPE() {
		return I_TYPE;
	}
	public void setI_TYPE(String i_TYPE) {
		I_TYPE = i_TYPE;
	}
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("I_ID", this.I_ID);
		jo.put("S_ID", this.s_ID);
		jo.put("I_Content", this.I_Content);
		jo.put("I_Factor", this.I_Factor);
		jo.put("I_TYPE", this.I_TYPE);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
}

/*
CREATE TABLE `tab_scaleitem` (
`I_ID` int(11) NOT NULL AUTO_INCREMENT,
`S_ID` int(11) DEFAULT NULL,
`I_Content` varchar(10000) NOT NULL,
`I_Factor` int(11) DEFAULT NULL,
`I_TYPE` char(4) DEFAULT NULL,
PRIMARY KEY (`I_ID`),
KEY `FK_TAB_SCAL_REFERENCE_TAB_MENT` (`S_ID`),
CONSTRAINT `FK_TAB_SCAL_REFERENCE_TAB_MENT` FOREIGN KEY (`S_ID`) REFERENCES `tab_mentalscale` (`S_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=55801 DEFAULT CHARSET=gbk;
*/