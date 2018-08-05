package com.csu.entity;

import java.io.Serializable;
import java.util.Date;

import org.json.JSONObject;

public class CommentPK implements Serializable{
	
	private int S_ID;
	private int U_ID;
	private Date T_Time;
	
	public int getS_ID() {
		return S_ID;
	}
	public void setS_ID(int s_ID) {
		S_ID = s_ID;
	}
	public int getU_ID() {
		return U_ID;
	}
	public void setU_ID(int u_ID) {
		U_ID = u_ID;
	}
	public Date getT_Time() {
		return T_Time;
	}
	public void setT_Time(Date t_Time) {
		T_Time = t_Time;
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
		jo.put("U_ID", this.U_ID);
		jo.put("S_ID", this.S_ID);
		jo.put("T_Time", this.T_Time);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
	
}
