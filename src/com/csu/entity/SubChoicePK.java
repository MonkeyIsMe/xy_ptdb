package com.csu.entity;

import java.io.Serializable;

import org.json.JSONObject;

public class SubChoicePK implements Serializable{

	private int I_ID;
	private int C_Num; //´ð°¸±àºÅ
	private int C_SubNum;
	
	
	public int getI_ID() {
		return I_ID;
	}
	public void setI_ID(int i_ID) {
		I_ID = i_ID;
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
	
	@Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
	
	@Override
    public int hashCode() {
        return super.hashCode();
    }
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("C_Num", this.C_Num);
		jo.put("C_SubNum", this.C_SubNum);
		jo.put("I_ID", this.I_ID);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
	
}
