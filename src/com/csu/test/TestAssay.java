package com.csu.test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import com.csu.entity.Assay;
import com.csu.utils.HibernateUtil;


public class TestAssay {

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
	


	
}
