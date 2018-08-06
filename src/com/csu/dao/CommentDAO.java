package com.csu.dao;

import java.util.List;

import com.csu.entity.Comment;

public interface CommentDAO {
	
	public boolean add(Comment com);
	
	public boolean update(Comment com);
	
	public boolean delete(Comment com);
	
	public List<Comment> query();
}
