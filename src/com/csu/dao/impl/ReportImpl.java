package com.csu.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.csu.dao.ReportDAO;
import com.csu.entity.Report;
import com.csu.utils.HibernateUtil;

public class ReportImpl implements ReportDAO{

	@Override
	public boolean add(Report re) {
		// TODO Auto-generated method stub
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			session.save(re);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.getTransaction().rollback();
			return false;
		}
		
		return true;
	}

	@Override
	public boolean update(Report re) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			session.update(re);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.getTransaction().rollback();
			return false;
		}
		
		return true;
	}

	@Override
	public boolean delete(Report re) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
		try {
			session.beginTransaction();
			session.delete(re);
			session.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			session.getTransaction().rollback();
			return false;
		}
		
		return true;
	}

	@Override
	public List<Report> getAllReport() {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		List<Report> result = null;
		
		try {
			session.beginTransaction();
			String hql = "from Report";
			Query query = session.createQuery(hql);
			result = query.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return result;
		}
		
		return result;
	}

}
