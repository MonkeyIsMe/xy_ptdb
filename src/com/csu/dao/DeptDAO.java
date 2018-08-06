package com.csu.dao;

import java.util.List;

import com.csu.entity.Dept;

public interface DeptDAO {
	
	public boolean add(Dept dept);
	
	public boolean delete(Dept dept);
	
	public boolean update(Dept dept);
	
	public List<Dept> query();
}
