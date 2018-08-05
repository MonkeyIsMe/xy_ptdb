package com.csu.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.json.JSONObject;


@Entity
@Table(name="tab_comments")
public class Comment implements Serializable{
	
	@EmbeddedId
	private CommentPK cpk;
	
	@Column(name="T_ZFComment")
	private String T_ZFComment;
	
	@Column(name="T_RComment")
	private String T_RComment;
	
	@Column(name="T_Comment")
	private String T_Comment;
	
	
	
	public CommentPK getCpk() {
		return cpk;
	}
	public void setCpk(CommentPK cpk) {
		this.cpk = cpk;
	}
	public String getT_ZFComment() {
		return T_ZFComment;
	}
	public void setT_ZFComment(String t_ZFComment) {
		T_ZFComment = t_ZFComment;
	}
	public String getT_RComment() {
		return T_RComment;
	}
	public void setT_RComment(String t_RComment) {
		T_RComment = t_RComment;
	}
	public String getT_Comment() {
		return T_Comment;
	}
	public void setT_Comment(String t_Comment) {
		T_Comment = t_Comment;
	}
	
	
	public JSONObject toJSON() {
		JSONObject jo = new JSONObject();
		jo.put("cpk", this.cpk);
		jo.put("T_ZFComment", this.T_ZFComment);
		jo.put("T_RComment", this.T_RComment);
		jo.put("T_Comment", this.T_Comment);
		return jo;
	}

	public String toString() {
		return this.toJSON().toString(); 
	}
	
}


/*
 * CREATE TABLE `tab_comments` (
  `S_ID` int(10) unsigned NOT NULL,
  `U_ID` int(10) unsigned NOT NULL,
  `T_Time` datetime NOT NULL,
  `T_ZFComment` varchar(300) DEFAULT NULL,
  `T_RComment` varchar(200) DEFAULT NULL,
  `T_Comment` varchar(15000) DEFAULT NULL,
  PRIMARY KEY (`S_ID`,`U_ID`,`T_Time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */