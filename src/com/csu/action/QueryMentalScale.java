package com.csu.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.csu.dao.MentalScaleDAO;
import com.csu.dao.impl.MentalScaleDAOImpl;
import com.csu.entity.MentalScale;
import com.opensymphony.xwork2.ActionSupport;

public class QueryMentalScale extends ActionSupport{
	
	private int m_id;

	public int getM_id() {
		return m_id;
	}

	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	
	public void getMental() {
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		HttpServletRequest request= ServletActionContext.getRequest();
		String mental = request.getParameter("m_id");
		int mental_id = Integer.parseInt(mental);
		System.out.println(mental_id);
		MentalScaleDAO msd = new MentalScaleDAOImpl();
		MentalScale ms = msd.getMentalScaleById(mental_id);
		PrintWriter out = null;
		try {
			out = ServletActionContext.getResponse().getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println(ms);
	}
	
}
