package com.csu.dao;

import java.util.List;

import com.csu.entity.PatientInfo;

public interface PatientInfoDAO {

	public boolean add(PatientInfo pi);
	
	public boolean update(PatientInfo pi);
	
	public boolean delete(PatientInfo pi);
	
	public List<PatientInfo> getAllPatientInfo();
	
	public List<PatientInfo> getPatientInfo(int u_id);
	
	public List<PatientInfo> getPatientByPage(int i,int pagesize);
}
