package com.csu.dao;

import java.util.List;

import com.csu.entity.Specimen;

public interface SpecimenDAO {
	
	public boolean add(Specimen sp);
	
	public boolean update(Specimen sp);
	
	public boolean delete(Specimen sp);
	
	public List<Specimen> Query();
}
