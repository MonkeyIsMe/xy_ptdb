package com.csu.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.csu.dao.ScaleDAO;
import com.csu.dao.impl.ScaleDAOImpl;
import com.csu.entity.ScaleItem;
import com.opensymphony.xwork2.ActionSupport;

public class ReportAction extends ActionSupport{
	
	public void SendReport() {
		HttpServletRequest request= ServletActionContext.getRequest();
		
		//获取每道题的分数
		String score = request.getParameter("score");
		//System.out.println(score);
		//System.out.println(score.length());
		
		//记录每一题的得分
		int [] cal = new int [score.length()];
		
		for(int i = 0 ;i<score.length() ; i++) {
			int val = score.charAt(i) - '0';
			cal[i] = val;
		}
		
		//获取题目编号
		HttpServletRequest reqeust= ServletActionContext.getRequest();
		HttpServletRequest req = ServletActionContext.getRequest();
		HttpSession session  = req.getSession();
		String scale_id = (String) session.getAttribute("scale_id");
		int scale = Integer.parseInt(scale_id);
		
		//获取题目
		ScaleDAO sd = new ScaleDAOImpl();
		List<ScaleItem> list = sd.queryScaleItemById(scale);
		int scale_size = list.size();
		
		
		
	}
	
}
