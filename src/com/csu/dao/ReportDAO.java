package com.csu.dao;

import java.util.List;

import com.csu.entity.Report;

public interface ReportDAO {
	
	public boolean add(Report re);
	
	public boolean update(Report re);
	
	public boolean delete(Report re);
	
	public List<Report> getAllReport();
}
