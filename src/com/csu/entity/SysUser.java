package com.csu.entity;

import org.json.JSONObject;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
//系统用户表：该表用于保存系统的用户，用于登录使用

@Entity
@Table(name="tab_sysuser")
public class SysUser implements Serializable{
	
	@Id
	@Column(name="u_id")
	private Integer u_id;
	
	@Column(name="u_account")
	private String u_account; //用户名
	
	@Column(name="u_password")
	private String u_password; //登录密码
	
	@Column(name="dept_Id")
	private Integer dept_id;
	
	@Column(name="u_sort")
	private String u_sort;
	
	@ManyToOne(fetch=FetchType.LAZY) //fentch: 设置了延迟加载 ，默认为立即加载，不设置则会和dept表外连接查询
    @JoinColumn(name="dept_id")
	private Dept dept;
	
	@OneToMany(mappedBy="sysuser",cascade={CascadeType.ALL})
	private Set<UserMsg> um = new HashSet<UserMsg>();
	
	@OneToMany(mappedBy="sysu",cascade={CascadeType.ALL})
	private Set<UserRole> uesrrole = new HashSet<UserRole>();
	
	
	public Set<UserMsg> getUm() {
		return um;
	}
	public void setUm(Set<UserMsg> um) {
		this.um = um;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	public Integer getU_id() {
		return u_id;
	}
	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}
	public String getU_account() {
		return u_account;
	}
	public void setU_account(String u_account) {
		this.u_account = u_account;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	public Integer getDept_id() {
		return dept_id;
	}
	public void setDept_id(Integer dept_id) {
		this.dept_id = dept_id;
	}
	public String getU_sort() {
		return u_sort;
	}
	public void setU_sort(String u_sort) {
		this.u_sort = u_sort;
	}
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("u_id", this.u_id);
		jo.put("u_account", this.u_account);
		jo.put("u_password", this.u_password);
		jo.put("dept_id", this.dept_id);
		jo.put("u_sort", this.u_sort);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
	
	/*
	 * private Integer u_id;
	private String u_account; //用户名
	private String u_password; //登录密码
	private Integer dept_id;
	private String u_sort;
	 */
}
