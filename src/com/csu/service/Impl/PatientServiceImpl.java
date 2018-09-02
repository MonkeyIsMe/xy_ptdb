package com.csu.service.Impl;

import com.csu.dao.PatientInfoDAO;
import com.csu.dao.impl.PatientInfoDAOImpl;
import com.csu.entity.PatientInfo;
import com.csu.service.PatientService;

public class PatientServiceImpl implements PatientService{

	@Override
	public boolean deletePatientInfo(int id) {
		// TODO Auto-generated method stub
		PatientInfoDAO pd = new PatientInfoDAOImpl();
		PatientInfo pi = pd.getPatientInfo(id);
		if(pd.delete(pi)) {
			return true;
		}
		else return false;
		
	}

}
