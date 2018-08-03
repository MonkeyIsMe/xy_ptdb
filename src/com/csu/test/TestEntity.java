package com.csu.test;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import com.csu.entity.Assay;
import com.csu.entity.PatientInfo;
import com.csu.entity.Report;
import com.csu.utils.HibernateUtil;

public class TestEntity {
	
	@Test
	public void getAll() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from Assay";
		Query query = s.createQuery(hql);
		List<Assay> list = query.list();
		for(Assay in : list) {
			System.out.println(in.toString());
		}
	} 
	
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
	
	@Test
	public void getReport() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session s = sf.getCurrentSession();
		s.beginTransaction();
		String hql = "from Report";
		Query query = s.createQuery(hql);
		List<Report> list = query.list();
		for(Report pi : list) {
			System.out.println(pi.toString());
		}
	}
}
