package com.csu.dao;

import java.util.List;

import com.csu.entity.Reference;

public interface ReferenceDAO {
	
	public boolean add(Reference refer);
	
	public boolean update(Reference refer);
	
	public boolean delete(Reference refer);
	
	public List<Reference> Query();
	
	public List<Reference> getRefer(int sid,int fid);
}
