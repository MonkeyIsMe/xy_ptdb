package com.csu.entity;

import org.json.JSONObject;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="tab_factor")
public class Factor implements Serializable{
	
	@Id
	@Column(name="S_id")
	private Integer S_ID;
	
	@Column(name="F_SNum")
	private Integer F_SNum;
	
	@Column(name="F_Content")
	private String F_Content;
	
	@Column(name="F_Info")
	private String F_Info;
	
	@Column(name="F_Balance")
	private double F_Balance;
	
	@Column(name="F_Den")
	private double F_Den;
	
	@Column(name="F_ONum")
	private Integer F_ONum;
	
	@Column(name="F_TYPE")
	private String F_TYPE;
	
	@Column(name="F_Formula")
	private String F_Formula;
	
	
	@ManyToOne(fetch=FetchType.LAZY) //fentch: 设置了延迟加载 ，默认为立即加载，不设置则会和dept表外连接查询
    @JoinColumn(name="S_ID")
	private MentalScale factor_ms;
	
	
	
	public MentalScale getFactor_ms() {
		return factor_ms;
	}
	public void setFactor_ms(MentalScale factor_ms) {
		this.factor_ms = factor_ms;
	}
	public int getS_ID() {
		return S_ID;
	}
	public void setS_ID(int s_ID) {
		S_ID = s_ID;
	}
	public int getF_SNum() {
		return F_SNum;
	}
	public void setF_SNum(int f_SNum) {
		F_SNum = f_SNum;
	}
	public String getF_Content() {
		return F_Content;
	}
	public void setF_Content(String f_Content) {
		F_Content = f_Content;
	}
	public String getF_Info() {
		return F_Info;
	}
	public void setF_Info(String f_Info) {
		F_Info = f_Info;
	}
	public double getF_Balance() {
		return F_Balance;
	}
	public void setF_Balance(double f_Balance) {
		F_Balance = f_Balance;
	}
	public double getF_Den() {
		return F_Den;
	}
	public void setF_Den(double f_Den) {
		F_Den = f_Den;
	}
	public int getF_ONum() {
		return F_ONum;
	}
	public void setF_ONum(int f_ONum) {
		F_ONum = f_ONum;
	}
	public String getF_TYPE() {
		return F_TYPE;
	}
	public void setF_TYPE(String f_TYPE) {
		F_TYPE = f_TYPE;
	}
	public String getF_Formula() {
		return F_Formula;
	}
	public void setF_Formula(String f_Formula) {
		F_Formula = f_Formula;
	}
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("S_ID", this.S_ID);
		jo.put("F_SNum", this.F_SNum);
		jo.put("F_Content", this.F_Content);
		jo.put("F_Info", this.F_Info);
		jo.put("F_Balance", this.F_Balance);
		jo.put("F_Den", this.F_Den);
		jo.put("F_Content", this.F_Content);
		jo.put("F_ONum", this.F_ONum);
		jo.put("F_TYPE", this.F_TYPE);
		jo.put("F_Formula", this.F_Formula);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
	
}
/*
CREATE TABLE `tab_factor` (
`S_ID` int(11) NOT NULL,
`F_SNum` int(11) NOT NULL,
`F_Content` varchar(10000) NOT NULL,
`F_Info` varchar(10000) NOT NULL,
`F_Balance` float DEFAULT NULL,
`F_Den` float DEFAULT NULL,
`F_ONum` int(11) DEFAULT NULL,
`F_TYPE` char(4) DEFAULT NULL,
`F_Formula` varchar(50) DEFAULT NULL,
PRIMARY KEY (`S_ID`,`F_SNum`),
CONSTRAINT `FK_TAB_FACT_REFERENCE_TAB_MENT` FOREIGN KEY (`S_ID`) REFERENCES `tab_mentalscale` (`S_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
*/