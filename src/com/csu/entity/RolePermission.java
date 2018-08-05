package com.csu.entity;

import org.json.JSONObject;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="tab_rolepermission")
public class RolePermission implements Serializable{
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="r_Id")
	private int r_id;
	
	@Column(name="per_Id")
	private int per_id;
	
	@ManyToOne(fetch=FetchType.LAZY) //fentch: 设置了延迟加载 ，默认为立即加载，不设置则会和dept表外连接查询
    @JoinColumn(name="per_id")
	private Permissions per;
	
	@ManyToOne(fetch=FetchType.LAZY) //fentch: 设置了延迟加载 ，默认为立即加载，不设置则会和dept表外连接查询
    @JoinColumn(name="r_id")
	private Role rolep;
	
	public Permissions getPer() {
		return per;
	}
	public void setPer(Permissions per) {
		this.per = per;
	}
	public Role getRolep() {
		return rolep;
	}
	public void setRolep(Role rolep) {
		this.rolep = rolep;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getR_id() {
		return r_id;
	}
	public void setR_id(int r_id) {
		this.r_id = r_id;
	}
	public int getPer_id() {
		return per_id;
	}
	public void setPer_id(int per_id) {
		this.per_id = per_id;
	}
	
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("id", this.id);
		jo.put("r_id", this.r_id);
		jo.put("per_id", this.per_id);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
}

/*
CREATE TABLE `tab_rolepermission` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`r_id` int(11) NOT NULL,
`per_id` int(11) NOT NULL,
PRIMARY KEY (`id`),
KEY `fkey_rper_rid` (`r_id`),
KEY `fkey_rper_pid` (`per_id`),
CONSTRAINT `fkey_rper_pid` FOREIGN KEY (`per_id`) REFERENCES `tab_permissions` (`per_id`) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT `fkey_rper_rid` FOREIGN KEY (`r_id`) REFERENCES `tab_role` (`r_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
*/