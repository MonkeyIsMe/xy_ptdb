package com.csu.dao;

import java.util.List;

import com.csu.entity.DiagClass;
import com.csu.entity.DiagName;
import com.csu.entity.DiagRule;
import com.csu.entity.DiagType;

public interface DiagDAO {

	public boolean addDiagClass(DiagClass diagclass);
	
	public boolean updateDiagClass(DiagClass diagclass);
	
	public boolean deleteDiagClass(DiagClass diagclass);
	
	public List<DiagClass> queryDiagClass();
	
    public boolean addDiagName(DiagName diagname);
	
	public boolean updateDiagName(DiagName diagname);
	
	public boolean deleteDiagName(DiagName diagname);
	
	public List<DiagName> queryDiagName();
	
    public boolean addDiagRule(DiagRule diagrule);
	
	public boolean updateDiagRule(DiagRule diagrule);
	
	public boolean deleteDiagRule(DiagRule diagrule);
	
	public List<DiagRule> queryDiagRule();
	
    public boolean addDiagClass(DiagType diagtype);
	
	public boolean updateDiagType(DiagClass diagtype);
	
	public boolean deleteDiagType(DiagClass diagtype);
	
	public List<DiagType> queryDiagType();
}
