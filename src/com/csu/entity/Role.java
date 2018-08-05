package com.csu.entity;

import org.json.JSONObject;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="tab_role")
public class Role implements Serializable{
	
	@Id
	@Column(name="r_id")
	private int r_id;
	
	@Column(name="r_code")
	private String r_code;
	
	@Column(name="r_name")
	private String r_name;
	
	@Column(name="r_description")
	private String r_description;
	
	@Column(name="r_sort")
	private int r_sort;
	
	@OneToMany(mappedBy="role",cascade={CascadeType.ALL})
	private Set<RoleMenu> menu = new HashSet<RoleMenu>();
	
	@OneToMany(mappedBy="rolep",cascade={CascadeType.ALL})
	private Set<RolePermission> permission = new HashSet<RolePermission>();
	
	@OneToMany(mappedBy="roleu",cascade={CascadeType.ALL})
	private Set<UserRole> user = new HashSet<UserRole>();
	
	
	public Set<UserRole> getUser() {
		return user;
	}
	public void setUser(Set<UserRole> user) {
		this.user = user;
	}
	public Set<RolePermission> getPermission() {
		return permission;
	}
	public void setPermission(Set<RolePermission> permission) {
		this.permission = permission;
	}
	public Set<RoleMenu> getMenu() {
		return menu;
	}
	public void setMenu(Set<RoleMenu> menu) {
		this.menu = menu;
	}
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public String getR_code() {
		return r_code;
	}
	public void setR_code(String r_code) {
		this.r_code = r_code;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public String getR_description() {
		return r_description;
	}
	public void setR_description(String r_description) {
		this.r_description = r_description;
	}
	public int getR_sort() {
		return r_sort;
	}
	public void setR_sort(int r_sort) {
		this.r_sort = r_sort;
	}
	
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("r_id", this.r_id);
		jo.put("r_code", this.r_code);
		jo.put("r_name", this.r_name);
		jo.put("r_description", this.r_description);
		jo.put("r_sort", this.r_sort);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
	
}


/*
 * 
 * CREATE TABLE `tab_role` (
  `r_id` int(11) NOT NULL AUTO_INCREMENT,
  `r_code` varchar(64) DEFAULT NULL,
  `r_name` varchar(128) NOT NULL,
  `r_description` varchar(1000) DEFAULT NULL,
  `r_sort` int(11) DEFAULT NULL,
  PRIMARY KEY (`r_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
*/
