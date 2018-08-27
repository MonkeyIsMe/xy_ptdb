package com.csu.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.csu.dao.DiagDAO;
import com.csu.dao.impl.DiagDAOImpl;
import com.csu.entity.*;

import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;

public class DiagInfoAction extends ActionSupport{
	
	List<DiagName> diag_name;
	
	List<DiagClass> diag_class;
	
	List<DiagRule> diag_rule;
	
	List<DiagType> diag_type;

	public List<DiagName> getDiag_name() {
		return diag_name;
	}

	public void setDiag_name(List<DiagName> diag_name) {
		this.diag_name = diag_name;
	}

	public List<DiagClass> getDiag_class() {
		return diag_class;
	}

	public void setDiag_class(List<DiagClass> diag_class) {
		this.diag_class = diag_class;
	}

	public List<DiagRule> getDiag_rule() {
		return diag_rule;
	}

	public void setDiag_rule(List<DiagRule> diag_rule) {
		this.diag_rule = diag_rule;
	}

	public List<DiagType> getDiag_type() {
		return diag_type;
	}

	public void setDiag_type(List<DiagType> diag_type) {
		this.diag_type = diag_type;
	}
	
	public String queryDiagType() {
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		DiagDAO dd = new DiagDAOImpl();
		List<DiagType> diag_type = dd.queryDiagType();
		JSONArray arr = JSONArray.fromObject(diag_type);
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
		System.out.println(diag_type.size());
		return SUCCESS;
	}
	
	public String queryDiagRule() {
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		DiagDAO dd = new DiagDAOImpl();
		List<DiagRule> diag_rule = dd.queryDiagRule();
		JSONArray arr = JSONArray.fromObject(diag_rule);
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
		System.out.println(diag_rule.size());
		return SUCCESS;
	}

	public String queryDiagClass() {
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		DiagDAO dd = new DiagDAOImpl();
		List<DiagClass> diag_class = dd.queryDiagClass();
		JSONArray arr = JSONArray.fromObject(diag_class);
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
		System.out.println(diag_class.size());
		return SUCCESS;
	}

	public String queryDiagName() {
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		DiagDAO dd = new DiagDAOImpl();
		List<DiagName> diag_name = dd.queryDiagName();
		JSONArray arr = JSONArray.fromObject(diag_name);
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
		System.out.println(diag_name.size());
		return SUCCESS;
	}
}
