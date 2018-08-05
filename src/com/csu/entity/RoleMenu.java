package com.csu.entity;

import org.json.JSONObject;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="tab_rolemenu")
public class RoleMenu implements Serializable{
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="r_Id")
	private int r_id;
	
	@Column(name="m_Id")
	private int m_id;
	
	@ManyToOne(fetch=FetchType.LAZY) //fentch: 设置了延迟加载 ，默认为立即加载，不设置则会和dept表外连接查询
    @JoinColumn(name="r_id")
	private Role role;
	
	@ManyToOne(fetch=FetchType.LAZY) //fentch: 设置了延迟加载 ，默认为立即加载，不设置则会和dept表外连接查询
    @JoinColumn(name="m_id")
	private Menu menu;
	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
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
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("id", this.id);
		jo.put("r_id", this.r_id);
		jo.put("m_id", this.m_id);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
	
}

/*
CREATE TABLE `tab_rolemenu` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`r_id` int(11) NOT NULL,
`m_id` int(11) NOT NULL,
PRIMARY KEY (`id`),
KEY `fkey_rm_rid` (`r_id`),
KEY `fkey_rm_mid` (`m_id`),
CONSTRAINT `fkey_rm_mid` FOREIGN KEY (`m_id`) REFERENCES `tab_menu` (`m_id`) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT `fkey_rm_rid` FOREIGN KEY (`r_id`) REFERENCES `tab_role` (`r_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
*/