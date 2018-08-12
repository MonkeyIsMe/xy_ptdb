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
import com.csu.dao.impl.PatientInfoDAOImpl;
import com.csu.entity.PatientInfo;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;

public class PatientInfoAction extends ActionSupport{
	
	private List<PatientInfo> pi;
	
	
	
	public List<PatientInfo> getPi() {
		return pi;
	}

	
	public String queryPatientInfo() {
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		pi = query();
		JSONArray arr = JSONArray.fromObject(pi);
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
		System.out.println(pi.size());
		return SUCCESS;
	}


	public List<PatientInfo> query() {
		PatientInfoDAO pid = new PatientInfoDAOImpl();
		List<PatientInfo> list = null;
		list = pid.getAllPatientInfo();
		/*for(PatientInfo pi :list) {
			System.out.println(pi.toString());
		}*/
		return list;
	}
	
}
