package com.csu.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import com.csu.entity.PatientInfo;
import com.csu.utils.HibernateUtil;

public class TestPatientInfo {
	
	@Test
	public void getPatientInfo() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from PatientInfo";
		Query query = s.createQuery(hql);
		List<PatientInfo> list = query.list();
		for(PatientInfo pi : list) {
			System.out.println(pi.toString());
		}
	}
}
