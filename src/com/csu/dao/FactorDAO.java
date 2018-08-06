package com.csu.dao;

import java.util.List;

import com.csu.entity.Factor;

public interface FactorDAO {
	
	public boolean add(Factor fac);
	
	public boolean delete(Factor fac);
	
	public boolean update(Factor fac);
	
	public List<Factor> query();
}
