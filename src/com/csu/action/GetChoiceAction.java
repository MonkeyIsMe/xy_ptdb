package com.csu.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.csu.dao.ChoiceDAO;
import com.csu.dao.ScaleDAO;
import com.csu.dao.impl.ChoiceDAOImpl;
import com.csu.dao.impl.ScaleDAOImpl;
import com.csu.entity.Choice;
import com.csu.entity.ScaleItem;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONArray;

public class GetChoiceAction extends ActionSupport{
	
	List<Choice> ch;

	public List<Choice> getCh() {
		return ch;
	}

	public void setCh(List<Choice> ch) {
		this.ch = ch;
	}
	
	public String queryChoice() {
		ServletActionContext.getResponse().setContentType("text/html; charset=utf-8");
		HttpServletRequest request = ServletActionContext.getRequest();
		String id = request.getParameter("id");
		HttpServletRequest reqeust= ServletActionContext.getRequest();
		HttpServletRequest req = ServletActionContext.getRequest();
		HttpSession session  = req.getSession();
		String scale_id = (String) session.getAttribute("scale_id");
		//System.out.println("scale_id+++==="+scale_id);
		int i_id = Integer.parseInt(scale_id);
		//System.out.println("第"+id+"个");
		ch = query(i_id);
		JSONArray arr = JSONArray.fromObject(ch);
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
		//System.out.println(ch.size());
		return SUCCESS;
	}

	private List<Choice> query(int i_id) {
		// TODO Auto-generated method stub
		List<Choice> list = null;
		ChoiceDAO cd = new ChoiceDAOImpl();
		list = cd.getChoiceById(i_id);
		//System.out.println("i_id="+i_id);
		//for(Choice ch : list) {
			//System.out.println(ch.toString());
		//}
		return list;
	}
}
