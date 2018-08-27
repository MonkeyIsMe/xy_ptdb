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

public class PaAssayInfoAction extends ActionSupport{
	
	private List<Assay> assay;

	public List<Assay> getAssay() {
		return assay;
	}

	public void setAssay(List<Assay> assay) {
		this.assay = assay;
	}
	
	public String queryAssay() {
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		HttpServletRequest request= ServletActionContext.getRequest();
		HttpSession session  = request.getSession();
		String use_id = (String) session.getAttribute("patientId");
		System.out.println(use_id);
		assay = query(use_id);
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

	private List<Assay> query(String use_id) {
		// TODO Auto-generated method stub
		List<Assay> list = null;
		AssayDAO ad = new AssayDAOImpl();
		int id = Integer.parseInt(use_id);
		list = ad.getAssayById(id);
		return list;
	}
	
}
