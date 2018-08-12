package com.csu.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.json.JSONObject;

import com.csu.dao.PatientInfoDAO;
import com.csu.dao.RecordDAO;
import com.csu.dao.impl.PatientInfoDAOImpl;
import com.csu.dao.impl.RecordDAOImpl;
import com.csu.entity.PatientInfo;
import com.csu.entity.Record;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;

public class RecordInfoAction extends ActionSupport{
	
	private List<Record> record;
	
	
	

	
	public List<Record> getRecord() {
		return record;
	}


	public void setRecord(List<Record> record) {
		this.record = record;
	}


	public String queryRecordInfo() {
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		record = query();
		JSONArray arr = JSONArray.fromObject(record);
		PrintWriter out = null;
		try {
			out = ServletActionContext.getResponse().getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        out.println(arr.toString());
        out.flush(); 
        out.close(); 
		System.out.println(record.size());
		return SUCCESS;
	}


	public List<Record> query() {
		RecordDAO rd = new RecordDAOImpl();
		List<Record> list = null;
		list = rd.Query();
		/*for(PatientInfo pi :list) {
			System.out.println(pi.toString());
		}*/
		return list;
	}
	
}
