package com.csu.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.json.JSONObject;

import com.csu.dao.KindDAO;
import com.csu.dao.PatientInfoDAO;
import com.csu.dao.impl.KindDAOImpl;
import com.csu.dao.impl.PatientInfoDAOImpl;
import com.csu.entity.Fkind;
import com.csu.entity.PatientInfo;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;

public class FkindInfoAction extends ActionSupport{
	
	private List<Fkind> fkind;
	
	

	
	public List<Fkind> getFkind() {
		return fkind;
	}


	public void setFkind(List<Fkind> fkind) {
		this.fkind = fkind;
	}


	public String queryFkindInfo() {
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		fkind = query();
		JSONArray arr = JSONArray.fromObject(fkind);
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
		System.out.println(fkind.size());
		return SUCCESS;
	}


	public List<Fkind> query() {
		KindDAO kd = new KindDAOImpl();
		List<Fkind> list = null;
		list = kd.queryFKind();
		/*for(PatientInfo pi :list) {
			System.out.println(pi.toString());
		}*/
		return list;
	}
	
}
