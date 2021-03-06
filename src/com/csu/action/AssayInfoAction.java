package com.csu.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.csu.dao.AssayDAO;
import com.csu.dao.impl.AssayDAOImpl;
import com.csu.entity.Assay;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;

public class AssayInfoAction extends ActionSupport{
	
	private List<Assay> assay;

	public List<Assay> getAssay() {
		return assay;
	}

	public void setAssay(List<Assay> assay) {
		this.assay = assay;
	}
	
	public String queryAssayInfo() {
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		assay = query();
		JSONArray arr = JSONArray.fromObject(assay);
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
		System.out.println(assay.size());
		return SUCCESS;
	}

	private List<Assay> query() {
		// TODO Auto-generated method stub
		List<Assay> list = null;
		AssayDAO ad = new AssayDAOImpl();
		list = ad.getAllAssay();
		return list;
	}
	
}
