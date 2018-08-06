package com.csu.dao;

import java.util.List;

import com.csu.entity.Unit;

public interface UnitDAO {
	
	public boolean add(Unit unit);
	
	public boolean delete(Unit unit);
	
	public boolean update(Unit unit);
	
	public List<Unit> query();
	
}
