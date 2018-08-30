package com.csu.dao;

import java.util.List;

import com.csu.entity.Factor;

public interface FactorDAO {
	
	public boolean add(Factor fac);
	
	public boolean delete(Factor fac);
	
	public boolean update(Factor fac);
	
	public List<Factor> query();
	
	public List<Factor> getFactorsBySid(int S_id);
	
	public List<Factor> getFactor(int s_id,int f_id);
}
