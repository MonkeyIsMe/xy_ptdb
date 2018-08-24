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
import com.csu.entity.Skind;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;

public class TestSkindInfoAction extends ActionSupport{
	
	private List<Skind> skind;
	
	


	public List<Skind> getSkind() {
		return skind;
	}


	public void setSkind(List<Skind> skind) {
		this.skind = skind;
	}


	public String queryTestSkindInfo() {
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		HttpServletRequest request= ServletActionContext.getRequest();
		HttpSession session  = request.getSession();
		String fkind_id = (String) session.getAttribute("fkind_id");
		//System.out.println(fkind_id);
		skind = query(fkind_id);
		JSONArray arr = JSONArray.fromObject(skind);
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
		System.out.println(skind.size());
		return SUCCESS;
	}


	public List<Skind> query(String fkind_id) {
		KindDAO kd = new KindDAOImpl();
		List<Skind> list = null;
		//System.out.println(fkind_id);
		int fk_id = Integer.parseInt(fkind_id);
		//System.out.println(fk_id);
		list = kd.getSkindsByfid(fk_id);
		/*for(PatientInfo pi :list) {
			System.out.println(pi.toString());
		}*/
		return list;
	}
	
}
