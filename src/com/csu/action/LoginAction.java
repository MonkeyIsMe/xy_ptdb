package com.csu.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.csu.dao.SysDAO;
import com.csu.dao.impl.SysDAOImpl;
import com.csu.entity.SysUser;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private String username;
	private String password;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	 
	public String IsLogin() {
		//HttpServletRequest reqeust= ServletActionContext.getRequest();
		//String account=reqeust.getParameter("username");//×Ö·û´®
		//String password=reqeust.getParameter("password");//×Ö·û´®
		//System.out.println(account+" "+password);
		int ans = check(username,password);
		if(ans == 0) 
			return "WrongPassword";
		else if(ans == 1) 
			return "LoginSuccess";
		else
			return "NoAccount";
	}
	
	public int check(String username, String pwd) {
		// TODO Auto-generated method stub
		SysDAO sd = new SysDAOImpl();
		int flag = -1;
		List<SysUser> list = sd.querySysUser();
		for(SysUser su : list) {
			System.out.println(su.toString());
			if(username.equals(su.getU_account()) && pwd.equals(su.getU_password())) {
				flag = 1;
				break;
			}
			else if(username.equals(su.getU_account()) && !pwd.equals(su.getU_password())) {
				flag = 0;
			}
		}
		return flag;
	}
	
}
