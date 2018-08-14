package com.csu.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.json.JSONObject;

import com.csu.dao.MentalScaleDAO;
import com.csu.dao.impl.MentalScaleDAOImpl;
import com.csu.entity.MentalScale;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

public class ScaleInfoAction extends ActionSupport{
	
	private List<MentalScale> scale;
	
	

	
	public List<MentalScale> getScale() {
		return scale;
	}


	public void setScale(List<MentalScale> scale) {
		this.scale = scale;
	}


	public String queryScaleInfo() {
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		scale = query();
		//JsonConfig config = new JsonConfig();
		//config.setExcludes(new String[] {"factor_ms"});
		//config.setExcludes(new String[] {"ms"});
		JSONArray arr = JSONArray.fromObject(scale);
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
		System.out.println(scale.size());
		return SUCCESS;
	}


	public List<MentalScale> query() {
		MentalScaleDAO msd = new MentalScaleDAOImpl();
		List<MentalScale> list = null;
		list = msd.query();
		/*for(PatientInfo pi :list) {
			System.out.println(pi.toString());
		}*/
		return list;
	}
	
}
