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
import com.csu.dao.SpecimenDAO;
import com.csu.dao.impl.PatientInfoDAOImpl;
import com.csu.dao.impl.SpecimenDAOImpl;
import com.csu.entity.PatientInfo;
import com.csu.entity.Specimen;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;

public class PaSpecimenInfo extends ActionSupport{
	
	private List<Specimen> sp;
	
	
	
	public List<Specimen> getSp() {
		return sp;
	}

	
	public String querySpecimenInfo() {
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		HttpServletRequest request= ServletActionContext.getRequest();
		HttpSession session  = request.getSession();
		String use_id = (String) session.getAttribute("patientId");
		sp = query(use_id);
		JSONArray arr = JSONArray.fromObject(sp);
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
		System.out.println(sp.size());
		return SUCCESS;
	}


	public List<Specimen> query(String use_id) {
		SpecimenDAO sd = new SpecimenDAOImpl();
		List<Specimen> list = null;
		int id = Integer.parseInt(use_id);
		list = sd.getSpecimenByUid(id);
		/*for(PatientInfo pi :list) {
			System.out.println(pi.toString());
		}*/
		return list;
	}
	
}
