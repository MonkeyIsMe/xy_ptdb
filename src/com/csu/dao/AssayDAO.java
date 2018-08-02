package com.csu.dao;

import java.util.List;

import com.csu.entity.Assay;

public interface AssayDAO {
	
	public boolean add(Assay assay);
	
	public boolean delete(Assay assay);
	
	public boolean Update(Assay assay);
	
	public List<Assay> getAllAssay();
}
