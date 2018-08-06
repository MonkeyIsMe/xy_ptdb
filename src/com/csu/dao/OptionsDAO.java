package com.csu.dao;

import java.util.List;

import com.csu.entity.Options;

public interface OptionsDAO {
	
	public boolean add(Options op);
	
	public boolean update(Options op);
	
	public boolean delete(Options op);
	
	public List<Options> query();
}
