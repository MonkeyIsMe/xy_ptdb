package com.csu.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.csu.dao.SysDAO;
import com.csu.dao.impl.SysDAOImpl;
import com.csu.entity.SysUser;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	private String account;
	private String password;
	private String login_code;
	
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getLogin_code() {
		return login_code;
	}
	public void setLogin_code(String login_code) {
		this.login_code = login_code;
	}
	
	String checkcode;
	
	public String IsLogin() {
		HttpServletRequest request= ServletActionContext.getRequest();
		//String Paccount=reqeust.getParameter("login_code");//�ַ���
		//String password=reqeust.getParameter("password");//�ַ���
		//System.out.println(account+" "+password+" "+login_code);
		HttpSession session  = request.getSession();
		checkcode = (String)session.getAttribute("checkCode");
		System.out.println(checkcode );
		int ans = check(account,password,login_code);
		if(ans == 0) 
			return "WrongPassword";
		else if(ans == 1) 
			return "LoginSuccess";
		else if(ans == -1)
			return "NoAccount";
		else 
			return "WrongCode";
	}
	
	public int check(String username, String pwd,String code) {
		// TODO Auto-generated method stub
		SysDAO sd = new SysDAOImpl();
		int flag = -1;
		List<SysUser> list = sd.querySysUser();
		if(checkcode.equals(code)) {
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
		}
		else {
			flag = -2;
		}
		return flag;
	}
	
}
