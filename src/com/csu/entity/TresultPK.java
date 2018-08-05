package com.csu.entity;

import java.io.Serializable;
import java.util.Date;

import org.json.JSONObject;

public class TresultPK implements Serializable{

	private int U_ID;
	private int S_ID;
	private int I_ID;
	private Date T_Time;
	
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
		jo.put("I_ID", this.I_ID);
		jo.put("T_Time", this.T_Time);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
	
}
