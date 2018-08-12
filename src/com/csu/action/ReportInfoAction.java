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
import com.csu.dao.ReportDAO;
import com.csu.dao.impl.PatientInfoDAOImpl;
import com.csu.dao.impl.RecordDAOImpl;
import com.csu.dao.impl.ReportDAOImpl;
import com.csu.entity.PatientInfo;
import com.csu.entity.Report;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;

public class ReportInfoAction extends ActionSupport{
	
	private List<Report> report;
	
	
	public List<Report> getReport() {
		return report;
	}


	public void setReport(List<Report> report) {
		this.report = report;
	}


	public String queryReportInfo() {
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		report = query();
		JSONArray arr = JSONArray.fromObject(report);
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
		System.out.println(report.size());
		return SUCCESS;
	}


	public List<Report> query() {
		ReportDAO rd = new ReportDAOImpl();
		List<Report> list = null;
		list = rd.getAllReport();
		/*for(PatientInfo pi :list) {
			System.out.println(pi.toString());
		}*/
		return list;
	}
	
}
