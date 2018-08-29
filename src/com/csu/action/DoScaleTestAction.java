package com.csu.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.csu.dao.ScaleDAO;
import com.csu.dao.impl.ScaleDAOImpl;
import com.csu.entity.ScaleItem;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;

public class DoScaleTestAction extends ActionSupport{
	
	private List<ScaleItem> si;


	public void setSi(List<ScaleItem> si) {
		this.si = si;
	}
	
	public String queryScaleItem() {
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		si = query();
		JSONArray arr = JSONArray.fromObject(si);
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
		//System.out.println(si.size());
		return SUCCESS;
		
	}

	private List<ScaleItem> query() {
		// TODO Auto-generated method stub
		ScaleDAO sd = new ScaleDAOImpl();
		HttpServletRequest reqeust= ServletActionContext.getRequest();
		HttpServletRequest req = ServletActionContext.getRequest();
		HttpSession session  = req.getSession();
		String scale_id = (String) session.getAttribute("scale_id");
		//System.out.println(scale_id);
		int scale = Integer.parseInt(scale_id);
		//int uid = (int) session.getAttribute("test");
		List<ScaleItem> list = null;
		list = sd.queryScaleItemById(scale);
		return list;
	}
}
