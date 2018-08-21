package com.csu.entity;

import org.json.JSONObject;

import java.io.Serializable;

import javax.persistence.*;
//��Ŀѡ����ñ���Ҫ���ڴ洢ÿһ����Ŀ��ѡ��

@Entity
@Table(name="tab_choice")
public class Choice implements Serializable{
	
	@EmbeddedId
	private ChoicePK cpk;
	

	@Column(name="C_Content")
	private String C_Content; //ѡ������
	
	@Column(name="C_Score")
	private int C_Score; //ѡ���ֵ
	
	@Column(name="C_SubChoice")
	private String C_SubChoice; //��ѡ��
	
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
	public String getC_SubChoice() {
		return C_SubChoice;
	}
	public void setC_SubChoice(String c_SubChoice) {
		C_SubChoice = c_SubChoice;
	}
	
	public ChoicePK getCpk() {
		return cpk;
	}
	public void setCpk(ChoicePK cpk) {
		this.cpk = cpk;
	}
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("C_Content", this.C_Content);
		jo.put("C_Score", this.C_Score);
		jo.put("C_SubChoice", this.C_SubChoice);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
	
	
}


/*
 * private int I_ID; //��Ӧ����Ŀ���
	private int C_Num; //ѡ����
	private String C_Content; //ѡ������
	private int C_Score; //ѡ���ֵ
	private String C_SubChoice; //��ѡ��
 */
/*
CREATE TABLE `tab_choice` (
`I_ID` int(11) NOT NULL,
`C_Num` int(11) NOT NULL,
`C_Content` varchar(5000) DEFAULT NULL,
`C_Score` int(11) DEFAULT NULL,
`C_SubChoice` char(1) DEFAULT NULL,
PRIMARY KEY (`I_ID`,`C_Num`),
CONSTRAINT `FK_TAB_CHOI_REFERENCE_TAB_SCAL` FOREIGN KEY (`I_ID`) REFERENCES `tab_scaleitem` (`I_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;
*/