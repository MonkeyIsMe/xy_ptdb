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
import com.csu.dao.ResultDAO;
import com.csu.dao.SpecimenDAO;
import com.csu.dao.impl.PatientInfoDAOImpl;
import com.csu.dao.impl.ResultDAOImpl;
import com.csu.dao.impl.SpecimenDAOImpl;
import com.csu.entity.PatientInfo;
import com.csu.entity.Result;
import com.csu.entity.Specimen;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;

public class ResultInfoAction extends ActionSupport{
	
	private List<Result> result;
	
	
	public List<Result> getResult() {
		return result;
	}


	public void setResult(List<Result> result) {
		this.result = result;
	}


	public String queryResultInfo() {
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		result = query();
		JSONArray arr = JSONArray.fromObject(result);
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
		System.out.println(result.size());
		return SUCCESS;
	}


	public List<Result> query() {
		ResultDAO rd = new ResultDAOImpl();
		List<Result> list = null;
		list = rd.queryResult();
		/*for(PatientInfo pi :list) {
			System.out.println(pi.toString());
		}*/
		return list;
	}
	
}
