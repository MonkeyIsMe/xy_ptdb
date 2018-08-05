package com.csu.entity;

import org.json.JSONObject;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="tab_permissions")
public class Permissions implements Serializable{
	
	@Id
	@Column(name="per_id")
	private int per_id;
	
	@Column(name="per_code")
	private String per_code;
	
	@Column(name="per_name")
	private String per_name;
	
	@Column(name="per_description")
	private String per_description;
	
	@Column(name="per_sort")
	private int per_sort;
	
	@OneToMany(mappedBy="per",cascade={CascadeType.ALL})
	private Set<RolePermission> permission = new HashSet<RolePermission>();
	
	public Set<RolePermission> getPermission() {
		return permission;
	}
	public void setPermission(Set<RolePermission> permission) {
		this.permission = permission;
	}
	public int getPer_id() {
		return per_id;
	}
	public void setPer_id(int per_id) {
		this.per_id = per_id;
	}
	public String getPer_code() {
		return per_code;
	}
	public void setPer_code(String per_code) {
		this.per_code = per_code;
	}
	public String getPer_name() {
		return per_name;
	}
	public void setPer_name(String per_name) {
		this.per_name = per_name;
	}
	public String getPer_description() {
		return per_description;
	}
	public void setPer_description(String per_description) {
		this.per_description = per_description;
	}
	public int getPer_sort() {
		return per_sort;
	}
	public void setPer_sort(int per_sort) {
		this.per_sort = per_sort;
	}
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("per_id", this.per_id);
		jo.put("per_code", this.per_code);
		jo.put("per_name", this.per_name);
		jo.put("per_description", this.per_description);
		jo.put("per_sort", this.per_sort);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
}

/*
 * CREATE TABLE `tab_permissions` (
  `per_id` int(11) NOT NULL AUTO_INCREMENT,
  `per_code` varchar(64) DEFAULT NULL,
  `per_name` varchar(128) NOT NULL,
  `per_description` varchar(1000) DEFAULT NULL,
  `per_sort` int(11) DEFAULT NULL,
  PRIMARY KEY (`per_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
*/
