package com.csu.entity;

import java.io.Serializable;

import org.json.JSONObject;


public class ReferencePK implements Serializable{

	private int S_ID;
	
	private int F_Num;
	
	private int F_Rid;

	public int getS_ID() {
		return S_ID;
	}

	public void setS_ID(int s_ID) {
		S_ID = s_ID;
	}

	public int getF_Num() {
		return F_Num;
	}

	public void setF_Num(int f_Num) {
		F_Num = f_Num;
	}

	public int getF_Rid() {
		return F_Rid;
	}

	public void setF_Rid(int f_Rid) {
		F_Rid = f_Rid;
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
		jo.put("S_ID", this.S_ID);
		jo.put("F_Num", this.F_Num);
		jo.put("F_Rid", this.F_Rid);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
	
}
