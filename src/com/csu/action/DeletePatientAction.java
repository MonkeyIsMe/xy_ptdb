package com.csu.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.csu.service.PatientService;
import com.csu.service.Impl.PatientServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class DeletePatientAction extends ActionSupport{
	
	private int PatientId;

	public int getPatientId() {
		return PatientId;
	}

	public void setPatientId(int patientId) {
		PatientId = patientId;
	}
	
	public void delete() {
		HttpServletRequest request= ServletActionContext.getRequest();
		String PatientId = request.getParameter("p_id");
		PatientService ps = new PatientServiceImpl();
		System.out.println(PatientId);
		PrintWriter out = null;
		try {
			out = ServletActionContext.getResponse().getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int p_id = Integer.parseInt(PatientId);
		if(ps.deletePatientInfo(p_id)) {
			out.println("SUCCESS");
		}
		else out.println("FAIL");
		
	}
	
}
